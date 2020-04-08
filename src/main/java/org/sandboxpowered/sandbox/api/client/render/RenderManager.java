package org.sandboxpowered.sandbox.api.client.render;

import org.sandboxpowered.sandbox.api.block.entity.BlockEntity;
import org.sandboxpowered.sandbox.api.client.render.universal.BlockEntityRender;

import java.util.function.Function;
import java.util.function.Supplier;

public interface RenderManager {
    <T extends BlockEntity> void register(Class<T> beClass, Supplier<BlockEntityRender<T>> render);
}
