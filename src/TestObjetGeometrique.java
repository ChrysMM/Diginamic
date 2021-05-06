public class TestObjetGeometrique {

    public static void main (String[] args) {
        ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
        objetGeometriques[0] = new Cercle(5);
        objetGeometriques[1]= new Rectangle(10,2);

        for (ObjetGeometrique o: objetGeometriques){
        System.out.println(o);
        System.out.println("peri" + o.perimetre());
        System.out.println("surf" + o.surface());
    }}
}
