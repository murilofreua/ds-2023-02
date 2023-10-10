import org.junit.Test;
import static org.junit.Assert.*;
public class EnderecoTest {

    @Test
    public void testaBuilder() {

        Director director = new Director();
        EnderecoBuilder enderecoBuilder = new EnderecoBuilder();
        director.construtorEndereco(enderecoBuilder);
        Endereco endereco = enderecoBuilder.getEndereco();

        assertEquals(endereco.bloco, "C");
    }
}
