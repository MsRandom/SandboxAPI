package org.sandboxpowered.api.client.rendering.manager;

import org.sandboxpowered.api.client.rendering.model.Model;
import org.sandboxpowered.api.util.Identity;

import java.util.Collection;

public interface ModelManager {
    /**
     * Registers a model to be manually loaded
     *
     * @param model Identity of the model to load
     */
    void register(Identity.Variant model);

    Model getModel(Identity.Variant model);

    Collection<Identity> getSupportedModelFormats();

    boolean isSupportedFormat(Identity modelType);

    interface DefaultFormats {
        Identity MOJANGSON = Identity.of("minecraft", "json");
        Identity OBJ = Identity.of("sandbox", "obj");
    }
}