package org.example;

public class Carte {
    private int number;
    private CarteType couleur;

    public Carte(CarteType couleur, int number) {
        this.couleur = couleur;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public CarteType getCouleur() {
        return couleur;
    }
}
