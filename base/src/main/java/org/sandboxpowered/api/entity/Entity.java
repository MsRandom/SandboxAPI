package org.sandboxpowered.api.entity;

import org.sandboxpowered.api.component.Component;
import org.sandboxpowered.api.content.Content;
import org.sandboxpowered.api.events.args.SizeUpdateArgs;
import org.sandboxpowered.api.registry.Registry;
import org.sandboxpowered.api.util.Mono;
import org.sandboxpowered.api.util.annotation.Alpha;
import org.sandboxpowered.eventhandler.EventHandler;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.core.EventArgs;
import org.sandboxpowered.eventhandler.core.EventHandlerBase;
import org.sandboxpowered.eventhandler.priority.Cancellable;
import org.sandboxpowered.eventhandler.priority.PriorityHandler;

@Alpha
public interface Entity {
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
