package org.sandboxpowered.api.client.rendering;

import org.sandboxpowered.api.client.rendering.universal.model.BakedModel;
import org.sandboxpowered.api.util.Identity;

public interface ModelManager {
    /**
     * Registers a model to be manually loaded
     *
     * @param model Identity of the model to load
     */
    void register(Identity.Variant model);

    BakedModel getModel(Identity.Variant model);
}
