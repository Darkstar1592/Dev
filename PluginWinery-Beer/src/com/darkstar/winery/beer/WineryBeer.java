package com.darkstar.winery.beer;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WineryBeer extends JavaPlugin implements Listener{

	@EventHandler
	public void onConsume(PlayerItemConsumeEvent e) {
		final Player player = e.getPlayer();
		if (player.getItemInHand() != null){
			if (player.getItemInHand().getItemMeta().getDisplayName() != null){
				if(player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Amber Ale") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Pale Ale") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Bitter") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "India Pale Ale") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Irish Ale") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Barley Wine") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Stouts") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Porter") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Wheat Beer") ||

						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Bock") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Dunkel") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Marzen") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Pale Lager") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Munich") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "DoppleBock") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Dos Equis")){

					/*Collection<PotionEffect> playereffects = player.getActivePotionEffects();
					if (playereffects != null){
						player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 0));
					}*/
					if (!(player.getItemInHand().getItemMeta().getDisplayName().equals(null))){
						if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Amber Ale")){
							PotionEffect ambereffect = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0);
							ambereffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Pale Ale")){
							PotionEffect palealeeffect = new PotionEffect(PotionEffectType.JUMP, 300, 0);
							palealeeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Bitter")){
							PotionEffect bittereffect = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 0);
							bittereffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "India Pale Ale")){
							PotionEffect indiaeffect = new PotionEffect(PotionEffectType.HEAL, 300, 0);
							indiaeffect.apply(player);

						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Irish Ale")){
							PotionEffect irisheffect = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 0);
							irisheffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Barley Wine")){
							PotionEffect barleyeffect = new PotionEffect(PotionEffectType.HEALTH_BOOST, 300, 0);
							barleyeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Stouts")){
							PotionEffect stoutseffect = new PotionEffect(PotionEffectType.ABSORPTION, 300, 0);
							stoutseffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Porter")){
							PotionEffect portereffect = new PotionEffect(PotionEffectType.FAST_DIGGING, 300, 0);
							portereffect.apply(player);
						}

						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Wheat Beer")){
							PotionEffect wheateffect = new PotionEffect(PotionEffectType.REGENERATION, 300, 0);
							wheateffect.apply(player);
						}

						//Lagers
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Bock")){
							PotionEffect bockeffect = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0);
							bockeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Dunkel")){
							PotionEffect dunkeleffect = new PotionEffect(PotionEffectType.SPEED, 300, 0);
							dunkeleffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Marzen")){
							PotionEffect marzeneffect = new PotionEffect(PotionEffectType.HEAL, 300, 0);
							marzeneffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Pale Lager")){
							PotionEffect paleeffect = new PotionEffect(PotionEffectType.WATER_BREATHING, 300, 0);
							paleeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Munich")){
							PotionEffect munichdarkeffect = new PotionEffect(PotionEffectType.ABSORPTION, 300, 0);
							munichdarkeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "DoppleBock")){
							PotionEffect dopplebockeffect = new PotionEffect(PotionEffectType.NIGHT_VISION, 300, 0);
							dopplebockeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Dos Equis")){
							PotionEffect dopplebockeffect = new PotionEffect(PotionEffectType.HEAL, 300, 0);
							dopplebockeffect.apply(player);
						}
						else {
							getLogger().info("Error!");
						}
						player.getInventory().setItemInHand(null);
						ItemStack bottle = new ItemStack(Material.GLASS_BOTTLE);
						player.getInventory().setItemInHand(bottle);
						//getLogger().info("Effect added");
					}
				}
			}
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Action action = e.getAction();
		Player player = e.getPlayer();
		String loreFormat = ChatColor.GRAY + "" + ChatColor.ITALIC;

		if (action.equals(Action.RIGHT_CLICK_BLOCK)) {

			//Ales
			ItemStack amber = new ItemStack(Material.POTION, 1);
			ItemMeta amberMeta = amber.getItemMeta();
			ArrayList<String> amberLore = new ArrayList<String>();
			amberLore.add(loreFormat + "A sweeter ale due to it's ");
			amberLore.add(loreFormat + "excess of malt");
			amberMeta.setLore(amberLore);
			amberMeta.setDisplayName(ChatColor.GOLD + "Amber Ale");
			amber.setItemMeta(amberMeta);

			ItemStack pale = new ItemStack(Material.POTION, 1);
			ItemMeta paleMeta = pale.getItemMeta();
			ArrayList<String> paleLore = new ArrayList<String>();
			paleLore.add(loreFormat + "A light-colored alcoholic  ");
			paleLore.add(loreFormat + "drink full of malt and hops");
			paleMeta.setLore(paleLore);
			paleMeta.setDisplayName(ChatColor.GOLD + "Pale Ale");
			pale.setItemMeta(paleMeta);

			ItemStack bitter = new ItemStack(Material.POTION, 1);
			ItemMeta bitterMeta = bitter.getItemMeta();
			ArrayList<String> bitterLore = new ArrayList<String>();
			bitterLore.add(loreFormat + "Contains hops that give ");
			bitterLore.add(loreFormat + "it a pleasant aroma");
			bitterMeta.setLore(bitterLore);
			bitterMeta.setDisplayName(ChatColor.GOLD + "Bitter");
			bitter.setItemMeta(bitterMeta);

			ItemStack ipa = new ItemStack(Material.POTION, 1);
			ItemMeta ipaMeta = ipa.getItemMeta();
			ArrayList<String> ipaLore = new ArrayList<String>();
			ipaLore.add(loreFormat + "This hoppy flavor comes across as ");
			ipaLore.add(loreFormat + "golden or darker in color and has ");
			ipaLore.add(loreFormat + "a bitter scent and taste");
			ipaMeta.setLore(ipaLore);
			ipaMeta.setDisplayName(ChatColor.GOLD + "India Pale Ale");
			ipa.setItemMeta(ipaMeta);

			ItemStack irish = new ItemStack(Material.POTION, 1);
			ItemMeta irishMeta = irish.getItemMeta();
			ArrayList<String> irishLore = new ArrayList<String>();
			irishLore.add(loreFormat + "It is deeply red in color and has ");
			irishLore.add(loreFormat + "a sweet, malty taste ");
			irishMeta.setLore(irishLore);
			irishMeta.setDisplayName(ChatColor.GOLD + "Irish Ale");
			irish.setItemMeta(irishMeta);

			ItemStack barley = new ItemStack(Material.POTION, 1);
			ItemMeta barleyMeta = barley.getItemMeta();
			ArrayList<String> barleyLore = new ArrayList<String>();
			barleyLore.add(loreFormat + "It is a very fruity and flavorful ");
			barleyLore.add(loreFormat + "beer but with a high alcoholic content ");
			barleyMeta.setLore(barleyLore);
			barleyMeta.setDisplayName(ChatColor.GOLD + "Barley Wine");
			barley.setItemMeta(barleyMeta);			

			ItemStack stouts = new ItemStack(Material.POTION, 1);
			ItemMeta stoutsMeta = stouts.getItemMeta();
			ArrayList<String> stoutsLore = new ArrayList<String>();
			stoutsLore.add(loreFormat + "Uses malt-free, dark-roasted barley, ");
			stoutsLore.add(loreFormat + "minimal hops, and sweet, chocolate scents");
			stoutsMeta.setLore(stoutsLore);
			stoutsMeta.setDisplayName(ChatColor.GOLD + "Stouts");
			stouts.setItemMeta(stoutsMeta);			

			ItemStack porter = new ItemStack(Material.POTION, 1);
			ItemMeta porterMeta = porter.getItemMeta();
			ArrayList<String> porterLore = new ArrayList<String>();
			porterLore.add(loreFormat + "This is a type of extremely Dark Ale, ");
			porterLore.add(loreFormat + "brewed from heavy-roasted malt.");
			porterLore.add(loreFormat + "Medium-bodied and has a crisp taste");
			porterMeta.setLore(porterLore);
			porterMeta.setDisplayName(ChatColor.GOLD + "Porter");
			porter.setItemMeta(porterMeta);

			ItemStack wheat = new ItemStack(Material.POTION, 1);
			ItemMeta wheatMeta = wheat.getItemMeta();
			ArrayList<String> wheatLore = new ArrayList<String>();
			wheatLore.add(loreFormat + "A refreshing beer, pale-colored ");
			wheatLore.add(loreFormat + "and very carbonated");
			wheatMeta.setLore(wheatLore);
			wheatMeta.setDisplayName(ChatColor.GOLD + "Wheat Beer");
			wheat.setItemMeta(wheatMeta);



			//Lagers
			ItemStack bock = new ItemStack(Material.POTION, 1);
			ItemMeta bockMeta = bock.getItemMeta();
			ArrayList<String> bockLore = new ArrayList<String>();
			bockLore.add(loreFormat + "vary from malty-flavored lagers to ");
			bockLore.add(loreFormat + "darker, hoppy-flavored bocks");
			bockMeta.setLore(bockLore);
			bockMeta.setDisplayName(ChatColor.RED + "Bock");
			bock.setItemMeta(bockMeta);

			ItemStack dunkel = new ItemStack(Material.POTION, 1);
			ItemMeta dunkelMeta = dunkel.getItemMeta();
			ArrayList<String> dunkelLore = new ArrayList<String>();
			dunkelLore.add(loreFormat + "Dark in color with a modest alcoholic ");
			dunkelLore.add(loreFormat + "strength and tastes often suggestive ");
			dunkelLore.add(loreFormat + "of chocolate, coffee and licorice"); 
			dunkelMeta.setLore(dunkelLore);
			dunkelMeta.setDisplayName(ChatColor.RED + "Dunkel");
			dunkel.setItemMeta(dunkelMeta);	

			ItemStack marzen = new ItemStack(Material.POTION, 1);
			ItemMeta marzenMeta = marzen.getItemMeta();
			ArrayList<String> marzenLore = new ArrayList<String>();
			marzenLore.add(loreFormat + "Also known as Oktoberfest beer");
			marzenLore.add(loreFormat + "It is full-bodied and dark brown in color");
			marzenMeta.setLore(marzenLore);
			marzenMeta.setDisplayName(ChatColor.RED + "Marzen");
			marzen.setItemMeta(marzenMeta);	

			ItemStack palelager = new ItemStack(Material.POTION, 1);
			ItemMeta palelagerMeta = palelager.getItemMeta();
			ArrayList<String> palelagerLore = new ArrayList<String>();
			palelagerLore.add(loreFormat + "They are straw-colored and ");
			palelagerLore.add(loreFormat + "carbonated though lacking ");
			palelagerLore.add(loreFormat + "high alcohol content ");
			palelagerMeta.setLore(palelagerLore);
			palelagerMeta.setDisplayName(ChatColor.RED + "Pale Lager");
			palelager.setItemMeta(palelagerMeta);

			ItemStack munich = new ItemStack(Material.POTION, 1);
			ItemMeta munichMeta = munich.getItemMeta();
			ArrayList<String> munichLore = new ArrayList<String>();
			munichLore.add(loreFormat + "A dark lager with fiery blend of malt ");
			munichLore.add(loreFormat + "and coffee taste ");
			munichMeta.setLore(munichLore);
			munichMeta.setDisplayName(ChatColor.RED + "Munich");
			munich.setItemMeta(munichMeta);

			ItemStack dopplebock = new ItemStack(Material.POTION, 1);
			ItemMeta dopplebockMeta = dopplebock.getItemMeta();
			ArrayList<String> dopplebockLore = new ArrayList<String>();
			dopplebockLore.add(loreFormat + "It is full-bodied and malty ");
			dopplebockLore.add(loreFormat + "It is typically dark with increased ");
			dopplebockLore.add(loreFormat + "caramel as well as chocolate malts  ");
			dopplebockMeta.setLore(dopplebockLore);
			dopplebockMeta.setDisplayName(ChatColor.RED + "DoppleBock");
			dopplebock.setItemMeta(dopplebockMeta);

			ItemStack dosequis = new ItemStack(Material.POTION, 1);
			ItemMeta dosequisMeta = dosequis.getItemMeta();
			ArrayList<String> dosequisLore = new ArrayList<String>();
			dosequisLore.add(loreFormat + "I don't always drink beer ");
			dosequisLore.add(loreFormat + "but when I do I drink Dos Equis");
			dosequisLore.add(loreFormat + "Stay thirsty my friends ");
			dosequisMeta.setLore(dosequisLore);
			dosequisMeta.setDisplayName(ChatColor.RED + "Dos Equis");
			dosequis.setItemMeta(dosequisMeta);

			ItemStack[] ales = {
					amber,
					pale,
					bitter,
					ipa,
					irish,
					barley,
					stouts,
					porter,
					wheat,
			};
			ItemStack[] lagers = {
					bock,
					dunkel,
					marzen,
					palelager,
					munich,
					dopplebock,
					dosequis,
			};

			BlockFace[] blockSides = {
					BlockFace.NORTH,
					BlockFace.EAST,
					BlockFace.SOUTH,
					BlockFace.WEST,
			};
			for(@SuppressWarnings("unused") BlockFace face : blockSides) {

				if(player.getItemInHand().getType() == (Material.GLASS_BOTTLE) &&
						!(player.getItemInHand().getType() == (null)) &&
						!(player.getItemInHand().getType() == (Material.POTION)))
					if(e.getClickedBlock().getType().equals(Material.LADDER)) {
						if ((e.getClickedBlock().getRelative(BlockFace.NORTH).getType() == (Material.LOG)) || 
								(e.getClickedBlock().getRelative(BlockFace.EAST).getType() == (Material.LOG)) ||
								(e.getClickedBlock().getRelative(BlockFace.SOUTH).getType() == (Material.LOG)) || 
								(e.getClickedBlock().getRelative(BlockFace.WEST).getType() == (Material.LOG))){

							player.getInventory().addItem(ales[(int) (Math.random()*ales.length)]);
							getLogger().info("Ale");

							if (player.getItemInHand().getType().equals((Material.GLASS_BOTTLE))){
								if(e.getClickedBlock().getType().equals(Material.LADDER)) {
									if (player.getInventory().getItemInHand().getAmount()>1){
										player.getInventory().getItemInHand().setAmount(player.getInventory().getItemInHand().getAmount()-1);
										player.updateInventory();
									}
									if (player.getInventory().getItemInHand().getAmount()==1){
										player.getInventory().setItemInHand(null);
										player.updateInventory();
									}
								}
							}
							player.updateInventory();
						}
					}

				if(player.getItemInHand().getType() == (Material.GLASS_BOTTLE) &&
						!(player.getItemInHand().getType() == (null)) &&
						!(player.getItemInHand().getType() == (Material.POTION)))
					if(e.getClickedBlock().getType().equals(Material.LADDER)) {
						if ((e.getClickedBlock().getRelative(BlockFace.NORTH).getType() == (Material.LOG_2)) || 
								((e.getClickedBlock().getRelative(BlockFace.EAST).getType() == (Material.LOG_2)) ||
										((e.getClickedBlock().getRelative(BlockFace.SOUTH).getType() == (Material.LOG_2)) || 
												((e.getClickedBlock().getRelative(BlockFace.WEST).getType() == (Material.LOG_2)))))) {

							player.getInventory().addItem(lagers[(int) (Math.random()*lagers.length)]);
							getLogger().info("Lager");

							if (player.getItemInHand().getType().equals((Material.GLASS_BOTTLE))){
								if(e.getClickedBlock().getType().equals(Material.LADDER)) {
									if (player.getInventory().getItemInHand().getAmount()>1){
										player.getInventory().getItemInHand().setAmount(player.getInventory().getItemInHand().getAmount()-1);
										player.updateInventory();
									}
									else if (player.getInventory().getItemInHand().getAmount()==1){
										player.getInventory().setItemInHand(null);
										player.updateInventory();
									}
								}
							}
							player.updateInventory();
						}
					}

				/*if(e.getClickedBlock().getRelative(face).getType().equals(birchleaves.getData())) {
						player.getInventory().addItem(wine);
					}
					if(e.getClickedBlock().getRelative(face).getType().equals(jungleleaves.getData())) {
						player.getInventory().addItem(wine);
					}*/

				break;
			}

		}
	}

	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
}
