package com.example.minefactory.init;

import com.example.minefactory.MineFactory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create
            (ForgeRegistries.BLOCKS, MineFactory.MOD_ID);

    public static final RegistryObject<Block> TITAN_BLOCK = BLOCKS.register("titan_block",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                            .strength(5.0F, 6.0F)
                            .sound(SoundType.METAL)
            ));
}
