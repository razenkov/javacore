package center.kit.app.homework.lesson12;

public class FlowerBouquet {
    public static class Flower {
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

    public static class Rose extends Flower {
        public Rose(double price) {
            super("Rose", price);
        }
    }

    public static class Carnation extends Flower {
        public Carnation(double price) {
            super("Carnation", price);
        }
    }

    public static class Tulip extends Flower {
        public Tulip(double price) {
            super("Tulip", price);
        }
    }

    public static class Chamomile extends Flower {
        public Chamomile(double price) {
            super("Chamomile", price);
        }
    }
}

