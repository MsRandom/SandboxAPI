package org.sandboxpowered.api.item;

import org.sandboxpowered.api.entity.Arm;
import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.api.entity.LivingEntity;
import org.sandboxpowered.api.entity.player.Hand;
import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.state.BlockState;
import org.sandboxpowered.api.util.Color;
import org.sandboxpowered.api.util.Identity;
import org.sandboxpowered.api.util.ItemUse;
import org.sandboxpowered.api.util.ObjectInteractionResult;
import org.sandboxpowered.api.util.nbt.NbtType;
import org.sandboxpowered.api.world.World;
import org.sandboxpowered.api.component.Component;
import org.sandboxpowered.api.content.Content;
import org.sandboxpowered.api.registry.Registry;
import org.sandboxpowered.api.util.InteractionResult;
import org.sandboxpowered.api.util.Mono;
import org.sandboxpowered.api.util.math.Position;
import org.sandboxpowered.api.util.text.Text;

import javax.annotation.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface Item extends Content<Item> {
    Registry<Item> REGISTRY = Registry.getRegistryFromType(Item.class);

    default ObjectInteractionResult<ItemStack> onUse(World world, PlayerEntity player, Hand hand) {
        return ObjectInteractionResult.of(player.getStackInHand(hand), InteractionResult.IGNORE);
    }

    default InteractionResult onBlockInteract(ItemUse use) {
        return InteractionResult.IGNORE;
    }

    default ItemStack onFinishedUsing(ItemStack stack, World world, LivingEntity user) {
        return stack;
    }

    default boolean afterHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return false;
    }

    default boolean afterMine(ItemStack stack, BlockState state, World world, Position pos, LivingEntity miner) {
        return false;
    }

    default void onInventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

    }

    default void onCraft(ItemStack result, World world, PlayerEntity crafter) {

    }

    default void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingTicks) {

    }

    default void onUseTick(World world, LivingEntity user, ItemStack stack, int remainingTicks) {
        
    }

    @Override
    default Class<Item> getContentType() {
        return Item.class;
    }

    Settings getSettings();

    default void appendTooltipText(ItemStack cast, @Nullable World world, List<Text> tooltip, boolean advanced) {

    }

    default <X> Mono<X> getComponent(Component<X> component) {
        return getComponent(component, ItemStack.empty());
    }

    default <X> Mono<X> getComponent(Component<X> component, ItemStack stack) {
        return Mono.empty();
    }

    class Settings {
        private int stackSize = 64;
        private int maxDamage = 0;
        //TODO: make recipe-aware once we implement recipes, probably make a separate interface
        private Function<ItemStack, ItemStack> recipeRemainder = stack -> ItemStack.empty();
        private Map<Identity, ItemProperty> properties = new HashMap<>();
        private MeteredItemProperty meterProperty;
        //TODO, rarity, food component(should that be a Component<X>?)

        public Settings() {
        }

        public int getMaxDamage() {
            return maxDamage;
        }

        public Settings setMaxDamage(int maxDamage) {
            this.maxDamage = maxDamage;
            this.stackSize = 1;
            return this.setMeterProperty(Identity.of("damage"), DAMAGE);
        }

        public Map<Identity, ItemProperty> getProperties() {
            return properties;
        }

        public Settings addProperty(Identity id, ItemProperty property) {
            properties.put(id, property);
            return this;
        }

        public ItemProperty getMeterProperty() {
            return meterProperty;
        }

        public Settings setMeterProperty(Identity id, MeteredItemProperty property) {
            this.meterProperty = property;
            return this.addProperty(id, property);
        }

        public int getStackSize() {
            return stackSize;
        }

        public Settings setStackSize(int stackSize) {
            if (this.maxDamage > 0) {
                throw new RuntimeException("Unable to have damage AND stack.");
            } else {
                this.stackSize = stackSize;
                return this;
            }
        }

        public Function<ItemStack, ItemStack> getRecipeRemainder() {
            return recipeRemainder;
        }

        public Settings setRecipeRemainder(Item remainderItem) {
            this.recipeRemainder = stack -> ItemStack.of(remainderItem);
            return this;
        }

        public Settings setRecipeRemainder(Function<ItemStack, ItemStack> recipeRemainder) {
            this.recipeRemainder = recipeRemainder;
            return this;
        }
    }

    interface ItemProperty {
        float getCurrentValue(ItemStack stack, World world, @Nullable LivingEntity holder);
    }

    interface MeteredItemProperty extends ItemProperty {
        default boolean displayMeter(ItemStack stack, World world, @Nullable LivingEntity holder) {
            return getCurrentValue(stack, world, holder) != 1f;
        }
        default Color getMeterColor(ItemStack stack, World world, @Nullable LivingEntity holder) {
            return Color.fromHsv(getCurrentValue(stack, world, holder) / 3F, 1F, 1.0F);
        }
    }

    MeteredItemProperty DAMAGE = (stack, world, holder) -> (stack.getMaxDamage() - stack.getDamage()) / (float) stack.getMaxDamage();
    ItemProperty DAMAGED = (stack, world, holder) -> stack.getDamage() > 0? 1F : 0F;
    ItemProperty LEFT_HANDED = (stack, world, holder) -> {
        if (holder == null) return 0F;
        return holder.getDominantArm() == Arm.LEFT? 1F: 0F;
    };
    ItemProperty CUSTOM_MODEL_DATA = (stack, world, holder) -> {
        if (!stack.hasTag()) return 0F;
        if (!stack.getTag().contains("CustomModelData", NbtType.INT)) return 0F;
        return (float) stack.getTag().getInt("CustomModelData");
    };
    //TODO: cooldown

}