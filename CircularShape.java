package praktic.geometry.bases;

// Kelas abstrak perantara untuk bentuk berbentuk lingkaran
public abstract class CircularShape extends TwoDimensionalShape {
    protected double radius;

    public CircularShape(String name, double radius) {
        super(name);
        this.radius = radius;
    }
}
