package net.darkeclipse.chickenparts.item;

import net.darkeclipse.chickenparts.ChickenParts;
import net.darkeclipse.chickenparts.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHICKEN_PARTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChickenParts.MOD_ID, "chicken_bone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chicken_parts"))
                    .icon(() -> new ItemStack(ModItems.CHICKEN_BONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHICKEN_BONE);
                        entries.add(ModItems.CHICKEN_CHUNK);
                        entries.add(ModItems.CHICKEN_NUGGET);
                        entries.add(ModItems.COOKED_CHICKEN_NUGGET);
                        entries.add(ModItems.COOKED_CHICKEN_CHUNK);
                        entries.add(ModBlocks.CLOTH);

                    }).build());

    public static void registerItemGrups() {
        ChickenParts.LOGGER.info("Registering Item Groups for" + ChickenParts.MOD_ID);
    }
}
