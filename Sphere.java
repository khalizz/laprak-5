package praktic.geometry.shapes;

import praktic.geometry.bases.ThreeDimensionalShape;
import praktic.geometry.interfaces.Weightable;

public class Sphere extends ThreeDimensionalShape implements Weightable {
    private double radius;
    private double mass;

    public Sphere(double radius, double mass) {
        super("Sphere");
        this.radius = radius;
        this.mass = mass;
    }

    public double getSurfaceArea() {
        return (4 * 22 * radius * radius) / 7;
    }

    public double getVolume() {
        return (4 * 22 * radius * radius * radius) / (3.0 * 7);
    }

    public double getWeight() {
        return mass * getVolume();
    }

    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
    }
}
