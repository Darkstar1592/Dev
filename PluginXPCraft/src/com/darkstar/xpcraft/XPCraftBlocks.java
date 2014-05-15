package com.darkstar.xpcraft;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class XPCraftBlocks
implements Listener
{
	public XPCraft plugin;

	public XPCraftBlocks(XPCraft plugin)
	{
		this.plugin = plugin;
	}

	@EventHandler
	public void BreakBlock(BlockBreakEvent e)
	{
		if ((e.getBlock().getType().equals(Material.ANVIL)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Anvil");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.BEACON)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Beacon");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.BEDROCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Bedrock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.BOOKSHELF)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Bookshelf");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.BRICK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Brick");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.BRICK_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.BrickStairs");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.CACTUS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Cactus");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.CHEST)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Chest");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.CLAY)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.ClayBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.COAL_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.CoalBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.COAL_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.CoalOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.COBBLESTONE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Cobblestone");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.COBBLESTONE_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.CobblestoneStairs");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.COBBLE_WALL)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.CobblestoneWall");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.WEB)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Cobweb");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.COMMAND)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.CommandBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.DIAMOND_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.DiamondBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.DIAMOND_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.DiamondOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.DIRT)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Dirt");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.DISPENSER)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Dispenser");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.DROPPER)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Dopper");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.EMERALD_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.EmeraldBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.EMERALD_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.EmeraldOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.ENCHANTMENT_TABLE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.EnchantmentTable");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.ENDER_CHEST)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Enderchest");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.ENDER_STONE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.EndStone");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.FENCE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Fence");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.FURNACE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Furnace");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.GLASS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Glass");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.GLOWSTONE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.GlowStone");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.GOLD_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.GoldBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.GOLD_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.GoldOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.GRASS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Grass");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.GRAVEL)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Gravel");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.HARD_CLAY)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.HardenedClay");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.HAY_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.HayBale");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.ICE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Ice");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.IRON_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.IronBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.IRON_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.IronOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.JACK_O_LANTERN)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.JackOLantern");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.JUKEBOX)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Jukebox");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.LAPIS_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.LapisBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.LAPIS_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.LapisOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.LEAVES)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Leaves");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.MELON_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Melon");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.MOB_SPAWNER)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.MobSpawner");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.MOSSY_COBBLESTONE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.MossStone");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.MYCEL)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Mycelium");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.NETHER_BRICK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.NetherBrick");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.NETHER_FENCE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.NetherBrickFence");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.NETHER_BRICK_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.NetherBrickStairs");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.NETHERRACK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Netherrack");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.NOTE_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.NoteBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.OBSIDIAN)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Obsidian");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.PISTON_BASE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Gravel");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.PUMPKIN)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Pumpkin");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.QUARTZ_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.QuartzBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.REDSTONE_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.RedstoneBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.REDSTONE_LAMP_ON)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.RedstoneLamp");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.REDSTONE_LAMP_OFF)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.RedstoneLamp");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.REDSTONE_ORE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.RedstoneOre");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SAND)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Sand");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SANDSTONE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Sandstone");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SANDSTONE_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.SandstoneStairs");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SNOW_BLOCK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.SnowBlock");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SOUL_SAND)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.SoulSand");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SPONGE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Sponge");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.STAINED_CLAY)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StainedClay");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.PISTON_STICKY_BASE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.PistonSticky");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.STONE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Stone");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SMOOTH_BRICK)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StoneBricks");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SMOOTH_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StoneBrickStairs");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.TNT)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.TNT");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.LOG)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Wood");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.WOOD)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenPlank");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.WOOD_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenStairsOak");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.BIRCH_WOOD_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenStairsBirch");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.SPRUCE_WOOD_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenStairsSpruce");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.JUNGLE_WOOD_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenStairsJungle");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.WOOD_STEP)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodSlab");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.WOOL)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Wool");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.WORKBENCH)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.Workbench");

			e.setExpToDrop(0 + x);
		}

		//1.7.2

		else if ((e.getBlock().getType().equals(Material.ACACIA_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenStairsAcacia");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.DARK_OAK_STAIRS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.WoodenStairsDarkOak");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.STAINED_GLASS)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StainedGlass");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.STAINED_GLASS_PANE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StainedGlassPane");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.STAINED_GLASS_PANE)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StainedGlassPane");

			e.setExpToDrop(0 + x);
		}		else if ((e.getBlock().getType().equals(Material.LOG_2)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.AcaciaLogs/DarkOakLogs");

			e.setExpToDrop(0 + x);
		}
		else if ((e.getBlock().getType().equals(Material.STAINED_CLAY)) && (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)))
		{
			int x = this.plugin.getConfig().getInt("Config.Exp.Blocks.StainedClay");

			e.setExpToDrop(0 + x);
		}
	}
}