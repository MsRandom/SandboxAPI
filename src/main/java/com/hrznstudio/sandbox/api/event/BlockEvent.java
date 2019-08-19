package com.hrznstudio.sandbox.api.event;

import com.hrznstudio.sandbox.api.block.state.BlockState;
import com.hrznstudio.sandbox.api.util.math.Position;
import com.hrznstudio.sandbox.api.world.World;

public class BlockEvent extends Event {
    @Cancellable
    public static class Place extends BlockEvent {
        private final World world;
        private final Position position;
        private BlockState state;

        public Place(World world, Position position, BlockState state) {
            this.world = world;
            this.position = position;
            this.state = state;
        }

        public World getWorld() {
            return world;
        }

        public Position getPosition() {
            return position;
        }

        public BlockState getState() {
            return state;
        }

        public void setState(BlockState state) {
            checkState();
            this.state = state;
        }
    }

    @Cancellable
    public static class Break extends BlockEvent {
        private final World world;
        private final Position position;
        private final BlockState state;

        public Break(World world, Position position, BlockState state) {
            this.world = world;
            this.position = position;
            this.state = state;
        }

        public World getWorld() {
            return world;
        }

        public Position getPosition() {
            return position;
        }

        public BlockState getState() {
            return state;
        }
    }
}