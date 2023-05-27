package net.kichwepchik.projectmod.event;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.item.ModItems;
import net.kichwepchik.projectmod.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

//
//import javax.swing.text.html.parser.Entity;
//
//public class ModEvents {
//    @Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID)
//    public class ForgeEvents{
//        @SubscribeEvent
//        public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
//            if (event.getObject() instanceof Player) {
//                if (!event.getObject().getCapability(PlayerThirstProvider.PLAYER_THIRST).isPresent()) {
//                    event.addCapability(new ResourceLocation(ProjectMod.MOD_ID, "properties"), new PlayerThirstProvider());
//                }
//            }
//        }
//
//        @SubscribeEvent
//        public static void onPlayerCloned(PlayerEvent.Clone event){
//            if (event.isWasDeath()){
//                event.getOriginal().getCapability(PlayerThirstProvider.PLAYER_THIRST).ifPresent(oldStore -> {
//                    event.getOriginal().getCapability(PlayerThirstProvider.PLAYER_THIRST).ifPresent(newStore -> {
//                        newStore.copyFrom(oldStore);
//                    });
//                });
//            }
//        }
//        @SubscribeEvent
//        public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
//            event.register(PlayerThirst.class);
//        }
//
//        @SubscribeEvent
//        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
//            if(event.side == LogicalSide.SERVER) {
//                event.player.getCapability(PlayerThirstProvider.PLAYER_THIRST).ifPresent(thirst -> {
//                    if(thirst.getThirst() > 0 && event.player.getRandom().nextFloat() < 0.005f) { // Once Every 10 Seconds on Avg
//                        thirst.subThirst(1);
//                        ModMessages.sendToPlayer(new ThirstDataSyncS2CPacket(thirst.getThirst()), ((ServerPlayer) event.player));
//                    }
//                });
//            }
//        }
//
//        @SubscribeEvent
//        public static void onPlayerJoinWorld(EntityJoinLevelEvent event) {
//            if (!event.getLevel().isClientSide()) {
//                if (event.getEntity() instanceof ServerPlayer player) {
//                    player.getCapability(PlayerThirstProvider.PLAYER_THIRST).ifPresent(thirst -> {
//                        ModMessages.sendToPlayer(new ThirstDataSyncS2CPacket(thirst.getThirst()), player);
//                    });
//                }
//            }
//        }
//        @Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//        public static class ModEventBusEvents {
//            @SubscribeEvent
//            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
//                event.put(ModEntityTypes.CHOMPER.get(), ChomperEntity.setAttributes());
//            }
//        }
//    }
//}
@Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){

        if(event.getType() == ModVillagers.CREATOR.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SAPPHIRE.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }

        if(event.getType() == ModVillagers.MINER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_PICKAXE, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    stack,10,8,0.02F));
        }

        if(event.getType() == ModVillagers.SEEKER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.ENDER_PEARL, 10);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack,10,8,0.02F));
        }

        if(event.getType() == ModVillagers.HUNTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND_SWORD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    stack,10,8,0.02F));
        }

        if(event.getType() == ModVillagers.ARCHITECT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.SAND, 64);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack,10,8,0.02F));
        }
    }
}


