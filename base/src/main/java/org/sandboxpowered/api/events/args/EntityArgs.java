package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class EntityArgs<T extends Entity> extends CancellableEventArgs {
    private T entity;

    public T getEntity() {
        return entity;
    }

    public final EntityArgs<T> setup(T entity) {
        reset();
        this.entity = entity;
        return this;
    }
}
