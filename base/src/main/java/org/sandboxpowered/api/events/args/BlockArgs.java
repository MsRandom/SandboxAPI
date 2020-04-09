package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.block.Block;
import org.sandboxpowered.api.state.BlockState;
import org.sandboxpowered.api.util.math.Position;
import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class BlockArgs extends CancellableEventArgs {
    private final Position pos;
    private final BlockState state;

    public BlockArgs(Position pos, BlockState state) {
        this.pos = pos;
        this.state = state;
    }

    public Position getPos() {
        return pos;
    }

    public BlockState getState() {
        return state;
    }

    public Block getBlock() {
        return state.getBlock();
    }
}
