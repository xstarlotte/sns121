package net.starlotte.sns121.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class SNSFoodProperties {
    public static final FoodProperties HERB = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL, 100, 1), 1.0F)
            .build();
}
