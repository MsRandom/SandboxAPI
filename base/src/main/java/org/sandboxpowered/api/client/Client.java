package org.sandboxpowered.api.client;

import org.sandboxpowered.api.util.Functions;

public interface Client {
    static Client getInstance() {
        return Functions.getInstance().clientInstance();
    }
}
