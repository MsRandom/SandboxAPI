package org.sandboxpowered.sandbox.api.util.math;

import org.joml.*;

public interface MatrixStack {
    void push();

    void scale(double x, double y, double z);

    void scale(float x, float y, float z);

    void scale(Vector3dc vec);

    void scale(Vector3fc vec);

    void translate(double x, double y, double z);

    void translate(float x, float y, float z);

    void translate(Vector3dc vec);

    void translate(Vector3fc vec);

    void multiply(Quaterniondc quaternion);

    void multiply(Quaternionfc quaternion);

    Matrices peek();

    boolean isEmpty();

    void pop();

    interface Matrices {
        Matrix4fc getModelMatrix();

        Matrix3fc getNormalMatrix();
    }
}