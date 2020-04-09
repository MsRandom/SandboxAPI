package org.sandboxpowered.api.events;

import org.sandboxpowered.api.entity.Entity;
import org.sandboxpowered.api.events.args.BlockArgs;
import org.sandboxpowered.api.world.World;
import org.sandboxpowered.eventhandler.PriorityEventHandler;
import org.sandboxpowered.eventhandler.core.Cancellable;
import org.sandboxpowered.eventhandler.core.PriorityHandler;

public class SandboxClientEvents {
    public static final PriorityHandler<Entity, Cancellable> ENTITY_RENDER = new PriorityEventHandler<>();
    public static final PriorityHandler<World, BlockArgs> BLOCK_HIGHLIGHT = new PriorityEventHandler<>();
}
