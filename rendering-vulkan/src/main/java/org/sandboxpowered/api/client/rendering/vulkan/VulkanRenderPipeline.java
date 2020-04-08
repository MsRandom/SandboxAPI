package org.sandboxpowered.api.client.rendering.vulkan;

import org.sandboxpowered.api.client.rendering.RenderPipeline;

public interface VulkanRenderPipeline extends RenderPipeline {
    static boolean isSupported() {
        return false;
    }
}