package org.sandboxpowered.sandbox.api.client.render.universal;

import org.sandboxpowered.sandbox.api.block.entity.BlockEntity;
import org.sandboxpowered.sandbox.api.util.math.MatrixStack;

public interface BlockEntityRender<T extends BlockEntity> {
    void render(T entity, MatrixStack stack, VertexConsumer.Provider vertexConsumerProvider, int light, int overlay, float delta);
}
