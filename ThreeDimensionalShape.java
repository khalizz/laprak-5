package praktic.geometry.bases;

// Bentuk 3D turunan dari Shape
public abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape(String name) {
        super(name);
    }

    public abstract double getSurfaceArea(); // Luas permukaan
    public abstract double getVolume();      // Volume
}
