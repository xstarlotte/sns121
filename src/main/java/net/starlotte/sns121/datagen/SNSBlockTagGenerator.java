package net.starlotte.sns121.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SNSBlockTagGenerator extends BlockTagsProvider {
    public SNSBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SNS121.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //HERB
                .add(SNSBlocks.CANDY_CANE_BRICKS.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_BUTTON.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_FENCE.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_SLAB.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_STAIRS.get())
                .add(SNSBlocks.CANDY_CANE_BRICK_WALL.get())

                .add(SNSBlocks.CANDY_CANE_STONE.get())
                .add(SNSBlocks.CANDY_CANE_STONE_COAL_ORE.get())
                .add(SNSBlocks.CANDY_CANE_STONE_BUTTON.get())
                .add(SNSBlocks.CANDY_CANE_STONE_FENCE.get())
                .add(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get())
                .add(SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get())
                .add(SNSBlocks.CANDY_CANE_STONE_SLAB.get())
                .add(SNSBlocks.CANDY_CANE_STONE_STAIRS.get())
                .add(SNSBlocks.CANDY_CANE_STONE_WALL.get())

                .add(SNSBlocks.MINT_BLOCK.get())
                .add(SNSBlocks.MINT_BUTTON.get())
                .add(SNSBlocks.MINT_FENCE.get())
                .add(SNSBlocks.MINT_FENCE_GATE.get())
                .add(SNSBlocks.MINT_PRESSURE_PLATE.get())
                .add(SNSBlocks.MINT_SLAB.get())
                .add(SNSBlocks.MINT_STAIRS.get())
                .add(SNSBlocks.MINT_WALL.get())

                .add(SNSBlocks.MINT_BRICKS.get())
                .add(SNSBlocks.MINT_BRICK_BUTTON.get())
                .add(SNSBlocks.MINT_BRICK_FENCE.get())
                .add(SNSBlocks.MINT_BRICK_FENCE_GATE.get())
                .add(SNSBlocks.MINT_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlocks.MINT_BRICK_SLAB.get())
                .add(SNSBlocks.MINT_BRICK_STAIRS.get())
                .add(SNSBlocks.MINT_BRICK_WALL.get())

                .add(SNSBlocks.MINT_HUMBUG_BLOCK.get())
                .add(SNSBlocks.MINT_HUMBUG_BUTTON.get())
                .add(SNSBlocks.MINT_HUMBUG_FENCE.get())
                .add(SNSBlocks.MINT_HUMBUG_FENCE_GATE.get())
                .add(SNSBlocks.MINT_HUMBUG_PRESSURE_PLATE.get())
                .add(SNSBlocks.MINT_HUMBUG_SLAB.get())
                .add(SNSBlocks.MINT_HUMBUG_STAIRS.get())
                .add(SNSBlocks.MINT_HUMBUG_WALL.get())

                .add(SNSBlocks.MINT_HUMBUG_BRICKS.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_BUTTON.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_FENCE.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_SLAB.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_STAIRS.get())
                .add(SNSBlocks.MINT_HUMBUG_BRICK_WALL.get())

                .add(SNSBlocks.TOOTHPASTE_BRICKS.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_BUTTON.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_FENCE.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_SLAB.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_STAIRS.get())
                .add(SNSBlocks.TOOTHPASTE_BRICK_WALL.get());

        this.tag(BlockTags.FENCES).add(SNSBlocks.CANDY_CANE_BRICK_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.CANDY_CANE_STONE_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.MINT_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.MINT_BRICK_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.MINT_HUMBUG_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.MINT_HUMBUG_BRICK_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.TOOTHPASTE_FENCE.get());
        this.tag(BlockTags.FENCES).add(SNSBlocks.TOOTHPASTE_BRICK_FENCE.get());

        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.MINT_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.MINT_BRICK_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.MINT_HUMBUG_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.TOOTHPASTE_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES).add(SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE.get());

        this.tag(BlockTags.WALLS).add(SNSBlocks.CANDY_CANE_BRICK_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.CANDY_CANE_STONE_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.MINT_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.MINT_BRICK_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.MINT_HUMBUG_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.MINT_HUMBUG_BRICK_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.TOOTHPASTE_WALL.get());
        this.tag(BlockTags.WALLS).add(SNSBlocks.TOOTHPASTE_BRICK_WALL.get());

    }

}
