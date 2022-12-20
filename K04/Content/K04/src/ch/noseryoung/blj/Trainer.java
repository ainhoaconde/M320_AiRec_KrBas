package ch.noseryoung.blj;
/**
 * This class creates a trainer.
 * @author Krish & ainhoa
 * @version 1.0.0
 */
public class Trainer {
    // attributes
    private String name;
    private float height;

    /**
     * This constructor creates a trainer.
     * @param name
     * @param height
     */
    public Trainer(String name, float height) {
        this.name = name;
        this.height = height;

    }
    /**
     * This method gets the name of the trainer.
     * @return name
     */

    public String getName() {
        return name;
    }
    /**
     * This method set the name of the trainer.
     * @return height
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * This method gets the height of the trainer.
     * @return height
     */
    public float getHeight() {
        return height;
    }
    /**
     * This method set the height of the trainer.
     * @return height
     */
    public void setHeight(float height) {
        this.height = height;
    }

}
