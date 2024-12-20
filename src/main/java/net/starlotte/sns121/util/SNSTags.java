package net.starlotte.sns121.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.starlotte.sns121.SNS121;

public class SNSTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_HERB_TOOL = createTag("needs_herb_tool");
        public static final TagKey<Block> INCORRECT_FOR_HERB_TOOL = createTag("incorrect_for_herb_tool");

        public static final TagKey<Block> PAXEL_MINEABLE = createTag("mineable/paxel");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID, name));
        }
    }

    public static class Items {



        public static final TagKey<Item> HERB = createTag("herb");






        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SNS121.MOD_ID, name));
        }
    }
}
