package org.sandboxpowered.api.events;

import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.api.entity.LivingEntity;
import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.events.args.*;
import org.sandboxpowered.api.world.World;
import org.sandboxpowered.eventhandler.EventHandler;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.core.Cancellable;
import org.sandboxpowered.eventhandler.core.EventArgs;
import org.sandboxpowered.eventhandler.core.EventHandlerBase;
import org.sandboxpowered.eventhandler.core.PriorityHandler;

public final class SandboxCommonEvents {
    public static final PriorityHandler<PlayerEntity, BlockArgs> BLOCK_BREAK = new PriorityEventHandler<>();
    public static final PriorityHandler<PlayerEntity, EntityArgs<LivingEntity>> PLAYER_ENTITY_INTERACT = new PriorityEventHandler<>();
    public static final PriorityHandler<PlayerEntity, EntityArgs<LivingEntity>> PLAYER_BLOCK_INTERACT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, DropsArgs> ENTITY_DROPS = new PriorityEventHandler<>();
    public static final PriorityHandler<World, BlockDropArgs> BLOCK_DROPS = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> ENTITY_SPAWN = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, HealthArgs> ENTITY_HURT = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, HealthArgs> ENTITY_HEAL = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, DistanceArgs> ENTITY_FALL = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, Cancellable> ENTITY_JUMP = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> ENTITY_TICK = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> ENTITY_DEATH = new PriorityEventHandler<>();
    //Should replace Entity here with ItemEntity
    public static final PriorityHandler<PlayerEntity, EntityArgs<Entity>> ITEM_THROW = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, Cancellable> ITEM_REMOVE = new PriorityEventHandler<>();
    public static final PriorityHandler<LivingEntity, EntityArgs<LivingEntity>> ENTITY_KNOCKBACK = new PriorityEventHandler<>();
    public static final PriorityHandler<PlayerEntity, BlockArgs> PLAYER_SLEEP = new PriorityEventHandler<>();
    public static final PriorityHandler<PlayerEntity, BlockArgs> PLAYER_WAKE_UP = new PriorityEventHandler<>();
    //public static final PriorityHandler<Entity, CancellableEventArgs> UPDATE_SIZE = new PriorityEventHandler<>();
    public static final PriorityHandler<Entity, ChatArgs> CHAT_MESSAGE = new PriorityEventHandler<>();
    public static final EventHandlerBase<Entity, EventArgs> ENTITY_CONSTRUCT = new EventHandler<>();
    public static final EventHandlerBase<PlayerEntity, EntityArgs<PlayerEntity>> PLAYER_CLONE = new EventHandler<>();
}
