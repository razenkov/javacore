
package center.kit.app.homework.lesson11;

import java.util.Random;

public class Person{
    private String name;
    private String university;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setUniversity(String university){
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public Person(String name){
        this.name = name;
        this.university = "Massachusetts Institute of Technology";
        this.age = (new Random()).nextInt(99);
    }

    public void showName()
    {
        System.out.println("Person name: " + this.name);
    }

    //Create method showDegree() in class Person which displays text "General degree" in console.
    public void showDegree(){
        System.out.println("General degree");
    }
}