package org.sandboxpowered.api.entity;

import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.events.EntityArgs;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.priority.Cancellable;
import org.sandboxpowered.eventhandler.priority.PriorityHandler;

public interface ItemEntity extends Entity {
    PriorityHandler<Entity, Cancellable> REMOVE_EVENT = new PriorityEventHandler<>();
    PriorityHandler<PlayerEntity, EntityArgs<ItemEntity>> THROW_EVENT = new PriorityEventHandler<>();
}
