package org.sandboxpowered.api.events.args;

import org.sandboxpowered.api.entity.player.PlayerEntity;
import org.sandboxpowered.api.util.text.Text;

public class ChatArgs extends EntityArgs<PlayerEntity> {
    private Text text;

    public ChatArgs(PlayerEntity player, Text text) {
        super(player);
        this.text = text;
    }

    public Text getText() {
        return text;
    }
}
