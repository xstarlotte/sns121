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
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(SNSItems.CANDY_CANE_SUGAR.get()))
                    .title(Component.translatable("creativetab.herb_sns"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SNSBlocks.CANDY_CANE_BRICKS.get());
                        output.accept(SNSBlocks.CANDY_CANE_STONE.get());

                        output.accept(SNSItems.CANDY_CANE.get());
                        output.accept(SNSItems.CANDY_CANE_SUGAR.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
