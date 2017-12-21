package center.kit.runners.classwork.lesson11;

import center.kit.app.homework.lesson11.ISchoolUnit;
import center.kit.app.homework.lesson11.Pupil;
import center.kit.app.homework.lesson11.Teacher;

public class ISchoolUnitRunner {
    public static void main(String[] args) {
        ISchoolUnit[] array = new ISchoolUnit[100];
        for (int i = 0; i < 100; i+=2){
            array[i] = new Pupil(1);
            array[i+1] = new Teacher(100);
        }

        for(int i = 0; i < 200; ++i) {
            array[i].showAge();
        }
    }
}
