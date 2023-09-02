import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        numeros.add(num);
    }

    public int calcularSoma(){
        int totalSoma = 0;
        for(Integer i : numeros){
            totalSoma = totalSoma + i; //metodo get pega o elemento na posicão correspondente 
        }
        
        return totalSoma;
    }

    public int encontrarMaiorNumero(){
        int aux = 0;
        if(!numeros.isEmpty()){
            for(Integer i : numeros){
                if(i > aux){
                    aux = i;
                }
            }
        }
        return aux;
    }
    public int encontrarMenorNumero(){
        int aux = 0;
        if(!numeros.isEmpty()){
            for(Integer i : numeros){
                if(i < aux){
                    aux = i;
                }
            }
        }
        return aux;
    }
    public void imprimirElementos(){
        for(Integer i : numeros){
            System.out.println(" - " + i);
        }
    }
    
}
