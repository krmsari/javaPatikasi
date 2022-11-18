package Java101.EventCalendar;
import java.util.Scanner;
public class EventProgram {
    Scanner scn = new Scanner(System.in);
    String[] programs = new String[]{"Kayak","Sinema","Piknik","Yüzme"};
    int heat;
    public void event(){
        System.out.println("Sicaklik gir:");
        heat = scn.nextInt();
        if (heat<5){
            System.out.println("Kayak");
        } else if (heat>25) {
            System.out.println("Yüzme");
        } else if (heat>=5 && heat<=25) {
            if (heat<=15){
                System.out.println("Sinema");
            } else if (heat>=10) {
                System.out.println("Piknik");
            }
        }
    }
}
