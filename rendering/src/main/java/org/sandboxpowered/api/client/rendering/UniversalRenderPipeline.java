package org.sandboxpowered.api.client.rendering;

public interface UniversalRenderPipeline extends RenderPipeline {
    static boolean isSupported() {
        return true;
    }

    static UniversalRenderPipeline getInstance() {
        return null;
    }

}