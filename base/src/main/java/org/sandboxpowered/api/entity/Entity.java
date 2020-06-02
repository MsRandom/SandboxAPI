package org.sandboxpowered.api.entity;

import org.sandboxpowered.api.component.Component;
import org.sandboxpowered.api.content.Content;
import org.sandboxpowered.api.events.ChatArgs;
import org.sandboxpowered.api.events.SizeUpdateArgs;
import org.sandboxpowered.api.registry.Registry;
import org.sandboxpowered.api.util.Mono;
import org.sandboxpowered.api.util.annotation.Alpha;
import org.sandboxpowered.eventhandler.CancellableEventArgs;
import org.sandboxpowered.eventhandler.EventHandler;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.core.EventArgs;
import org.sandboxpowered.eventhandler.core.EventHandlerBase;
import org.sandboxpowered.eventhandler.priority.Cancellable;
import org.sandboxpowered.eventhandler.priority.PriorityHandler;

@Alpha
public interface Entity {
    PriorityHandler<Entity, Cancellable> SPAWN_EVENT = new PriorityEventHandler<>();
    PriorityHandler<Entity, Cancellable> TICK_EVENT = new PriorityEventHandler<>();
    PriorityHandler<Entity, Cancellable> DEATH_EVENT = new PriorityEventHandler<>();
    PriorityHandler<Entity, SizeUpdateArgs> UPDATE_SIZE_EVENT = new PriorityEventHandler<>();
    EventHandlerBase<Entity, EventArgs> CONSTRUCT_ENTITY_EVENT = new EventHandler<>();

    PriorityHandler<Entity, Cancellable> ENTITY_RENDER_EVENT = new PriorityEventHandler<>();

    default <X> Mono<X> getComponent(Component<X> component) {
        return Mono.empty();
    }

    Type getType();

    boolean isSneaking();

    interface Type extends Content<Type> {
        Registry<Type> REGISTRY = Registry.getRegistryFromType(Type.class);

        @Override
        default Class<Type> getContentType() {
            return Type.class;
        }
    }
}
