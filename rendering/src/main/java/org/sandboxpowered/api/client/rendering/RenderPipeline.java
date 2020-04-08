package org.sandboxpowered.api.client.rendering;

import org.sandboxpowered.api.client.rendering.manager.ModelManager;
import org.sandboxpowered.api.client.rendering.manager.RenderManager;
import org.sandboxpowered.api.client.rendering.manager.ShaderManager;

public interface RenderPipeline {

    RenderManager getRenderManager();

    ModelManager getModelManager();

    ShaderManager getShaderManager();

    class UnsupportedRenderPipelineException extends RuntimeException {

    }

}