package Java101.OgrenciNotSistemi;

public class Course {
    String name,prefix,code;
    int note,performance;
    Teacher courseTeacher;

    public Course(String _name, String _code, String _prefix){
    name=_name;
    code=_code;
    note=0;
    performance=0;
    prefix=_prefix;
    }

    public void addTeacher(Teacher t){
        if (prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println(t.branch + " dersine atandi, " + t.name);
        }
        else {
            System.out.println("Hoca dersi veremez. ");
        }
    }
    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(name + " dersinin Akademisyeni : " + courseTeacher.name);
        }else {
            System.out.println(name + " dersine Akademisyen atanmamistir.");
        }
    }
}
