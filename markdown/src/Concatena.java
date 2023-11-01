public class Concatena extends Decorator {
    Markdown segundoTexto;
    
    @Override
    public String exibe() { return super.exibe() + segundoTexto.exibe(); }

    Concatena(Markdown markdown, Markdown segundoTexto) {
        super(markdown);
        this.segundoTexto = segundoTexto;
    }
}
