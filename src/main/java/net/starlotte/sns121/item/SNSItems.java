package net.starlotte.sns121.item;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;

public class SNSItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNS121.MOD_ID);

    //HERB

    public static final RegistryObject<Item> CANDY_CANE_TORCH_ITEM = ITEMS.register("candy_cane_torch", () -> new StandingAndWallBlockItem(SNSBlocks.CANDY_CANE_TORCH.get(), SNSBlocks.CANDY_CANE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> MINT_HUMBUG = ITEMS.register("mint_humbug", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> PEPPERMINT_SWIRL = ITEMS.register("peppermint_swirl", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));
    public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().food(SNSFoodProperties.HERB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
