public class Negrito extends Decorator {
    @Override
    public String exibe() { return "**" + super.exibe() + "**"; }

    Negrito(Markdown markdown) { super(markdown); }
}