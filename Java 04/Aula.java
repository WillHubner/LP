import java.util.Random;
import java.util.Scanner;

public class Aula{
    public static void main(String[] args){

        boolean cadastro = true;
        Scanner scan = new Scanner(System.in);
        Random rdm = new Random();

        String[] nomes = new String[4];
        String[] sorteados = new String[4];
        
        int nomesCadastrados = 0;
        int nomesSorteados = 0;

        while (true) { // EXERCÍCIO 01: ENQUANTO nomesSorteados < 3 
            // CADASTRA AS PESSOAS
            if (cadastro){
                System.out.println("Digite seu nome");
                String nome = scan.nextLine();
                nomes[nomesCadastrados] = nome;
                nomesCadastrados++;

                if (nomesCadastrados > 3){
                    cadastro = false;
                }
            } else {
                System.out.println("Digite seu nome");
                String nome = scan.nextLine();
                int nSorteado = 0;
                
                int numeroSorteado = rdm.nextInt(3);

                // EXERCÍCIO 02: ENQUANTO MEU NOME FOR IGUAL AO SORTEADO "E" SE NOME JÁ FOI SORTEADO
                
                if (nome == nomes[numeroSorteado]) { // se nome = nomes[x]
                    // se sim
                } else { // se não
                    boolean jaSorteado = false; // se nomes[x] existe em sorteados[]
                    for(int i=0;i<4;i++){
                        jaSorteado = (nomes[numeroSorteado] == sorteados[i]);
                        if (jaSorteado) {
                            break;
                        }
                    }

                    if (jaSorteado){ // se sim
                        // sortear de novo 
                    } else { // se não
                        System.out.println("Voce tirou o "+nomes[numeroSorteado]);
                        sorteados[nSorteado] = nomes[numeroSorteado]; // adiciona em sorteados
                        nSorteado++;
                    }
                }
                
            }



        }

    }           
}