package center.kit.app.homework.lesson12;

public class Flower {
    private String name;
    private Double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void getFlowerInfo() {
        System.out.println("Name: " + name + " Price: " + price);
    }
}
