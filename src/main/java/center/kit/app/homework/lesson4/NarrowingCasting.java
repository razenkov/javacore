package center.kit.app.homework.lesson4;

public class NarrowingCasting {
    double double1 = 3.141510;
    float float1 = 0.0f;

    public void narrowing()
    {
        int temp = (int)double1;
        System.out.println(temp);
    }
}
