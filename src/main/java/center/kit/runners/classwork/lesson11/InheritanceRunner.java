package center.kit.runners.classwork.lesson11;

import center.kit.app.homework.lesson11.Student;

public class InheritanceRunner {
    public static void main(String[] args) {
        Student st = new Student("Bob", 5);
        st.showNameAndGroupe();
        st.showName();

        //Person person = new Person("Anonymous");
        //person.showName();
    }
}
