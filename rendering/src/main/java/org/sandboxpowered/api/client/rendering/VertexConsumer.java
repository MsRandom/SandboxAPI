package org.sandboxpowered.api.client.rendering;

import org.joml.*;
import org.sandboxpowered.api.client.rendering.model.Model;
import org.sandboxpowered.api.util.math.MatrixStack;

public interface VertexConsumer {

    void quad(MatrixStack.Matrices matrices, Model.Quad quad, Vector3fc colour, int light, int overlay);

    void vertex(Vector3fc position, Vector4fc colour, Vector2fc texture, int overlay, int light, Vector3fc normal);

    void vertex(Matrix4f matrix, float x, float y, float z);

    void vertex(Matrix4f matrix, Vector3fc vec);

    VertexConsumer vertex(float x, float y, float z);

    VertexConsumer vertex(Vector3fc vec);

    VertexConsumer color(int red, int green, int blue, int alpha);

    VertexConsumer color(int red, int green, int blue);

    VertexConsumer color(Vector4ic vec);

    VertexConsumer color(Vector3ic vec);

    VertexConsumer color(float red, float green, float blue, float alpha);

    VertexConsumer color(float red, float green, float blue);

    VertexConsumer color(Vector4fc vec);

    VertexConsumer color(Vector3fc vec);

    VertexConsumer texture(float u, float v);

    VertexConsumer texture(Vector2fc vec);

    VertexConsumer overlay(int uv);

    VertexConsumer overlay(int u, int v);

    VertexConsumer overlay(Vector2ic vec);

    VertexConsumer light(int uv);

    VertexConsumer light(int u, int v);

    VertexConsumer light(Vector2ic vec);

    VertexConsumer normal(float x, float y, float z);

    VertexConsumer normal(Vector3fc vec);

    void next();

    interface Provider {
        VertexConsumer getVertexConsumer(RenderLayer layer);
    }

    interface Builder extends VertexConsumer {
        void end();
    }
}