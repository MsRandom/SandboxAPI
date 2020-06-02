package org.sandboxpowered.api.events;

import org.sandboxpowered.eventhandler.priority.Cancellable;

public interface DistanceArgs extends Cancellable {
    float getDistance();
    void setDistance(float distance);
}
