package org.sandboxpowered.sandbox.api.client.render.universal.shader;

import org.joml.Matrix4fc;
import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public interface Shader {
    void bind();

    void attach(String samplerName, Object sampler);

    Uniform getUniform(String uniform);

    void unbind();

    interface Uniform {
        void set(float value);

        void set(Vector2fc vec);

        void set(Vector3fc vec);

        void set(Vector4fc vec);

        void set(Matrix4fc matrix4fc);
    }
}