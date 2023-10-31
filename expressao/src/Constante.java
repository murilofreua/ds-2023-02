public class Constante implements Expressao {
    private float valor;

    @Override
    public float valor() {
        return valor;
    }

    Constante(float valor) { this.valor = valor; }
}
