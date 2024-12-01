package net.starlotte.sns121.item;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.item.custom.PaxelItem;
import net.starlotte.sns121.item.custom.SNSHerbEffectItem;

public class SNSItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNS121.MOD_ID);

    //HERB


    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> MINT_HUMBUG = ITEMS.register("mint_humbug", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> PEPPERMINT_SWIRL = ITEMS.register("peppermint_swirl", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));


    public static final RegistryObject<Item> CANDY_CANE_HOE = ITEMS.register("candy_cane_hoe", () -> new HoeItem(SNSToolTiers.HERB, new Item.Properties().attributes(HoeItem.createAttributes(SNSToolTiers.HERB, 2, 1F))));
    public static final RegistryObject<Item> CANDY_CANE_PAXEL = ITEMS.register("candy_cane_paxel", () -> new PaxelItem(SNSToolTiers.HERB, new Item.Properties().attributes(HoeItem.createAttributes(SNSToolTiers.HERB, 4, 2F))));
    public static final RegistryObject<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword", () -> new SNSHerbEffectItem(SNSToolTiers.HERB, new Item.Properties().attributes(SwordItem.createAttributes(SNSToolTiers.HERB, 6, 4F)), MobEffects.POISON));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
