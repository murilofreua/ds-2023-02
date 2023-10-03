public class MetodoDeNewton {
    static double calculaRaizQuadrada(double inteiro, double tolerancia) {
        // Variável auxiliar
        double x = inteiro;

        // Raíz a ser calculada
        double raiz;

        while (true) {
            // Calcula o número mais próximo
            raiz = 0.5 * (x + (inteiro / x));

            // Checa a proximidade calculada
            if (Math.abs(raiz - x) < tolerancia)
                break;

            // Atualiza a raíz
            x = raiz;
        }

        return raiz;
    }
}