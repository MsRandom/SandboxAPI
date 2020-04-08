package org.sandboxpowered.api.client.rendering;

import org.sandboxpowered.api.client.rendering.universal.BlockEntityRender;
import org.sandboxpowered.api.block.entity.BlockEntity;

import java.util.function.Supplier;

public interface RenderManager {
    <T extends BlockEntity> void register(Class<T> beClass, Supplier<BlockEntityRender<T>> render);
}
