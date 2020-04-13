package org.sandboxpowered.api.events.args;

import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class HealthArgs extends CancellableEventArgs {
    private float amount;

    public float getAmount() {
        return amount;
    }

    public final HealthArgs setup(float amount) {
        reset();
        this.amount = amount;
        return this;
    }
}
