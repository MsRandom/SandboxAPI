package org.sandboxpowered.api.events.args;

import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class HealthArgs extends CancellableEventArgs {
    private final float amount;

    public HealthArgs(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}
