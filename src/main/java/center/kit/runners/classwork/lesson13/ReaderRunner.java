package center.kit.runners.classwork.lesson13;

import center.kit.app.classwork.lesson13.FileRD;

public class ReaderRunner {
    public static void main(String[] args) {
        FileRD frd = new FileRD();
        frd.source = "D://KIT";
        frd.read("Local reading");
        frd.printSourceOfReading();
    }
}
