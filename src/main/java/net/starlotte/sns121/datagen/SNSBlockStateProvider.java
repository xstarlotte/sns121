package net.starlotte.sns121.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;

public class SNSBlockStateProvider extends BlockStateProvider {
    public SNSBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SNS121.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //HERB
        blockWithItem(SNSBlocks.CANDY_CANE_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlocks.CANDY_CANE_BRICK_BUTTON.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.CANDY_CANE_BRICK_DOOR.get()), modLoc("block/candy_cane_brick_door_bottom"), modLoc("block/candy_cane_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.CANDY_CANE_BRICK_FENCE.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        blockItem(SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.CANDY_CANE_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        blockItem(SNSBlocks.CANDY_CANE_BRICK_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.CANDY_CANE_BRICK_SLAB.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        blockItem(SNSBlocks.CANDY_CANE_BRICK_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.CANDY_CANE_BRICK_STAIRS.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        blockItem(SNSBlocks.CANDY_CANE_BRICK_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.CANDY_CANE_BRICK_TRAPDOOR.get()), modLoc("block/candy_cane_brick_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.CANDY_CANE_BRICK_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.CANDY_CANE_BRICK_WALL.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));

        blockWithItem(SNSBlocks.CANDY_CANE_STONE);
        buttonBlock(((ButtonBlock) SNSBlocks.CANDY_CANE_STONE_BUTTON.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.CANDY_CANE_STONE_DOOR.get()), modLoc("block/candy_cane_stone_door_bottom"), modLoc("block/candy_cane_stone_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.CANDY_CANE_STONE_FENCE.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        blockItem(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        blockItem(SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.CANDY_CANE_STONE_SLAB.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        blockItem(SNSBlocks.CANDY_CANE_STONE_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.CANDY_CANE_STONE_STAIRS.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        blockItem(SNSBlocks.CANDY_CANE_STONE_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.CANDY_CANE_STONE_TRAPDOOR.get()), modLoc("block/candy_cane_stone_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.CANDY_CANE_STONE_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.CANDY_CANE_STONE_WALL.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));

        blockWithItem(SNSBlocks.CANDY_CANE_STONE_COAL_ORE);

        blockWithItem(SNSBlocks.MINT_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlocks.MINT_BUTTON.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.MINT_DOOR.get()), modLoc("block/mint_door_bottom"), modLoc("block/mint_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.MINT_FENCE.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        blockItem(SNSBlocks.MINT_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.MINT_FENCE_GATE.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.MINT_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        blockItem(SNSBlocks.MINT_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.MINT_SLAB.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        blockItem(SNSBlocks.MINT_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.MINT_STAIRS.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        blockItem(SNSBlocks.MINT_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.MINT_TRAPDOOR.get()), modLoc("block/mint_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.MINT_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.MINT_WALL.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));

        blockWithItem(SNSBlocks.MINT_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlocks.MINT_BRICK_BUTTON.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.MINT_BRICK_DOOR.get()), modLoc("block/mint_brick_door_bottom"), modLoc("block/mint_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.MINT_BRICK_FENCE.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        blockItem(SNSBlocks.MINT_BRICK_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.MINT_BRICK_FENCE_GATE.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.MINT_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        blockItem(SNSBlocks.MINT_BRICK_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.MINT_BRICK_SLAB.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        blockItem(SNSBlocks.MINT_BRICK_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.MINT_BRICK_STAIRS.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        blockItem(SNSBlocks.MINT_BRICK_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.MINT_BRICK_TRAPDOOR.get()), modLoc("block/mint_brick_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.MINT_BRICK_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.MINT_BRICK_WALL.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));

        blockWithItem(SNSBlocks.MINT_HUMBUG_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlocks.MINT_HUMBUG_BUTTON.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.MINT_HUMBUG_DOOR.get()), modLoc("block/mint_humbug_door_bottom"), modLoc("block/mint_humbug_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.MINT_HUMBUG_FENCE.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.MINT_HUMBUG_FENCE_GATE.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.MINT_HUMBUG_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.MINT_HUMBUG_SLAB.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.MINT_HUMBUG_STAIRS.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.MINT_HUMBUG_TRAPDOOR.get()), modLoc("block/mint_humbug_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.MINT_HUMBUG_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.MINT_HUMBUG_WALL.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BLOCK.get()));

        blockWithItem(SNSBlocks.MINT_HUMBUG_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlocks.MINT_HUMBUG_BRICK_BUTTON.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.MINT_HUMBUG_BRICK_DOOR.get()), modLoc("block/mint_humbug_brick_door_bottom"), modLoc("block/mint_humbug_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.MINT_HUMBUG_BRICK_FENCE.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.MINT_HUMBUG_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_BRICK_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.MINT_HUMBUG_BRICK_SLAB.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_BRICK_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.MINT_HUMBUG_BRICK_STAIRS.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));
        blockItem(SNSBlocks.MINT_HUMBUG_BRICK_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.MINT_HUMBUG_BRICK_TRAPDOOR.get()), modLoc("block/mint_humbug_brick_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.MINT_HUMBUG_BRICK_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.MINT_HUMBUG_BRICK_WALL.get()), blockTexture(SNSBlocks.MINT_HUMBUG_BRICKS.get()));

        blockWithItem(SNSBlocks.TOOTHPASTE_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlocks.TOOTHPASTE_BUTTON.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.TOOTHPASTE_DOOR.get()), modLoc("block/toothpaste_door_bottom"), modLoc("block/toothpaste_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.TOOTHPASTE_FENCE.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        blockItem(SNSBlocks.TOOTHPASTE_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.TOOTHPASTE_FENCE_GATE.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.TOOTHPASTE_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        blockItem(SNSBlocks.TOOTHPASTE_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.TOOTHPASTE_SLAB.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        blockItem(SNSBlocks.TOOTHPASTE_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.TOOTHPASTE_STAIRS.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        blockItem(SNSBlocks.TOOTHPASTE_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.TOOTHPASTE_TRAPDOOR.get()), modLoc("block/toothpaste_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.TOOTHPASTE_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.TOOTHPASTE_WALL.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));

        blockWithItem(SNSBlocks.TOOTHPASTE_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlocks.TOOTHPASTE_BRICK_BUTTON.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlocks.TOOTHPASTE_BRICK_DOOR.get()), modLoc("block/toothpaste_brick_door_bottom"), modLoc("block/toothpaste_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlocks.TOOTHPASTE_BRICK_FENCE.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        blockItem(SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE);
        fenceGateBlock(((FenceGateBlock) SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) SNSBlocks.TOOTHPASTE_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        blockItem(SNSBlocks.TOOTHPASTE_BRICK_PRESSURE_PLATE);
        slabBlock(((SlabBlock) SNSBlocks.TOOTHPASTE_BRICK_SLAB.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        blockItem(SNSBlocks.TOOTHPASTE_BRICK_SLAB);
        stairsBlock(((StairBlock) SNSBlocks.TOOTHPASTE_BRICK_STAIRS.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        blockItem(SNSBlocks.TOOTHPASTE_BRICK_STAIRS);
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlocks.TOOTHPASTE_BRICK_TRAPDOOR.get()), modLoc("block/toothpaste_brick_trapdoor"), true, "translucent");
        blockItem(SNSBlocks.TOOTHPASTE_BRICK_TRAPDOOR, "_bottom");
        wallBlock(((WallBlock) SNSBlocks.TOOTHPASTE_BRICK_WALL.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));








    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("sns121:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("sns121:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

}
