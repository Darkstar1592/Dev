package com.darkstar.meltdown;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class MeltDown extends JavaPlugin implements Listener{

	@Override
	public void onEnable(){
		Server server = this.getServer();
		
		//DiamondHelm
        FurnaceRecipe MeltDiamondHelm = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 5), Material.DIAMOND_HELMET);
        MeltDiamondHelm.setInput(Material.DIAMOND_HELMET);
        server.addRecipe(MeltDiamondHelm);
        Bukkit.addRecipe(MeltDiamondHelm);
		
		//DiamondChest
        FurnaceRecipe MeltDiamondChest = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 8), Material.DIAMOND_CHESTPLATE);
        MeltDiamondChest.setInput(Material.DIAMOND_CHESTPLATE);
        server.addRecipe(MeltDiamondChest);
        Bukkit.addRecipe(MeltDiamondChest);
        
		//DiamondPants
        FurnaceRecipe MeltDiamondPants = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 7), Material.DIAMOND_LEGGINGS);
        MeltDiamondPants.setInput(Material.DIAMOND_LEGGINGS);
        server.addRecipe(MeltDiamondPants);
        Bukkit.addRecipe(MeltDiamondPants);
        
		//DiamondBoots
        FurnaceRecipe MeltDiamondBoots = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 4), Material.DIAMOND_BOOTS);
        MeltDiamondBoots.setInput(Material.DIAMOND_BOOTS);
        server.addRecipe(MeltDiamondBoots);
        Bukkit.addRecipe(MeltDiamondBoots);
        
		//IRONHelm
        FurnaceRecipe MeltIRONHelm = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 5), Material.IRON_HELMET);
        MeltIRONHelm.setInput(Material.IRON_HELMET);
        server.addRecipe(MeltIRONHelm);
        Bukkit.addRecipe(MeltIRONHelm);
		
		//IRONChest
        FurnaceRecipe MeltIRONChest = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 8), Material.IRON_CHESTPLATE);
        MeltIRONChest.setInput(Material.IRON_CHESTPLATE);
        server.addRecipe(MeltIRONChest);
        Bukkit.addRecipe(MeltIRONChest);
        
		//IRONPants
        FurnaceRecipe MeltIRONPants = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 7), Material.IRON_LEGGINGS);
        MeltIRONPants.setInput(Material.IRON_LEGGINGS);
        server.addRecipe(MeltIRONPants);
        Bukkit.addRecipe(MeltIRONPants);
        
		//IRONBoots
        FurnaceRecipe MeltIRONBoots = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 4), Material.IRON_BOOTS);
        MeltIRONBoots.setInput(Material.IRON_BOOTS);
        server.addRecipe(MeltIRONBoots);
        Bukkit.addRecipe(MeltIRONBoots);
        
        //GOLDHelm
        FurnaceRecipe MeltGOLDHelm = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 5), Material.GOLD_HELMET);
        MeltGOLDHelm.setInput(Material.GOLD_HELMET);
        server.addRecipe(MeltGOLDHelm);
        Bukkit.addRecipe(MeltGOLDHelm);
		
		//GOLDChest
        FurnaceRecipe MeltGOLDChest = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 8), Material.GOLD_CHESTPLATE);
        MeltGOLDChest.setInput(Material.GOLD_CHESTPLATE);
        server.addRecipe(MeltGOLDChest);
        Bukkit.addRecipe(MeltGOLDChest);
        
		//GOLDPants
        FurnaceRecipe MeltGOLDPants = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 7), Material.GOLD_LEGGINGS);
        MeltGOLDPants.setInput(Material.GOLD_LEGGINGS);
        server.addRecipe(MeltGOLDPants);
        Bukkit.addRecipe(MeltGOLDPants);
        
		//GOLDBoots
        FurnaceRecipe MeltGOLDBoots = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 4), Material.GOLD_BOOTS);
        MeltGOLDBoots.setInput(Material.GOLD_BOOTS);
        server.addRecipe(MeltGOLDBoots);
        Bukkit.addRecipe(MeltGOLDBoots);
        
        
        //DiamondSword
        FurnaceRecipe MeltDiamondSword = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 2), Material.DIAMOND_SWORD);
        MeltDiamondSword.setInput(Material.DIAMOND_SWORD);
        server.addRecipe(MeltDiamondSword);
        Bukkit.addRecipe(MeltDiamondSword);
        
        //DiamondPickaxe
        FurnaceRecipe MeltDiamondPickaxe = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 3), Material.DIAMOND_PICKAXE);
        MeltDiamondPickaxe.setInput(Material.DIAMOND_PICKAXE);
        server.addRecipe(MeltDiamondPickaxe);
        Bukkit.addRecipe(MeltDiamondPickaxe);
        
        //DiamondAxe
        FurnaceRecipe MeltDiamondAxe = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 3), Material.DIAMOND_AXE);
        MeltDiamondAxe.setInput(Material.DIAMOND_AXE);
        server.addRecipe(MeltDiamondAxe);
        Bukkit.addRecipe(MeltDiamondAxe);
        
        //DiamondSpade
        FurnaceRecipe MeltDiamondSpade = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 1), Material.DIAMOND_SPADE);
        MeltDiamondSpade.setInput(Material.DIAMOND_SPADE);
        server.addRecipe(MeltDiamondSpade);
        Bukkit.addRecipe(MeltDiamondSpade);
        
        //DiamondHoe
        FurnaceRecipe MeltDiamondHoe = new FurnaceRecipe(new ItemStack(Material.DIAMOND, 2), Material.DIAMOND_HOE);
        MeltDiamondHoe.setInput(Material.DIAMOND_HOE);
        server.addRecipe(MeltDiamondHoe);
        Bukkit.addRecipe(MeltDiamondHoe);
        
        //IRONSword
        FurnaceRecipe MeltIRONSword = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 2), Material.IRON_SWORD);
        MeltIRONSword.setInput(Material.IRON_SWORD);
        server.addRecipe(MeltIRONSword);
        Bukkit.addRecipe(MeltIRONSword);
        
        //IRONPickaxe
        FurnaceRecipe MeltIRONPickaxe = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 3), Material.IRON_PICKAXE);
        MeltIRONPickaxe.setInput(Material.IRON_PICKAXE);
        server.addRecipe(MeltIRONPickaxe);
        Bukkit.addRecipe(MeltIRONPickaxe);
        
        //IRONAxe
        FurnaceRecipe MeltIRONAxe = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 3), Material.IRON_AXE);
        MeltIRONAxe.setInput(Material.IRON_AXE);
        server.addRecipe(MeltIRONAxe);
        Bukkit.addRecipe(MeltIRONAxe);
        
        //IRONSpade
        FurnaceRecipe MeltIRONSpade = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 1), Material.IRON_SPADE);
        MeltIRONSpade.setInput(Material.IRON_SPADE);
        server.addRecipe(MeltIRONSpade);
        Bukkit.addRecipe(MeltIRONSpade);
        
        //IRONHoe
        FurnaceRecipe MeltIRONHoe = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 2), Material.IRON_HOE);
        MeltIRONHoe.setInput(Material.IRON_HOE);
        server.addRecipe(MeltIRONHoe);
        Bukkit.addRecipe(MeltIRONHoe);
        
        //Shears
        FurnaceRecipe MeltShears = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 2), Material.SHEARS);
        MeltShears.setInput(Material.SHEARS);
        server.addRecipe(MeltShears);
        Bukkit.addRecipe(MeltShears);
        
        //IronDoor
        FurnaceRecipe MeltDoor = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 6), Material.IRON_DOOR);
        MeltDoor.setInput(Material.IRON_DOOR);
        server.addRecipe(MeltDoor);
        Bukkit.addRecipe(MeltDoor);
        
        //Minecart
        FurnaceRecipe MeltCart = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 5), Material.MINECART);
        MeltCart.setInput(Material.MINECART);
        server.addRecipe(MeltCart);
        Bukkit.addRecipe(MeltCart);
        
        //IronBars (only smelt if 16 bars)
        
        //GOLDSword
        FurnaceRecipe MeltGOLDSword = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 2), Material.GOLD_SWORD);
        MeltGOLDSword.setInput(Material.GOLD_SWORD);
        server.addRecipe(MeltGOLDSword);
        Bukkit.addRecipe(MeltGOLDSword);
        
        //GOLDPickaxe
        FurnaceRecipe MeltGOLDPickaxe = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 3), Material.GOLD_PICKAXE);
        MeltGOLDPickaxe.setInput(Material.GOLD_PICKAXE);
        server.addRecipe(MeltGOLDPickaxe);
        Bukkit.addRecipe(MeltGOLDPickaxe);
        
        //GOLDAxe
        FurnaceRecipe MeltGOLDAxe = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 3), Material.GOLD_AXE);
        MeltGOLDAxe.setInput(Material.GOLD_AXE);
        server.addRecipe(MeltGOLDAxe);
        Bukkit.addRecipe(MeltGOLDAxe);
        
        //GOLDSpade
        FurnaceRecipe MeltGOLDSpade = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 1), Material.GOLD_SPADE);
        MeltGOLDSpade.setInput(Material.GOLD_SPADE);
        server.addRecipe(MeltGOLDSpade);
        Bukkit.addRecipe(MeltGOLDSpade);
        
        //GoldHoe
        FurnaceRecipe MeltGOLDHoe = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 2), Material.GOLD_HOE);
        MeltGOLDHoe.setInput(Material.GOLD_HOE);
        server.addRecipe(MeltGOLDHoe);
        Bukkit.addRecipe(MeltGOLDHoe);
        
        //STONESword
        FurnaceRecipe MeltSTONESword = new FurnaceRecipe(new ItemStack(Material.COBBLESTONE, 2), Material.STONE_SWORD);
        MeltSTONESword.setInput(Material.STONE_SWORD);
        server.addRecipe(MeltSTONESword);
        Bukkit.addRecipe(MeltSTONESword);
        
        //STONEPickaxe
        FurnaceRecipe MeltSTONEPickaxe = new FurnaceRecipe(new ItemStack(Material.COBBLESTONE, 3), Material.STONE_PICKAXE);
        MeltSTONEPickaxe.setInput(Material.STONE_PICKAXE);
        server.addRecipe(MeltSTONEPickaxe);
        Bukkit.addRecipe(MeltSTONEPickaxe);
        
        //STONEAxe
        FurnaceRecipe MeltSTONEAxe = new FurnaceRecipe(new ItemStack(Material.COBBLESTONE, 3), Material.STONE_AXE);
        MeltSTONEAxe.setInput(Material.STONE_AXE);
        server.addRecipe(MeltSTONEAxe);
        Bukkit.addRecipe(MeltSTONEAxe);
        
        //STONESpade
        FurnaceRecipe MeltSTONESpade = new FurnaceRecipe(new ItemStack(Material.COBBLESTONE, 1), Material.STONE_SPADE);
        MeltSTONESpade.setInput(Material.STONE_SPADE);
        server.addRecipe(MeltSTONESpade);
        Bukkit.addRecipe(MeltSTONESpade);
        
        //STONEHoe
        FurnaceRecipe MeltSTONEHoe = new FurnaceRecipe(new ItemStack(Material.COBBLESTONE, 2), Material.STONE_HOE);
        MeltSTONEHoe.setInput(Material.STONE_HOE);
        server.addRecipe(MeltSTONEHoe);
        Bukkit.addRecipe(MeltSTONEHoe);
        
        //Poisonous potato to charcoal
		ItemStack charcoal = new ItemStack(Material.COAL);
		charcoal.setDurability((short) 1);
        FurnaceRecipe MeltPoisonPotato = new FurnaceRecipe(new ItemStack(charcoal), Material.POISONOUS_POTATO);
        MeltPoisonPotato.setInput(Material.POISONOUS_POTATO);
        server.addRecipe(MeltPoisonPotato);
        Bukkit.addRecipe(MeltPoisonPotato);
        
        //Rotten Flesh to Leather
        FurnaceRecipe meltFlesh = new FurnaceRecipe(new ItemStack(Material.LEATHER, 1), Material.ROTTEN_FLESH);
        meltFlesh.setInput(Material.ROTTEN_FLESH);
        server.addRecipe(meltFlesh);
        Bukkit.addRecipe(meltFlesh);
	}

	public void onDisable(){
	}
}
