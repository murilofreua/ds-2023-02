public class Programa {
    public static void main(String[] args) {
        Italico italico = new Italico(new Texto("teste"));
        System.out.println("Itálico: " + italico.exibe());

        Negrito negrito = new Negrito(new Texto("teste"));
        System.out.println("Negrito: " + negrito.exibe());

        Concatena concatena = new Concatena(new Texto("1234"), new Texto("5678"));
        System.out.println("Concatena: " + concatena.exibe());
    }
}