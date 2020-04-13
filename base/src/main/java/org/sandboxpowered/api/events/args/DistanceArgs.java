package org.sandboxpowered.api.events.args;

import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class DistanceArgs extends CancellableEventArgs {
    private float distance;

    public float getDistance() {
        return distance;
    }

    public final DistanceArgs setup(float distance) {
        reset();
        this.distance = distance;
        return this;
    }
}
