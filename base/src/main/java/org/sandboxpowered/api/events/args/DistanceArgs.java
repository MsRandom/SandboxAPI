package org.sandboxpowered.api.events.args;

import org.sandboxpowered.eventhandler.CancellableEventArgs;

public class DistanceArgs extends CancellableEventArgs {
    private final float distance;

    public DistanceArgs(float distance) {
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }
}
