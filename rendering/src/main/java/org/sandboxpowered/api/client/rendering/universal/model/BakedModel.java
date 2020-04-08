package org.sandboxpowered.api.client.rendering.universal.model;

import org.sandboxpowered.api.util.Direction;

import java.util.Collection;

public interface BakedModel {

    Collection<Quad> getQuads(Direction direction);

    Collection<Quad> getAllQuads();

    interface Quad {
    }
}
