import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[1000000];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
           
        }
        
        System.out.println("Qual número vc busca?");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();
        
        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while(inicio <= fim){
            meio = (int) ((inicio + fim) / 2);
            contador++; //conta quantos testes a busca fez
            if (vetor[meio] == buscado){
                achou = true;
                break;
            }else if (vetor[meio] < buscado){
                inicio = meio + 1;
            }else{ //só pode ser maior
                fim = meio - 1;
            }
        }
        System.out.println("Quantidade de testes: " + contador);
        if (achou == true){
            System.out.println("Achou");
        }else{
            System.out.println("Não achou");
        }
    }
    }
