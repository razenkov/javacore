package center.kit.runners.homework.lesson11_1;

        import center.kit.app.classwork.lesson11_1.Lecturer;
        import center.kit.app.homework.lesson11.Person;
        import center.kit.app.homework.lesson11.Student;

public class LecturerRunner {
    public static void main(String[] args) {
        // Create Person object in runner and invoke method that prints Lecturer's info.
        Person person = new Lecturer("Bill");
        ((Lecturer) person).showLecturerInfo();

        //Create Student and Lecturer objects and invoke showDegree() method in runner for both.
        Lecturer lecturer = new Lecturer("Hibbins");
        Student student = new Student("notHibbins", 55);

        lecturer.showDegree();
        student.showDegree();
    }
}
