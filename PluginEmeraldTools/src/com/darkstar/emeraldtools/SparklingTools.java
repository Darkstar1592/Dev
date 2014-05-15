package com.darkstar.emeraldtools;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class SparklingTools extends JavaPlugin implements Listener{

	/*public static double randSword = 0.0;
	public static double randSword2 = 0.0;
	public static double randSword3 = 0.0;
	public static double randPick = 0.0;
	public static double randPick2 = 0.0;
	public static double randPick3 = 0.0;
	public static double randAxe = 0.0;
	public static double randAxe2 = 0.0;
	public static double randAxe3 = 0.0;
	public static double randSpade = 0.0;
	public static double randSpade2 = 0.0;
	public static double randSpade3 = 0.0;
	public static double randHoe = 0.0;
	public static double randHoe2 = 0.0;
	public static double randHoe3 = 0.0;
	public static double randHelm = 0.0;
	public static double randHelm2 = 0.0;
	public static double randHelm3 = 0.0;
	public static double randChest = 0.0;
	public static double randChest2 = 0.0;
	public static double randChest3 = 0.0;
	public static double randPants = 0.0;
	public static double randPants2 = 0.0;
	public static double randPants3 = 0.0;
	public static double randBoots = 0.0;
	public static double randBoots2 = 0.0;
	public static double randBoots3 = 0.0;*/

	ItemStack EmeraldSword;
	ItemStack EmeraldSword2;
	ItemStack EmeraldSword3;
	ItemStack EmeraldPickaxe;
	ItemStack EmeraldPickaxe2;
	ItemStack EmeraldPickaxe3;
	ItemStack EmeraldAxe;
	ItemStack EmeraldAxe2;
	ItemStack EmeraldAxe3;
	ItemStack EmeraldSpade;
	ItemStack EmeraldSpade2;
	ItemStack EmeraldSpade3;
	ItemStack EmeraldHoe;
	ItemStack EmeraldHoe2;
	ItemStack EmeraldHoe3;

	ItemStack EmeraldHelm;
	ItemStack EmeraldHelm2;
	ItemStack EmeraldHelm3;
	ItemStack EmeraldChestplate;
	ItemStack EmeraldChestplate2;
	ItemStack EmeraldChestplate3;
	ItemStack EmeraldLeggings;
	ItemStack EmeraldLeggings2;
	ItemStack EmeraldLeggings3;
	ItemStack EmeraldBoots;
	ItemStack EmeraldBoots2;
	ItemStack EmeraldBoots3;

	Enchantment[] swordEnchants = {
			Enchantment.DAMAGE_ALL, 
			Enchantment.DAMAGE_ALL,
			Enchantment.DAMAGE_ALL,
			Enchantment.DAMAGE_ALL, 
			Enchantment.DAMAGE_ALL,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.DAMAGE_UNDEAD,
			Enchantment.DAMAGE_UNDEAD, 
			Enchantment.DAMAGE_UNDEAD, 
			Enchantment.DAMAGE_UNDEAD, 
			Enchantment.DAMAGE_UNDEAD,
			Enchantment.FIRE_ASPECT,
			Enchantment.FIRE_ASPECT,
			Enchantment.KNOCKBACK,
			Enchantment.KNOCKBACK,
			Enchantment.LOOT_BONUS_MOBS,
			Enchantment.LOOT_BONUS_MOBS,
			Enchantment.LOOT_BONUS_MOBS,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY
	};
	Enchantment[] sword3Enchants = {
			Enchantment.DAMAGE_ALL,
			Enchantment.DAMAGE_UNDEAD,
			Enchantment.FIRE_ASPECT,
			Enchantment.LOOT_BONUS_MOBS,
	};
	Enchantment[] pickEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.SILK_TOUCH,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.LOOT_BONUS_BLOCKS,
	};
	Enchantment[] pick3Enchants = {
			Enchantment.DIG_SPEED,
			Enchantment.SILK_TOUCH,
			Enchantment.LOOT_BONUS_BLOCKS,
	};
	Enchantment[] axeEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.SILK_TOUCH,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.LOOT_BONUS_BLOCKS
	};
	Enchantment[] axe3Enchants = {
			Enchantment.DURABILITY,
			Enchantment.DIG_SPEED,
			Enchantment.LOOT_BONUS_BLOCKS,

	};
	Enchantment[] shovelEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.DIG_SPEED,
			Enchantment.SILK_TOUCH,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.LOOT_BONUS_BLOCKS,
	};
	Enchantment[] shovel3Enchants = {
			Enchantment.DURABILITY, 
			Enchantment.DIG_SPEED, 
			Enchantment.SILK_TOUCH, 
			Enchantment.LOOT_BONUS_BLOCKS,
	};
	Enchantment[] hoeEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
	};
	Enchantment[] hoe3Enchants = {
			Enchantment.DURABILITY,
	};

	Enchantment[] helmEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY, 
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.THORNS,
			Enchantment.OXYGEN,
			Enchantment.OXYGEN,
			Enchantment.OXYGEN,
			Enchantment.WATER_WORKER,
	};
	Enchantment[] helm3Enchants = {
			Enchantment.DURABILITY,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.THORNS, 
			Enchantment.OXYGEN,
			Enchantment.WATER_WORKER,
	};
	Enchantment[] chestEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY, 
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.THORNS,
	};
	Enchantment[] chest3Enchants = {
			Enchantment.DURABILITY, 
			Enchantment.PROTECTION_ENVIRONMENTAL, 
			Enchantment.PROTECTION_EXPLOSIONS, 
			Enchantment.PROTECTION_PROJECTILE, 
			Enchantment.THORNS,
	};
	Enchantment[] legEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY, 
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.THORNS,
	};
	Enchantment[] leg3Enchants = {
			Enchantment.DURABILITY,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE, 
			Enchantment.THORNS,
	};
	Enchantment[] bootEnchants = {
			Enchantment.DURABILITY,
			Enchantment.DURABILITY,
			Enchantment.DURABILITY, 
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.THORNS,
			Enchantment.PROTECTION_FALL,
			Enchantment.PROTECTION_FALL,
			Enchantment.PROTECTION_FALL,
	};
	Enchantment[] boot3Enchants = {
			Enchantment.DURABILITY,
			Enchantment.PROTECTION_ENVIRONMENTAL, 
			Enchantment.PROTECTION_EXPLOSIONS, 
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.THORNS,
			Enchantment.PROTECTION_FALL,
	};

	@EventHandler
	public void onCraftSword(PrepareItemCraftEvent e){
		//getLogger().info("Event loaded");
		ItemStack item = e.getInventory().getResult();
		//Player player = (Player) e.getWhoClicked();

		//Emerald sword
		//if (player.hasPermission("stools.sword")){
			
			if (item.getType().equals(Material.DIAMOND_SWORD) &&
					(item.getItemMeta().getDisplayName() != null) &&
					(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Sword")) && 
					item.getItemMeta().getLore() != null &&
					item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I")){
				item.addUnsafeEnchantment(swordEnchants[(int) (Math.random()*swordEnchants.length)], (int) (Math.random()*5));
			}

			if (item.getType().equals(Material.DIAMOND_SWORD) &&
					(item.getItemMeta().getDisplayName() != null) &&
					(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Sword")) && 
					item.getItemMeta().getLore() != null &&
					item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II")	
					){
				item.addUnsafeEnchantment(swordEnchants[(int) (Math.random()*swordEnchants.length)], (int) (Math.random()*5));
			}
			if (item.getType().equals(Material.DIAMOND_SWORD) &&
					(item.getItemMeta().getDisplayName() != null) &&
					(item.getItemMeta().getDisplayName() != null) &&
					(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Sword")) && 
					(item.getItemMeta().getLore() != null) &&
					(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
				item.addUnsafeEnchantment(sword3Enchants[(int) (Math.random()*sword3Enchants.length)], (int) 5);
			}
		/*}
		else if (!(player.hasPermission("stools.sword"))){
			e.getInventory().setResult(null);
			getLogger().info("You dont have permission to craft that!");
		}*/

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftPickaxe(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Pickaxe
		if (item.getType().equals(Material.DIAMOND_PICKAXE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Pickaxe")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(pickEnchants[(int) (Math.random()*pickEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_PICKAXE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Pickaxe")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(pickEnchants[(int) (Math.random()*pickEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_PICKAXE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Pickaxe")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(pick3Enchants[(int) (Math.random()*pick3Enchants.length)], (int) 5);
		}
		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftAxe(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Axe
		if (item.getType().equals(Material.DIAMOND_AXE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Axe")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(axeEnchants[(int) (Math.random()*axeEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_AXE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Axe")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(axeEnchants[(int) (Math.random()*axeEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_AXE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Axe")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(axe3Enchants[(int) (Math.random()*axe3Enchants.length)], (int) 5);
		}

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftShovel(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Shovel
		if (item.getType().equals(Material.DIAMOND_SPADE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Spade")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(shovelEnchants[(int) (Math.random()*shovelEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_SPADE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Spade")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(shovelEnchants[(int) (Math.random()*shovelEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_SPADE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Spade")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(shovel3Enchants[(int) (Math.random()*shovel3Enchants.length)], (int) 5);
		}

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftHoe(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Hoe
		if (item.getType().equals(Material.DIAMOND_HOE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Hoe")) &&
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(hoeEnchants[(int) (Math.random()*hoeEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_HOE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Hoe")) &&
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(hoeEnchants[(int) (Math.random()*hoeEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_HOE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Hoe")) &&
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(hoeEnchants[(int) (Math.random()*hoeEnchants.length)], (int) (Math.random()*5));
		}

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftHelmet(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		if (item.getType().equals(Material.DIAMOND_HELMET) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Helmet")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(helmEnchants[(int) (Math.random()*helmEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_HELMET) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Helmet")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(helmEnchants[(int) (Math.random()*helmEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_HELMET) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Helmet")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(helm3Enchants[(int) (Math.random()*helm3Enchants.length)], (int) 5);
		}

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftChestplate(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Chestplate
		if (item.getType().equals(Material.DIAMOND_CHESTPLATE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Chestplate")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(chestEnchants[(int) (Math.random()*chestEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_CHESTPLATE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Chestplate")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(chestEnchants[(int) (Math.random()*chestEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_CHESTPLATE) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Chestplate")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(chest3Enchants[(int) (Math.random()*chest3Enchants.length)], (int) 5);
		}

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftLeggings(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Leggings
		if (item.getType().equals(Material.DIAMOND_LEGGINGS) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Leggings")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(legEnchants[(int) (Math.random()*legEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_LEGGINGS) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Leggings")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(legEnchants[(int) (Math.random()*legEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_LEGGINGS) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Leggings")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(leg3Enchants[(int) (Math.random()*leg3Enchants.length)], (int) 5);
		}

		e.getInventory().setResult(item);
	}
	@EventHandler
	public void onCraftBoots(PrepareItemCraftEvent e){
		ItemStack item = e.getInventory().getResult();

		//Emerald Boots
		if (item.getType().equals(Material.DIAMOND_BOOTS) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Boots")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier I"))){
			item.addUnsafeEnchantment(bootEnchants[(int) (Math.random()*bootEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_BOOTS) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Boots")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier II"))){
			item.addUnsafeEnchantment(bootEnchants[(int) (Math.random()*bootEnchants.length)], (int) (Math.random()*5));
		}
		if (item.getType().equals(Material.DIAMOND_BOOTS) &&
				(item.getItemMeta().getDisplayName() != null) &&
				(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emerald Boots")) && 
				(item.getItemMeta().getLore() != null) && 
				(item.getItemMeta().getLore().contains(ChatColor.GOLD + "Tier III"))){
			item.addUnsafeEnchantment(boot3Enchants[(int) (Math.random()*boot3Enchants.length)], (int) 5);
		}

		e.getInventory().setResult(item);
	}

	public void all(){
		//randomEnchant();
		swordRecipe();
		pickaxeRecipe();
		axeRecipe();
		shovelRecipe();
		hoeRecipe();
		helmetRecipe();
		chestplateRecipe();
		leggingsRecipe();
		bootsRecipe();
		//godPick();
	}

	/*public void randomEnchant(){		Random rand = new Random();

		randSword = rand.nextInt(25);
		//getLogger().info("randSword refreshed!");
		//getLogger().info("randSword = " + randSword);

		randSword2 = rand.nextInt(25);
		//getLogger().info("randSword2 refreshed!");
		//getLogger().info("randSword2 = " + randSword2);

		randSword3 = rand.nextInt(4);
		//getLogger().info("randSword3 refreshed!");
		//getLogger().info("randSword3 = " + randSword3);

		randPick = rand.nextInt(12); 
		//getLogger().info("randPick refreshed!");
		//getLogger().info("randPick = " + randPick);

		randPick2 = rand.nextInt(12);
		//getLogger().info("randPick2 refreshed!");
		//getLogger().info("randPick2 = " + randPick2);

		randPick3 = rand.nextInt(3);
		//getLogger().info("randPick3 refreshed!");
		//getLogger().info("randPick3 = " + randPick3);

		randAxe = rand.nextInt(12);
		//getLogger().info("randAxe refreshed!");
		//getLogger().info("randAxe = " + randAxe);

		randAxe2 = rand.nextInt(12);
		//getLogger().info("randAxe2 refreshed!");
		//getLogger().info("randAxe2 = " + randAxe2);

		randAxe3 = rand.nextInt(3);
		//getLogger().info("randAxe3 refreshed!");
		//getLogger().info("randAxe3 = " + randAxe3);

		randSpade = rand.nextInt(12);
		//getLogger().info("randSpade refreshed!");
		//getLogger().info("randSpade = " + randSpade);

		randSpade2 = rand.nextInt(12);
		//getLogger().info("randSpade2 refreshed!");
		//getLogger().info("randSpade2 = " + randSpade2);

		randSpade3 = rand.nextInt(4);
		//getLogger().info("randSpade3 refreshed!");
		//getLogger().info("randSpade3 = " + randSpade3);

		randHoe = rand.nextInt(3);
		//getLogger().info("randHoe refreshed!");
		//getLogger().info("randHoe = " + randHoe);

		randHoe2 = rand.nextInt(3);
		//getLogger().info("randHoe2 refreshed!");
		//getLogger().info("randHoe2 = " + randHoe2);

		randHoe3 = rand.nextInt(1);
		//getLogger().info("randHoe3 refreshed!");
		//getLogger().info("randHoe3 = " + randHoe3);

		randHelm = rand.nextInt(17);
		//getLogger().info("randHelm refreshed!");
		//getLogger().info("randHelm = " + randHelm);

		randHelm2 = rand.nextInt(17);
		//getLogger().info("randHelm2 refreshed!");
		//getLogger().info("randHelm2 = " + randHelm2);

		randHelm3 = rand.nextInt(7);
		//getLogger().info("randHelm3 refreshed!");
		//getLogger().info("randHelm3 = " + randHelm3);

		randChest = rand.nextInt(13);
		//getLogger().info("randChest refreshed!");
		//getLogger().info("randChest = " + randChest);

		randChest2 = rand.nextInt(13);
		//getLogger().info("randChest2 refreshed!");
		//getLogger().info("randChest2 = " + randChest2);

		randChest3 = rand.nextInt(5);
		//getLogger().info("randChest3 refreshed!");
		//getLogger().info("randChest3 = " + randChest3);

		randPants = rand.nextInt(13);
		//getLogger().info("randPants refreshed!");
		//getLogger().info("randPants = " + randPants);

		randPants2 = rand.nextInt(13);
		//getLogger().info("randPants2 refreshed!");
		//getLogger().info("randPants2 = " + randPants2);

		randPants3 = rand.nextInt(5);
		//getLogger().info("randPants3 refreshed!");
		//getLogger().info("randPants3 = " + randPants3);

		randBoots = rand.nextInt(16);
		//getLogger().info("randPants refreshed!");
		//getLogger().info("randBoots = " + randBoots);

		randBoots2 = rand.nextInt(16);
		//getLogger().info("randBoots2 refreshed!");
		//getLogger().info("randBoots2 = " + randBoots2);

		randBoots3 = rand.nextInt(6);
		//getLogger().info("randBoots3 refreshed!");
		//getLogger().info("randBoots3 = " + randBoots3);

		//getLogger().info("randomEnchant refreshed!");
	}*/

	/*public void godPick(){
		Server server = this.getServer();

		ItemStack godPick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta godPickMeta = godPick.getItemMeta();
		godPickMeta.setDisplayName(ChatColor.RED + "God Pick");
		godPick.setItemMeta(godPickMeta);
		godPick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 9001);
		ShapedRecipe godPickRecipe = new ShapedRecipe(godPick);
		godPickRecipe.shape("NNN", " S ", " S ");
		godPickRecipe.setIngredient('N', Material.NETHER_STAR);
		godPickRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(godPickRecipe);
	}*/

	public void swordRecipe(){
		Server server = this.getServer();	

		EmeraldSword = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta EmeraldSwordMeta = EmeraldSword.getItemMeta();
		EmeraldSwordMeta.setDisplayName(ChatColor.GREEN + "Emerald Sword");
		ArrayList<String> Tier1Swordlore = new ArrayList<String>();
		Tier1Swordlore.add(ChatColor.GOLD + "Tier I");
		Tier1Swordlore.add("");
		EmeraldSwordMeta.setLore(Tier1Swordlore);
		EmeraldSword.setItemMeta(EmeraldSwordMeta);
		//Enchantment
		ShapedRecipe EmeraldSwordRecipe = new ShapedRecipe(EmeraldSword);
		EmeraldSwordRecipe.shape(" E ", " E ", " S ");
		EmeraldSwordRecipe.setIngredient('E', Material.EMERALD);
		EmeraldSwordRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(EmeraldSwordRecipe);

		//getLogger().info("emeraldSword refreshed!");

		//Emerald Sword (With 2 2x Durability)

		EmeraldSword2 = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta EmeraldSword2Meta = EmeraldSword2.getItemMeta();
		EmeraldSword2Meta.setDisplayName(ChatColor.GREEN + "Emerald Sword");
		ArrayList<String> Tier2Swordlore = new ArrayList<String>();
		Tier2Swordlore.add(ChatColor.GOLD + "Tier II");
		Tier2Swordlore.add("");
		Tier2Swordlore.add(ChatColor.BLUE + "2x Durability");
		EmeraldSword2Meta.setLore(Tier2Swordlore);
		EmeraldSword2.setItemMeta(EmeraldSword2Meta);
		//Enchants
		ShapedRecipe EmeraldSword2Recipe = new ShapedRecipe(EmeraldSword2);
		EmeraldSword2Recipe.shape(" D ", " E ", " S ");
		EmeraldSword2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldSword2Recipe.setIngredient('E', Material.EMERALD);
		EmeraldSword2Recipe.setIngredient('S', Material.STICK);
		EmeraldSword2.setDurability((short) (EmeraldSword2.getDurability() * 2));
		server.addRecipe(EmeraldSword2Recipe);

		//getLogger().info("emeraldSword2 refreshed!");

		//Emerald Sword (diamond + netherstar = good enchant + 2x durability)

		EmeraldSword3 = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta EmeraldSword3Meta = EmeraldSword3.getItemMeta();
		EmeraldSword3Meta.setDisplayName(ChatColor.GREEN + "Emerald Sword");
		ArrayList<String> Tier3Swordlore = new ArrayList<String>();
		Tier3Swordlore.add(ChatColor.GOLD + "Tier III");
		Tier3Swordlore.add("");
		Tier3Swordlore.add(ChatColor.BLUE + "3x Durability");
		EmeraldSword3Meta.setLore(Tier3Swordlore);
		EmeraldSword3.setItemMeta(EmeraldSword3Meta);
		//Enchantments
		ShapedRecipe EmeraldSword3Recipe = new ShapedRecipe(EmeraldSword3);
		EmeraldSword3Recipe.shape("DEN", " E ", " S ");
		EmeraldSword3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldSword3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldSword3Recipe.setIngredient('E', Material.EMERALD);
		EmeraldSword3Recipe.setIngredient('S', Material.STICK);
		EmeraldSword3.setDurability((short) (EmeraldSword3.getDurability() * 3));
		server.addRecipe(EmeraldSword3Recipe);

		//getLogger().info("emeraldSword3 refreshed!");

		//getLogger().info("emeraldSword() refreshed!");
	}
	public void pickaxeRecipe(){

		Server server = this.getServer();

		//EmeraldPickaxe

		EmeraldPickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta EmeraldPickaxeMeta = EmeraldPickaxe.getItemMeta();
		EmeraldPickaxeMeta.setDisplayName(ChatColor.GREEN + "Emerald Pickaxe");
		ArrayList<String> Tier1Picklore = new ArrayList<String>();
		Tier1Picklore.add(ChatColor.GOLD + "Tier I");
		Tier1Picklore.add("");
		EmeraldPickaxeMeta.setLore(Tier1Picklore);
		EmeraldPickaxe.setItemMeta(EmeraldPickaxeMeta);
		//Enchants
		ShapedRecipe EmeraldPickaxeRecipe = new ShapedRecipe(EmeraldPickaxe);
		EmeraldPickaxeRecipe.shape("EEE", " S ", " S ");
		EmeraldPickaxeRecipe.setIngredient('E', Material.EMERALD); 
		EmeraldPickaxeRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(EmeraldPickaxeRecipe);

		//getLogger().info("EmeraldPickaxe refreshed!");

		//EmeraldPickaxe (diamond + 1.5x durability) 

		EmeraldPickaxe2 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta EmeraldPickaxe2Meta = EmeraldPickaxe2.getItemMeta();
		EmeraldPickaxe2Meta.setDisplayName(ChatColor.GREEN + "Emerald Pickaxe");
		ArrayList<String> Tier2Picklore = new ArrayList<String>();
		Tier2Picklore.add(ChatColor.GOLD + "Tier II");
		Tier2Picklore.add("");
		Tier2Picklore.add(ChatColor.BLUE + "2x Durability");
		EmeraldPickaxe2Meta.setLore(Tier2Picklore);
		EmeraldPickaxe2.setItemMeta(EmeraldPickaxe2Meta);
		//Enchants
		ShapedRecipe EmeraldPickaxe2Recipe = new ShapedRecipe(EmeraldPickaxe2);
		EmeraldPickaxe2Recipe.shape("EDE", " S ", " S ");
		EmeraldPickaxe2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldPickaxe2Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldPickaxe2Recipe.setIngredient('S', Material.STICK);
		EmeraldPickaxe2.setDurability((short) (EmeraldPickaxe.getDurability() * 2));
		server.addRecipe(EmeraldPickaxe2Recipe);

		//getLogger().info("EmeraldPickaxe2 refreshed!");

		//Emerald Pickaxe (diamond + netherstar = good enchant + 2x durability) 

		EmeraldPickaxe3 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta EmeraldPickaxe3Meta = EmeraldPickaxe3.getItemMeta();
		EmeraldPickaxe3Meta.setDisplayName(ChatColor.GREEN + "Emerald Pickaxe");
		ArrayList<String> Tier3Picklore = new ArrayList<String>();
		Tier3Picklore.add(ChatColor.GOLD + "Tier III");
		Tier3Picklore.add("");
		Tier3Picklore.add(ChatColor.BLUE + "3x Durability");
		EmeraldPickaxe3Meta.setLore(Tier3Picklore);
		EmeraldPickaxe3.setItemMeta(EmeraldPickaxe3Meta);
		//Enchants
		ShapedRecipe EmeraldPickaxe3Recipe = new ShapedRecipe(EmeraldPickaxe3);
		EmeraldPickaxe3Recipe.shape("EDE", " N ", " S ");
		EmeraldPickaxe3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldPickaxe3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldPickaxe3Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldPickaxe3Recipe.setIngredient('S', Material.STICK);
		EmeraldPickaxe3.setDurability((short) (EmeraldPickaxe3.getDurability() * 3));
		server.addRecipe(EmeraldPickaxe3Recipe);

		//getLogger().info("EmeraldPickaxe3 refreshed!");

		//getLogger().info("emeraldPickaxeRecipe() refreshed!");

	}
	public void axeRecipe(){
		Server server = this.getServer();

		//EmeraldAxe

		EmeraldAxe = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta EmeraldAxeMeta = EmeraldAxe.getItemMeta();
		EmeraldAxeMeta.setDisplayName(ChatColor.GREEN + "Emerald Axe");
		ArrayList<String> Tier1Axelore = new ArrayList<String>();
		Tier1Axelore.add(ChatColor.GOLD + "Tier I");
		Tier1Axelore.add("");
		EmeraldAxeMeta.setLore(Tier1Axelore);
		EmeraldAxe.setItemMeta(EmeraldAxeMeta);
		//Enchant
		ShapedRecipe EmeraldAxeRecipe = new ShapedRecipe(EmeraldAxe);
		EmeraldAxeRecipe.shape("EE ", "ES ", " S ");
		EmeraldAxeRecipe.setIngredient('E', Material.EMERALD); 
		EmeraldAxeRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(EmeraldAxeRecipe);

		//getLogger().info("EmeraldAxe refreshed!");

		//Emerald Axe (2 + 1.5x Durabilty)

		EmeraldAxe2 = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta EmeraldAxe2Meta = EmeraldAxe2.getItemMeta();
		EmeraldAxe2Meta.setDisplayName(ChatColor.GREEN + "Emerald Axe");
		ArrayList<String> Tier2Axelore = new ArrayList<String>();
		Tier2Axelore.add(ChatColor.GOLD + "Tier II");
		Tier2Axelore.add("");
		Tier2Axelore.add(ChatColor.BLUE + "2x Durability");
		EmeraldAxe2Meta.setLore(Tier2Axelore);
		EmeraldAxe2.setItemMeta(EmeraldAxe2Meta);
		//Enchant
		ShapedRecipe EmeraldAxe2Recipe = new ShapedRecipe(EmeraldAxe2);
		EmeraldAxe2Recipe.shape("EE ", "DS ", " S ");
		EmeraldAxe2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldAxe2Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldAxe2Recipe.setIngredient('S', Material.STICK);
		EmeraldAxe2.setDurability((short) (EmeraldAxe2.getDurability() * 2));
		server.addRecipe(EmeraldAxe2Recipe);

		//getLogger().info("EmeraldAxe2 refreshed!");

		//EmeraldAxe (diamond + netherstar = good enchant + 2x durability)

		EmeraldAxe3 = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta EmeraldAxe3Meta = EmeraldAxe3.getItemMeta();
		EmeraldAxe3Meta.setDisplayName(ChatColor.GREEN + "Emerald Axe");
		ArrayList<String> Tier3Axelore = new ArrayList<String>();
		Tier3Axelore.add(ChatColor.GOLD + "Tier III");
		Tier3Axelore.add("");
		Tier3Axelore.add(ChatColor.BLUE + "3x Durability");
		EmeraldAxe3Meta.setLore(Tier3Axelore);
		EmeraldAxe3.setItemMeta(EmeraldAxe3Meta);
		//Enchants
		ShapedRecipe EmeraldAxe3Recipe = new ShapedRecipe(EmeraldAxe3);
		EmeraldAxe3Recipe.shape("NE ", "DS ", " S ");
		EmeraldAxe3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldAxe3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldAxe3Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldAxe3Recipe.setIngredient('S', Material.STICK);
		EmeraldAxe3.setDurability((short) (EmeraldAxe3.getDurability() * 3));
		server.addRecipe(EmeraldAxe3Recipe);

		//getLogger().info("EmeraldAxe3 refreshed!");

		//getLogger().info("EmeraldAxe() refreshed!");
	}
	public void shovelRecipe(){
		Server server = this.getServer();

		//EmeraldSpade

		EmeraldSpade = new ItemStack(Material.DIAMOND_SPADE, 1);
		ItemMeta EmeraldSpadeMeta = EmeraldSpade.getItemMeta();
		EmeraldSpadeMeta.setDisplayName(ChatColor.GREEN + "Emerald Spade");
		ArrayList<String> Tier1Spadelore = new ArrayList<String>();
		Tier1Spadelore.add(ChatColor.GOLD + "Tier I");
		Tier1Spadelore.add("");
		EmeraldSpadeMeta.setLore(Tier1Spadelore);
		EmeraldSpade.setItemMeta(EmeraldSpadeMeta);
		//Enchant
		ShapedRecipe EmeraldSpadeRecipe = new ShapedRecipe(EmeraldSpade);
		EmeraldSpadeRecipe.shape(" E ", " S ", " S ");
		EmeraldSpadeRecipe.setIngredient('E', Material.EMERALD); 
		EmeraldSpadeRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(EmeraldSpadeRecipe);

		//getLogger().info("EmeraldSpade refreshed!");

		//EmeraldSpade (2 + 2x Durability)

		EmeraldSpade2 = new ItemStack(Material.DIAMOND_SPADE, 1);
		ItemMeta EmeraldSpade2Meta = EmeraldSpade2.getItemMeta();
		EmeraldSpade2Meta.setDisplayName(ChatColor.GREEN + "Emerald Spade");
		ArrayList<String> Tier2Spadelore = new ArrayList<String>();
		Tier2Spadelore.add(ChatColor.GOLD + "Tier II");
		Tier2Spadelore.add("");
		Tier2Spadelore.add(ChatColor.BLUE + "2x Durability");
		EmeraldSpade2Meta.setLore(Tier2Spadelore);
		EmeraldSpade2.setItemMeta(EmeraldSpade2Meta);
		//Enchant
		ShapedRecipe EmeraldSpade2Recipe = new ShapedRecipe(EmeraldSpade2);
		EmeraldSpade2Recipe.shape("DE ", " S ", " S ");
		EmeraldSpade2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldSpade2Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldSpade2Recipe.setIngredient('S', Material.STICK);
		EmeraldSpade2.setDurability((short) (EmeraldSpade2.getDurability() * 2));
		server.addRecipe(EmeraldSpade2Recipe);

		//getLogger().info("EmeraldSpade2 refreshed!");

		//Emerald Spade (diamond + netherstar = good enchant + 2x durability)

		EmeraldSpade3 = new ItemStack(Material.DIAMOND_SPADE, 1);
		ItemMeta EmeraldSpade3Meta = EmeraldSpade3.getItemMeta();
		EmeraldSpade3Meta.setDisplayName(ChatColor.GREEN + "Emerald Spade");
		ArrayList<String> Tier3Spadelore = new ArrayList<String>();
		Tier3Spadelore.add(ChatColor.GOLD + "Tier III");
		Tier3Spadelore.add("");
		Tier3Spadelore.add(ChatColor.BLUE + "3x Durability");
		EmeraldSpade3Meta.setLore(Tier3Spadelore);
		EmeraldSpade3.setItemMeta(EmeraldSpade3Meta);
		//Enchants
		ShapedRecipe EmeraldSpade3Recipe = new ShapedRecipe(EmeraldSpade3);
		EmeraldSpade3Recipe.shape("DEN", " S ", " S ");
		EmeraldSpade3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldSpade3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldSpade3Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldSpade3Recipe.setIngredient('S', Material.STICK);
		EmeraldSpade3.setDurability((short) (EmeraldSpade3.getDurability() * 3));
		server.addRecipe(EmeraldSpade3Recipe);

		//getLogger().info("EmeraldSpade3 refreshed!");

		//getLogger().info("EmeraldSpade() refreshed!");

	}
	public void hoeRecipe(){
		Server server = this.getServer();

		//EmeraldHoe

		EmeraldHoe = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta EmeraldHoeMeta = EmeraldHoe.getItemMeta();
		EmeraldHoeMeta.setDisplayName(ChatColor.GREEN + "Emerald Hoe");
		ArrayList<String> Tier1Hoelore = new ArrayList<String>();
		Tier1Hoelore.add(ChatColor.GOLD + "Tier I");
		Tier1Hoelore.add("");
		EmeraldHoeMeta.setLore(Tier1Hoelore);
		EmeraldHoe.setItemMeta(EmeraldHoeMeta);
		//Enchantments
		ShapedRecipe EmeraldHoeRecipe = new ShapedRecipe(EmeraldHoe);
		EmeraldHoeRecipe.shape("EE ", " S ", " S ");
		EmeraldHoeRecipe.setIngredient('E', Material.EMERALD); 
		EmeraldHoeRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(EmeraldHoeRecipe);

		//getLogger().info("EmeraldHoe refreshed!");

		//EmeraldHoe (2 + 2x Durability)

		EmeraldHoe2 = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta EmeraldHoe2Meta = EmeraldHoe2.getItemMeta();
		EmeraldHoe2Meta.setDisplayName(ChatColor.GREEN + "Emerald Hoe");
		ArrayList<String> Tier2Hoelore = new ArrayList<String>();
		Tier2Hoelore.add(ChatColor.GOLD + "Tier II");
		Tier2Hoelore.add("");
		Tier2Hoelore.add(ChatColor.BLUE + "2x Durability");
		EmeraldHoe2Meta.setLore(Tier2Hoelore);
		EmeraldHoe2.setItemMeta(EmeraldHoe2Meta);
		//Enchantments
		ShapedRecipe EmeraldHoe2Recipe = new ShapedRecipe(EmeraldHoe2);
		EmeraldHoe2Recipe.shape("ED ", " S ", " S ");
		EmeraldHoe2Recipe.setIngredient('D', Material.DIAMOND); 
		EmeraldHoe2Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldHoe2Recipe.setIngredient('S', Material.STICK);
		EmeraldHoe2.setDurability((short) (EmeraldHoe2.getDurability() * 2));
		server.addRecipe(EmeraldHoe2Recipe);

		//getLogger().info("EmeraldHoe2 refreshed!");

		//EmeraldHoe (diamond + netherstar = good enchant + 2x durability)

		EmeraldHoe3 = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta EmeraldHoe3Meta = EmeraldHoe3.getItemMeta();
		EmeraldHoe3Meta.setDisplayName(ChatColor.GREEN + "Emerald Hoe");
		ArrayList<String> Tier3Hoelore = new ArrayList<String>();
		Tier3Hoelore.add(ChatColor.GOLD + "Tier III");
		Tier3Hoelore.add("");
		Tier3Hoelore.add(ChatColor.BLUE + "3x Durability");
		EmeraldHoe3Meta.setLore(Tier3Hoelore);
		EmeraldHoe3.setItemMeta(EmeraldHoe3Meta);
		//Enchants
		ShapedRecipe EmeraldHoe3Recipe = new ShapedRecipe(EmeraldHoe3);
		EmeraldHoe3Recipe.shape("ED ", " N ", " S ");
		EmeraldHoe3Recipe.setIngredient('N', Material.BLAZE_POWDER); 
		EmeraldHoe3Recipe.setIngredient('D', Material.DIAMOND); 
		EmeraldHoe3Recipe.setIngredient('E', Material.EMERALD); 
		EmeraldHoe3Recipe.setIngredient('S', Material.STICK);
		EmeraldHoe3.setDurability((short) (EmeraldHoe3.getDurability() * 3));
		server.addRecipe(EmeraldHoe3Recipe);

		//getLogger().info("EmeraldHoe3 refreshed!");

		//getLogger().info("EmeraldHoe() refreshed!");
	}
	public void helmetRecipe(){
		Server server = this.getServer();

		//EmeraldHelm

		EmeraldHelm = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta EmeraldHelmMeta = EmeraldHelm.getItemMeta();
		EmeraldHelmMeta.setDisplayName(ChatColor.GREEN + "Emerald Helmet");
		ArrayList<String> Tier1Helmlore = new ArrayList<String>();
		Tier1Helmlore.add(ChatColor.GOLD + "Tier I");
		Tier1Helmlore.add("");
		EmeraldHelmMeta.setLore(Tier1Helmlore);
		EmeraldHelm.setItemMeta(EmeraldHelmMeta);
		//Enchantments
		ShapedRecipe EmeraldHelmRecipe = new ShapedRecipe(EmeraldHelm);
		EmeraldHelmRecipe.shape("EEE", "E E", "   ");
		EmeraldHelmRecipe.setIngredient('E', Material.EMERALD);
		server.addRecipe(EmeraldHelmRecipe);

		//getLogger().info("EmeraldHelm refreshed!");

		//EmeraldHelm (Tier 2) 

		EmeraldHelm2 = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta EmeraldHelm2Meta = EmeraldHelm2.getItemMeta();
		EmeraldHelm2Meta.setDisplayName(ChatColor.GREEN + "Emerald Helmet");
		ArrayList<String> Tier2Helmlore = new ArrayList<String>();
		Tier2Helmlore.add(ChatColor.GOLD + "Tier II");
		Tier2Helmlore.add("");
		Tier2Helmlore.add(ChatColor.BLUE + "2x Durability");
		EmeraldHelm2Meta.setLore(Tier2Helmlore);
		EmeraldHelm2.setItemMeta(EmeraldHelm2Meta);
		//Enchantments
		ShapedRecipe EmeraldHelm2Recipe = new ShapedRecipe(EmeraldHelm2);
		EmeraldHelm2Recipe.shape("EEE", "EDE", "   ");
		EmeraldHelm2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldHelm2Recipe.setIngredient('E', Material.EMERALD);
		EmeraldHelm2.setDurability((short) (EmeraldHelm2.getDurability() * 2));
		server.addRecipe(EmeraldHelm2Recipe);

		//getLogger().info("EmeraldHelm2 refreshed!");

		//EmeraldHelm (Tier 3) 

		EmeraldHelm3 = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta EmeraldHelm3Meta = EmeraldHelm3.getItemMeta();
		EmeraldHelm3Meta.setDisplayName(ChatColor.GREEN + "Emerald Helmet");
		ArrayList<String> Tier3Helmlore = new ArrayList<String>();
		Tier3Helmlore.add(ChatColor.GOLD + "Tier III");
		Tier3Helmlore.add("");
		Tier3Helmlore.add(ChatColor.BLUE + "3x Durability");
		EmeraldHelm3Meta.setLore(Tier3Helmlore);
		EmeraldHelm3.setItemMeta(EmeraldHelm3Meta);
		//Enchants
		ShapedRecipe EmeraldHelm3Recipe = new ShapedRecipe(EmeraldHelm3);
		EmeraldHelm3Recipe.shape("EEE", "D N", "   ");
		EmeraldHelm3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldHelm3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldHelm3Recipe.setIngredient('E', Material.EMERALD);
		EmeraldHelm3.setDurability((short) (EmeraldHelm3.getDurability() * 3));
		server.addRecipe(EmeraldHelm3Recipe);

		//getLogger().info("EmeraldHelm3 refreshed!");

		//getLogger().info("EmeraldHelm() refreshed!");
	}
	public void chestplateRecipe(){
		Server server = this.getServer();

		//EmeraldChestplate


		EmeraldChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta EmeraldChestplateMeta = EmeraldChestplate.getItemMeta();
		EmeraldChestplateMeta.setDisplayName(ChatColor.GREEN + "Emerald Chestplate");
		ArrayList<String> Tier1Chestlore = new ArrayList<String>();
		Tier1Chestlore.add(ChatColor.GOLD + "Tier I");
		Tier1Chestlore.add("");
		EmeraldChestplateMeta.setLore(Tier1Chestlore);
		EmeraldChestplate.setItemMeta(EmeraldChestplateMeta);
		//Enchantments
		ShapedRecipe EmeraldChestplateRecipe = new ShapedRecipe(EmeraldChestplate);
		EmeraldChestplateRecipe.shape("E E", "EEE", "EEE");
		EmeraldChestplateRecipe.setIngredient('E', Material.EMERALD);
		server.addRecipe(EmeraldChestplateRecipe);

		//getLogger().info("EmeraldChestplate refreshed!");

		//EmeraldChest (Tier 2) 

		EmeraldChestplate2 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta EmeraldChestplate2Meta = EmeraldChestplate2.getItemMeta();
		EmeraldChestplate2Meta.setDisplayName(ChatColor.GREEN + "Emerald Chestplate");
		ArrayList<String> Tier2Chestlore = new ArrayList<String>();
		Tier2Chestlore.add(ChatColor.GOLD + "Tier II");
		Tier2Chestlore.add("");
		Tier2Chestlore.add(ChatColor.BLUE + "2x Durability");
		EmeraldChestplate2Meta.setLore(Tier2Chestlore);
		EmeraldChestplate2.setItemMeta(EmeraldChestplate2Meta);
		//Enchantments
		ShapedRecipe EmeraldChestplate2Recipe = new ShapedRecipe(EmeraldChestplate2);
		EmeraldChestplate2Recipe.shape("EDE", "EEE", "EEE");
		EmeraldChestplate2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldChestplate2Recipe.setIngredient('E', Material.EMERALD);
		EmeraldChestplate2.setDurability((short) (EmeraldChestplate.getDurability() * 2));
		server.addRecipe(EmeraldChestplate2Recipe);

		//getLogger().info("EmeraldChestplate2 refreshed!");

		//EmeraldChest (Tier 3) 

		EmeraldChestplate3 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta EmeraldChestplate3Meta = EmeraldChestplate3.getItemMeta();
		EmeraldChestplate3Meta.setDisplayName(ChatColor.GREEN + "Emerald Chestplate");
		ArrayList<String> Tier3Chestlore = new ArrayList<String>();
		Tier3Chestlore.add(ChatColor.GOLD + "Tier III");
		Tier3Chestlore.add("");
		Tier3Chestlore.add(ChatColor.BLUE + "3x Durability");
		EmeraldChestplate3Meta.setLore(Tier3Chestlore);
		EmeraldChestplate3.setItemMeta(EmeraldChestplate3Meta);
		//Enchants
		ShapedRecipe EmeraldChestplate3Recipe = new ShapedRecipe(EmeraldChestplate3);
		EmeraldChestplate3Recipe.shape("EDE", "ENE", "EEE");
		EmeraldChestplate3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldChestplate3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldChestplate3Recipe.setIngredient('E', Material.EMERALD);
		EmeraldChestplate3.setDurability((short) (EmeraldChestplate3.getDurability() * 3));
		server.addRecipe(EmeraldChestplate3Recipe);

		//getLogger().info("EmeraldChestplate3 refreshed!");

		//getLogger().info("EmeraldChestplate() refreshed!");

	}
	public void leggingsRecipe(){
		Server server = this.getServer();

		//EmeraldLeggings

		EmeraldLeggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		ItemMeta EmeraldLeggingsMeta = EmeraldLeggings.getItemMeta();
		EmeraldLeggingsMeta.setDisplayName(ChatColor.GREEN + "Emerald Leggings");
		ArrayList<String> Tier1Legslore = new ArrayList<String>();
		Tier1Legslore.add(ChatColor.GOLD + "Tier I");
		Tier1Legslore.add("");
		EmeraldLeggingsMeta.setLore(Tier1Legslore);
		EmeraldLeggings.setItemMeta(EmeraldLeggingsMeta);
		//Enchantments
		ShapedRecipe EmeraldLeggingsRecipe = new ShapedRecipe(EmeraldLeggings);
		EmeraldLeggingsRecipe.shape("EEE", "E E", "E E");
		EmeraldLeggingsRecipe.setIngredient('E', Material.EMERALD);
		server.addRecipe(EmeraldLeggingsRecipe);

		//getLogger().info("EmeraldLeggings refreshed!");

		//EmeraldPants (Tier 2)

		EmeraldLeggings2 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		ItemMeta EmeraldLeggings2Meta = EmeraldLeggings2.getItemMeta();
		EmeraldLeggings2Meta.setDisplayName(ChatColor.GREEN + "Emerald Leggings");
		ArrayList<String> Tier2Legslore = new ArrayList<String>();
		Tier2Legslore.add(ChatColor.GOLD + "Tier II");
		Tier2Legslore.add("");
		Tier2Legslore.add(ChatColor.BLUE + "2x Durability");
		EmeraldLeggings2Meta.setLore(Tier2Legslore);
		EmeraldLeggings2.setItemMeta(EmeraldLeggings2Meta);
		//Enchantments
		ShapedRecipe EmeraldLeggings2Recipe = new ShapedRecipe(EmeraldLeggings2);
		EmeraldLeggings2Recipe.shape("EEE", "EDE", "E E");
		EmeraldLeggings2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldLeggings2Recipe.setIngredient('E', Material.EMERALD);
		EmeraldLeggings2.setDurability((short) (EmeraldLeggings2.getDurability() * 2));
		server.addRecipe(EmeraldLeggings2Recipe);

		//getLogger().info("EmeraldLeggings2 refreshed!");

		//EmeraldLeggings (Tier 3)

		EmeraldLeggings3 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		ItemMeta EmeraldLeggings3Meta = EmeraldLeggings3.getItemMeta();
		EmeraldLeggings3Meta.setDisplayName(ChatColor.GREEN + "Emerald Leggings");
		ArrayList<String> Tier3Legslore = new ArrayList<String>();
		Tier3Legslore.add(ChatColor.GOLD + "Tier III");
		Tier3Legslore.add("");
		Tier3Legslore.add(ChatColor.BLUE + "3x Durability");
		EmeraldLeggings3Meta.setLore(Tier3Legslore);
		EmeraldLeggings3.setItemMeta(EmeraldLeggings3Meta);
		//Enchants
		ShapedRecipe EmeraldLeggings3Recipe = new ShapedRecipe(EmeraldLeggings3);
		EmeraldLeggings3Recipe.shape("EEE", "EDE", "ENE");
		EmeraldLeggings3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldLeggings3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldLeggings3Recipe.setIngredient('E', Material.EMERALD);
		EmeraldLeggings3.setDurability((short) (EmeraldLeggings3.getDurability() * 3));
		server.addRecipe(EmeraldLeggings3Recipe);

		//getLogger().info("EmeraldLeggings3 refreshed!");

		//getLogger().info("EmeraldLeggings() refreshed!");

	}
	public void bootsRecipe(){
		Server server = this.getServer();

		//EmeraldBoots

		EmeraldBoots = new ItemStack(Material.DIAMOND_BOOTS, 1);
		ItemMeta EmeraldBootsMeta = EmeraldBoots.getItemMeta();
		EmeraldBootsMeta.setDisplayName(ChatColor.GREEN + "Emerald Boots");
		ArrayList<String> Tier1Bootslore = new ArrayList<String>();
		Tier1Bootslore.add(ChatColor.GOLD + "Tier I");
		Tier1Bootslore.add("");
		EmeraldBootsMeta.setLore(Tier1Bootslore);
		EmeraldBoots.setItemMeta(EmeraldBootsMeta);
		//Enchant
		ShapedRecipe EmeraldBootsRecipe = new ShapedRecipe(EmeraldBoots);
		EmeraldBootsRecipe.shape("   ", "E E", "E E");
		EmeraldBootsRecipe.setIngredient('E', Material.EMERALD);
		server.addRecipe(EmeraldBootsRecipe);

		//getLogger().info("EmeraldBoots refreshed!");

		//EmeraldBoots (Tier 2)

		EmeraldBoots2 = new ItemStack(Material.DIAMOND_BOOTS, 1);
		ItemMeta EmeraldBoots2Meta = EmeraldBoots2.getItemMeta();
		EmeraldBoots2Meta.setDisplayName(ChatColor.GREEN + "Emerald Boots");
		ArrayList<String> Tier2Bootslore = new ArrayList<String>();
		Tier2Bootslore.add(ChatColor.GOLD + "Tier II");
		Tier2Bootslore.add("");
		Tier2Bootslore.add(ChatColor.BLUE + "2x Durability");
		EmeraldBoots2Meta.setLore(Tier2Bootslore);
		EmeraldBoots2.setItemMeta(EmeraldBoots2Meta);
		//Enchant
		ShapedRecipe EmeraldBoots2Recipe = new ShapedRecipe(EmeraldBoots2);
		EmeraldBoots2Recipe.shape("EDE", "E E");
		EmeraldBoots2Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldBoots2Recipe.setIngredient('E', Material.EMERALD);
		EmeraldBoots2.setDurability((short) (EmeraldBoots2.getDurability() * 2));
		server.addRecipe(EmeraldBoots2Recipe);

		//getLogger().info("EmeraldBoots2 refreshed!");

		//EmeraldBoots (Tier 3)

		EmeraldBoots3 = new ItemStack(Material.DIAMOND_BOOTS, 1);
		ItemMeta EmeraldBoots3Meta = EmeraldBoots3.getItemMeta();
		EmeraldBoots3Meta.setDisplayName(ChatColor.GREEN + "Emerald Boots");
		ArrayList<String> Tier3Bootslore = new ArrayList<String>();
		Tier3Bootslore.add(ChatColor.GOLD + "Tier III");
		Tier3Bootslore.add("");
		Tier3Bootslore.add(ChatColor.BLUE + "3x Durability");
		EmeraldBoots3Meta.setLore(Tier3Bootslore);
		EmeraldBoots3.setItemMeta(EmeraldBoots3Meta);
		//Enchants
		ShapedRecipe EmeraldBoots3Recipe = new ShapedRecipe(EmeraldBoots3);
		EmeraldBoots3Recipe.shape("EDE", "ENE");
		EmeraldBoots3Recipe.setIngredient('N', Material.BLAZE_POWDER);
		EmeraldBoots3Recipe.setIngredient('D', Material.DIAMOND);
		EmeraldBoots3Recipe.setIngredient('E', Material.EMERALD);
		EmeraldBoots3.setDurability((short) (EmeraldBoots3.getDurability() * 3));
		server.addRecipe(EmeraldBoots3Recipe);

		//getLogger().info("EmeraldBoots3 refreshed!");

		//getLogger().info("EmeraldBoots() refreshed!");

	}

	/*public void enchantRefresh(){
		EmeraldSword.addUnsafeEnchantment(swordEnchants[(int) (Math.random()*swordEnchants.length)], (int) (Math.random()*5));
		EmeraldSword2.addUnsafeEnchantment(swordEnchants[(int) (Math.random()*swordEnchants.length)], (int) (Math.random()*5));
		EmeraldPickaxe.addUnsafeEnchantment(pickEnchants[(int) (Math.random()*pickEnchants.length)], (int) (Math.random()*5));
		EmeraldPickaxe2.addUnsafeEnchantment(pickEnchants[(int) (Math.random()*pickEnchants.length)], (int) (Math.random()*5));
		EmeraldAxe.addUnsafeEnchantment(axeEnchants[(int) (Math.random()*axeEnchants.length)], (int) (Math.random()*5));
		EmeraldAxe2.addUnsafeEnchantment(axeEnchants[(int) (Math.random()*axeEnchants.length)], (int) (Math.random()*5));
		EmeraldSpade.addUnsafeEnchantment(shovelEnchants[(int) (Math.random()*shovelEnchants.length)], (int) (Math.random()*5));
		EmeraldSpade2.addUnsafeEnchantment(shovelEnchants[(int) (Math.random()*shovelEnchants.length)], (int) (Math.random()*5));
		EmeraldHoe.addUnsafeEnchantment(hoeEnchants[(int) (Math.random()*hoeEnchants.length)], (int) (Math.random()*5));
		EmeraldHoe2.addUnsafeEnchantment(hoeEnchants[(int) (Math.random()*hoeEnchants.length)], (int) (Math.random()*5));

		EmeraldHelm.addUnsafeEnchantment(helmEnchants[(int) (Math.random()*helmEnchants.length)], (int) (Math.random()*5));
		EmeraldHelm2.addUnsafeEnchantment(helmEnchants[(int) (Math.random()*helmEnchants.length)], (int) (Math.random()*5));
		EmeraldChestplate.addUnsafeEnchantment(chestEnchants[(int) (Math.random()*chestEnchants.length)], (int) (Math.random()*5));
		EmeraldChestplate2.addUnsafeEnchantment(chestEnchants[(int) (Math.random()*chestEnchants.length)], (int) (Math.random()*5));
		EmeraldLeggings.addUnsafeEnchantment(legEnchants[(int) (Math.random()*legEnchants.length)], (int) (Math.random()*5));
		EmeraldLeggings2.addUnsafeEnchantment(legEnchants[(int) (Math.random()*legEnchants.length)], (int) (Math.random()*5));
		EmeraldBoots.addUnsafeEnchantment(bootEnchants[(int) (Math.random()*bootEnchants.length)], (int) (Math.random()*5));
		EmeraldBoots2.addUnsafeEnchantment(bootEnchants[(int) (Math.random()*bootEnchants.length)], (int) (Math.random()*5));

		//getLogger().info("Enchantments added!");
	}*/

	/*public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("stools")) {
			switch(args.length) {
			case 0:
				// send message
				return true;
			case 1:
				if(args[0].equalsIgnoreCase("refresh")) {
					//getLogger().info("Refresh invoked!");
					enchantRefresh();
					//getLogger().info("Refreshing randomEnchant()...");
					randomEnchant();
					//getLogger().info("Refreshing swordRecipe()...");
					swordRecipe();
					//getLogger().info("Refreshing pickaxeRecipe()...");
					pickaxeRecipe();
					//getLogger().info("Refreshing axeRecipe()...");
					axeRecipe();
					//getLogger().info("Refreshing shovelRecipe()...");
					shovelRecipe();
					//getLogger().info("Refreshing hoeRecipe()...");
					hoeRecipe();
					//getLogger().info("Refreshing helmetRecipe()...");
					helmetRecipe();
					//getLogger().info("Refreshing chestplateRecipe()...");
					chestplateRecipe();
					//getLogger().info("Refreshing leggingsRecipe()...");
					leggingsRecipe();
					//getLogger().info("Refreshing bootsRecipe()...");
					bootsRecipe();
					sender.sendMessage("Enchantments refreshed!");
				}
			}
		}
		return true;
	}*/

	@Override
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		//getLogger().info("onEnable invoked!");
		all();
	}
}
