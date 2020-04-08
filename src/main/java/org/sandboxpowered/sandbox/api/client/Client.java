package org.sandboxpowered.sandbox.api.client;

import org.sandboxpowered.sandbox.api.client.model.ModelManager;
import org.sandboxpowered.sandbox.api.client.render.RenderManager;
import org.sandboxpowered.sandbox.api.util.Functions;

public interface Client {
    static Client getInstance() {
        return Functions.getInstance().clientInstance();
    }

    ModelManager getModelManager();

    RenderManager getRenderManager();
}
