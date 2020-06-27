package org.sandboxpowered.api.events;

import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.api.entity.ItemEntity;
import org.sandboxpowered.api.entity.LivingEntity;
import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.events.args.*;
import org.sandboxpowered.eventhandler.EventHandler;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.core.EventArgs;
import org.sandboxpowered.eventhandler.core.EventHandlerBase;
import org.sandboxpowered.eventhandler.priority.Cancellable;
import org.sandboxpowered.eventhandler.priority.PriorityHandler;

public class EntityEvents {
    public static final PriorityHandler<PlayerEntity, EntityArgs<ItemEntity>> ITEM_THROW_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> SPAWN_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> TICK_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> DEATH_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> REMOVE_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, SizeUpdateArgs> UPDATE_SIZE_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, DropsArgs> DROPS_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, HealthArgs> HURT_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, HealthArgs> HEAL_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, DistanceArgs> FALL_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, Cancellable> JUMP_EVENT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, EntityArgs<LivingEntity>> KNOCKBACK_EVENT = new PriorityEventHandler<>();
    public static final EventHandlerBase<Entity, EventArgs> CONSTRUCT_ENTITY_EVENT = new EventHandler<>();

    //TODO may need args that include the renderer
    public static final PriorityHandler<Entity, Cancellable> ENTITY_RENDER_EVENT = new PriorityEventHandler<>();
}
