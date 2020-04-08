package org.sandboxpowered.api.client.rendering.texture;

public interface Atlas {
    interface AtlasTexture extends Texture {
        Atlas getAtlas();
    }
}
