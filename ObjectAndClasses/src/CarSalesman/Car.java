package CarSalesman;

public class Car {
    String model;
    String engine;
    String weight;
    String color;

    public Car(String model, String engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%s: %s: %s: %s:", this.model, this.engine, this.weight, this.color);
    }
}
