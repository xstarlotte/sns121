package net.starlotte.sns121.datagen.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.starlotte.sns121.block.SNSBlocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class SNSBlockLootTables extends BlockLootSubProvider {
    public SNSBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {

        //HERB
        dropSelf(SNSBlocks.CANDY_CANE_BRICKS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICK_BUTTON.get());
        this.add(SNSBlocks.CANDY_CANE_BRICK_DOOR.get(), block -> createDoorTable(SNSBlocks.CANDY_CANE_BRICK_DOOR.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICK_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BRICK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BRICK_SLAB.get()));
        dropSelf(SNSBlocks.CANDY_CANE_BRICK_STAIRS.get());
        dropSelf(SNSBlocks.CANDY_CANE_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlocks.CANDY_CANE_BRICK_WALL.get());

        dropSelf(SNSBlocks.CANDY_CANE_STONE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_BUTTON.get());
        this.add(SNSBlocks.CANDY_CANE_STONE_DOOR.get(), block -> createDoorTable(SNSBlocks.CANDY_CANE_STONE_DOOR.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_STONE_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_STONE_SLAB.get()));
        dropSelf(SNSBlocks.CANDY_CANE_STONE_STAIRS.get());
        dropSelf(SNSBlocks.CANDY_CANE_STONE_TRAPDOOR.get());
        dropSelf(SNSBlocks.CANDY_CANE_STONE_WALL.get());

        //===================================================
        this.dropSelf(SNSBlocks.CANDY_CANE_TORCH.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_WALL_TORCH.get());

        dropSelf(SNSBlocks.MINT_BLOCK.get());
        this.dropSelf(SNSBlocks.MINT_BUTTON.get());
        this.add(SNSBlocks.MINT_DOOR.get(), block -> createDoorTable(SNSBlocks.MINT_DOOR.get()));
        this.dropSelf(SNSBlocks.MINT_FENCE.get());
        this.dropSelf(SNSBlocks.MINT_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.MINT_PRESSURE_PLATE.get());
        this.add(SNSBlocks.MINT_SLAB.get(), block -> createSlabItemTable(SNSBlocks.MINT_SLAB.get()));
        dropSelf(SNSBlocks.MINT_STAIRS.get());
        dropSelf(SNSBlocks.MINT_TRAPDOOR.get());
        dropSelf(SNSBlocks.MINT_WALL.get());

        dropSelf(SNSBlocks.MINT_BRICKS.get());
        this.dropSelf(SNSBlocks.MINT_BRICK_BUTTON.get());
        this.add(SNSBlocks.MINT_BRICK_DOOR.get(), block -> createDoorTable(SNSBlocks.MINT_BRICK_DOOR.get()));
        this.dropSelf(SNSBlocks.MINT_BRICK_FENCE.get());
        this.dropSelf(SNSBlocks.MINT_BRICK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.MINT_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.MINT_BRICK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.MINT_BRICK_SLAB.get()));
        dropSelf(SNSBlocks.MINT_BRICK_STAIRS.get());
        dropSelf(SNSBlocks.MINT_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlocks.MINT_BRICK_WALL.get());

        dropSelf(SNSBlocks.MINT_HUMBUG_BLOCK.get());
        this.dropSelf(SNSBlocks.MINT_HUMBUG_BUTTON.get());
        this.add(SNSBlocks.MINT_HUMBUG_DOOR.get(), block -> createDoorTable(SNSBlocks.MINT_HUMBUG_DOOR.get()));
        this.dropSelf(SNSBlocks.MINT_HUMBUG_FENCE.get());
        this.dropSelf(SNSBlocks.MINT_HUMBUG_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.MINT_HUMBUG_PRESSURE_PLATE.get());
        this.add(SNSBlocks.MINT_HUMBUG_SLAB.get(), block -> createSlabItemTable(SNSBlocks.MINT_HUMBUG_SLAB.get()));
        dropSelf(SNSBlocks.MINT_HUMBUG_STAIRS.get());
        dropSelf(SNSBlocks.MINT_HUMBUG_TRAPDOOR.get());
        dropSelf(SNSBlocks.MINT_HUMBUG_WALL.get());

        dropSelf(SNSBlocks.MINT_HUMBUG_BRICKS.get());
        this.dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_BUTTON.get());
        this.add(SNSBlocks.MINT_HUMBUG_BRICK_DOOR.get(), block -> createDoorTable(SNSBlocks.MINT_HUMBUG_BRICK_DOOR.get()));
        this.dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_FENCE.get());
        this.dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.MINT_HUMBUG_BRICK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.MINT_HUMBUG_BRICK_SLAB.get()));
        dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_STAIRS.get());
        dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlocks.MINT_HUMBUG_BRICK_WALL.get());

        dropSelf(SNSBlocks.TOOTHPASTE_BLOCK.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BUTTON.get());
        this.add(SNSBlocks.TOOTHPASTE_DOOR.get(), block -> createDoorTable(SNSBlocks.TOOTHPASTE_DOOR.get()));
        this.dropSelf(SNSBlocks.TOOTHPASTE_FENCE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_PRESSURE_PLATE.get());
        this.add(SNSBlocks.TOOTHPASTE_SLAB.get(), block -> createSlabItemTable(SNSBlocks.TOOTHPASTE_SLAB.get()));
        dropSelf(SNSBlocks.TOOTHPASTE_STAIRS.get());
        dropSelf(SNSBlocks.TOOTHPASTE_TRAPDOOR.get());
        dropSelf(SNSBlocks.TOOTHPASTE_WALL.get());

        dropSelf(SNSBlocks.TOOTHPASTE_BRICKS.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICK_BUTTON.get());
        this.add(SNSBlocks.TOOTHPASTE_BRICK_DOOR.get(), block -> createDoorTable(SNSBlocks.TOOTHPASTE_BRICK_DOOR.get()));
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICK_FENCE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.TOOTHPASTE_BRICK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.TOOTHPASTE_BRICK_SLAB.get()));
        dropSelf(SNSBlocks.TOOTHPASTE_BRICK_STAIRS.get());
        dropSelf(SNSBlocks.TOOTHPASTE_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlocks.TOOTHPASTE_BRICK_WALL.get());

        this.add(SNSBlocks.CANDY_CANE_STONE_COAL_ORE.get(), block -> createMultipleOreDrops(SNSBlocks.CANDY_CANE_STONE_COAL_ORE.get(), Items.COAL, 1, 2));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SNSBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
