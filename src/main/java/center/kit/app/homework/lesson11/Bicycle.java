package center.kit.app.homework.lesson11;

public class Bicycle {
    private String color;
    private int wheelSize;
    private String type;
    private int speed;

    private double price;
    public void setPrice(double price){
        if (price > 0 && price < 100){
            this.price = price;
        }else
        {
            this.price = 10.50;
        }
    }

    public double getPrice(){
        return this.price;
    }

    public Bicycle(){
        this.setPrice(111.111);
        this.type = "KidBicycle";
        this.color = "Red";
    }

    public Bicycle(double price){
        this();
        setPrice(price);
    }

    public Bicycle(int speed, int wheelSize){
        this();
        this.wheelSize = wheelSize;
        this.speed = speed;
    }

    public Bicycle(int speed, int wheelsize, String color){
        this(speed, wheelsize);
        this.color = color;
    }

    public void showBicycle(){
        System.out.println(this.color + " " + this.wheelSize + " " + this.speed + " " + this.type + " price = " + this.getPrice());
    }
}
