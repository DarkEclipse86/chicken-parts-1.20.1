package net.darkeclipse.chickenparts.util;

import net.darkeclipse.chickenparts.ChickenParts;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

    }

    public static class Items {
        public static final TagKey<Item> CHICKEN_LOOT = createTag("chicken_loot");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ChickenParts.MOD_ID, name));
        }
    }
}
