package ch.noseryoung.blj;

public class Trainer {
    private String name;
    private float height;
    private String brand;

    public Trainer(String name, float height, String brand) {
        this.name = name;
        this.height = height;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
