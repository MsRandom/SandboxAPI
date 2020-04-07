package org.sandboxpowered.sandbox.api.client.render.universal;

import org.sandboxpowered.sandbox.api.util.Identity;

public interface RenderLayer {
    static RenderLayer getSolid() {
        return null;
    }

    static RenderLayer getCutout() {
        return null;
    }

    static RenderLayer getTranslucent() {
        return null;
    }

    static RenderLayer getCustomSolid(Identity texture) {
        return null;
    }

    static RenderLayer getCustomCutout(Identity texture) {
        return null;
    }

    static RenderLayer getCustomTranslucent(Identity texture) {
        return null;
    }
}