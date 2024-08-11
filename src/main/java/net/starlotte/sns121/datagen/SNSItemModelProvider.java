package net.starlotte.sns121.datagen;


import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;
import net.starlotte.sns121.item.SNSItems;

public class SNSItemModelProvider extends ItemModelProvider {
    public SNSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SNS121.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //HERB
        basicItem(SNSItems.CANDY_CANE.get());
        basicItem(SNSItems.CANDY_CANE_SUGAR.get());
        basicItem(SNSItems.MINT_HUMBUG.get());
        basicItem(SNSItems.PEPPERMINT_SWIRL.get());
        basicItem(SNSItems.TOOTHPASTE.get());

        buttonItem(SNSBlocks.CANDY_CANE_BRICK_BUTTON, SNSBlocks.CANDY_CANE_BRICKS);
        simpleBlockItem(SNSBlocks.CANDY_CANE_BRICK_DOOR);
        fenceItem(SNSBlocks.CANDY_CANE_BRICK_FENCE, SNSBlocks.CANDY_CANE_BRICKS);
        wallItem(SNSBlocks.CANDY_CANE_BRICK_WALL, SNSBlocks.CANDY_CANE_BRICKS);

        buttonItem(SNSBlocks.CANDY_CANE_STONE_BUTTON, SNSBlocks.CANDY_CANE_STONE);
        simpleBlockItem(SNSBlocks.CANDY_CANE_STONE_DOOR);
        fenceItem(SNSBlocks.CANDY_CANE_STONE_FENCE, SNSBlocks.CANDY_CANE_STONE);
        wallItem(SNSBlocks.CANDY_CANE_STONE_WALL, SNSBlocks.CANDY_CANE_STONE);

        simpleTorch(SNSBlocks.CANDY_CANE_TORCH);


        buttonItem(SNSBlocks.MINT_BUTTON, SNSBlocks.MINT_BLOCK);
        simpleBlockItem(SNSBlocks.MINT_DOOR);
        fenceItem(SNSBlocks.MINT_FENCE, SNSBlocks.MINT_BLOCK);
        wallItem(SNSBlocks.MINT_WALL, SNSBlocks.MINT_BLOCK);

        buttonItem(SNSBlocks.MINT_BRICK_BUTTON, SNSBlocks.MINT_BRICKS);
        simpleBlockItem(SNSBlocks.MINT_BRICK_DOOR);
        fenceItem(SNSBlocks.MINT_BRICK_FENCE, SNSBlocks.MINT_BRICKS);
        wallItem(SNSBlocks.MINT_BRICK_WALL, SNSBlocks.MINT_BRICKS);

        buttonItem(SNSBlocks.MINT_HUMBUG_BUTTON, SNSBlocks.MINT_HUMBUG_BLOCK);
        simpleBlockItem(SNSBlocks.MINT_HUMBUG_DOOR);
        fenceItem(SNSBlocks.MINT_HUMBUG_FENCE, SNSBlocks.MINT_HUMBUG_BLOCK);
        wallItem(SNSBlocks.MINT_HUMBUG_WALL, SNSBlocks.MINT_HUMBUG_BLOCK);

        buttonItem(SNSBlocks.MINT_HUMBUG_BRICK_BUTTON, SNSBlocks.MINT_HUMBUG_BRICKS);
        simpleBlockItem(SNSBlocks.MINT_HUMBUG_BRICK_DOOR);
        fenceItem(SNSBlocks.MINT_HUMBUG_BRICK_FENCE, SNSBlocks.MINT_HUMBUG_BRICKS);
        wallItem(SNSBlocks.MINT_HUMBUG_BRICK_WALL, SNSBlocks.MINT_HUMBUG_BRICKS);

        buttonItem(SNSBlocks.TOOTHPASTE_BUTTON, SNSBlocks.TOOTHPASTE_BLOCK);
        simpleBlockItem(SNSBlocks.TOOTHPASTE_DOOR);
        fenceItem(SNSBlocks.TOOTHPASTE_FENCE, SNSBlocks.TOOTHPASTE_BLOCK);
        wallItem(SNSBlocks.TOOTHPASTE_WALL, SNSBlocks.TOOTHPASTE_BLOCK);

        buttonItem(SNSBlocks.TOOTHPASTE_BRICK_BUTTON, SNSBlocks.TOOTHPASTE_BRICKS);
        simpleBlockItem(SNSBlocks.TOOTHPASTE_BRICK_DOOR);
        fenceItem(SNSBlocks.TOOTHPASTE_BRICK_FENCE, SNSBlocks.TOOTHPASTE_BRICKS);
        wallItem(SNSBlocks.TOOTHPASTE_BRICK_WALL, SNSBlocks.TOOTHPASTE_BRICKS);
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }



    private ItemModelBuilder simpleTorch(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID,"block/" + block.getId().getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
}
