package fr.esgi.cleanbike.business;

public class Parcours {
    private Long id;
    private String cheminVideo;

    private String libelle;

    public Parcours(Long id, String cheminVideo, String libelle) {
        this.id = id;
        this.cheminVideo = cheminVideo;
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
