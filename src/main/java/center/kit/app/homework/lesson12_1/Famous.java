package center.kit.app.homework.lesson12_1;

/*Список людей с ФИО, их возрастами и статусами жизни
должен находится в enum.*/

public enum Famous{
    BILL_GATES(1955, true),
    ADOLF_HITLER(1889, false),
    OPRAH_WINFREY(1954, true),
    BOB_MARLEY(1945, false);

    private final int bornYear;
    private final boolean isLive;

    Famous(int bornYear, boolean isLive){
        this.bornYear = bornYear;
        this.isLive = isLive;
    }

    public int getBornYear(){
        return this.bornYear;
    }

    public boolean getIsLive(){
        return this.isLive;
    }
}

//[oukv7iti8586p-[h-n