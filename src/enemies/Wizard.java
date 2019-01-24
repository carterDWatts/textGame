package enemies;

public class Wizard {
	double health;
	double power;
	
	public Wizard(double power,double health) {
		this.power=power;
		this.health=health;
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
	
	
	
	public double attack() {
		return getPower();
	}
	public void heal() {
		health = health + 15;
		if(health>100) {health=100;}
	}
	
}
