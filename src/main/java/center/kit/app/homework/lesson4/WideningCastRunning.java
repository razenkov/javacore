package center.kit.app.homework.lesson4;

public class WideningCastRunning {
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    float float1 = 0.0f;
    long long1 = 0;
    double double1 = 0.0;

    public void widening(){
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);

    }
}

