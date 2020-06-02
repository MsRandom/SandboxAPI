package org.sandboxpowered.api.entity;

import org.sandboxpowered.api.events.DistanceArgs;
import org.sandboxpowered.api.events.DropsArgs;
import org.sandboxpowered.api.events.EntityArgs;
import org.sandboxpowered.api.events.HealthArgs;
import org.sandboxpowered.api.util.annotation.Alpha;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.priority.Cancellable;
import org.sandboxpowered.eventhandler.priority.PriorityHandler;

@Alpha
public interface LivingEntity extends Entity {
    PriorityHandler<LivingEntity, DropsArgs> DROPS_EVENT = new PriorityEventHandler<>();
    PriorityHandler<LivingEntity, HealthArgs> HURT_EVENT = new PriorityEventHandler<>();
    PriorityHandler<LivingEntity, HealthArgs> HEAL_EVENT = new PriorityEventHandler<>();
    PriorityHandler<LivingEntity, DistanceArgs> FALL_EVENT = new PriorityEventHandler<>();
    PriorityHandler<LivingEntity, Cancellable> JUMP_EVENT = new PriorityEventHandler<>();
    PriorityHandler<LivingEntity, EntityArgs<LivingEntity>> KNOCKBACK_EVENT = new PriorityEventHandler<>();

    float getHealth();

    void setHealth(float health);
}
