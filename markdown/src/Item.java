public class Item extends Decorator {
    @Override
    public String exibe() { return "- " + super.exibe(); }

    Item(Markdown markdown) { super(markdown); }
}
