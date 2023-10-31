public class Subtrai extends Decorator {
    Expressao segundoFator;
    @Override
    public float valor() {
        return super.valor() - segundoFator.valor();
    }

    Subtrai(Expressao primeiroFator, Expressao segundoFator) {
        super(primeiroFator);
        this.segundoFator = segundoFator;
    }
}

