package entites;

public class AdressePostale {

        public int numeroRue;
        public int codePostal;
        public String rue;
        public String ville;


    public AdressePostale(int numeroRue, int codePostal, String rue, String ville) {
        this.numeroRue = numeroRue;
        this.codePostal = codePostal;
        this.rue = rue;
        this.ville = ville;
    }
}
