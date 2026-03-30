package inici;

import joc.Alien;
import joc.Human;
import joc.Warrior;

public class JocDeRol {

    public void provaFaseV2() {
        Human human = new Human("Salva", 18, 4, 40);
        Warrior warrior = new Warrior("Joange", 20, 3, 35);
        Alien alien = new Alien("Carlos",22, 2, 33);

        warrior.attack(human);
        alien.attack(warrior);
        human.attack(alien);
    }
}
