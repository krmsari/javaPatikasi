package MMA;

public class Fighter {
    String name;
    int health,damage,weight;;
    double dodge;
    public Fighter(String name,int damage,int health,int weight,double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }
    public int hit(Fighter fighter){
        System.out.println(this.name + "==>" + " " + fighter.damage + " hasar verdi.");

        if (fighter.dodge()){
            System.out.println(fighter.name + "gelen saldiriyi savurdu.");
            return fighter.health;
        }
        if (fighter.health - this.health < 0){
            return 0;
        }
        return fighter.health - this.health;
    }

    public boolean dodge(){
        double randomValue = Math.random()*100;
            return randomValue <= this.dodge;
    }
}
