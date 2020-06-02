package org.sandboxpowered.api.events;

import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.util.text.Text;

public interface ChatArgs extends EntityArgs<PlayerEntity> {
    Text getText();
}
