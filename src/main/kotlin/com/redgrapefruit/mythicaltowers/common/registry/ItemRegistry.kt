package com.redgrapefruit.mythicaltowers.common.registry

import com.redgrapefruit.mythicaltowers.common.MythicalTowers.Companion.idOf
import com.redgrapefruit.mythicaltowers.common.armor.BootsItem
import com.redgrapefruit.mythicaltowers.common.armor.ChestplateItem
import com.redgrapefruit.mythicaltowers.common.armor.HelmetItem
import com.redgrapefruit.mythicaltowers.common.armor.LeggingsItem
import com.redgrapefruit.mythicaltowers.common.item.AmuletItem
import com.redgrapefruit.mythicaltowers.common.item.IngotItem
import com.redgrapefruit.mythicaltowers.common.item.OrbItem
import com.redgrapefruit.mythicaltowers.common.tool.CustomHoeItem
import com.redgrapefruit.mythicaltowers.common.tool.CustomPickaxeItem
import com.redgrapefruit.mythicaltowers.common.tool.CustomShovelItem
import com.redgrapefruit.mythicaltowers.common.tool.weapon.CustomAxeItem
import com.redgrapefruit.mythicaltowers.common.tool.weapon.CustomSwordItem
import com.redgrapefruit.mythicaltowers.common.tool.weapon.DoubleAxeItem
import com.redgrapefruit.mythicaltowers.common.tool.weapon.DoubleSwordItem
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

/**
 * Stores and registers mod's items
 */
@Suppress("MemberVisibilityCanBePrivate")
object ItemRegistry {
    // Orbs
    val GREEN_ORB = OrbItem(EffectConfigRegistry.GREEN_ORB)
    val YELLOW_ORB = OrbItem(EffectConfigRegistry.YELLOW_ORB)
    val ORANGE_ORB = OrbItem(EffectConfigRegistry.ORANGE_ORB)
    val RED_ORB = OrbItem(EffectConfigRegistry.RED_ORB)
    val BLUE_ORB = OrbItem(EffectConfigRegistry.BLUE_ORB)
    val PURPLE_ORB = OrbItem(EffectConfigRegistry.PURPLE_ORB)
    val GRAY_ORB = OrbItem(EffectConfigRegistry.GRAY_ORB)
    val BLACK_ORB = OrbItem(EffectConfigRegistry.BLACK_ORB)

    // Amulets
    val GREEN_AMULET = AmuletItem(StatusEffects.JUMP_BOOST, 1)
    val YELLOW_AMULET = AmuletItem(StatusEffects.REGENERATION, 0)
    val ORANGE_AMULET = AmuletItem(StatusEffects.SPEED, 2)
    val RED_AMULET = AmuletItem(StatusEffects.FIRE_RESISTANCE, 0)
    val BLUE_AMULET = AmuletItem(StatusEffects.SLOW_FALLING, 3)
    val PURPLE_AMULET = AmuletItem(StatusEffects.SATURATION, 5)
    val GRAY_AMULET = AmuletItem(StatusEffects.HERO_OF_THE_VILLAGE, 0)
    val BLACK_AMULET = AmuletItem(StatusEffects.STRENGTH, 7)

    // Ingots
    val GREEN_INGOT = IngotItem()
    val YELLOW_INGOT = IngotItem()
    val ORANGE_INGOT = IngotItem()
    val RED_INGOT = IngotItem()
    val BLUE_INGOT = IngotItem()
    val PURPLE_INGOT = IngotItem()
    val GRAY_INGOT = IngotItem()
    val BLACK_INGOT = IngotItem()

    // Tools
    val GREEN_PICKAXE = CustomPickaxeItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 2, -2.3f)
    val GREEN_SHOVEL = CustomShovelItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 1, -1.5f)
    val GREEN_HOE = CustomHoeItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 1, -1.25f)

    // Weapons
    val GREEN_SWORD = CustomSwordItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 3, -1.8f)
    val GREEN_AXE = CustomAxeItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 5, -3.1f)
    val GREEN_DOUBLE_SWORD = DoubleSwordItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 5, -1.4f)
    val GREEN_DOUBLE_AXE = DoubleAxeItem(EffectConfigRegistry.GREEN_TOOLS, ToolMaterialRegistry.GREEN, 8, -3.7f)

    // Armor
    val GREEN_HELMET = HelmetItem(ArmorMaterialRegistry.GREEN, StatusEffects.REGENERATION, 1)
    val GREEN_CHESTPLATE = ChestplateItem(ArmorMaterialRegistry.GREEN, StatusEffects.ABSORPTION, 1)
    val GREEN_LEGGINGS = LeggingsItem(ArmorMaterialRegistry.GREEN, StatusEffects.REGENERATION, 0)
    val GREEN_BOOTS = BootsItem(ArmorMaterialRegistry.GREEN, StatusEffects.ABSORPTION, 0)

    fun init() {
        register("green_orb", GREEN_ORB)
        register("yellow_orb", YELLOW_ORB)
        register("orange_orb", ORANGE_ORB)
        register("red_orb", RED_ORB)
        register("blue_orb", BLUE_ORB)
        register("purple_orb", PURPLE_ORB)
        register("gray_orb", GRAY_ORB)
        register("black_orb", BLACK_ORB)

        register("green_amulet", GREEN_AMULET)
        register("yellow_amulet", YELLOW_AMULET)
        register("orange_amulet", ORANGE_AMULET)
        register("red_amulet", RED_AMULET)
        register("blue_amulet", BLUE_AMULET)
        register("purple_amulet", PURPLE_AMULET)
        register("gray_amulet", GRAY_AMULET)
        register("black_amulet", BLACK_AMULET)

        register("green_ingot", GREEN_INGOT)
        register("yellow_ingot", YELLOW_INGOT)
        register("orange_ingot", ORANGE_INGOT)
        register("red_ingot", RED_INGOT)
        register("blue_ingot", BLUE_INGOT)
        register("purple_ingot", PURPLE_INGOT)
        register("gray_ingot", GRAY_INGOT)
        register("black_ingot", BLACK_INGOT)

        register("green_pickaxe", GREEN_PICKAXE)
        register("green_shovel", GREEN_SHOVEL)
        register("green_hoe", GREEN_HOE)

        register("green_sword", GREEN_SWORD)
        register("green_axe", GREEN_AXE)
        register("green_double_sword", GREEN_DOUBLE_SWORD)
        register("green_double_axe", GREEN_DOUBLE_AXE)

        register("green_helmet", GREEN_HELMET)
        register("green_chestplate", GREEN_CHESTPLATE)
        register("green_leggings", GREEN_LEGGINGS)
        register("green_boots", GREEN_BOOTS)
    }

    /**
     * Registers an item
     *
     * @param name Item name
     * @param item Item instance
     */
    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, idOf(name), item)
    }
}