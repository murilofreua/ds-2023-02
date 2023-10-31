public class Programa {
    public static void main(String[] args) {
        Soma teste = new Soma(new Constante(5),new Multiplica(new Constante(2), new Constante(3)));
        System.out.println(teste.valor());
    }
}