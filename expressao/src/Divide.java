public class Divide extends Decorator {
    Expressao segundoFator;
    
    @Override
    public float valor() { return super.valor() / segundoFator.valor(); }

    Divide(Expressao primeiroFator, Expressao segundoFator) {
        super(primeiroFator);
        this.segundoFator = segundoFator;
    }
}


