package com.gunsmod.core.init;

import com.gunsmod.GunsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GunsMod.MOD_ID);

    public static final RegistryObject<Item> glock_18 = ITEMS.register("glock_18", () -> new Item(new Item.Properties()));
}
