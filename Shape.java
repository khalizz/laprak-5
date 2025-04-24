package praktic.geometry.bases;

// Kelas abstrak dasar untuk semua bentuk
public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void printInfo(); // method override
}
