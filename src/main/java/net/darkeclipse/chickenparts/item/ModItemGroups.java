package net.darkeclipse.chickenparts.item;

import net.darkeclipse.chickenparts.ChickenParts;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHICKEN_CORE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChickenParts.MOD_ID, "chicken_bone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chicken_core"))
                    .icon(() -> new ItemStack(ModItems.CHICKEN_BONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHICKEN_BONE);
                        entries.add(ModItems.CHICKEN_CHUNK);
                        entries.add(ModItems.CHICKEN_NUGGET);

                    }).build());

    public static void registerItemGrups() {
        ChickenParts.LOGGER.info("Registering Item Groups for" + ChickenParts.MOD_ID);
    }
}
