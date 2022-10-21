package br.com.code.factory.monster.model;

public class MonsterBoss extends Moster {

	@Override
	public void getMonsterHability() {
		System.out.println("Hability list");
		System.out.println("\t- Fire Ball");
		System.out.println("\t- Eletric Ball");
		System.out.println("\t- Cold Breath");
		System.out.println("\t- Ultimate Guard");
		System.out.println("\t- Ultimate Slam");
	}
}
