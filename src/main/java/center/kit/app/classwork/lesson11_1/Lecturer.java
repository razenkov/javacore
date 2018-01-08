package center.kit.app.classwork.lesson11_1;

        import center.kit.app.homework.lesson11.Person;

public class Lecturer extends Person {
    private String faculty;
    private int experience;
    private String degree;

    public Lecturer(String name) {
        super(name);
        this.faculty = "default_faculty";
        this.degree = "default_degree";
        this.experience = 1;
    }

    // Override method showDegree() in class Student and Lecturer and display "Student's degree"
    // and "Lecturer's degree" correspondingly.
    @Override
    public void showDegree() {
        System.out.println("Lecturer's degree");
    }

    //Create method in class Lecturer that prints Lecturer's info - faculty, experience, degree, university, age.
    public void showLecturerInfo() {
        this.showName();
        System.out.println(
                "Faculty - " + this.faculty
                        + " Experience - " + this.experience
                        + " Degree - " + this.degree
                        + " University - " + this.getUniversity()
                        + " Age - " + this.getAge()
        );
    }
}
