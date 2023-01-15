package Java101.ValuesOfCircle;
import java.util.Scanner;
public class Circle {
    double area,perimeter,radius,sliceArea,angle,pi=3.14;
    Scanner scn = new Scanner(System.in);
    public void getRadius(){
        System.out.print("Dairenin yari capini gir: ");
        radius=scn.nextDouble();
    }
    public void areaCal(){
        //pi*r^2
        area = pi*radius*radius;
        System.out.println("Alani: " + area  );
    }
    public void perimeterCal(){
        //2*pi*r
        perimeter = 2*pi*radius;
        System.out.println("Cevresi: " + perimeter  );
    }
    public void circleSliceArea(){
        System.out.print("Yay acisi gir: ");
        angle = scn.nextDouble();
        sliceArea = (pi*(radius*radius)*angle)/360;
        System.out.print("Acisi:" + angle + " alani: " + sliceArea);
    }
    public void allMethod(){
        getRadius();
        areaCal();
        perimeterCal();
        circleSliceArea();
    }
}
