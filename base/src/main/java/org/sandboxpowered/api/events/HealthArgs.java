package org.sandboxpowered.api.events;

import org.sandboxpowered.eventhandler.priority.Cancellable;

public interface HealthArgs extends Cancellable {
    float getAmount();
    void setAmount(float amount);
}
