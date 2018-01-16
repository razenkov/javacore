package center.kit.app.classwork.lesson18;

public class BoxPrinter<T>  {
    private T value;

    public <T extends Number> BoxPrinter(T value){
        System.out.println("T is " + value.getClass());
    }

    @Override
    public String toString() {
        return "Type is = ";
    }

    public T getValue() {
        return value;
    }
}
