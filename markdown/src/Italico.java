public class Italico extends Decorator {
    @Override
    public String exibe() { return "_" + super.exibe() + "_"; }

    Italico(Markdown markdown) { super(markdown); }
}
