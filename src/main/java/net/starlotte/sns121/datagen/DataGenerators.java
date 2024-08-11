package net.starlotte.sns121.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.starlotte.sns121.SNS121;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SNS121.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(event.includeServer(), new SNSRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), SNSLootTableProvider.create(packOutput, lookupProvider));
        BlockTagsProvider blockTagsProvider = new SNSBlockTagGenerator(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new SNSItemTagGenerator(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeClient(), new SNSItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new SNSBlockStateProvider(packOutput, existingFileHelper));
    }
}
