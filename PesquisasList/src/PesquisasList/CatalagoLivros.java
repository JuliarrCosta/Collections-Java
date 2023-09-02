package PesquisasList;
import java.util.List;
import java.util.ArrayList;

public class CatalagoLivros {
    private List<Livro> catalogoLivros; //criei uma lista de livros para criar o catalogo

    public CatalagoLivros() { // O construtor instacia o catálog como um array
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){ //para adicionar um livro eu adiciono um livro instanciado dentro do catálogo
        catalogoLivros.add(new Livro(titulo, autor, ano));
    }

    public void removerLivro(String titulo){//removendo o livro através do titulo
        List<Livro> deletarLivro = new ArrayList<>(); //crio uma lista auxiliar para armazenar o livro que será deletado 
        for(Livro l : catalogoLivros){ //percorro todo o array de livros
            if(l.getTitulo().equals(titulo)){// se possui o mesmo titulo
                deletarLivro.add(l); //adiciono na lista de delecão
            }
        }
        catalogoLivros.removeAll(deletarLivro); // e deleto todos os dados do catálogo que são iguais a lista de delecão
    }
    public void mostrarAcervo(){
        System.out.println(catalogoLivros);
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> livroPorAutor = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){ //verificando se há livros no catalogo
            for(Livro l : catalogoLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add (l);
                }
            }
        }
        return livroPorAutor;
    }
    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal){ //pesquisando intervalo
        List <Livro> livroPorAno = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){
            for(Livro l : catalogoLivros){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livroPorAno.add(l);
                }
            }
        }

        return livroPorAno;
    }

    public Livro pesquisarPorTitulo(){ //pesquisando apenas por um titulo
        Livro pesquisaLivro = null;
        if(!catalogoLivros.isEmpty()){
            for(Livro l : catalogoLivros){
                pesquisaLivro = l;
                break;
            }
        }
        return pesquisaLivro;
    }
}
