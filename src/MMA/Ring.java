package MMA;

public class Ring {
    Fighter f1,f2;
    Fighter fFigther,sFighter;
    int minWeight,maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    public void whoStarting(){
        int rate = (int) (Math.random()*10);
        if (rate>=0 && rate<5){
            fFigther=f1;
            sFighter=f2;
        }
        else {
            fFigther=f2;
            sFighter=f1;
        }
        System.out.println("\nIlk saldiriyi " + fFigther.name + " yapti. \n");
    }
    public void run() {
        whoStarting();
        if (checkWeight()) {
            while (fFigther.health > 0 && sFighter.health > 0) {
                System.out.println("======== YENI ROUND ===========");
                sFighter.health = fFigther.hit(sFighter);
                if (isWin()){
                    break;
                }
                fFigther.health = sFighter.hit(fFigther);
                if (isWin()){
                    break;
                }
                printScore();

            }
        } else {
            System.out.println("Sporcularin agirlikli uyusmuyor.");
        }
    }
    public boolean checkWeight(){
        return (fFigther.weight >= minWeight && fFigther.weight <= maxWeight) &&
                (sFighter.weight >= minWeight && sFighter.weight <= maxWeight);
    }
    public boolean isWin() {
        if (fFigther.health == 0) {
            System.out.println("Mac kazanani: " + sFighter.name);
            return true;
        } else if (sFighter.health == 0) {
            System.out.println("Mac kazanani: " + fFigther.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(fFigther.name + " Kalan Can\t: " + fFigther.health);
        System.out.println(sFighter.name + " Kalan Can\t: " + sFighter.health);
    }
}
