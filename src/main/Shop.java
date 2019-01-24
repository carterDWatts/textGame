package main;

import java.util.Scanner;

import player.Player;

public class Shop {
	Scanner sc = new Scanner(System.in);
	
	Player player = Main.player;
	double goldChange;
	boolean shopping;
	
	String leave = "Would you like to stay at the shop or leave?";
	
	
	
	
	
	public void shop() {
		System.out.println("Buy or sell?");
		String shopAction = sc.nextLine();
		if (!shopAction.equals("buy")&& !shopAction.equals("sell") && !shopAction.equals("back")) {
			shop();
		}
		switch(shopAction) {
			case "buy":
				buy();
			case "sell":
				sell();
			case "back":
				
				}
		
		}
	
	
	 public void buy() {
		 System.out.println("What would you like to buy? Our selection includes a bow for 50 gold.");
		 String buyAction = sc.nextLine();
		 
		 if (!buyAction.equals("bow")) {
			 buy();
		 
		 switch(buyAction) {
		 	case "bow":
		 		player.inv.put("bow",1);
		 		Main.player.setPower(player.getPower()+5);
		 		System.out.println("You bought a bow. Your power is now "+ player.getPower());
		 		player.inv.put("bow", 1);
		 		leave();
 				}
		 
		 }
	 	}

	 
		 
	 
	 public void sell() {
		 System.out.println("What would you like to sell? you could sell bones for 5 gold,");
		 String sellAction = sc.nextLine();
		 if (!sellAction.equals("bones") && !sellAction.equals("back")) {
			 sell();}
		 if(sellAction.equals("back")) {
			 shop();
		 }
			 
		 System.out.println("How many would you like to sell?");
		 int sellAmmount = sc.nextInt();
		 switch(sellAction){
			 case "bones":
				 player.inv.put("gold", player.inv.get("gold")+ (5*sellAmmount));
				 System.out.println(player.inv);
				 leave();
				  
		 case "back":
			 shop();
		 }
		 
	 } 
	 
	 
	 
	 
	public void leave() {
	 System.out.println(leave);
		String leaveAction = sc.nextLine();
		if (leaveAction.equals("stay") || leaveAction.equals("shop")){
			shop();
		}
		if (leaveAction != "leave" && leaveAction != "stay") {
			leave();
		}
	}
}