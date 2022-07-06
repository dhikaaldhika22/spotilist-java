package Playlist;

import java.util.ArrayList;

public class Lagu {
    public String judul;
    public String genre;
    public String album;
    public String tahunRilis;
    public String artis;
    public String record;
    public String kode;
    public static ArrayList<Lagu> song = new ArrayList<>(); 
    public Lagu() {
    }

    public Lagu(String artis, String judul, String genre, String album, String tahunRilis, String record, String kode) {
        this.judul = judul;
        this.genre = genre;
        this.album = album;
        this.tahunRilis = tahunRilis;
        this.artis = artis;
        this.record = record;
        this.kode = kode;
    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
}
