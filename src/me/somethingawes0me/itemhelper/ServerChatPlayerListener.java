package me.somethingawes0me.itemhelper;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class ServerChatPlayerListener extends PlayerListener {
	public static itemhelper plugin;

	public ServerChatPlayerListener(itemhelper instance) {
		plugin = instance;
		
	}
	
	public void onPlayerChat(PlayerChatEvent chat) {
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		ChatColor DARK_GREEN = ChatColor.DARK_GREEN;
		ChatColor GRAY = ChatColor.GRAY;
		ChatColor DARK_RED = ChatColor.DARK_RED;
		ChatColor DARK_AQUA = ChatColor.DARK_AQUA;
		if(message_lower.equals("find:1")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "STONE.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:2")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 2 = " + GRAY +  "GRASS.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:3")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 3 = " + GRAY +  "DIRT.");
			chat.setCancelled(true);
		}

		if(message_lower.equals("find:4")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 4 = " + GRAY +  "COBBLESTONE.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:5")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 5 = " + GRAY +  "WOOD (planks).");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:6")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 6 = " + GRAY +  "SAPLING (6=birch 6,1=oak 6,2=redwood.)");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:7")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 7 = " + GRAY +  "BEDROCK.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:8")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 8 = " + GRAY +  "WATER.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:9")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 9 = " + GRAY +  "WATER.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:10")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 10 = " + GRAY +  "LAVA.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:11")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 11 = " + GRAY +  "LAVA.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:12")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 12 = " + GRAY +  "SAND.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:13")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 13 = " + GRAY +  "GRAVEL.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:14")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 14 = " + GRAY +  "GOLD ORE.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:15")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 15 = " + GRAY +  "IRON ORE.");
			chat.setCancelled(true);

		}
		if(message_lower.equals("find:16")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 16 = " + GRAY +  "COAL ORE.");
			chat.setCancelled(true);
		
		}
		if(message_lower.equals("find:17")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 17 = " + GRAY +  "LOG (17=birch log..17,1=oak log..17,2=redwood log.)");
			chat.setCancelled(true);

		}
		if(message_lower.equals("find:18")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 18 = " + GRAY +  "LEAF (18=birch leafe..18,1=oak leaf..18,2=redwood leaf.)");
			chat.setCancelled(true);
		
		}
		if(message_lower.equals("find:19")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 19 = " + GRAY +  "SPONGE.");
			chat.setCancelled(true);
	
		}
		if(message_lower.equals("find:20")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 20 = " + GRAY +  "GLASS.");
			chat.setCancelled(true);
		
		}
		if(message_lower.equals("find:21")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 21 = " + GRAY +  "LAPIS ORE.");
			chat.setCancelled(true);
		
		}
		if(message_lower.equals("find:22")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 22 = " + GRAY +  "LAPIS BLOCK.");
			chat.setCancelled(true);
		
		}
		if(message_lower.equals("find:23")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 23 = " + GRAY +  "DISPENSER.");
			chat.setCancelled(true);

		}
		if(message_lower.equals("find:24")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 24 = " + GRAY +  "SANDSTONE.");
			chat.setCancelled(true);

		}
		if(message_lower.equals("find:25")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 25 = " + GRAY +  "NOTE BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:26")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 26 = " + GRAY +  "BED BLOCK. " + DARK_RED+"I would advise against using this. Use 355 instead!");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:27")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 27 = " + GRAY +  "POWERED RAIL.");
			chat.setCancelled(true);
		}
		if(message_lower.equals("find:28")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 28 = " + GRAY +  "DETECTOR RAIL.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:29")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 29 = " + GRAY +  "STICKY PISTON.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:30")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 30 = " + GRAY +  "WEB.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:31")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 31 = " + GRAY +  "GRASS (30=dead tree..30,1=grass..30,2=fern.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:32")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 32 = " + GRAY +  "DEAD TREE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:33")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 33 = " + GRAY +  "PISTON.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:34")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 34 = " + GRAY +  "EXTENDED PISTON. " + DARK_RED+ "I would advise against using this as it doesn't do anything!");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:35")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 35 = " + GRAY +  "WOOL (35=white 35,1=orange 35,2=magenta 35,3=light blue 35,4=yellow 35,5=green 35,6=pink 35,7=dark grey 35,8=gray 35,9=cyan 35,10=purple 35,11=blue (dark) 35,12=brown 35,13=olive 35,14=red 35,15=black");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:36")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 36 = " + GRAY +  "MOVING PISTON. " + DARK_RED+ "I would advise against using this as it doesn't do anything!");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:37")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 37 = " + GRAY +  "YELLOW FLOWER.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:38")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 38 = " + GRAY +  "ROSE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:39")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 39 = " + GRAY +  "BROWN MUSHROOM.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:40")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 40 = " + GRAY +  "RED MUSHROOM.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:41")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 41 = " + GRAY +  "GOLD BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:42")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 42 = " + GRAY +  "IRON BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:43")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 43 = " + GRAY +  "DOUBLE STEP (43=stone 43,1=sandstone 43,2=wood 43,3=cobblestone 43,4=brick 43,5=stone brick 43,6=stone.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:44")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 44 = " + GRAY +  "STEP (44=stone 44,1=sandstone 44,2=wood 44,3=cobblestone 44,4=brick 44,5=stone brick 44,6=stone.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:45")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 45 = " + GRAY +  "BRICK (block).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:46")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 46 = " + GRAY +  "TNT.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:47")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 47 = " + GRAY +  "BOOKSHELF.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:48")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 48 = " + GRAY +  "MOSSY COBBLESTONE");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:49")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 49 = " + GRAY +  "OBSIDIAN.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:50")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 50 = " + GRAY +  "TORCH.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:51")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 51 = " + GRAY +  "FIRE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:52")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 52 = " + GRAY +  "MOB SPAWNER.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:53")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 53 = " + GRAY +  "WOOD STAIRS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:54")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 54 = " + GRAY +  "CHEST.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:55")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 55 = " + GRAY +  "REDSTONE WIRE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:56")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 56 = " + GRAY +  "DIAMOND ORE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 57 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:58")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 58 = " + GRAY +  "CRAFTING TABLE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:59")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 59 = " + GRAY +  "CROP. " + DARK_RED+ "I would advise against using this!");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:60")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 60 = " + GRAY +  "SOIL (fertile land).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:61")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 61 = " + GRAY +  "FURNACE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:62")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 62 = " + GRAY +  "FURNACE (on).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:63")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 63 = " + GRAY +  "SIGN. " + DARK_RED+ "I would advise against using this! Use 323 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:64")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 64 = " + GRAY +  "WOODEN DOOR. " + DARK_RED+ "I would advise against using this! Use 324 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:65")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 65 = " + GRAY +  "LADDER,");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:66")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 66 = " + GRAY +  "RAILS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:67")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 67 = " + GRAY +  "COBBLESTONE STAIRS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:68")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 68 = " + GRAY +  "SIGN. " + DARK_RED+ "I would advise against using this! Use 323 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:69")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 69 = " + GRAY +  "LEVER.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:70")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 70 = " + GRAY +  "STONE PRESSURE PLATE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:71")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 71 = " + GRAY +  "IRON DOOR. " + DARK_RED+ "I would advise against using this! Use 330 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:72")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 72 = " + GRAY +  "WOODEN PRESSURE PLATE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:73")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 73 = " + GRAY +  "REDSTONE ORE (lit up).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:74")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 74 = " + GRAY +  "REDSTEONE ORE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:75")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 75 = " + GRAY +  "REDSTONE TORCH (off).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:76")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 76 = " + GRAY +  "REDSTONE TORCH.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:77")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 77 = " + GRAY +  "STONE BUTTON.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:78")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 78 = " + GRAY +  "SNOW (not the block!).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:79")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 79 = " + GRAY +  "ICE BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:80")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 80 = " + GRAY +  "SNOW BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:81")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 81 = " + GRAY +  "CACTUS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:82")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 82 = " + GRAY +  "CLAY BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:83")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 83 = " + GRAY +  "REED BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:84")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 84 = " + GRAY +  "JUKEBOX.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:85")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 85 = " + GRAY +  "FENCE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:86")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 86 = " + GRAY +  "PUMPKIN.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:87")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 87 = " + GRAY +  "NETHERRACK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:88")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 88 = " + GRAY +  "SOUL SAND.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:89")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 89 = " + GRAY +  "GLOWSTONE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:90")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 90 = " + GRAY +  "PORTAL BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:91")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 91 = " + GRAY +  "JACK 'o LANTERN.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:92")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 92 = " + GRAY +  "[the]CAKE[is a lie].");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:93")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 93 = " + GRAY +  "REDSTONE DIODE BLOCK." + DARK_RED+ "I would advise against using this! Use 356 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:94")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 94 = " + GRAY +  "REDSTONE DIODE BLOCK." + DARK_RED+ "I would advise against using this! Use 356 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:95")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 95 = " + GRAY +  "LOCKED CHEST." + DARK_RED+ "I would advise against using this! Use 54 instead.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:96")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 96 = " + GRAY +  "TRAP DOOR.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:97")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 97 = " + GRAY +  "MONSTER EGGS. (97=stone 97,1=cobblesonte 97,2=stone brick.)");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:98")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 98 = " + GRAY +  "STONEBRICK (98=stonebrick 98,1=mossy stone brick 98,2=cracked stone brick.)");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:99")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 99 = " + GRAY +  "GIANT MUSHROOM BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:100")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 100 = " + GRAY +  "GIANT MUSHROOM BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:101")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 101 = " + GRAY +  "IRON FENCE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:102")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 102 = " + GRAY +  "GLASS PANE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:103")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 103 = " + GRAY +  "MELON BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:104")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 104 = " + GRAY +  "MELON SPROUT." + DARK_RED+ "I would advise against using this!");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:105")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 105 = " + GRAY +  "MELON SPROUT." + DARK_RED+ "I would advise against using this!");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:106")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 106 = " + GRAY +  "VINE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:107")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 107 = " + GRAY +  "FENCE GATE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:108")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 108 = " + GRAY +  "BRICK STAIRS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:109")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 109 = " + GRAY +  "STONE BRICK STAIRS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:110")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 110 = " + GRAY +  "MYCELIUM.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:111")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 111 = " + GRAY +  "LILLY PAD.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:112")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 112 = " + GRAY +  "NETHERBRICK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:113")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 113 = " + GRAY +  "NETHERBRICK FENCE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:114")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 114 = " + GRAY +  "NETHERBRICK STAIRS.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:115")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 115 = " + GRAY +  "NETHER WART.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:116")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 116 = " + GRAY +  "ENCHANTMENT TABLE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:117")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 117 = " + GRAY +  "BREWING STAND.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:118")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 118 = " + GRAY +  "CAULDRON.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:119")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 119 = " + GRAY +  "ENDER PORTAL (goes to The End).");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:120")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 120 = " + GRAY +  "END PORTAL FRAME.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:121")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 121 = " + GRAY +  "END STONE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:122")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 122 = " + GRAY +  "DRAGON EGG.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:ids")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item ids range from:: 1-122 :: 256-382 :: 2256-2266.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:id")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item ids range from:: 1-122 :: 256-382 :: 2256-2266.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:278")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND PICKAXE.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
		
		if(message_lower.equals("find:57")) {
			p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
			chat.setCancelled(true);
		}
// Divide between exact (find) and search		
				if(message_lower.contains("search:1")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "STONE.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:2")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 2 = " + GRAY +  "GRASS.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:3")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 3 = " + GRAY +  "DIRT.");
					chat.setCancelled(true);
				}

				if(message_lower.contains("search:4")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 4 = " + GRAY +  "COBBLESTONE.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:5")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 5 = " + GRAY +  "WOOD (planks).");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:6")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 6 = " + GRAY +  "SAPLING (6=birch 6,1=oak 6,2=redwood.)");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:7")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 7 = " + GRAY +  "BEDROCK.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:8")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 8 = " + GRAY +  "WATER.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:9")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 9 = " + GRAY +  "WATER.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:10")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 10 = " + GRAY +  "LAVA.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:11")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 11 = " + GRAY +  "LAVA.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:12")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 12 = " + GRAY +  "SAND.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:13")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 13 = " + GRAY +  "GRAVEL.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:14")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 14 = " + GRAY +  "GOLD ORE.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:15")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 15 = " + GRAY +  "IRON ORE.");
					chat.setCancelled(true);

				}
				if(message_lower.contains("search:16")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 16 = " + GRAY +  "COAL ORE.");
					chat.setCancelled(true);
				
				}
				if(message_lower.contains("search:17")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 17 = " + GRAY +  "LOG (17=birch log..17,1=oak log..17,2=redwood log.)");
					chat.setCancelled(true);

				}
				if(message_lower.contains("search:18")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 18 = " + GRAY +  "LEAF (18=birch leafe..18,1=oak leaf..18,2=redwood leaf.)");
					chat.setCancelled(true);
				
				}
				if(message_lower.contains("search:19")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 19 = " + GRAY +  "SPONGE.");
					chat.setCancelled(true);
			
				}
				if(message_lower.contains("search:20")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 20 = " + GRAY +  "GLASS.");
					chat.setCancelled(true);
				
				}
				if(message_lower.contains("search:21")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 21 = " + GRAY +  "LAPIS ORE.");
					chat.setCancelled(true);
				
				}
				if(message_lower.contains("search:22")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 22 = " + GRAY +  "LAPIS BLOCK.");
					chat.setCancelled(true);
				
				}
				if(message_lower.contains("search:23")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 23 = " + GRAY +  "DISPENSER.");
					chat.setCancelled(true);

				}
				if(message_lower.contains("search:24")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 24 = " + GRAY +  "SANDSTONE.");
					chat.setCancelled(true);

				}
				if(message_lower.contains("search:25")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 25 = " + GRAY +  "NOTE BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:26")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 26 = " + GRAY +  "BED BLOCK. " + DARK_RED+"I would advise against using this. Use 355 instead!");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:27")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 27 = " + GRAY +  "POWERED RAIL.");
					chat.setCancelled(true);
				}
				if(message_lower.contains("search:28")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 28 = " + GRAY +  "DETECTOR RAIL.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:29")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 29 = " + GRAY +  "STICKY PISTON.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:30")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 30 = " + GRAY +  "WEB.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:31")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 31 = " + GRAY +  "GRASS (30=dead tree..30,1=grass..30,2=fern.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:32")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 32 = " + GRAY +  "DEAD TREE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:33")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 33 = " + GRAY +  "PISTON.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:34")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 34 = " + GRAY +  "EXTENDED PISTON. " + DARK_RED+ "I would advise against using this as it doesn't do anything!");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:35")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 35 = " + GRAY +  "WOOL (35=white 35,1=orange 35,2=magenta 35,3=light blue 35,4=yellow 35,5=green 35,6=pink 35,7=dark grey 35,8=gray 35,9=cyan 35,10=purple 35,11=blue (dark) 35,12=brown 35,13=olive 35,14=red 35,15=black");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:36")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 36 = " + GRAY +  "MOVING PISTON. " + DARK_RED+ "I would advise against using this as it doesn't do anything!");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:37")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 37 = " + GRAY +  "YELLOW FLOWER.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:38")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 38 = " + GRAY +  "ROSE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:39")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 39 = " + GRAY +  "BROWN MUSHROOM.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:40")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 40 = " + GRAY +  "RED MUSHROOM.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:41")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 41 = " + GRAY +  "GOLD BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:42")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 42 = " + GRAY +  "IRON BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:43")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 43 = " + GRAY +  "DOUBLE STEP (43=stone 43,1=sandstone 43,2=wood 43,3=cobblestone 43,4=brick 43,5=stone brick 43,6=stone.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:44")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 44 = " + GRAY +  "STEP (44=stone 44,1=sandstone 44,2=wood 44,3=cobblestone 44,4=brick 44,5=stone brick 44,6=stone.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:45")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 45 = " + GRAY +  "BRICK (block).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:46")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 46 = " + GRAY +  "TNT.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:47")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 47 = " + GRAY +  "BOOKSHELF.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:48")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 48 = " + GRAY +  "MOSSY COBBLESTONE");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:49")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 49 = " + GRAY +  "OBSIDIAN.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:50")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 50 = " + GRAY +  "TORCH.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:51")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 51 = " + GRAY +  "FIRE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:52")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 52 = " + GRAY +  "MOB SPAWNER.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:53")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 53 = " + GRAY +  "WOOD STAIRS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:54")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 54 = " + GRAY +  "CHEST.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:55")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 55 = " + GRAY +  "REDSTONE WIRE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:56")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 56 = " + GRAY +  "DIAMOND ORE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 57 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:58")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 58 = " + GRAY +  "CRAFTING TABLE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:59")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 59 = " + GRAY +  "CROP. " + DARK_RED+ "I would advise against using this!");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:60")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 60 = " + GRAY +  "SOIL (fertile land).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:61")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 61 = " + GRAY +  "FURNACE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:62")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 62 = " + GRAY +  "FURNACE (on).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:63")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 63 = " + GRAY +  "SIGN. " + DARK_RED+ "I would advise against using this! Use 323 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:64")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 64 = " + GRAY +  "WOODEN DOOR. " + DARK_RED+ "I would advise against using this! Use 324 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:65")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 65 = " + GRAY +  "LADDER,");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:66")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 66 = " + GRAY +  "RAILS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:67")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 67 = " + GRAY +  "COBBLESTONE STAIRS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:68")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 68 = " + GRAY +  "SIGN. " + DARK_RED+ "I would advise against using this! Use 323 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:69")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 69 = " + GRAY +  "LEVER.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:70")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 70 = " + GRAY +  "STONE PRESSURE PLATE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:71")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 71 = " + GRAY +  "IRON DOOR. " + DARK_RED+ "I would advise against using this! Use 330 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:72")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 72 = " + GRAY +  "WOODEN PRESSURE PLATE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:73")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 73 = " + GRAY +  "REDSTONE ORE (lit up).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:74")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 74 = " + GRAY +  "REDSTEONE ORE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:75")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 75 = " + GRAY +  "REDSTONE TORCH (off).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:76")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 76 = " + GRAY +  "REDSTONE TORCH.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:77")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 77 = " + GRAY +  "STONE BUTTON.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:78")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 78 = " + GRAY +  "SNOW (not the block!).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:79")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 79 = " + GRAY +  "ICE BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:80")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 80 = " + GRAY +  "SNOW BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:81")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 81 = " + GRAY +  "CACTUS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:82")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 82 = " + GRAY +  "CLAY BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:83")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 83 = " + GRAY +  "REED BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:84")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 84 = " + GRAY +  "JUKEBOX.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:85")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 85 = " + GRAY +  "FENCE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:86")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 86 = " + GRAY +  "PUMPKIN.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:87")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 87 = " + GRAY +  "NETHERRACK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:88")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 88 = " + GRAY +  "SOUL SAND.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:89")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 89 = " + GRAY +  "GLOWSTONE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:90")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 90 = " + GRAY +  "PORTAL BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:91")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 91 = " + GRAY +  "JACK 'o LANTERN.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:92")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 92 = " + GRAY +  "[the]CAKE[is a lie].");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:93")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 93 = " + GRAY +  "REDSTONE DIODE BLOCK." + DARK_RED+ "I would advise against using this! Use 356 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:94")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 94 = " + GRAY +  "REDSTONE DIODE BLOCK." + DARK_RED+ "I would advise against using this! Use 356 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:95")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 95 = " + GRAY +  "LOCKED CHEST." + DARK_RED+ "I would advise against using this! Use 54 instead.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:96")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 96 = " + GRAY +  "TRAP DOOR.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:97")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 97 = " + GRAY +  "MONSTER EGGS. (97=stone 97,1=cobblesonte 97,2=stone brick.)");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:98")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 98 = " + GRAY +  "STONEBRICK (98=stonebrick 98,1=mossy stone brick 98,2=cracked stone brick.)");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:99")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 99 = " + GRAY +  "GIANT MUSHROOM BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:100")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 100 = " + GRAY +  "GIANT MUSHROOM BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:101")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 101 = " + GRAY +  "IRON FENCE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:102")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 102 = " + GRAY +  "GLASS PANE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:103")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 103 = " + GRAY +  "MELON BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:104")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 104 = " + GRAY +  "MELON SPROUT." + DARK_RED+ "I would advise against using this!");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:105")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 105 = " + GRAY +  "MELON SPROUT." + DARK_RED+ "I would advise against using this!");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:106")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 106 = " + GRAY +  "VINE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:107")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 107 = " + GRAY +  "FENCE GATE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:108")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 108 = " + GRAY +  "BRICK STAIRS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:109")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 109 = " + GRAY +  "STONE BRICK STAIRS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:110")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 110 = " + GRAY +  "MYCELIUM.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:111")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 111 = " + GRAY +  "LILLY PAD.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:112")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 112 = " + GRAY +  "NETHERBRICK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:113")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 113 = " + GRAY +  "NETHERBRICK FENCE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:114")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 114 = " + GRAY +  "NETHERBRICK STAIRS.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:115")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 115 = " + GRAY +  "NETHER WART.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:116")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 116 = " + GRAY +  "ENCHANTMENT TABLE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:117")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 117 = " + GRAY +  "BREWING STAND.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:118")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 118 = " + GRAY +  "CAULDRON.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:119")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 119 = " + GRAY +  "ENDER PORTAL (goes to The End).");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:120")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 120 = " + GRAY +  "END PORTAL FRAME.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:121")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 121 = " + GRAY +  "END STONE.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:122")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 122 = " + GRAY +  "DRAGON EGG.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:ids")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item ids range from:: 1-122 :: 256-382 :: 2256-2266.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:id")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item ids range from:: 1-122 :: 256-382 :: 2256-2266.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				
				if(message_lower.contains("search:57")) {
					p.sendMessage(DARK_AQUA + "[itemHelper] " + DARK_GREEN + "Item id 1 = " + GRAY +  "DIAMOND BLOCK.");
					chat.setCancelled(true);
				}
				




			}
		






	}


