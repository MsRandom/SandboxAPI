package org.sandboxpowered.api.client.rendering;

import org.sandboxpowered.api.block.entity.BlockEntity;
import org.sandboxpowered.api.util.math.MatrixStack;

public interface BlockEntityRender<T extends BlockEntity> {
    void render(T entity, MatrixStack stack, VertexConsumer.Provider vertexConsumerProvider, int light, int overlay, float delta);
}
