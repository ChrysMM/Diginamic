public class Rectangle implements ObjetGeometrique {
private double longeur, largeur;




    public Rectangle(double longeur, double largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return longeur * largeur * 2;

    }

    @Override
    public double surface() {
        return longeur * largeur;
    }
}
