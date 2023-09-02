public class App {
    public static void main(String[] args) throws Exception {
       AgendaTelefonica nokia = new AgendaTelefonica();
       nokia.adicionarContato("Ana", "12155115");
       nokia.adicionarContato("Ana L", "121515");
       nokia.adicionarContato("Ana LLA", "1253205");
       nokia.adicionarContato("Maria", "1253205");

       nokia.exibirContatos();
       System.out.println(nokia.pesquisarContatos("Ana L"));
       nokia.alterarContato("Ana" , "1234");
       nokia.exibirContatos();
       

    }
}
