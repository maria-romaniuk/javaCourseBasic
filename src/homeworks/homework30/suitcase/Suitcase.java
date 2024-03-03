package homeworks.homework30.suitcase;

public class Suitcase {

    private Material material;
    private Color color;

    private Size size;

    public Suitcase(Material material, Color color, Size size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material=" + material +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
