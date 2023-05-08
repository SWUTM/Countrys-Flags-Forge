package net.swutm.countrysflags.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.swutm.countrysflags.countrysflags;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, countrysflags.MOD_ID);





        public static void register(IEventBus modEventBus) {
            ITEMS.register(modEventBus);
        }
    }
