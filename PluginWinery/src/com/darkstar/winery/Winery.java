package com.darkstar.winery;

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

public class Winery extends JavaPlugin implements Listener{

	@EventHandler
	public void onConsume(PlayerItemConsumeEvent e) {
		final Player player = e.getPlayer();
		if (player.getItemInHand() != null){
			if (player.getItemInHand().getItemMeta().getDisplayName() != null){
				if(player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Chardonnay") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Riesling") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Pinot Gris") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Sauvignon Blanc") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Red Wine") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Merlot") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Cabernet Sauvignon") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Pinot Noir") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Shiraz") ||

						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Sangiovese") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Nebbiolo") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Malbec") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Tempranillo") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Gamay") ||
						player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Zinfandel")) {

					/*Collection<PotionEffect> playereffects = player.getActivePotionEffects();
					if (playereffects != null){
						player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 0));
					}*/
					if (!(player.getItemInHand().getItemMeta().getDisplayName().equals(null))){
						if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "Chardonnay")){
							PotionEffect chardonnayeffect = new PotionEffect(PotionEffectType.WATER_BREATHING, 300, 0);
							chardonnayeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "Riesling")){
							PotionEffect Reislingeffect = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0);
							Reislingeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "Pinot Gris")){
							PotionEffect pinotgriseffect = new PotionEffect(PotionEffectType.HEALTH_BOOST, 300, 0);
							pinotgriseffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "Sauvignon Blanc")){
							PotionEffect Sauvignoneffect = new PotionEffect(PotionEffectType.HEAL, 300, 0);
							Sauvignoneffect.apply(player);

						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Merlot")){
							PotionEffect Merloteffect = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 0);
							Merloteffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Cabernet Sauvignon")){
							PotionEffect Caberneteffect = new PotionEffect(PotionEffectType.JUMP, 300, 0);
							Caberneteffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Pinot Noir")){
							PotionEffect pinotnoireffect = new PotionEffect(PotionEffectType.ABSORPTION, 300, 0);
							pinotnoireffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Shiraz")){
							PotionEffect Shiraeffect = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0);
							Shiraeffect.apply(player);
						}

						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Sangiovese")){
							PotionEffect Sangioveseeffect = new PotionEffect(PotionEffectType.HEAL, 300, 0);
							Sangioveseeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Nebbiolo")){
							PotionEffect Nebbioloeffect = new PotionEffect(PotionEffectType.NIGHT_VISION, 300, 0);
							Nebbioloeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Malbec")){
							PotionEffect Malbeceffect = new PotionEffect(PotionEffectType.INVISIBILITY, 300, 0);
							Malbeceffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Tempranillo")){
							PotionEffect Tempranilloeffect = new PotionEffect(PotionEffectType.SATURATION, 300, 0);
							Tempranilloeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Gamay")){
							PotionEffect Gamayeffect = new PotionEffect(PotionEffectType.REGENERATION, 300, 0);
							Gamayeffect.apply(player);
						}
						else if (player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Zinfandel")){
							PotionEffect Zinfandeleffect = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 0);
							Zinfandeleffect.apply(player);
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

			ItemStack whiteWine = new ItemStack(Material.POTION, 1);
			ItemMeta whiteWineMeta = whiteWine.getItemMeta();
			whiteWineMeta.setDisplayName(ChatColor.GRAY + "White Wine");
			whiteWine.setItemMeta(whiteWineMeta);

			ItemStack redWine = new ItemStack(Material.POTION, 1);
			ItemMeta redWineMeta = whiteWine.getItemMeta();
			redWineMeta.setDisplayName(ChatColor.DARK_PURPLE + "Red Wine");
			redWine.setItemMeta(redWineMeta);


			//Red Wines
			ItemStack wine = new ItemStack(Material.POTION, 1);
			ItemMeta wineMeta = wine.getItemMeta();
			wineMeta.setDisplayName(ChatColor.DARK_PURPLE + "wine");
			ArrayList<String> wineLore = new ArrayList<String>();
			wineLore.add(loreFormat + "A simple red wine");
			wineLore.add("");
			wineMeta.setLore(wineLore);
			wine.setItemMeta(wineMeta);

			ItemStack merlot = new ItemStack(Material.POTION, 1);
			ItemMeta merlotMeta = merlot.getItemMeta();
			ArrayList<String> merlotLore = new ArrayList<String>();
			merlotLore.add(loreFormat + "A soft red wine with nice fruit ");
			merlotLore.add(loreFormat + "flavors of plums, blackberries ");
			merlotLore.add(loreFormat + "and occasionally mint");
			merlotLore.add("");
			merlotLore.add(loreFormat + "Most often grown in California, and Chile");
			merlotMeta.setLore(merlotLore);
			merlotMeta.setDisplayName(ChatColor.DARK_PURPLE + "Merlot");
			merlot.setItemMeta(merlotMeta);

			ItemStack cabernet = new ItemStack(Material.POTION, 1);
			ItemMeta cabernetMeta = cabernet.getItemMeta();
			ArrayList<String> cabernetLore = new ArrayList<String>();
			cabernetLore.add(loreFormat + "A more assertive wine with more ");
			cabernetLore.add(loreFormat + "tannin and greater aging potential ");
			cabernetLore.add("");
			cabernetLore.add(loreFormat + "Most often grown in California, Chile, and Australia");
			cabernetMeta.setLore(cabernetLore);
			cabernetMeta.setDisplayName(ChatColor.DARK_PURPLE + "Cabernet Sauvignon");
			cabernet.setItemMeta(cabernetMeta);

			ItemStack pinot = new ItemStack(Material.POTION, 1);
			ItemMeta pinotMeta = pinot.getItemMeta();
			ArrayList<String> pinotLore = new ArrayList<String>();
			pinotLore.add(loreFormat + "A notoriously difficult grape to grow ");
			pinotLore.add(loreFormat + "With age, flavors become more complex ");
			pinotLore.add("");
			pinotLore.add(loreFormat + "Most often grown in Oregon and New Zealand");
			pinotMeta.setLore(pinotLore);
			pinotMeta.setDisplayName(ChatColor.DARK_PURPLE + "Pinot Noir");
			pinot.setItemMeta(pinotMeta);

			ItemStack shiraz = new ItemStack(Material.POTION, 1);
			ItemMeta shirazMeta = shiraz.getItemMeta();
			ArrayList<String> shirazLore = new ArrayList<String>();
			shirazLore.add(loreFormat + "typically big, bold and spicy with jammy ");
			shirazLore.add(loreFormat + "fruit and aromas of leather and black fruit  ");
			shirazLore.add("");
			shirazLore.add(loreFormat + "Most often grown in California and Washington");
			shirazMeta.setLore(shirazLore);
			shirazMeta.setDisplayName(ChatColor.DARK_PURPLE + "Shiraz");
			shiraz.setItemMeta(shirazMeta);

			//Other reds to consider

			ItemStack sangiovese = new ItemStack(Material.POTION, 1);
			ItemMeta sangioveseMeta = sangiovese.getItemMeta();
			ArrayList<String> sangioveseLore = new ArrayList<String>();
			sangioveseLore.add(loreFormat + "It the wine grape that makes Chianti, ");
			sangioveseLore.add(loreFormat + "a tremendous food wine with flavors ");
			sangioveseLore.add(loreFormat + "and aromas of cherries and rose petals ");
			sangioveseLore.add("");
			sangioveseLore.add(loreFormat + "Most often grown in Italy and Portugul");
			sangioveseMeta.setLore(sangioveseLore);
			sangioveseMeta.setDisplayName(ChatColor.DARK_PURPLE + "Sangiovese");
			sangiovese.setItemMeta(sangioveseMeta);

			ItemStack nebbiolo = new ItemStack(Material.POTION, 1);
			ItemMeta nebbioloMeta = nebbiolo.getItemMeta();
			ArrayList<String> nebbioloLore = new ArrayList<String>();
			nebbioloLore.add(loreFormat + "The noble and pricey red wine of ");
			nebbioloLore.add(loreFormat + "the Piedmont region of Italy ");
			nebbioloLore.add("");
			nebbioloLore.add(loreFormat + "Most often grown in Italy");
			nebbioloMeta.setLore(nebbioloLore);
			nebbioloMeta.setDisplayName(ChatColor.DARK_PURPLE + "Nebbiolo");
			nebbiolo.setItemMeta(nebbioloMeta);			

			ItemStack malbec = new ItemStack(Material.POTION, 1);
			ItemMeta malbecMeta = malbec.getItemMeta();
			ArrayList<String> malbecLore = new ArrayList<String>();
			malbecLore.add(loreFormat + "A star in Argentina, where it produces ");
			malbecLore.add(loreFormat + "inky wines with an attractive smoke and ");
			malbecLore.add(loreFormat + "leather quality ");
			malbecLore.add("");
			malbecLore.add(loreFormat + "Most often grown in Argentina and France");
			malbecMeta.setLore(malbecLore);
			malbecMeta.setDisplayName(ChatColor.DARK_PURPLE + "Malbec");
			malbec.setItemMeta(malbecMeta);			

			ItemStack tempranillo = new ItemStack(Material.POTION, 1);
			ItemMeta tempranilloMeta = tempranillo.getItemMeta();
			ArrayList<String> tempranilloLore = new ArrayList<String>();
			tempranilloLore.add(loreFormat + "A famous grape of Spain, where it is used ");
			tempranilloLore.add(loreFormat + "in wines of the Rioja and ");
			tempranilloLore.add(loreFormat + "Ribera del Duero regions ");
			tempranilloLore.add("");
			tempranilloLore.add(loreFormat + "Most often grown in Spain");
			tempranilloMeta.setLore(tempranilloLore);
			tempranilloMeta.setDisplayName(ChatColor.DARK_PURPLE + "Tempranillo");
			tempranillo.setItemMeta(tempranilloMeta);

			ItemStack gamay = new ItemStack(Material.POTION, 1);
			ItemMeta gamayMeta = gamay.getItemMeta();
			ArrayList<String> gamayLore = new ArrayList<String>();
			gamayLore.add(loreFormat + "The fresh and fruity, raspberry-flavored wine of ");
			gamayLore.add(loreFormat + "the Beaujolais region of Burgundy, France ");
			gamayLore.add("");
			gamayLore.add(loreFormat + "Most often grown in France");
			gamayMeta.setLore(gamayLore);
			gamayMeta.setDisplayName(ChatColor.DARK_PURPLE + "Gamay");
			gamay.setItemMeta(gamayMeta);

			ItemStack zinfandel = new ItemStack(Material.POTION, 1);
			ItemMeta zinfandelMeta = zinfandel.getItemMeta();
			ArrayList<String> zinfandelLore = new ArrayList<String>();
			zinfandelLore.add(loreFormat + "It's home is in California, where it produces large, ");
			zinfandelLore.add(loreFormat + "fruity, often spicy red wine ");
			zinfandelLore.add("");
			zinfandelLore.add(loreFormat + "Most often grown in California");
			zinfandelMeta.setLore(zinfandelLore);
			zinfandelMeta.setDisplayName(ChatColor.DARK_PURPLE + "Zinfandel");
			zinfandel.setItemMeta(zinfandelMeta);


			//White Wines
			ItemStack chardonnay = new ItemStack(Material.POTION, 1);
			ItemMeta chardonnayMeta = chardonnay.getItemMeta();
			ArrayList<String> chardonnayLore = new ArrayList<String>();
			chardonnayLore.add(loreFormat + "A very versatile wine. It's flavor and ");
			chardonnayLore.add(loreFormat + "aromas are easily influenced by where ");
			chardonnayLore.add(loreFormat + "it's grown and how it's made ");
			chardonnayLore.add("");
			chardonnayLore.add(loreFormat + "Most often grown in California and France");
			chardonnayMeta.setLore(chardonnayLore);
			chardonnayMeta.setDisplayName(ChatColor.GRAY + "Chardonnay");
			chardonnay.setItemMeta(chardonnayMeta);

			ItemStack riesling = new ItemStack(Material.POTION, 1);
			ItemMeta rieslingMeta = riesling.getItemMeta();
			ArrayList<String> rieslingLore = new ArrayList<String>();
			rieslingLore.add(loreFormat + "A crisp, clean wine with green apple, ");
			rieslingLore.add(loreFormat + "pear and lime flavors. The best offer ");
			rieslingLore.add(loreFormat + "pleasing mineral qualities as well. "); 
			rieslingLore.add("");
			rieslingLore.add(loreFormat + "Most often grown in Washington, and Australia");
			rieslingMeta.setLore(rieslingLore);
			rieslingMeta.setDisplayName(ChatColor.GRAY + "Riesling");
			riesling.setItemMeta(rieslingMeta);	

			ItemStack pinotgris = new ItemStack(Material.POTION, 1);
			ItemMeta pinotgrisMeta = pinotgris.getItemMeta();
			ArrayList<String> pinotgrisLore = new ArrayList<String>();
			pinotgrisLore.add(loreFormat + "Generally produce different styles of wine ");
			pinotgrisLore.add(loreFormat + "depending on where the grapes are grown and ");
			pinotgrisLore.add(loreFormat + "how they're handled in the cellar ");
			pinotgrisLore.add("");
			pinotgrisLore.add(loreFormat + "Most often grown in France and New Zealand");
			pinotgrisMeta.setLore(pinotgrisLore);
			pinotgrisMeta.setDisplayName(ChatColor.GRAY + "Pinot Gris");
			pinotgris.setItemMeta(pinotgrisMeta);	

			ItemStack sauvignon = new ItemStack(Material.POTION, 1);
			ItemMeta sauvignonMeta = sauvignon.getItemMeta();
			ArrayList<String> sauvignonLore = new ArrayList<String>();
			sauvignonLore.add(loreFormat + "A fresh, crisp, aromatic wine with grapefruit ");
			sauvignonLore.add(loreFormat + "and grassy flavors. This wine is the star of ");
			sauvignonLore.add(loreFormat + "the Loire region of France ");
			sauvignonLore.add("");
			sauvignonLore.add(loreFormat + "Most often grown in France and New Zealand");
			sauvignonMeta.setLore(sauvignonLore);
			sauvignonMeta.setDisplayName(ChatColor.GRAY + "Sauvignon Blanc");
			sauvignon.setItemMeta(sauvignonMeta);

			ItemStack[] redWines = {
					merlot,
					cabernet,
					pinot,
					shiraz,
					sangiovese,
					nebbiolo,
					malbec,
					tempranillo,
					gamay,
					zinfandel,
			};
			ItemStack[] whiteWines = {
					chardonnay,
					riesling,
					pinotgris,
					sauvignon,
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
					if(e.getClickedBlock().getType().equals(Material.VINE)) {
						if ((e.getClickedBlock().getRelative(BlockFace.NORTH).getType() == ((Material.WOOD)) && (e.getClickedBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).getType() == (Material.FENCE))) || 
								((e.getClickedBlock().getRelative(BlockFace.EAST).getType() == ((Material.WOOD)) && (e.getClickedBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).getType() == (Material.FENCE)))) ||
								((e.getClickedBlock().getRelative(BlockFace.SOUTH).getType() == ((Material.WOOD)) && (e.getClickedBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).getType() == (Material.FENCE)))) || 
								((e.getClickedBlock().getRelative(BlockFace.WEST).getType() == ((Material.WOOD)) && (e.getClickedBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).getType() == (Material.FENCE)))) || 

								((e.getClickedBlock().getRelative(BlockFace.NORTH).getType() == ((Material.FENCE)) && (e.getClickedBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.UP).getType() == (Material.WOOD))) || 
										((e.getClickedBlock().getRelative(BlockFace.EAST).getType() == ((Material.FENCE)) && (e.getClickedBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.UP).getType() == (Material.WOOD)))) ||
										((e.getClickedBlock().getRelative(BlockFace.SOUTH).getType() == ((Material.FENCE)) && (e.getClickedBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.UP).getType() == (Material.WOOD)))) || 
										((e.getClickedBlock().getRelative(BlockFace.WEST).getType() == ((Material.FENCE)) && (e.getClickedBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.UP).getType() == (Material.WOOD)))))) {


							player.getInventory().addItem(whiteWines[(int) (Math.random()*whiteWines.length)]);

							if (player.getItemInHand().getType().equals((Material.GLASS_BOTTLE))){
								if(e.getClickedBlock().getType().equals(Material.VINE)) {
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
					if(e.getClickedBlock().getType().equals(Material.VINE)) {
						if ((e.getClickedBlock().getRelative(BlockFace.NORTH).getType() == ((Material.NETHER_BRICK))  && (e.getClickedBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN).getType() == (Material.NETHER_FENCE))) || 
								((e.getClickedBlock().getRelative(BlockFace.EAST).getType() == ((Material.NETHER_BRICK)) && (e.getClickedBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN).getType() == (Material.NETHER_FENCE)))) ||
								((e.getClickedBlock().getRelative(BlockFace.SOUTH).getType() == ((Material.NETHER_BRICK)) && (e.getClickedBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN).getType() == (Material.NETHER_FENCE)))) || 
								((e.getClickedBlock().getRelative(BlockFace.WEST).getType() == ((Material.NETHER_BRICK)) && (e.getClickedBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN).getType() == (Material.NETHER_FENCE)))) || 

								((e.getClickedBlock().getRelative(BlockFace.NORTH).getType() == ((Material.NETHER_FENCE)) && (e.getClickedBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.UP).getType() == (Material.NETHER_BRICK))) || 
										((e.getClickedBlock().getRelative(BlockFace.EAST).getType() == ((Material.NETHER_FENCE)) && (e.getClickedBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.UP).getType() == (Material.NETHER_BRICK)))) ||
										((e.getClickedBlock().getRelative(BlockFace.SOUTH).getType() == ((Material.NETHER_FENCE)) && (e.getClickedBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.UP).getType() == (Material.NETHER_BRICK)))) || 
										((e.getClickedBlock().getRelative(BlockFace.WEST).getType() == ((Material.NETHER_FENCE)) && (e.getClickedBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.UP).getType() == (Material.NETHER_BRICK)))))) {


							player.getInventory().addItem(redWines[(int) (Math.random()*redWines.length)]);

							if (player.getItemInHand().getType().equals((Material.GLASS_BOTTLE))){
								if(e.getClickedBlock().getType().equals(Material.VINE)) {
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
