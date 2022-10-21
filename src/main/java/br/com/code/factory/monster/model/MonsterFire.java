package br.com.code.factory.monster.model;

public class MonsterFire extends Moster {

	@Override
	public void getMonsterHability() {
		System.out.println("Hability list");
		System.out.println("\t- Fire Ball");
		System.out.println("\t- Fire Punch");
		System.out.println("\t- Guard");
		System.out.println("\t- Dodge");
	}
}
