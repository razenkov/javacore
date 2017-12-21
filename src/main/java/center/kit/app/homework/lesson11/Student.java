package center.kit.app.homework.lesson11;

public class Student extends Person {
    private int group;

    public Student(String name, int group){
        super(name);
        this.group = group;
    }

    public String getName(){
        return name;
    }

    public void showNameAndGroupe()
    {
        System.out.println("Student name: " + getName() + " group " + this.group);
    }
}
