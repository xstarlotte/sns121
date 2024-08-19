package net.starlotte.sns121.item;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;

import java.util.function.Supplier;

public class SNSItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNS121.MOD_ID);

    //HERB


    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> MINT_HUMBUG = ITEMS.register("mint_humbug", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> PEPPERMINT_SWIRL = ITEMS.register("peppermint_swirl", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));


    public static final RegistryObject<Item> CANDY_CANE_HOE = ITEMS.register("candy_cane_hoe", () -> new HoeItem(SNSToolTiers.HERB, new Item.Properties().attributes(HoeItem.createAttributes(SNSToolTiers.HERB, 5, 3F))));
    public static final RegistryObject<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword", () -> new SwordItem(SNSToolTiers.HERB, new Item.Properties().attributes(SwordItem.createAttributes(SNSToolTiers.HERB, 2, 1.5F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
