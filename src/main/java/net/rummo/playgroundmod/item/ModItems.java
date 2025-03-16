package net.rummo.playgroundmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rummo.playgroundmod.PlaygroundMod;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PlaygroundMod.MOD_ID);

    public static final DeferredItem<Item> GILDED_NETHERITE = ITEMS.register("gildednetherite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNREFINED_GILDED_NETHERITE = ITEMS.register("ungildnetherite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
