package center.kit.app.homework.lesson11;

public class Pupil extends ISchoolUnit{
    private int age;

    public Pupil(int age){
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
        System.out.println("Pupil age is " + age);
    }
}
