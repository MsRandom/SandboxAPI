package org.sandboxpowered.api;

import org.sandboxpowered.api.addon.AddonInfo;
import org.sandboxpowered.api.util.Log;
import org.sandboxpowered.api.util.Side;

public interface SandboxAPI {
    AddonInfo getSourceAddon();

    Side getSide();

    default void execute(Side side, Runnable runnable) {
        if (getSide() == side) {
            runnable.run();
        }
    }

    Log getLog();
}