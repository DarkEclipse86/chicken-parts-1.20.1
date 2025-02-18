package net.darkeclipse.chickenparts.item;

import net.minecraft.item.FoodComponent;

public class ModFood {
    public static final FoodComponent CHICKEN_CHUNK = new FoodComponent.Builder().hunger(2).saturationModifier(0).meat().build();
    public static final FoodComponent CHICKEN_NUGGET = new FoodComponent.Builder().hunger(1).saturationModifier(1).meat().build();
    public static final FoodComponent COOKED_CHICKEN_NUGGET = new FoodComponent.Builder().hunger(3).saturationModifier(1).meat().build();
    public static final FoodComponent COOKED_CHICKEN_CHUNK = new FoodComponent.Builder().hunger(4).saturationModifier(1).meat().build();
}
