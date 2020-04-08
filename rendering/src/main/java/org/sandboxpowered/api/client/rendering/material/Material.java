package org.sandboxpowered.api.client.rendering.material;

import org.sandboxpowered.api.client.rendering.Colour;
import org.sandboxpowered.api.client.rendering.texture.Texture;

public interface Material {
    Texture getTexture();

    Colour getAlbedo();

    Texture getMetallic();

    Texture getSmoothness();

    Colour.HDR getEmission();
}