
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.almod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.almod.item.MinecraftiumDustItem;
import net.mcreator.almod.AlmodMod;

public class AlmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlmodMod.MODID);
	public static final RegistryObject<Item> MINECRAFTIUM_DUST = REGISTRY.register("minecraftium_dust", () -> new MinecraftiumDustItem());
	public static final RegistryObject<Item> MINECRAFTIUM_ORE = block(AlmodModBlocks.MINECRAFTIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MINECRAFTIUM_BLOCK = block(AlmodModBlocks.MINECRAFTIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
