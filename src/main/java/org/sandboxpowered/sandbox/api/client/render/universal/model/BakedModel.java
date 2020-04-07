package org.sandboxpowered.sandbox.api.client.render.universal.model;

import org.sandboxpowered.sandbox.api.util.Direction;

import java.util.Collection;

public interface BakedModel {

    Collection<Quad> getQuads(Direction direction);

    Collection<Quad> getAllQuads();

    interface Quad {
    }
}
