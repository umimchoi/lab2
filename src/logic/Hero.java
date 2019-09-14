package logic;

public class Hero {
	protected String name;
	protected int power;
	protected int hp;
	public Hero(String name,int power,int hp) {
		this.name = name;
	if(power<0){
		this.power = 0;
	}
	else if (power>=0){
		this.power = power;
	}
	if (hp<1) {
		this.hp=1;
	}
	else if (hp>=1)
	{
		this.hp=hp;
	}
	}
	public int takeDamage(int damage) {
		if(damage<0) {
			damage=0;
		}
		this.hp=this.hp-damage;
		if(this.hp <0)
		{
			this.hp=0;
		}
		return damage;
	}
	public int doDamage(Hero target) {
		return target.takeDamage(this.power);
	}
	public boolean isDefeated() {
		return this.hp==0;
	}
	public String printStat() {
		String format ="[atk:"+Integer.toString(this.power)+" hp:"+Integer.toString(this.hp)+"]";
		return format;
	}
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getHp() {
		return this.hp;
	}

}
