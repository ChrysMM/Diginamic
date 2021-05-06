package fr.diginamic.banque.entites;

public class Compte {
    @Override
    public String toString() {
        return "Compte{" +
                "numeroDeCompte=" + numeroDeCompte +
                ", soldeDeCompte=" + soldeDeCompte + "}";

    }

    private int numeroDeCompte;
    private int soldeDeCompte;
    private int tauxDeRemuneration;
    public Compte(int numeroDeCompte, int soldeDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDeCompte = soldeDeCompte;
    }

    public int getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public void setNumeroDeCompte(int numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public int getSoldeDeCompte() {
        return soldeDeCompte;
    }

    public void setSoldeDeCompte(int soldeDeCompte) {
        this.soldeDeCompte = soldeDeCompte;
    }
}
