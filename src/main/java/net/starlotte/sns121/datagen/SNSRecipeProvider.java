package net.starlotte.sns121.datagen;

import net.minecraft.world.item.Items;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.block.SNSBlocks;
import net.starlotte.sns121.item.SNSItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SNSRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SNSRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        //HERB


        List<ItemLike> CANDY_CANE_SMELTABLES = List.of(SNSBlocks.CANDY_CANE_STONE_COAL_ORE.get());

        oreSmelting(recipeOutput, CANDY_CANE_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "coal");
        oreBlasting(recipeOutput, CANDY_CANE_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "coal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItems.CANDY_CANE.get())
                .pattern(" CC")
                .pattern("C  ")
                .define('C', SNSItems.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane_sugar", has(SNSItems.CANDY_CANE_SUGAR.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItems.CANDY_CANE_HOE.get())
                .pattern(" SS")
                .pattern(" C ")
                .pattern("C  ")
                .define('C', SNSItems.CANDY_CANE.get())
                .define('S', SNSItems.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane", has(SNSItems.CANDY_CANE.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItems.CANDY_CANE_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" C ")
                .define('C', SNSItems.CANDY_CANE.get())
                .define('S', SNSItems.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane", has(SNSItems.CANDY_CANE.get())).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItems.PEPPERMINT_SWIRL.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .define('C', SNSItems.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane_sugar", has(SNSItems.CANDY_CANE_SUGAR.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.CANDY_CANE_TORCH.get())
                .pattern("O")
                .pattern("C")
                .pattern("C")
                .define('O', Items.COAL)
                .define('C', SNSItems.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane_sugar", has(SNSItems.CANDY_CANE_SUGAR.get())).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.CANDY_CANE_STONE.get())
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSItems.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane_sugar", has(SNSItems.CANDY_CANE_SUGAR.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.CANDY_CANE_STONE_BUTTON.get(), Ingredient.of(SNSBlocks.CANDY_CANE_STONE.get())).group("herb").unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.CANDY_CANE_STONE_DOOR.get(), Ingredient.of(SNSBlocks.CANDY_CANE_STONE.get())).group("herb").unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.CANDY_CANE_STONE_FENCE.get(), Ingredient.of(SNSBlocks.CANDY_CANE_STONE.get())).group("herb").unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get(), Ingredient.of(SNSBlocks.CANDY_CANE_STONE.get())).group("herb").unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get(), SNSBlocks.CANDY_CANE_STONE.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.CANDY_CANE_STONE_SLAB.get(), SNSBlocks.CANDY_CANE_STONE.get());
        stairBuilder(SNSBlocks.CANDY_CANE_STONE_STAIRS.get(), Ingredient.of(SNSBlocks.CANDY_CANE_STONE.get())).group("herb").unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.CANDY_CANE_STONE_TRAPDOOR.get(), Ingredient.of(SNSBlocks.CANDY_CANE_STONE.get())).group("herb").unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.CANDY_CANE_STONE_WALL.get(), SNSBlocks.CANDY_CANE_STONE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.CANDY_CANE_BRICKS.get())
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSBlocks.CANDY_CANE_STONE.get())
                .unlockedBy("has_candy_cane_stone", has(SNSBlocks.CANDY_CANE_STONE.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.CANDY_CANE_BRICK_BUTTON.get(), Ingredient.of(SNSBlocks.CANDY_CANE_BRICKS.get())).group("herb").unlockedBy("has_candy_cane_bricks", has(SNSBlocks.CANDY_CANE_BRICKS.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.CANDY_CANE_BRICK_DOOR.get(), Ingredient.of(SNSBlocks.CANDY_CANE_BRICKS.get())).group("herb").unlockedBy("has_candy_cane_bricks", has(SNSBlocks.CANDY_CANE_BRICKS.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.CANDY_CANE_BRICK_FENCE.get(), Ingredient.of(SNSBlocks.CANDY_CANE_BRICKS.get())).group("herb").unlockedBy("has_candy_cane_bricks", has(SNSBlocks.CANDY_CANE_BRICKS.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.CANDY_CANE_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlocks.CANDY_CANE_BRICKS.get())).group("herb").unlockedBy("has_candy_cane_bricks", has(SNSBlocks.CANDY_CANE_BRICKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.CANDY_CANE_BRICK_PRESSURE_PLATE.get(), SNSBlocks.CANDY_CANE_BRICKS.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.CANDY_CANE_BRICK_SLAB.get(), SNSBlocks.CANDY_CANE_BRICKS.get());
        stairBuilder(SNSBlocks.CANDY_CANE_BRICK_STAIRS.get(), Ingredient.of(SNSBlocks.CANDY_CANE_BRICKS.get())).group("herb").unlockedBy("has_candy_cane_bricks", has(SNSBlocks.CANDY_CANE_BRICKS.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.CANDY_CANE_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlocks.CANDY_CANE_BRICKS.get())).group("herb").unlockedBy("has_candy_cane_bricks", has(SNSBlocks.CANDY_CANE_BRICKS.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.CANDY_CANE_BRICK_WALL.get(), SNSBlocks.CANDY_CANE_BRICKS.get());


        buttonBuilder(SNSBlocks.MINT_BUTTON.get(), Ingredient.of(SNSBlocks.MINT_BLOCK.get())).group("herb").unlockedBy("has_mint_block", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.MINT_DOOR.get(), Ingredient.of(SNSBlocks.MINT_BLOCK.get())).group("herb").unlockedBy("has_mint_block", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.MINT_FENCE.get(), Ingredient.of(SNSBlocks.MINT_BLOCK.get())).group("herb").unlockedBy("has_mint", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.MINT_FENCE_GATE.get(), Ingredient.of(SNSBlocks.MINT_BLOCK.get())).group("herb").unlockedBy("has_mint", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.MINT_PRESSURE_PLATE.get(), SNSBlocks.MINT_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_SLAB.get(), SNSBlocks.MINT_BLOCK.get());
        stairBuilder(SNSBlocks.MINT_STAIRS.get(), Ingredient.of(SNSBlocks.MINT_BLOCK.get())).group("herb").unlockedBy("has_mint_block", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.MINT_TRAPDOOR.get(), Ingredient.of(SNSBlocks.MINT_BLOCK.get())).group("herb").unlockedBy("has_mint_block", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_WALL.get(), SNSBlocks.MINT_BLOCK.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.MINT_BRICKS.get())
                .pattern("MM")
                .pattern("MM")
                .define('M', SNSBlocks.MINT_BLOCK.get())
                .unlockedBy("has_mint_block", has(SNSBlocks.MINT_BLOCK.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.MINT_BRICK_BUTTON.get(), Ingredient.of(SNSBlocks.MINT_BRICKS.get())).group("herb").unlockedBy("has_mint_bricks", has(SNSBlocks.MINT_BRICKS.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.MINT_BRICK_DOOR.get(), Ingredient.of(SNSBlocks.MINT_BRICKS.get())).group("herb").unlockedBy("has_mint_bricks", has(SNSBlocks.MINT_BRICKS.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.MINT_BRICK_FENCE.get(), Ingredient.of(SNSBlocks.MINT_BRICKS.get())).group("herb").unlockedBy("has_mint_bricks", has(SNSBlocks.MINT_BRICKS.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.MINT_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlocks.MINT_BRICKS.get())).group("herb").unlockedBy("has_mint_bricks", has(SNSBlocks.MINT_BRICKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.MINT_BRICK_PRESSURE_PLATE.get(), SNSBlocks.MINT_BRICKS.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_BRICK_SLAB.get(), SNSBlocks.MINT_BRICKS.get());
        stairBuilder(SNSBlocks.MINT_BRICK_STAIRS.get(), Ingredient.of(SNSBlocks.MINT_BRICKS.get())).group("herb").unlockedBy("has_mint_bricks", has(SNSBlocks.MINT_BRICKS.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.MINT_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlocks.MINT_BRICKS.get())).group("herb").unlockedBy("has_mint_bricks", has(SNSBlocks.MINT_BRICKS.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_BRICK_WALL.get(), SNSBlocks.MINT_BRICKS.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.MINT_HUMBUG_BLOCK.get())
                .pattern("HH")
                .pattern("HH")
                .define('H', SNSItems.MINT_HUMBUG.get())
                .unlockedBy("has_mint_humbug", has(SNSItems.MINT_HUMBUG.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.MINT_HUMBUG_BUTTON.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BLOCK.get())).group("herb").unlockedBy("has_mint_humbug_block", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.MINT_HUMBUG_DOOR.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BLOCK.get())).group("herb").unlockedBy("has_mint_humbug_block", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.MINT_HUMBUG_FENCE.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BLOCK.get())).group("herb").unlockedBy("has_mint_humbug", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.MINT_HUMBUG_FENCE_GATE.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BLOCK.get())).group("herb").unlockedBy("has_mint_humbug", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.MINT_HUMBUG_PRESSURE_PLATE.get(), SNSBlocks.MINT_HUMBUG_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_HUMBUG_SLAB.get(), SNSBlocks.MINT_HUMBUG_BLOCK.get());
        stairBuilder(SNSBlocks.MINT_HUMBUG_STAIRS.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BLOCK.get())).group("herb").unlockedBy("has_mint_humbug_block", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.MINT_HUMBUG_TRAPDOOR.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BLOCK.get())).group("herb").unlockedBy("has_mint_humbug_block", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_HUMBUG_WALL.get(), SNSBlocks.MINT_HUMBUG_BLOCK.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.MINT_HUMBUG_BRICKS.get())
                .pattern("HH")
                .pattern("HH")
                .define('H', SNSBlocks.MINT_HUMBUG_BLOCK.get())
                .unlockedBy("has_mint_humbug_block", has(SNSBlocks.MINT_HUMBUG_BLOCK.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.MINT_HUMBUG_BRICK_BUTTON.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BRICKS.get())).group("herb").unlockedBy("has_mint_humbug_bricks", has(SNSBlocks.MINT_HUMBUG_BRICKS.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.MINT_HUMBUG_BRICK_DOOR.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BRICKS.get())).group("herb").unlockedBy("has_mint_humbug_bricks", has(SNSBlocks.MINT_HUMBUG_BRICKS.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.MINT_HUMBUG_BRICK_FENCE.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BRICKS.get())).group("herb").unlockedBy("has_mint_humbug_bricks", has(SNSBlocks.MINT_HUMBUG_BRICKS.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.MINT_HUMBUG_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BRICKS.get())).group("herb").unlockedBy("has_mint_humbug_bricks", has(SNSBlocks.MINT_HUMBUG_BRICKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.MINT_HUMBUG_BRICK_PRESSURE_PLATE.get(), SNSBlocks.MINT_HUMBUG_BRICKS.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_HUMBUG_BRICK_SLAB.get(), SNSBlocks.MINT_HUMBUG_BRICKS.get());
        stairBuilder(SNSBlocks.MINT_HUMBUG_BRICK_STAIRS.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BRICKS.get())).group("herb").unlockedBy("has_mint_humbug_bricks", has(SNSBlocks.MINT_HUMBUG_BRICKS.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.MINT_HUMBUG_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlocks.MINT_HUMBUG_BRICKS.get())).group("herb").unlockedBy("has_mint_humbug_bricks", has(SNSBlocks.MINT_HUMBUG_BRICKS.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.MINT_HUMBUG_BRICK_WALL.get(), SNSBlocks.MINT_HUMBUG_BRICKS.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.TOOTHPASTE_BLOCK.get())
                .pattern("TT")
                .pattern("TT")
                .define('T', SNSItems.TOOTHPASTE.get())
                .unlockedBy("has_toothpaste", has(SNSItems.TOOTHPASTE.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.TOOTHPASTE_BUTTON.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BLOCK.get())).group("herb").unlockedBy("has_toothpaste_block", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.TOOTHPASTE_DOOR.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BLOCK.get())).group("herb").unlockedBy("has_toothpaste_block", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.TOOTHPASTE_FENCE.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BLOCK.get())).group("herb").unlockedBy("has_toothpaste", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.TOOTHPASTE_FENCE_GATE.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BLOCK.get())).group("herb").unlockedBy("has_toothpaste", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.TOOTHPASTE_PRESSURE_PLATE.get(), SNSBlocks.TOOTHPASTE_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.TOOTHPASTE_SLAB.get(), SNSBlocks.TOOTHPASTE_BLOCK.get());
        stairBuilder(SNSBlocks.TOOTHPASTE_STAIRS.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BLOCK.get())).group("herb").unlockedBy("has_toothpaste_block", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.TOOTHPASTE_TRAPDOOR.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BLOCK.get())).group("herb").unlockedBy("has_toothpaste_block", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.TOOTHPASTE_WALL.get(), SNSBlocks.TOOTHPASTE_BLOCK.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlocks.TOOTHPASTE_BRICKS.get())
                .pattern("TT")
                .pattern("TT")
                .define('T', SNSBlocks.TOOTHPASTE_BLOCK.get())
                .unlockedBy("has_toothpaste_block", has(SNSBlocks.TOOTHPASTE_BLOCK.get())).save(recipeOutput);
        buttonBuilder(SNSBlocks.TOOTHPASTE_BRICK_BUTTON.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BRICKS.get())).group("herb").unlockedBy("has_toothpaste_bricks", has(SNSBlocks.TOOTHPASTE_BRICKS.get())).save(recipeOutput);
        doorBuilder(SNSBlocks.TOOTHPASTE_BRICK_DOOR.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BRICKS.get())).group("herb").unlockedBy("has_toothpaste_bricks", has(SNSBlocks.TOOTHPASTE_BRICKS.get())).save(recipeOutput);
        fenceBuilder(SNSBlocks.TOOTHPASTE_BRICK_FENCE.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BRICKS.get())).group("herb").unlockedBy("has_toothpaste_bricks", has(SNSBlocks.TOOTHPASTE_BRICKS.get())).save(recipeOutput);
        fenceGateBuilder(SNSBlocks.TOOTHPASTE_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BRICKS.get())).group("herb").unlockedBy("has_toothpaste_bricks", has(SNSBlocks.TOOTHPASTE_BRICKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, SNSBlocks.TOOTHPASTE_BRICK_PRESSURE_PLATE.get(), SNSBlocks.TOOTHPASTE_BRICKS.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.TOOTHPASTE_BRICK_SLAB.get(), SNSBlocks.TOOTHPASTE_BRICKS.get());
        stairBuilder(SNSBlocks.TOOTHPASTE_BRICK_STAIRS.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BRICKS.get())).group("herb").unlockedBy("has_toothpaste_bricks", has(SNSBlocks.TOOTHPASTE_BRICKS.get())).save(recipeOutput);
        trapdoorBuilder(SNSBlocks.TOOTHPASTE_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlocks.TOOTHPASTE_BRICKS.get())).group("herb").unlockedBy("has_toothpaste_bricks", has(SNSBlocks.TOOTHPASTE_BRICKS.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlocks.TOOTHPASTE_BRICK_WALL.get(), SNSBlocks.TOOTHPASTE_BRICKS.get());













    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, SNS121.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
