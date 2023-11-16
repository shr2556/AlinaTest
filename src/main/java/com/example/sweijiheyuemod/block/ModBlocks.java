package com.example.sweijiheyuemod.block;

import com.example.sweijiheyuemod.SWeiJiHeYueMod;
import com.example.sweijiheyuemod.item.ModCreativeModeTab;
import com.example.sweijiheyuemod.item.ModItem;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * @author 我永远喜欢凯尔希
 * @Date 2023/9/27
 * @apiNote
 */
public class ModBlocks {
    // 注册一个方块，s_weijiheyue_block
    // new Block时候需要设置方块的一些属性，通过BlockBehaviour进行设置
    // 不同的材质可以在Material下面进行调整。例如AIR 等等通 .就可以看到，或者按住ctrl在点击Material，就可以看到可以用的Material
    // 可以看到of返回的依旧是properties的对象
    // 通过properties对象还可以设置 硬度
    // 需要正确的工具才可以采集
    // 设置的内容都可以在properties下面找到，按住ctrl点击Properties可以看到。
    // tab是之前自己自己创建的tab
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS,
            SWeiJiHeYueMod.MODID);
    // 注册一个矿物的方块，这里new的是一个Block的子类，这个类指明了是一个破坏后会掉落经验的Block
    // 如果是其他具有自己效果的Block，也可以自己去实现一个Block类。
    // 其中 new DropExperienceBlock 的第三个参数指明的是掉落经验值的范围。
        public static final RegistryObject<Block> MANGANESE_TRIHYDRATE_BLOCK=registerBlock("manganese_trihydrate_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.SWEIJIHEYUE_TAB);
        public static final RegistryObject<Block> SOLID_STONE=registerBlock("solid_stone",
                ()->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(12f).requiresCorrectToolForDrops()),
                ModCreativeModeTab.SWEIJIHEYUE_TAB);




        //注册方块
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                    CreativeModeTab tab){
        RegistryObject<T> toReturn = ModBlocks.BLOCKS.register(name, block);
        registryBlockItem(name,toReturn,tab);
        return toReturn;

    }
    //注册方块在物品栏中作为item时的物品（如果不注册，该物品在物品栏中则不会显示）
    private static <T extends Block> RegistryObject<Item> registryBlockItem (String name,
    RegistryObject<T> block, CreativeModeTab tab) {
        return ModItem.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
