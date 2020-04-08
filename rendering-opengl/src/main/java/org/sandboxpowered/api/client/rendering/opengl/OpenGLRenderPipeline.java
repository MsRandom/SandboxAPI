package org.sandboxpowered.api.client.rendering.opengl;

import org.sandboxpowered.api.client.rendering.RenderPipeline;

public interface OpenGLRenderPipeline extends RenderPipeline {
    static boolean isSupported() {
        return false;
    }

    static OpenGLRenderPipeline getInstance() throws UnsupportedRenderPipelineException {
        throw new UnsupportedRenderPipelineException();
    }
}