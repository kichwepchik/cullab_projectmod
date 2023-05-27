package net.kichwepchik.projectmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_PROJECT = "key.category.projectmod.project";
    public static final String KEY_NOTHING_BUTTON = "key.projectmod.nothing";

    public static final KeyMapping NOTHING_KEY = new KeyMapping(KEY_NOTHING_BUTTON, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_0, KEY_CATEGORY_PROJECT);
}
