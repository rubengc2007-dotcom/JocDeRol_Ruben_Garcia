package joc;

public class Player {
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;

    public Player() {
        System.out.println("CONSTRUCTOR --> He creat un PLAYER");
    }

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String toString() {
        return  name + " " +
                "PA: " + attackPoints +
                "  /  PD:" + defensePoints +
                "  /  PV:" + life;
    }

    public void attack(Player p) {
        //ATACANT
        System.out.print("Atacant: ");
        System.out.println(this);
        //ATACAT
        System.out.print("Atacat: ");
        System.out.println(p);
        p.hit(this.attackPoints);
        if (p.life>0) {
            this.hit(p.attackPoints);
        }
        //DESPRÉS DE ATACAR
        System.out.print("Atacant: ");
        System.out.println(this);
        System.out.print("Atacat: ");
        System.out.println(p);
    }

    protected void hit(int attackPoints) {
        if (this.life>0){
            int colp = attackPoints - this.defensePoints;
            //ATACAT
            System.out.println(this.name + " és colpejat amb " + attackPoints + " i és defén amb " + this.defensePoints + ". Vides: " + this.life + " - " + colp + " = " + (this.life-colp));
            this.life -= colp;
        }
        else {
            System.out.println("Aquest Player té 0 PV, no pots atacar");
        }
    }

}
