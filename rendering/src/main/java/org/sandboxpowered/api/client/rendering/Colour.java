package org.sandboxpowered.api.client.rendering;

public interface Colour {
    float getRed();

    float getGreen();

    float getBlue();

    float getAlpha();

    interface HDR extends Colour {
        float getIntensity();
    }
}
