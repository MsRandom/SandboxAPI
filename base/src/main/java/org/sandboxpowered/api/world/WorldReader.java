package org.sandboxpowered.api.world;

import org.sandboxpowered.api.block.entity.BlockEntity;
import org.sandboxpowered.api.state.BlockState;
import org.sandboxpowered.api.state.FluidState;
import org.sandboxpowered.api.util.math.Position;

import javax.annotation.Nullable;

public interface WorldReader {
    BlockState getBlockState(Position position);

    @Nullable
    BlockEntity getBlockEntity(Position position);

    FluidState getFluidState(Position position);

    default boolean isValid(Position position) {
        return isHeightValid(position) && position.x() >= -30000000 && position.z() >= -30000000 && position.x() < 30000000 && position.z() < 30000000;
    }

    default boolean isHeightValid(Position position) {
        return isHeightValid(position.y());
    }

    default boolean isHeightValid(int height) {
        return height > 0 && height < 256;
    }
}