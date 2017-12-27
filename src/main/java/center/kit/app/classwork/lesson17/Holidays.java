package center.kit.app.classwork.lesson17;

import java.util.Calendar;

public enum Holidays {
    NEW_YEAR("1.01", "new Year");

    private final String name;
    private final String date;
    //private final Calendar date1(1990, 12, 1);

    Holidays(String data, String name){
       this.date = data;
       this.name = name;
       //calendar = Calendar.set(Calendar.YEAR);
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }
}
