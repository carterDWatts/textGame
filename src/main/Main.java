package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import enemies.Bat;
import enemies.Enemy;
import enemies.Skeleton;
import enemies.Wizard;
import player.Player;

public class Main {

	static Player player = new Player("Carter",10,10);
	Skeleton skeleton = new Skeleton(5,10);
	Bat bat = new Bat(5,5);
	Wizard wizard = new Wizard(8,10);
	
	
	public static void main(String[] args) {
		
		//Inv
		
		
		
		
		
		
		
		
		
		
		player.inv.put("gold",20);
		
		
		
		
		
		String action;
		Scanner sc = new Scanner(System.in);
		
		Shop shop = new Shop();
	boolean alive = true;	
		
	while(alive) {	
		
		
		System.out.println("Power"+ player.getPower());
		System.out.println("Health" + player.getHealth());
		
		System.out.println(player.inv);
		
		
		System.out.println("Shop or adventure?");
		action = sc.nextLine();
		switch(action) {
			case "shop":
				shop.shop();
			case "adventure":
				//adventure.adventure();
		}
		}			
	}

}
