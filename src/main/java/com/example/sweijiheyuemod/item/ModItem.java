package com.example.sweijiheyuemod.item;

import com.example.sweijiheyuemod.SWeiJiHeYueMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author 我永远喜欢凯尔希
 * @Date 2023/9/26
 * @apiNote
 */
public class ModItem {
    //创建注册表，类型为item（物品），MODid为sweijiheyuemod的modid属性
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, SWeiJiHeYueMod.MODID);
    //将创建的物品使用注册表注册，注册的name为yuanshiingot
    //该物品在游戏中的分类是tab内是该物品的分类中的材料栏
    public static final RegistryObject<Item> YUANSHIINGOT=ITEMS.register("yuanshiingot",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.SWEIJIHEYUE_TAB)));

    public static final RegistryObject<Item> REWARD=ITEMS.register("reward",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.SWEIJIHEYUE_TAB)));
    public static final RegistryObject<Item> LIGHT_MANGANESE_ORE=
            ITEMS.register("light_manganese_ore",
                    ()->new Item(new Item.Properties().tab(ModCreativeModeTab.SWEIJIHEYUE_TAB)));
    public static final RegistryObject<Item> MUD_STONE=ITEMS.register("mud_stone",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.SWEIJIHEYUE_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    };
}
