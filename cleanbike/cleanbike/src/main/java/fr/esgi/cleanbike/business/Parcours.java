package fr.esgi.clean_bike.business;

public class Parcours {
    private int id;
    private String cheminVideo;

    private String libelle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCheminVideo() {
        return cheminVideo;
    }

    public void setCheminVideo(String cheminVideo) {
        this.cheminVideo = cheminVideo;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
