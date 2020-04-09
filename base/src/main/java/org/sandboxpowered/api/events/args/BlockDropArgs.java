package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.item.ItemStack;
import org.sandboxpowered.api.state.BlockState;
import org.sandboxpowered.api.util.math.Position;

import java.util.List;

public class BlockDropArgs extends BlockArgs implements DropsArgs {
    private final List<ItemStack> items;

    public BlockDropArgs(Position pos, BlockState state, List<ItemStack> items) {
        super(pos, state);
        this.items = items;
    }

    @Override
    public List<ItemStack> getItems() {
        return items;
    }
}
