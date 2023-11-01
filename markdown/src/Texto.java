public class Texto implements Markdown {
    private final String texto;

    @Override
    public String exibe() { return texto; }

    Texto(String texto) { this.texto = texto; }
}
