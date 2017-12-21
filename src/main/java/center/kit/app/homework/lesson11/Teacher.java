package center.kit.app.homework.lesson11;

public class Teacher extends ISchoolUnit{
    private int age;

    public Teacher(int age){
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public void showAge(){
        System.out.println("Teacher age is " + getAge());
    }
}
