package Java101.MMA;

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
        if (fighter.dodge()){
            System.out.println(fighter.name + " gelen saldiriyi savurdu.");
            return fighter.health;
        }
        if (fighter.health - this.damage < 0){
            System.out.println(fighter.name + " bayildi, rakibi "+ this.name +"'in cani ise " + this.health );

            return 0;
        }
        System.out.println(this.name + " hit " + fighter.name + " with " + this.damage + " his power." );
        return fighter.health - this.damage;

    }

    public boolean dodge(){
        double randomValue = Math.random()*100;
            return randomValue <= this.dodge;
    }
}
