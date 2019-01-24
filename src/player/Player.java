package player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import main.Main;

public class Player {
	
	Scanner sc = new Scanner(System.in);
	String name;
	double health;
	double power;
	
	public Player(String name,double power,double health) {
		this.name = name;
		this.power=power;
		this.health=health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	
	
	//Inventory
	public Map<String, Integer> inv = new HashMap<String, Integer>();
	
	
	
	
	
	
	
	
	

	//Main Actions	
	
		/*
		String action;
		
		System.out.println("A skeleton apppears!");
		System.out.println("Do you fight or run?");
		action = sc.nextLine();
		action = "fight";
		if (action == "fight") {
			System.out.println("You fought");
			
		}
		if (action == "run") {
			
		}
		*/
	
	
	
	
	
	


	//Adventure actions
	public double attack() {
		return getPower();
	}


	public void heal() {
		health = health + 20;
		if(health >100) {health = 100;}
	}
}	
