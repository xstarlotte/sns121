package net.starlotte.sns121.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.starlotte.sns121.SNS121;
import net.starlotte.sns121.item.SNSItems;
import net.starlotte.sns121.util.SNSTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SNSItemTagGenerator extends ItemTagsProvider {
    public SNSItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, SNS121.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(SNSTags.Items.HERB)
                .add(SNSItems.CANDY_CANE.get())
                .add(SNSItems.CANDY_CANE_SUGAR.get())
                .add(SNSItems.PEPPERMINT_SWIRL.get())
                .add(SNSItems.TOOTHPASTE.get());

    }
}
