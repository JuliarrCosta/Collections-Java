public class App {
    public static void main(String[] args) {
       SomaNumeros teste = new SomaNumeros();
      
       teste.adicionarNumero(1);
       teste.adicionarNumero(2);
       teste.adicionarNumero(3);
       teste.adicionarNumero(4);

       System.out.println(teste.calcularSoma());
       System.out.println(teste.encontrarMaiorNumero());
       teste.imprimirElementos();
    }
}
