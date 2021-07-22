package com.example.uas.resource;

import java.util.ArrayList;

public class Castle {
	protected String name;
	protected String skin;
	protected ArrayList<Army> armylist = new ArrayList();
	protected ArrayList<Hero> herolist = new ArrayList();
	protected double battlepoint;
	protected double X;
	protected double Y;
	protected double total;

	public double getBattlepoint() {
		return battlepoint;
	}
	
	public Castle(String name, String skin) {
		this.name = name;
		this.skin = skin;
	}
	
	public void addArmy(Army armylist) {
		this.armylist.add(armylist);
	}
	
	public void addHero(Hero herolist) {
		this.herolist.add(herolist);
		Hero buff = new Hero();
		for (Army army : this.armylist) {
			if (army.type.equals(herolist.type)) {
			buff.atkBuff(army);
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void castlePrint() {
		String x = skin.toLowerCase();
		Hero buff = new Hero();
		
		
		switch (x) {
		
			case "horse" :
				for (Army army : armylist) {
					if (army.category == "Cavalry") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
				}
			}
			break;
			
			case "wood" :
				for (Army army : armylist) {
					if (army.category == "Archer") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
					}
				}
				break;
				
			case "steel" :
				for (Army army : armylist) {
					if (army.category == "Infantry") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
					}
				}
				break;
				
			case "stone" :
				for (Army army : armylist) {
					if (army.category == "Catapult") {
						army.skilldmg = army.skilldmg+(army.skilldmg * 0.2);
					}
				}
				break;
		}
		
		System.out.println("Castle Name : " + name);
		System.out.println(" ");
		System.out.println("Castle Skin : " + skin);
		System.out.println(" ");
		System.out.println("Heroes :");
		System.out.println(" ");
		for (Hero hero : herolist) {
			System.out.println("Hero Name : " + hero.name);
			System.out.println("Hero Level : " + hero.level);
			System.out.println(" ");
		}
		System.out.println("Troops :");
		System.out.println(" ");
		battlepoint = 0;
		X = 0;
		Y = 0;
		for (Army army : armylist) {
			System.out.println(army.type);
			System.out.println("Attack : " + army.atk);
			System.out.println("Skill Damage : " + army.skilldmg);
			System.out.println(" ");
			X = X + army.atk;
			Y = Y + army.skilldmg;
			total = X + Y;
		}
		battlepoint = total;
	}
	
}