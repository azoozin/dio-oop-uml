import java.util.ArrayList;

public class ReprodutorMusical {

    private ArrayList<Musica> colecaoMusicas = new ArrayList<>();

    ReprodutorMusical() {

    }

    public void tocar(String tituloMusica) {
        System.out.println("Tocar musica: " + selecionarMusica(tituloMusica));
    }

    public void pausar() {
        System.out.println("Reproducao pausada.");
    }

    public String selecionarMusica(String tituloMusica) {
        int index = 0;
        for (int x = 0; x < this.colecaoMusicas.size(); x++) {
            if (colecaoMusicas.get(x).getTitulo().equalsIgnoreCase(tituloMusica)) {
                index += x;
                System.out.println("Musica " + tituloMusica + " selecionada.");
                return colecaoMusicas.get(index).getTitulo();
            }
        }
        return "Musica nao encontrada.";
    }

    public void addMusica(String titulo, String artista) {
        Musica cancao = new Musica(titulo, artista);
        this.colecaoMusicas.add(cancao);
    }

    public void listaMusicas() {
        for (Musica musica : colecaoMusicas) {
            System.out.println(musica);
        }
    }
}
