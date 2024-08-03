package net.starlotte.sns121.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import java.util.Objects;

        public class ToothpasteItem extends Item {
            public ToothpasteItem(Properties properties) {
                super(properties);
            }

            @Override
            public InteractionResult useOn(UseOnContext context) {
                Level level = context.getLevel();

                if(!level.isClientSide()) {
                    if(level.getBlockState(context.getClickedPos()).is(BlockTags.LOGS)) {
                        level.destroyBlock(context.getClickedPos(), true, context.getPlayer());

                        context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level),
                                ((ServerPlayer) context.getPlayer()), item ->
                                        Objects.requireNonNull(context.getPlayer()).onEquippedItemBroken(item,  EquipmentSlot.MAINHAND));
                    }
                }

                return InteractionResult.CONSUME;
            }
        }