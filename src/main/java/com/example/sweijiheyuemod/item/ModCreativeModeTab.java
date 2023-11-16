package com.example.sweijiheyuemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * @author 我永远喜欢凯尔希
 * @Date 2023/9/27
 * @apiNote
 */
public class ModCreativeModeTab {
    public static final CreativeModeTab SWEIJIHEYUE_TAB=new CreativeModeTab("sweijiheyuemodtab") {
        //设置tab的图片
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.YUANSHIINGOT.get());
        }
    };
}
