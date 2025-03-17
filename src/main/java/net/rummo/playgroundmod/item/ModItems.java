package net.rummo.playgroundmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rummo.playgroundmod.PlaygroundMod;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PlaygroundMod.MOD_ID);

    public static final DeferredItem<Item> REFINED_GILDED_NETHERITE_INGOT = ITEMS.register("refinedgildednetheriteingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNREFINED_GILDED_NETHERITE_INGOT = ITEMS.register("unrefinedgildednetheriteingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMONDAPPLE)));

    public static final DeferredItem<Item> DIAMOND_BEEF = ITEMS.register("diamond_beef",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMONDBEEF)));

    public static final DeferredItem<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMONDCARROT)));

    public static final DeferredItem<Item> DIAMOND_BEETROOT = ITEMS.register("diamond_beetroot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMONDBEETROOT)));

    public static final DeferredItem<Item> DIAMOND_SALMON = ITEMS.register("diamond_salmon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMONDSALMON)));

    public static final DeferredItem<Item> DIAMOND_PORKCHOP = ITEMS.register("diamond_porkchop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DIAMONDPORKCHOP)));

    public static final DeferredItem<Item> GOLDEN_BEETROOT = ITEMS.register("golden_beetroot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDENBEETROOT)));

    public static final DeferredItem<Item> GOLDEN_PORKCHOP = ITEMS.register("golden_porkchop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDENPORKCHOP)));

    public static final DeferredItem<Item> GOLDEN_SALMON = ITEMS.register("golden_salmon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLDENSALMON)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
