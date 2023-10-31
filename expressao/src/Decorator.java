public class Decorator implements Expressao {
    protected Expressao expressao;

    @Override
    public float valor() {
        return this.expressao.valor();
    }

    Decorator(Expressao expressao) { this.expressao = expressao; }
}
