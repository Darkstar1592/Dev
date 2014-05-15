package com.darkstar.omnom;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class OmNom  extends JavaPlugin implements Listener {

	public void onEnable(){
		Server server = this.getServer();

		//Pies
		//AppplePie
		ItemStack ApplePie = new ItemStack(Material.PUMPKIN_PIE, 2);
		ItemMeta ApplePieMeta = ApplePie.getItemMeta();
		ApplePieMeta.setDisplayName("Apple Pie");
		ApplePie.setItemMeta(ApplePieMeta);
		ShapedRecipe ApplePieRecipe = new ShapedRecipe(ApplePie);
		ApplePieRecipe.shape("WAW", "WWW");
		ApplePieRecipe.setIngredient('A', Material.APPLE);
		ApplePieRecipe.setIngredient('W', Material.WHEAT);
		server.addRecipe(ApplePieRecipe);

		/*//GoldenApplePie
		ItemStack GoldenApplePie = new ItemStack(Material.PUMPKIN_PIE, 8);
		ItemMeta GoldenApplePieMeta = GoldenApplePie.getItemMeta();
		GoldenApplePieMeta.setDisplayName("Golden Appple Pie");
		GoldenApplePie.setItemMeta(GoldenApplePieMeta);
		ShapedRecipe GoldenApplePieRecipe = new ShapedRecipe(GoldenApplePie);
		GoldenApplePieRecipe.shape("WGW", "WWW");
		GoldenApplePieRecipe.setIngredient('G', Material.GOLDEN_APPLE);
		GoldenApplePieRecipe.setIngredient('W', Material.WHEAT);
		server.addRecipe(GoldenApplePieRecipe);*/

		//BlueberryPie
		ItemStack lapis = new ItemStack(Material.INK_SACK);
		lapis.setDurability((short) 4);
		ItemStack BlueberryPie = new ItemStack(Material.PUMPKIN_PIE, 2);
		ItemMeta BlueberryPieMeta = BlueberryPie.getItemMeta();
		BlueberryPieMeta.setDisplayName(ChatColor.BLUE + "Blueberry Pie");
		BlueberryPie.setItemMeta(BlueberryPieMeta);
		ShapedRecipe BlueberryPieRecipe = new ShapedRecipe(BlueberryPie);
		BlueberryPieRecipe.shape("WLW", "WWW");
		BlueberryPieRecipe.setIngredient('L', (lapis.getData()));
		BlueberryPieRecipe.setIngredient('W', Material.WHEAT);
		server.addRecipe(BlueberryPieRecipe);

		//BlackberryPie
		ItemStack BlackberryPie = new ItemStack(Material.PUMPKIN_PIE, 2);
		ItemMeta BlackberryPieMeta = BlackberryPie.getItemMeta();
		BlackberryPieMeta.setDisplayName("Blackberry Pie");
		BlackberryPie.setItemMeta(BlackberryPieMeta);
		ShapedRecipe BlackberryPieRecipe = new ShapedRecipe(BlackberryPie);
		BlackberryPieRecipe.shape("WIW", "WWW");
		BlackberryPieRecipe.setIngredient('I', Material.INK_SACK);
		BlackberryPieRecipe.setIngredient('W', Material.WHEAT);
		server.addRecipe(BlackberryPieRecipe);

		//ChickenPotPie (carrot, wheat, potato, chicken)
		ItemStack ChickenPotPie = new ItemStack(Material.PUMPKIN_PIE, 2);
		ItemMeta ChickenPotPieMeta = ChickenPotPie.getItemMeta();
		ChickenPotPieMeta.setDisplayName("Chicken Pot Pie");
		ChickenPotPie.setItemMeta(ChickenPotPieMeta);
		ShapedRecipe ChickenPotPieRecipe = new ShapedRecipe(ChickenPotPie);
		ChickenPotPieRecipe.shape("PCP", " R ", "WWW");
		ChickenPotPieRecipe.setIngredient('R', Material.RAW_CHICKEN);
		ChickenPotPieRecipe.setIngredient('P', Material.POTATO_ITEM); 
		ChickenPotPieRecipe.setIngredient('C', Material.CARROT_ITEM);
		ChickenPotPieRecipe.setIngredient('W', Material.WHEAT);
		server.addRecipe(ChickenPotPieRecipe);

		//CarrotCake
		ItemStack CarrotCake = new ItemStack(Material.CAKE, 1);
		ItemMeta CarrotCakeMeta = CarrotCake.getItemMeta();
		CarrotCakeMeta.setDisplayName("Carrot Cake");
		CarrotCake.setItemMeta(CarrotCakeMeta);
		ShapedRecipe CarrotCakeRecipe = new ShapedRecipe(CarrotCake);
		CarrotCakeRecipe.shape("MMM", "CEC", "WWW");
		CarrotCakeRecipe.setIngredient('M', Material.MILK_BUCKET);
		CarrotCakeRecipe.setIngredient('E', Material.EGG); 
		CarrotCakeRecipe.setIngredient('C', Material.CARROT_ITEM);
		CarrotCakeRecipe.setIngredient('W', Material.WHEAT);
		server.addRecipe(CarrotCakeRecipe);


		//Crab Cake
	

		//PotatoStew
		ItemStack PotatoStew = new ItemStack(Material.MUSHROOM_SOUP, 1);
		ItemMeta PotatoStewMeta = PotatoStew.getItemMeta();
		PotatoStewMeta.setDisplayName("Potato Stew");
		PotatoStew.setItemMeta(PotatoStewMeta);
		ShapedRecipe PotatoStewRecipe = new ShapedRecipe(PotatoStew);
		PotatoStewRecipe.shape("  P", "  B");
		PotatoStewRecipe.setIngredient('P', Material.POTATO_ITEM);
		PotatoStewRecipe.setIngredient('B', Material.BOWL); 
		server.addRecipe(PotatoStewRecipe);

		//CarrotStew
		ItemStack CarrotStew = new ItemStack(Material.MUSHROOM_SOUP, 1);
		ItemMeta CarrotStewMeta = CarrotStew.getItemMeta();
		CarrotStewMeta.setDisplayName("Carrot Stew");
		CarrotStew.setItemMeta(CarrotStewMeta);
		ShapedRecipe CarrotStewRecipe = new ShapedRecipe(CarrotStew);
		CarrotStewRecipe.shape("  C", "  B");
		CarrotStewRecipe.setIngredient('C', Material.CARROT_ITEM);
		CarrotStewRecipe.setIngredient('B', Material.BOWL); 
		server.addRecipe(CarrotStewRecipe);

		//ChickenSandwich
		ItemStack ChickenSandwich = new ItemStack(Material.BREAD, 9);
		ItemMeta ChickenSandwichMeta = ChickenSandwich.getItemMeta();
		ChickenSandwichMeta.setDisplayName("Chicken Sandwich");
		ChickenSandwich.setItemMeta(ChickenSandwichMeta);
		ShapedRecipe ChickenSandwichRecipe = new ShapedRecipe(ChickenSandwich);
		ChickenSandwichRecipe.shape("BBB", "CCC", "BBB");
		ChickenSandwichRecipe.setIngredient('C', Material.COOKED_CHICKEN);
		ChickenSandwichRecipe.setIngredient('B', Material.BREAD); 
		server.addRecipe(ChickenSandwichRecipe);

		//Hamburger
		ItemStack Hamburger = new ItemStack(Material.BREAD, 9);
		ItemMeta HamburgerMeta = Hamburger.getItemMeta();
		HamburgerMeta.setDisplayName("Hamburger");
		Hamburger.setItemMeta(HamburgerMeta);
		ShapedRecipe HamburgerRecipe = new ShapedRecipe(Hamburger);
		HamburgerRecipe.shape("BBB", "CCC", "BBB");
		HamburgerRecipe.setIngredient('C', Material.COOKED_BEEF);
		HamburgerRecipe.setIngredient('B', Material.BREAD); 
		server.addRecipe(HamburgerRecipe);

		//PorkSandwich
		ItemStack PorkSandwich = new ItemStack(Material.BREAD, 9);
		ItemMeta PorkSandwichMeta = PorkSandwich.getItemMeta();
		PorkSandwichMeta.setDisplayName("Pork Sandwich");
		PorkSandwich.setItemMeta(PorkSandwichMeta);
		ShapedRecipe PorkSandwichRecipe = new ShapedRecipe(PorkSandwich);
		PorkSandwichRecipe.shape("BBB", "PPP", "BBB");
		PorkSandwichRecipe.setIngredient('P', Material.PORK);
		PorkSandwichRecipe.setIngredient('B', Material.BREAD); 
		server.addRecipe(PorkSandwichRecipe);

		//Coffee
		ItemStack cocoabean = new ItemStack(Material.INK_SACK);
		cocoabean.setDurability((short) 3);
		ItemStack speedpotion = new ItemStack(Material.POTION,1,(short) 8226);
		ItemStack Coffee = new ItemStack(speedpotion);
		ItemMeta CoffeeMeta = Coffee.getItemMeta();
		CoffeeMeta.setDisplayName(ChatColor.GREEN + "Coffee");
		Coffee.setItemMeta(CoffeeMeta);
		ShapedRecipe CoffeeRecipe = new ShapedRecipe(Coffee);
		CoffeeRecipe.shape(" SC", " MB");
		CoffeeRecipe.setIngredient('S', Material.SUGAR);
		CoffeeRecipe.setIngredient('C', (cocoabean.getData()));
		CoffeeRecipe.setIngredient('B', Material.GLASS_BOTTLE);
		CoffeeRecipe.setIngredient('M', Material.MILK_BUCKET);
		server.addRecipe(CoffeeRecipe);

		/*//Cocoa
		ItemStack cocoabean = new ItemStack(Material.INK_SACK);
		cocoabean.setDurability((short) 3);
		ItemStack cocoa = new ItemStack(cocoabean);
		ItemMeta cocoaMeta = cocoabean.getItemMeta();
		cocoaMeta.setDisplayName("Cocoa");
		cocoa.setItemMeta(cocoaMeta);
		ShapedRecipe cocoaRecipe = new ShapedRecipe(cocoa);
		cocoaRecipe.shape("   ", "   ", "  C");
		cocoaRecipe.setIngredient('C', (cocoabean.getData()));
		server.addRecipe(cocoaRecipe);*/

		//Soda (Plain)
		ItemStack sodasodaspeedpotion = new ItemStack(Material.POTION,1,(short) 8194);
		ItemStack Soda = new ItemStack(sodasodaspeedpotion);
		ItemMeta SodaMeta = Soda.getItemMeta();
		SodaMeta.setDisplayName("Soda");
		ArrayList<String> PlainSodaLore = new ArrayList<String>();
		PlainSodaLore.add("");
		PlainSodaLore.add(ChatColor.GOLD + "Plain ol' Soda");
		SodaMeta.setLore(PlainSodaLore);
		Soda.setItemMeta(SodaMeta);
		ShapedRecipe SodaRecipe = new ShapedRecipe(Soda);
		SodaRecipe.shape("  S", "  W");
		SodaRecipe.setIngredient('S', Material.SUGAR);
		SodaRecipe.setIngredient('W', Material.POTION);
		server.addRecipe(SodaRecipe);

		//Soda (Apple)
		ItemStack Appleregenpotion = new ItemStack(Material.POTION,1,(short) 8197);
		ItemStack AppleSoda = new ItemStack(Appleregenpotion);
		ItemMeta AppleSodaMeta = AppleSoda.getItemMeta();
		AppleSodaMeta.setDisplayName("Soda");
		ArrayList<String> AppleSodaLore = new ArrayList<String>();
		AppleSodaLore.add("");
		AppleSodaLore.add(ChatColor.GOLD + "Apple Flavored");
		AppleSodaMeta.setLore(AppleSodaLore);
		AppleSoda.setItemMeta(AppleSodaMeta);
		ShapedRecipe AppleSodaRecipe = new ShapedRecipe(AppleSoda);
		AppleSodaRecipe.shape("  S", " AW");
		AppleSodaRecipe.setIngredient('S', Material.SUGAR);
		AppleSodaRecipe.setIngredient('A', Material.APPLE);
		AppleSodaRecipe.setIngredient('W', Material.POTION);
		server.addRecipe(AppleSodaRecipe);

		/*//Chocolate Milk
        ItemStack cocoa = new ItemStack(Material.MUSHROOM_SOUP, 1);
        ItemMeta metacocoa = cocoa.getItemMeta();
        metacocoa.setDisplayName("Chocolate Milk");
        cocoa.setItemMeta(metacocoa);
        ShapelessRecipe recipe = new ShapelessRecipe(cocoa);
        recipe.addIngredient(Material.BOWL);
        MaterialData cocoaBeans = new MaterialData(Material.INK_SACK);
        ((ItemStack) cocoaBeans).setDurability((short) 3);
        recipe.addIngredient(cocoaBeans);
        getServer().addRecipe(recipe);
        this.getServer();*/

		//Tea
		ItemStack tearegen = new ItemStack(Material.POTION,1,(short) 8225);
		ItemStack Tea = new ItemStack(tearegen);
		ItemMeta TeaMeta = Tea.getItemMeta();
		TeaMeta.setDisplayName("Tea");
		ArrayList<String> TeaLore = new ArrayList<String>();
		TeaLore.add("");
		TeaLore.add(ChatColor.GOLD + "Plain tea");
		TeaMeta.setLore(TeaLore);
		Tea.setItemMeta(TeaMeta);
		ShapedRecipe TeaRecipe = new ShapedRecipe(Tea);
		TeaRecipe.shape("  L", "  W");
		TeaRecipe.setIngredient('L', Material.LEAVES);
		TeaRecipe.setIngredient('W', Material.POTION);
		server.addRecipe(TeaRecipe);

		//Sweet Tea
		ItemStack SweetTearegen = new ItemStack(Material.POTION,1,(short) 8193);
		ItemStack SweetTea = new ItemStack(SweetTearegen);
		ItemMeta SweetTeaMeta = SweetTea.getItemMeta();
		SweetTeaMeta.setDisplayName("Sweet Tea");
		ArrayList<String> SweetTeaLore = new ArrayList<String>();
		SweetTeaLore.add("");
		SweetTeaLore.add(ChatColor.GOLD + "Sweet Tea");
		SweetTeaMeta.setLore(SweetTeaLore);
		SweetTea.setItemMeta(SweetTeaMeta);
		ShapedRecipe SweetTeaRecipe = new ShapedRecipe(SweetTea);
		SweetTeaRecipe.shape("  L", " SW");
		SweetTeaRecipe.setIngredient('L', Material.LEAVES);
		SweetTeaRecipe.setIngredient('W', Material.POTION);
		SweetTeaRecipe.setIngredient('S', Material.SUGAR);
		server.addRecipe(SweetTeaRecipe);

		//Iced Tea
		ItemStack icedtearegen = new ItemStack(Material.POTION,1,(short) 8289);
		ItemStack IcedTea = new ItemStack(icedtearegen);
		ItemMeta IcedTeaMeta = IcedTea.getItemMeta();
		IcedTeaMeta.setDisplayName("Iced Tea");
		ArrayList<String> IcedTeaLore = new ArrayList<String>();
		IcedTeaLore.add("");
		IcedTeaLore.add(ChatColor.GOLD + "Iced Tea");
		IcedTeaMeta.setLore(IcedTeaLore);
		IcedTea.setItemMeta(IcedTeaMeta);
		ShapedRecipe IcedTeaRecipe = new ShapedRecipe(IcedTea);
		IcedTeaRecipe.shape("  L", " IW");
		IcedTeaRecipe.setIngredient('L', Material.LEAVES);
		IcedTeaRecipe.setIngredient('W', Material.POTION);
		IcedTeaRecipe.setIngredient('I', Material.ICE);
		server.addRecipe(IcedTeaRecipe);
		
		//Fish Sticks
		ItemStack FishStick = new ItemStack(Material.GRILLED_PORK, 2);
		ItemMeta FishStickMeta = FishStick.getItemMeta();
		FishStickMeta.setDisplayName("Fish Stick");
		FishStick.setItemMeta(FishStickMeta);
		ShapedRecipe FishStickRecipe = new ShapedRecipe(FishStick);
		FishStickRecipe.shape("  F", "  S");
		FishStickRecipe.setIngredient('F', Material.COOKED_FISH);
		FishStickRecipe.setIngredient('S', Material.STICK);
		server.addRecipe(FishStickRecipe);
		
		//Fish Tacos
		ItemStack FishTaco = new ItemStack(Material.BAKED_POTATO, 3);
		ItemMeta FishTacoMeta = FishTaco.getItemMeta();
		FishTacoMeta.setDisplayName("Fish Tacos");
		FishStick.setItemMeta(FishStickMeta);
		ShapedRecipe FishTacoRecipe = new ShapedRecipe(FishTaco);
		FishTacoRecipe.shape("   ", "BFB", "BBB");
		FishTacoRecipe.setIngredient('F', Material.COOKED_FISH);
		FishTacoRecipe.setIngredient('B', Material.BREAD); 
		server.addRecipe(FishTacoRecipe);
		
		//Fried Fish
		ItemStack FriedFish = new ItemStack(Material.BREAD, 2);
		ItemMeta FriedFishMeta = FriedFish.getItemMeta();
		FriedFishMeta.setDisplayName("Fried Fish");
		FriedFish.setItemMeta(FriedFishMeta);
		ShapedRecipe FriedFishRecipe = new ShapedRecipe(FriedFish);
		FriedFishRecipe.shape("   ", " F ", " L ");
		FriedFishRecipe.setIngredient('F', Material.COOKED_FISH);
		FriedFishRecipe.setIngredient('L', Material.LAVA_BUCKET);
		server.addRecipe(FriedFishRecipe);
		
		//
		
		//Cod
		//Breaded Cod
		//Tilapia
		//Tuna
		//Trout
		
	}


	public void onDisable(){
	}

}
