
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.almod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.almod.block.MinecraftiumOreBlock;
import net.mcreator.almod.block.MinecraftiumBlockBlock;
import net.mcreator.almod.AlmodMod;

public class AlmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlmodMod.MODID);
	public static final RegistryObject<Block> MINECRAFTIUM_ORE = REGISTRY.register("minecraftium_ore", () -> new MinecraftiumOreBlock());
	public static final RegistryObject<Block> MINECRAFTIUM_BLOCK = REGISTRY.register("minecraftium_block", () -> new MinecraftiumBlockBlock());
}
