package org.sandboxpowered.api.entity.player;

import org.jetbrains.annotations.Nullable;
import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.api.entity.LivingEntity;
import org.sandboxpowered.api.events.BlockArgs;
import org.sandboxpowered.api.events.ChatArgs;
import org.sandboxpowered.api.events.EntityArgs;
import org.sandboxpowered.api.util.Identity;
import org.sandboxpowered.api.util.annotation.Alpha;
import org.sandboxpowered.api.util.math.Position;
import org.sandboxpowered.api.util.nbt.CompoundTag;
import org.sandboxpowered.api.util.text.Text;
import org.sandboxpowered.eventhandler.EventHandler;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.core.EventHandlerBase;
import org.sandboxpowered.eventhandler.priority.PriorityHandler;

import java.util.Optional;

@Alpha
public interface PlayerEntity extends LivingEntity {
    PriorityHandler<PlayerEntity, EntityArgs<LivingEntity>> ENTITY_INTERACT_EVENT = new PriorityEventHandler<>();
    PriorityHandler<PlayerEntity, EntityArgs<LivingEntity>> BLOCK_INTERACT_EVENT = new PriorityEventHandler<>();
    PriorityHandler<PlayerEntity, BlockArgs> PLAYER_SLEEP = new PriorityEventHandler<>();
    PriorityHandler<PlayerEntity, BlockArgs> PLAYER_WAKE_UP = new PriorityEventHandler<>();
    EventHandlerBase<PlayerEntity, ChatArgs> CHAT_MESSAGE_EVENT = new EventHandler<>();
    EventHandlerBase<PlayerEntity, EntityArgs<PlayerEntity>> CLONE_EVENT = new EventHandler<>();

    void sendChatMessage(Text text);

    void sendOverlayMessage(Text text);

    default void openContainer(Identity id) {
        openContainer(id, null);
    }

    void openContainer(Identity id, @Nullable CompoundTag data);

    Optional<Position> getSleepingPosition();

    default boolean isSleeping() {
        return getSleepingPosition().isPresent();
    }
}
