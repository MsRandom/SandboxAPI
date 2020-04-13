package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.block.Block;
import org.sandboxpowered.api.state.BlockState;
import org.sandboxpowered.api.util.math.Position;
import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class BlockArgs extends CancellableEventArgs {
    private Position pos;
    private BlockState state;

    public Position getPos() {
        return pos;
    }

    public BlockState getState() {
        return state;
    }

    public Block getBlock() {
        return state.getBlock();
    }

    public final BlockArgs setup(Position pos, BlockState state) {
        reset();
        this.pos = pos;
        this.state = state;
        return this;
    }
}
