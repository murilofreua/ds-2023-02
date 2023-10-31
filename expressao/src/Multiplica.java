public class Multiplica extends Decorator {
    Expressao segundoFator;
    @Override
    public float valor() {
        return super.valor() * segundoFator.valor();
    }

    Multiplica(Expressao primeiroFator, Expressao segundoFator) {
        super(primeiroFator);
        this.segundoFator = segundoFator;
    }
}
