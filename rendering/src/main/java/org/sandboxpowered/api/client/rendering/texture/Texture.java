package org.sandboxpowered.api.client.rendering.texture;

import org.joml.Vector2ic;

public interface Texture {
    /**
     * Size of the texture in pixels
     */
    Vector2ic getSize();

    /**
     * The texture U wrapping mode
     */
    WrapMode getWrapModeU();

    /**
     * The texture V wrapping mode
     */
    WrapMode getWrapModeV();

    enum WrapMode {
        /**
         * Texture doesn't wrap
         */
        NONE,
        /**
         * Repeats the texture
         */
        REPEAT,
        /**
         * Clamps the texture to the last pixel at the edge
         */
        CLAMP,
        /**
         * Repeats the texture mirroring it at every edge
         */
        MIRROR
    }
}