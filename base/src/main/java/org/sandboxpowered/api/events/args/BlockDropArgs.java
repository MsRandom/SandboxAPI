package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.item.ItemStack;
import org.sandboxpowered.api.state.BlockState;
import org.sandboxpowered.api.util.math.Position;

import java.util.List;

public class BlockDropArgs extends BlockArgs implements DropsArgs {
    private List<ItemStack> items;

    @Override
    public List<ItemStack> getItems() {
        return items;
    }

    public final BlockDropArgs setup(Position pos, BlockState state, List<ItemStack> items) {
        setup(pos, state);
        this.items = items;
        return this;
    }
}
