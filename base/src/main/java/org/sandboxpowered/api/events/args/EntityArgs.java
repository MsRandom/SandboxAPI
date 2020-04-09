package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class EntityArgs<T extends Entity> extends CancellableEventArgs {
    private final T entity;

    public EntityArgs(T entity) {
        this.entity = entity;
    }

    public T getEntity() {
        return entity;
    }
}
