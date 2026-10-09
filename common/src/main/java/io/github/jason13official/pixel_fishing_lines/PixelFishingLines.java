package io.github.jason13official.pixel_fishing_lines;

import net.minecraft.resources.ResourceLocation;

public class PixelFishingLines {

  public static void init() {

    // Sailing.register(Constants.MOD_ID, MonoLib.createFilename(Constants.MOD_ID, "1.21.1", "1.0.0"));
  }

  public static ResourceLocation identifier(final String path) {
    return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
  }
}