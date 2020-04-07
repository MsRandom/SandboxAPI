package org.sandboxpowered.sandbox.api.client.model;

import org.sandboxpowered.sandbox.api.client.render.universal.model.BakedModel;
import org.sandboxpowered.sandbox.api.util.Identity;

public interface ModelManager {
    /**
     * Registers a model to be manually loaded
     *
     * @param model Identity of the model to load
     */
    void register(Identity.Variant model);

    BakedModel getModel(Identity.Variant model);
}
