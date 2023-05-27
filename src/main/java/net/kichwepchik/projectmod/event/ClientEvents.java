package net.kichwepchik.projectmod.event;

import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.networking.ModMessages;
import net.kichwepchik.projectmod.networking.packet.ProjectC2SPacket;
import net.kichwepchik.projectmod.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



public class ClientEvents {
    @Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.NOTHING_KEY.consumeClick()) {
                ModMessages.sendToServer(new ProjectC2SPacket());
            }
        }
    }

    @Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.NOTHING_KEY);
        }
    }
}
