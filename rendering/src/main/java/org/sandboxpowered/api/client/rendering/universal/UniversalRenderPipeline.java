package org.sandboxpowered.api.client.rendering.universal;

import org.sandboxpowered.api.client.rendering.RenderPipeline;

public interface UniversalRenderPipeline extends RenderPipeline {
    static boolean isSupported() {
        return true;
    }

}