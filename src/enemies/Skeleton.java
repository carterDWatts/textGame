package enemies;

public class Skeleton {

	
	double health;
	double power;
	
	public Skeleton(double power,double health) {
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
	
	
	
	
	
}
