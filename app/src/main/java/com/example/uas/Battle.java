package com.example.uas;
import com.example.uas.resource.*;

import java.util.ArrayList;

public class Battle {
    ArrayList<Player> playerlist = new ArrayList<>();
    public Battle(){
        Castle castle1 = new Castle("Wall Maria", "Horse");
        Player player1 = new Player("Eren Yeager", castle1);
        castle1.addArmy(new Cavalry());
        castle1.addArmy(new Cavalry());
        castle1.addArmy(new Cavalry());
        castle1.addArmy(new Cavalry());
        castle1.addHero(new HeroArcher());
        castle1.addHero(new HeroInfantry());
        castle1.addHero(new HeroCavalry());
        castle1.addHero(new HeroCatapult());
        castle1.addHero(new HeroArcher());
        castle1.addHero(new HeroCatapult());

        Castle castle2 = new Castle("Wall Rose", "Wood");
        Player player2 = new Player("Mikasa Ackerman", castle2);
        castle2.addArmy(new Archer());
        castle2.addArmy(new Archer());
        castle2.addArmy(new Archer());
        castle2.addArmy(new Archer());
        castle2.addHero(new HeroArcher());
        castle2.addHero(new HeroInfantry());
        castle2.addHero(new HeroCavalry());
        castle2.addHero(new HeroCatapult());
        castle2.addHero(new HeroArcher());
        castle2.addHero(new HeroArcher());

        Castle castle3 = new Castle("Wall Sheena", "Stone");
        Player player3 = new Player("Armin Arlert", castle3);
        castle3.addArmy(new Archer());
        castle3.addArmy(new Infantry());
        castle3.addArmy(new Catapult());
        castle3.addArmy(new Cavalry());
        castle3.addHero(new HeroArcher());
        castle3.addHero(new HeroInfantry());
        castle3.addHero(new HeroCavalry());
        castle3.addHero(new HeroCatapult());
        castle3.addHero(new HeroInfantry());
        castle3.addHero(new HeroInfantry());

        Castle castle4 = new Castle("Fort Salsa", "Steel");
        Player player4 = new Player("Jean Kirstein", castle4);
        castle4.addArmy(new Infantry());
        castle4.addArmy(new Infantry());
        castle4.addArmy(new Infantry());
        castle4.addArmy(new Infantry());
        castle4.addHero(new HeroArcher());
        castle4.addHero(new HeroInfantry());
        castle4.addHero(new HeroCavalry());
        castle4.addHero(new HeroCatapult());
        castle4.addHero(new HeroArcher());
        castle4.addHero(new HeroCatapult());

        playerlist.add(player1);
        playerlist.add(player2);
        playerlist.add(player3);
        playerlist.add(player4);
    }
    public int war(){
        playerlist.get(0).getCastle().castlePrint();
        if (playerlist.get(0).getCastle().getBattlepoint() > playerlist.get(1).getCastle().getBattlepoint()){
            return 1;
        }
        else if (playerlist.get(0).getCastle().getBattlepoint() < playerlist.get(1).getCastle().getBattlepoint()){
            return 2;
        }
        else
            return 0;
    }
    public int war1(){
        playerlist.get(2).getCastle().castlePrint();
        if (playerlist.get(2).getCastle().getBattlepoint() > playerlist.get(3).getCastle().getBattlepoint()){
            return 1;
        }
        else if (playerlist.get(2).getCastle().getBattlepoint() < playerlist.get(3).getCastle().getBattlepoint()){
            return 2;
        }
        else
            return 0;
    }
}
