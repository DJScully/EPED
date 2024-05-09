package es.uned.lsi.eped.pract2023_2024;

public class Tune implements TuneIF{
    private String titulo;
    private String autor;
    private String album;
    private String genero;
    private int anio;
    private int duracion;

    public Tune(String titulo, String autor, String album, String genero, int anio, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.album = album;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    @Override
    public boolean match(QueryIF q) {
        boolean flag = false;
        try {
            if (titulo.equalsIgnoreCase(q.getTitle()) && autor.equalsIgnoreCase(q.getAuthor()) && album.equalsIgnoreCase(q.getAlbum()) && genero.equalsIgnoreCase(q.getGenre())) {
                if (anio > q.getMin_year() && anio < q.getMax_year()) {
                    if (duracion > q.getMin_duration() && duracion < q.getMax_duration()) {
                        flag = true;
                    }
                }
            }
            return flag;
        } catch (Exception e) {
            return flag;
        }
    }
}
