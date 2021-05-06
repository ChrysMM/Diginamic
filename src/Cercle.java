public class Cercle implements ObjetGeometrique{
    private double ray;

    public Cercle(double rayon) {
        this.ray = rayon;
    }

    @Override
    public double perimetre() {
        return ray * 2 * Math.PI;

    }

    @Override
    public double surface() {
         return Math.PI * Math.pow(ray, 2);
    }
}
