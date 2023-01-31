package ch.noseryoung.plj;

public class Item implements Comparable<Item>{

    private String name;
    private double price;


    public Item(String name, double price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.price, o.price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
