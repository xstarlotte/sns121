package net.starlotte.sns121.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.sns121.SNS121;

public class SNSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNS121.MOD_ID);

    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
