public class Decorator implements Markdown {
    protected Markdown markdown;

    @Override
    public String exibe() { return this.markdown.exibe(); }

    Decorator(Markdown markdown) { this.markdown = markdown; }
}
