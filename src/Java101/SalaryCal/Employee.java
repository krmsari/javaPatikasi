package Java101.SalaryCal;

public class Employee {
    String name;
    double salary,workHours;
    int hireYear;
    public Employee(String name,double salary,double workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        return (salary<1000)?0:salary*(0.03);
    }
    public double bonus(){
         return (workHours<40)?0:((workHours-40)*30);
    }
    public double raiseSalary(){
        double prizeAmount = 0;
        int dateDifference = 2021-hireYear;
        if (dateDifference<10){
            prizeAmount = salary*0.05;
        } else if (dateDifference>9 && dateDifference<20) {
            prizeAmount = salary*0.10;
        } else if (dateDifference>19) {
            prizeAmount = salary*0.15;
        }
        return prizeAmount;
    }
    @Override
    public String toString() {          // calisan bilgilerini konsola yazdirmak icin toString() methodu olusturduk
        String result= "Calisan Ad Soyad    = " + name +
                "\nSalary              = " + salary +
                "\nWork hours          = " + workHours +
                "\nHire year           = " + hireYear +
                "\nTax                 = " + tax() +
                "\nBonus               = " + bonus() +
                "\nRaise salary        = " + raiseSalary() +
                "\nTotal salary        = " + (salary - tax() + bonus() + raiseSalary());
        return result;
    }
}
