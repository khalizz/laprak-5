package praktic.geometry.bases;

// Bentuk 2D turunan dari Shape
public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(String name) {
        super(name);
    }

    public abstract double getArea();      // Luas
    public abstract double getPerimeter(); // Keliling
}
