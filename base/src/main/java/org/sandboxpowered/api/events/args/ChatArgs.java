package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.util.text.Text;

public class ChatArgs extends EntityArgs<PlayerEntity> {
    private Text text;

    public Text getText() {
        return text;
    }

    public final ChatArgs setup(PlayerEntity player, Text text) {
        setup(player);
        this.text = text;
        return this;
    }
}
