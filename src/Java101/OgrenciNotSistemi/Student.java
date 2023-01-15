package Java101.OgrenciNotSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat,fizik,kimya;
    double avarage;
    boolean isPass;

    public Student(String _name,int _classes,String _stuNo, Course _mat, Course _fizik, Course _kimya){
        name = _name;
        stuNo = _stuNo;
        classes = _classes;
        mat = _mat;
        fizik = _fizik;
        kimya = _kimya;
        calcAvarage();
        isPass = false;
    }

    public void addBulkExamNote(int _mat, int _fizik,int _kimya){
        if (_mat>=0 && _mat<=100){
            mat.note = _mat;
        }
        if (_fizik>=0 && _fizik<=100){
            fizik.note = _fizik;
        }
        if (_kimya>=0 && _kimya<=100){
            kimya.note = _kimya;
        }
    }
    public void addBulkPerformanceNote(int _mat, int _fizik,int _kimya){
        if (_mat>=0 && _mat<=100){
            mat.performance = _mat;
        }
        if (_fizik>=0 && _fizik<=100){
            fizik.performance = _fizik;
        }
        if (_kimya>=0 && _kimya<=100){
            kimya.performance = _kimya;
        }
    }
    public void isPass() {
        if (mat.note == 0 || fizik.note == 0 || kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + avarage);
            if (isPass) {
                System.out.println("Sinifi gecti. ");
            } else {
                System.out.println("Sinifta kaldi.");
            }
        }
    }
    public void calcAvarage()
    {
        double performanceImpact = 0.2;
        double noteImpact = 0.8;

        avarage = (fizik.note*noteImpact + fizik.performance*performanceImpact
                + kimya.note*noteImpact + kimya.performance*performanceImpact
                + mat.note*noteImpact + mat.performance*performanceImpact) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return avarage > 55;
    }

    public void printNote(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ogrenci: " + name);
        System.out.println("Matematik notu: " + mat.note);
        System.out.println("Matematik sozlu: " + mat.performance);
        System.out.println("Fizik notu: " + fizik.note);
        System.out.println("Fizik sozlu: " + fizik.performance);
        System.out.println("Kimya notu: " + kimya.note);
        System.out.println("Kimya sozlu: " + kimya.performance);
    }

}
