package net.starlotte.sns121.block;

import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;

import net.starlotte.sns121.item.SNSItems;

import java.util.function.Supplier;

public class SNSBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SNS121.MOD_ID);

    //HERB
    public static final RegistryObject<Block> CANDY_CANE_BRICKS = registerBlock("candy_cane_bricks", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_BUTTON = registerBlock("candy_cane_brick_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_DOOR = registerBlock("candy_cane_brick_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_FENCE = registerBlock("candy_cane_brick_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_FENCE_GATE = registerBlock("candy_cane_brick_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_PRESSURE_PLATE = registerBlock("candy_cane_brick_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_SLAB = registerBlock("candy_cane_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_STAIRS = registerBlock("candy_cane_brick_stairs", () -> new StairBlock(SNSBlocks.CANDY_CANE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_TRAPDOOR = registerBlock("candy_cane_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> CANDY_CANE_BRICK_WALL = registerBlock("candy_cane_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CANDY_CANE_STONE = registerBlock("candy_cane_stone", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_BUTTON = registerBlock("candy_cane_stone_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_DOOR = registerBlock("candy_cane_stone_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_FENCE = registerBlock("candy_cane_stone_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_FENCE_GATE = registerBlock("candy_cane_stone_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_PRESSURE_PLATE = registerBlock("candy_cane_stone_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_SLAB = registerBlock("candy_cane_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_STAIRS = registerBlock("candy_cane_stone_stairs", () -> new StairBlock(SNSBlocks.CANDY_CANE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_TRAPDOOR = registerBlock("candy_cane_stone_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_WALL = registerBlock("candy_cane_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CANDY_CANE_STONE_COAL_ORE = registerBlock("candy_cane_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> CANDY_CANE_TORCH = registerBlock("candy_cane_torch", () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final RegistryObject<Block> CANDY_CANE_WALL_TORCH = registerBlock("candy_cane_wall_torch", () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));



    public static final RegistryObject<Block> MINT_BLOCK = registerBlock("mint_block", () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_BUTTON = registerBlock("mint_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_DOOR = registerBlock("mint_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_FENCE = registerBlock("mint_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_FENCE_GATE = registerBlock("mint_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_PRESSURE_PLATE = registerBlock("mint_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MINT_SLAB = registerBlock("mint_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_STAIRS = registerBlock("mint_stairs", () -> new StairBlock(SNSBlocks.MINT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_TRAPDOOR = registerBlock("mint_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_WALL = registerBlock("mint_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MINT_BRICKS = registerBlock("mint_bricks", () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_BRICK_BUTTON = registerBlock("mint_brick_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_BRICK_DOOR = registerBlock("mint_brick_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_BRICK_FENCE = registerBlock("mint_brick_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_BRICK_FENCE_GATE = registerBlock("mint_brick_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_BRICK_PRESSURE_PLATE = registerBlock("mint_brick_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MINT_BRICK_SLAB = registerBlock("mint_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_BRICK_STAIRS = registerBlock("mint_brick_stairs", () -> new StairBlock(SNSBlocks.MINT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_BRICK_TRAPDOOR = registerBlock("mint_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_BRICK_WALL = registerBlock("mint_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> MINT_HUMBUG_BLOCK = registerBlock("mint_humbug_block", () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_HUMBUG_BUTTON = registerBlock("mint_humbug_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_HUMBUG_DOOR = registerBlock("mint_humbug_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_HUMBUG_FENCE = registerBlock("mint_humbug_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_HUMBUG_FENCE_GATE = registerBlock("mint_humbug_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_HUMBUG_PRESSURE_PLATE = registerBlock("mint_humbug_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MINT_HUMBUG_SLAB = registerBlock("mint_humbug_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_HUMBUG_STAIRS = registerBlock("mint_humbug_stairs", () -> new StairBlock(SNSBlocks.MINT_HUMBUG_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_HUMBUG_TRAPDOOR = registerBlock("mint_humbug_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_HUMBUG_WALL = registerBlock("mint_humbug_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MINT_HUMBUG_BRICKS = registerBlock("mint_humbug_bricks", () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_BUTTON = registerBlock("mint_humbug_brick_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_DOOR = registerBlock("mint_humbug_brick_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_FENCE = registerBlock("mint_humbug_brick_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_FENCE_GATE = registerBlock("mint_humbug_brick_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_PRESSURE_PLATE = registerBlock("mint_humbug_brick_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_SLAB = registerBlock("mint_humbug_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_STAIRS = registerBlock("mint_humbug_brick_stairs", () -> new StairBlock(SNSBlocks.MINT_HUMBUG_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_TRAPDOOR = registerBlock("mint_humbug_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> MINT_HUMBUG_BRICK_WALL = registerBlock("mint_humbug_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> TOOTHPASTE_BLOCK = registerBlock("toothpaste_block", () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> TOOTHPASTE_BUTTON = registerBlock("toothpaste_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> TOOTHPASTE_DOOR = registerBlock("toothpaste_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> TOOTHPASTE_FENCE = registerBlock("toothpaste_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> TOOTHPASTE_FENCE_GATE = registerBlock("toothpaste_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> TOOTHPASTE_PRESSURE_PLATE = registerBlock("toothpaste_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOOTHPASTE_SLAB = registerBlock("toothpaste_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> TOOTHPASTE_STAIRS = registerBlock("toothpaste_stairs", () -> new StairBlock(SNSBlocks.TOOTHPASTE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> TOOTHPASTE_TRAPDOOR = registerBlock("toothpaste_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> TOOTHPASTE_WALL = registerBlock("toothpaste_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TOOTHPASTE_BRICKS = registerBlock("toothpaste_bricks", () -> new Block(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_BUTTON = registerBlock("toothpaste_brick_button", () -> new ButtonBlock(BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_DOOR = registerBlock("toothpaste_brick_door", () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_FENCE = registerBlock("toothpaste_brick_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_FENCE_GATE = registerBlock("toothpaste_brick_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_PRESSURE_PLATE = registerBlock("toothpaste_brick_plate", () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_SLAB = registerBlock("toothpaste_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_STAIRS = registerBlock("toothpaste_brick_stairs", () -> new StairBlock(SNSBlocks.TOOTHPASTE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(1f)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_TRAPDOOR = registerBlock("toothpaste_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission().noOcclusion()));
    public static final RegistryObject<Block> TOOTHPASTE_BRICK_WALL = registerBlock("toothpaste_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));




















    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        SNSItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
