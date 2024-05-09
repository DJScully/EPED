package es.uned.lsi.eped.pract2023_2024;

public class Query implements QueryIF {

    private String titulo;
    private String autor;
    private String album;
    private String genero;
    private int anioMin;
    private int anioMax;
    private int duracionMin;
    private int duracionMax;

    public Query (String titulo, String autor, String album, String genero, int anioMin,int anioMax, int duracionMin, int duracionMax) {
        this.titulo = titulo;
        this.autor = autor;
        this.album = album;
        this.genero = genero;
        this.anioMin = anioMin;
        this.anioMax = anioMax;
        this.duracionMin = duracionMin;
        this.duracionMax = duracionMax;
    }


    @Override
    public String getTitle() {
        return this.titulo;
    }

    @Override
    public String getAuthor() {
        return this.autor;
    }

    @Override
    public String getGenre() {
        return this.genero;
    }

    @Override
    public String getAlbum() {
        return this.album;
    }

    @Override
    public int getMin_year() {
        return this.anioMin;
    }

    @Override
    public int getMax_year() {
        return this.anioMax;
    }

    @Override
    public int getMin_duration() {
        return this.duracionMin;
    }

    @Override
    public int getMax_duration() {
        return this.duracionMax;
    }
    
}
