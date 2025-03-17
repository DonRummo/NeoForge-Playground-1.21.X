package net.rummo.playgroundmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties DIAMONDBEEF = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties DIAMONDAPPLE = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties DIAMONDCARROT = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties DIAMONDBEETROOT = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties DIAMONDSALMON = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties DIAMONDPORKCHOP = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties GOLDENBEETROOT = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties GOLDENPORKCHOP = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties GOLDENSALMON = new FoodProperties.Builder().nutrition(10).saturationModifier(4.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();
}
