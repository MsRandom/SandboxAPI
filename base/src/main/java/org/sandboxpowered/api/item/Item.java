package org.sandboxpowered.api.item;

import org.sandboxpowered.api.world.World;
import org.sandboxpowered.api.component.Component;
import org.sandboxpowered.api.content.Content;
import org.sandboxpowered.api.registry.Registry;
import org.sandboxpowered.api.util.InteractionResult;
import org.sandboxpowered.api.util.Mono;
import org.sandboxpowered.api.util.math.Position;
import org.sandboxpowered.api.util.text.Text;

import javax.annotation.Nullable;
import java.util.List;

public interface Item extends Content<Item> {
    Registry<Item> REGISTRY = Registry.getRegistryFromType(Item.class);

    default InteractionResult onItemUsed(World world, Position position, ItemStack itemStack) {
        return InteractionResult.IGNORE;
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
        private int maxDamage;
        private Item recipeRemainder;

        public Settings() {
        }

        public int getMaxDamage() {
            return maxDamage;
        }

        public Settings setMaxDamage(int maxDamage) {
            this.maxDamage = maxDamage;
            this.stackSize = 1;
            return this;
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

        public Item getRecipeRemainder() {
            return recipeRemainder;
        }

        public Settings setRecipeRemainder(Item recipeRemainder) {
            this.recipeRemainder = recipeRemainder;
            return this;
        }
    }
}