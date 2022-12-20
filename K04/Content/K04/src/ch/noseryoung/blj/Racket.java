package ch.noseryoung.blj;

public class Racket {
// attributes
    private float width;
    private float height;
    private String brand;

    /** constructor
     * @param width
     * @param height
     * @param brand
     */
    public Racket(float width, float height, String brand) {
        this.width = width;
        this.height = height;
        this.brand = brand;
    }
    /**
     * This method gets the width of the racket.
     * @return width
     */
    public float getWidth() {
        return width;
    }
    /**
     * This method sets the width of the racket.
     * @param width
     */
    public void setWidth(float width) {
        this.width = width;
    }
    /**
     * This method gets the height of the racket.
     * @return height
     */
    public float getHeight() {
        return height;
    }
    /**
     * This method sets the height of the racket.
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }
    /**
     * This method gets the brand of the racket.
     * @return brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * This method sets the brand of the racket.
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}