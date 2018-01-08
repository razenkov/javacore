package center.kit.app.homework.lesson11;

public class Student extends Person {
    private int group;

    public Student(String name, int group){
        super(name);
        this.group = group;
    }

    public String getName(){
        return this.getName();
    }

    public void showNameAndGroup()
    {
        System.out.println("Student name: " + getName() + " group " + this.group);
    }

    // Override method showDegree() in class Student and Lecturer and display "Student's degree"
    // and "Lecturer's degree" correspondingly.
    @Override
    public void showDegree(){
        System.out.println("Student's degree");
    }
}
