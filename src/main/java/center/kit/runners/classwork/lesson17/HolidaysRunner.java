package center.kit.runners.classwork.lesson17;

        import center.kit.app.classwork.lesson17.Holidays;

public class HolidaysRunner {
    public static void main(String[] args) {

        for (Holidays h : Holidays.values()) {
            System.out.println(h.getName() + " " + h.getDate());
        }
    }
}
