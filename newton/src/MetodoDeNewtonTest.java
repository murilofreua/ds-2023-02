import org.junit.Test;
import static org.junit.Assert.*;

public class MetodoDeNewtonTest {

    @Test
    public void testeCalculaRaizQuadrada() {

        double inteiro = 16.0;
        double tolerancia = 0.0001;
        double resultadoEsperado = 4.0;

        // Método testado
        double resultado = MetodoDeNewton.calculaRaizQuadrada(inteiro, tolerancia);

        assertEquals(resultadoEsperado, resultado, tolerancia);
    }
}