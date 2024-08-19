package net.starlotte.sns121.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.starlotte.sns121.util.SNSTags;

public class SNSToolTiers {
    public static final Tier HERB = new ForgeTier(1000, 4, 3f, 18,
            SNSTags.Blocks.NEEDS_HERB_TOOL, () -> Ingredient.of(SNSItems.CANDY_CANE_SUGAR.get()), SNSTags.Blocks.INCORRECT_FOR_HERB_TOOL);
}
