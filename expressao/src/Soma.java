public class Soma extends Decorator {
    Expressao segundoFator;

    @Override
    public float valor() { return super.valor() + segundoFator.valor(); }

    Soma(Expressao primeiroFator, Expressao segundoFator) {
        super(primeiroFator);
        this.segundoFator = segundoFator;
    }
}
