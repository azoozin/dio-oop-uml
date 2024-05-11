public class Musica {
    private String titulo;
    private String artista;

    Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + ", por: " + this.artista;
    }
}
