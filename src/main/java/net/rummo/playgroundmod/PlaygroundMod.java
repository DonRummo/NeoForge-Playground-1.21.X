package net.rummo.playgroundmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.rummo.playgroundmod.block.ModBlocks;
import net.rummo.playgroundmod.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(PlaygroundMod.MOD_ID)
public class PlaygroundMod
{
    public static final String MOD_ID = "playgroundmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PlaygroundMod(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.REFINED_GILDED_NETHERITE_INGOT);
            event.accept(ModItems.UNREFINED_GILDED_NETHERITE_INGOT);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(ModBlocks.GILDED_NETHERITE_BLOCK);
        }

        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
        {
            event.accept(ModItems.DIAMOND_BEEF);
            event.accept(ModItems.DIAMOND_APPLE);
            event.accept(ModItems.DIAMOND_CARROT);
            event.accept(ModItems.DIAMOND_BEETROOT);
            event.accept(ModItems.DIAMOND_SALMON);
            event.accept(ModItems.DIAMOND_PORKCHOP);
            event.accept(ModItems.GOLDEN_BEETROOT);
            event.accept(ModItems.GOLDEN_PORKCHOP);
            event.accept(ModItems.GOLDEN_SALMON);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
