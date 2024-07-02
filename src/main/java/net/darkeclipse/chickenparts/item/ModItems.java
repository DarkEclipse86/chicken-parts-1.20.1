package net.darkeclipse.chickenparts.item;

import net.darkeclipse.chickenparts.ChickenParts;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHICKEN_BONE = registerItem("chicken_bone", new Item(new FabricItemSettings()));
    public static final Item CHICKEN_CHUNK = registerItem("chicken_chunk", new Item(new FabricItemSettings().food(ModFood.CHICKEN_CHUNK)));

    private static void  addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHICKEN_BONE);
        entries.add(CHICKEN_CHUNK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChickenParts.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChickenParts.LOGGER.info("Registering Mod Items for " + ChickenParts.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(ModItems::addItemsToIngredientItemGroup);
    }
}
