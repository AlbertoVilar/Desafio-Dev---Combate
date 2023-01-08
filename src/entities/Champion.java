package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor) {

		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public int getAmor() {
		return armor;
	}

	public void takeDamage(Champion other) {

		int damage = 0;

		damage = (other.attack - armor);

		if (damage < 1) {
			damage = 1;
		}

		life -= damage;

		if (life < 0) {
			life = 0;
		}

	}
	
	public String status() {
		if (life == 0) {
			
			return name + ": " + life + " de vida " + "(morreu)";
		}
		return name + ": " + life + " de vida";
		
	}

	
}
