
package Country;

public enum RamzorColor {
    Green  (2/5),
    Yellow(3/5),
    Orange   (4/5),
    Red   (1);


    private final float Color;

    RamzorColor(float Color) {
        this.Color = Color;
    }

    public float getColor() {
        return this.Color;
    }

}