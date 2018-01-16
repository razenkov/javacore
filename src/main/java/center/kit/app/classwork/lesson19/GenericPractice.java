package center.kit.app.classwork.lesson19;

public class GenericPractice<NAME, AGE> {
    public NAME name;
    public AGE age;

    public GenericPractice(NAME name, AGE age){
        this.age = age;
        this.name = name;
    }

    public boolean compare(GenericPractice g1){
        if ((g1.name.equals(this.name)) && (g1.age == this.age)){
            return true;
        }else{
            return false;
        }
    }
}
