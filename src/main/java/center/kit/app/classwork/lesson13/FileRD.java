package center.kit.app.classwork.lesson13;

public class FileRD extends Reader{
    @Override
    public void read(String location) {
        System.out.println("Reading from hard disk from " + location);
    }
}
