package logic;

public class Tank extends Hero{
	private int armor;
	public Tank(String name,int power,int hp,int armor){
		super(name,power,hp);
		if(armor <1) {
			this.armor =1 ;
		}
		else {
		this.armor = armor;}
		
	}
	public int takeDamage(int damage) {
		damage = damage - this.armor;
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
	public int takePiercingDamage(int damage) {
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
	public String printStat() {
		String formatt ="[atk:"+Integer.toString(this.power)+" hp:"+Integer.toString(this.hp)+" armor:"+Integer.toString(this.armor)+"]";
		return formatt;
	}
	public int getArmor() {
		return this.armor;
	}
	
}
