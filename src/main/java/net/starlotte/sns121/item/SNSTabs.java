package net.starlotte.sns121.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;

public class SNSTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SNS121.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HERB_SNS_TAB = CREATIVE_MODE_TABS.register("herb_sns_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(SNSItems.CANDY_CANE.get()))
                    .title(Component.translatable("creativetab.herb_sns"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(SNSBlocks.CANDY_CANE_BRICKS.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_BUTTON.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_DOOR.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_FENCE.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_SLAB.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_STAIRS.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_TRAPDOOR.get());
                        output.accept(SNSBlocks.CANDY_CANE_BRICK_WALL.get());


                        output.accept(SNSBlocks.CANDY_CANE_STONE.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_BUTTON.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_DOOR.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_FENCE.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_SLAB.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_STAIRS.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_TRAPDOOR.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE_WALL.get());

                        //========================================================
                        output.accept(SNSBlocks.CANDY_CANE_TORCH.get());
                        output.accept(SNSBlocks.CANDY_CANE_WALL_TORCH.get());

                        output.accept(SNSBlocks.CANDY_CANE_STONE_COAL_ORE.get());


                        output.accept(SNSBlocks.MINT_BLOCK.get());
                        output.accept(SNSBlocks.MINT_BUTTON.get());
                        output.accept(SNSBlocks.MINT_DOOR.get());
                        output.accept(SNSBlocks.MINT_FENCE.get());
                        output.accept(SNSBlocks.MINT_FENCE_GATE.get());
                        output.accept(SNSBlocks.MINT_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.MINT_SLAB.get());
                        output.accept(SNSBlocks.MINT_STAIRS.get());
                        output.accept(SNSBlocks.MINT_TRAPDOOR.get());
                        output.accept(SNSBlocks.MINT_WALL.get());


                        output.accept(SNSBlocks.MINT_BRICKS.get());
                        output.accept(SNSBlocks.MINT_BRICK_BUTTON.get());
                        output.accept(SNSBlocks.MINT_BRICK_DOOR.get());
                        output.accept(SNSBlocks.MINT_BRICK_FENCE.get());
                        output.accept(SNSBlocks.MINT_BRICK_FENCE_GATE.get());
                        output.accept(SNSBlocks.MINT_BRICK_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.MINT_BRICK_SLAB.get());
                        output.accept(SNSBlocks.MINT_BRICK_STAIRS.get());
                        output.accept(SNSBlocks.MINT_BRICK_TRAPDOOR.get());
                        output.accept(SNSBlocks.MINT_BRICK_WALL.get());


                        output.accept(SNSBlocks.MINT_HUMBUG_BLOCK.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BUTTON.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_DOOR.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_FENCE.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_FENCE_GATE.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_SLAB.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_STAIRS.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_TRAPDOOR.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_WALL.get());


                        output.accept(SNSBlocks.MINT_HUMBUG_BRICKS.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_BUTTON.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_DOOR.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_FENCE.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_SLAB.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_STAIRS.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_TRAPDOOR.get());
                        output.accept(SNSBlocks.MINT_HUMBUG_BRICK_WALL.get());


                        output.accept(SNSBlocks.TOOTHPASTE_BLOCK.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BUTTON.get());
                        output.accept(SNSBlocks.TOOTHPASTE_DOOR.get());
                        output.accept(SNSBlocks.TOOTHPASTE_FENCE.get());
                        output.accept(SNSBlocks.TOOTHPASTE_FENCE_GATE.get());
                        output.accept(SNSBlocks.TOOTHPASTE_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.TOOTHPASTE_SLAB.get());
                        output.accept(SNSBlocks.TOOTHPASTE_STAIRS.get());
                        output.accept(SNSBlocks.TOOTHPASTE_TRAPDOOR.get());
                        output.accept(SNSBlocks.TOOTHPASTE_WALL.get());


                        output.accept(SNSBlocks.TOOTHPASTE_BRICKS.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_BUTTON.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_DOOR.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_FENCE.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_PRESSURE_PLATE.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_SLAB.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_STAIRS.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_TRAPDOOR.get());
                        output.accept(SNSBlocks.TOOTHPASTE_BRICK_WALL.get());




                        output.accept(SNSItems.CANDY_CANE.get());
                        output.accept(SNSItems.CANDY_CANE_SUGAR.get());
                        output.accept(SNSItems.MINT_HUMBUG.get());
                        output.accept(SNSItems.PEPPERMINT_SWIRL.get());
                        output.accept(SNSItems.TOOTHPASTE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
