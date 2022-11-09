import java.util.Random;
import java.util.Scanner;

public class Aula{

    static int numeroParticipantes = 3;

    static boolean jaSorteado(String[] nomes, String nome){
        boolean sorteado = false;        

        for(int i=0;i<numeroParticipantes;i++){            
            sorteado = (nome == nomes[i]);                
            if (sorteado) {
                break;
            }
        }
        return sorteado;
    }

    public static void main(String[] args){

        boolean cadastro = true;
        Scanner scan = new Scanner(System.in);
        Random rdm = new Random();

        String[] nomes = new String[4];
        String[] sorteados = new String[4];
        
        int nomesCadastrados = 0;
        int nomesSorteados = 0;
        int nSorteado = 0;

        while (nomesSorteados < numeroParticipantes) {        
            if (cadastro){
                System.out.println("CADASTRO: Digite seu nome");
                String nomeCadastro = scan.nextLine();
                nomes[nomesCadastrados] = nomeCadastro;
                nomesCadastrados++;

                if (nomesCadastrados >= numeroParticipantes){
                    cadastro = false;
                    System.out.println("Inicio do Sorteio!");
                }
            } else {
                System.out.println("SORTEIO: Digite seu nome");
                String nome = scan.nextLine();
                int numeroSorteado = rdm.nextInt(numeroParticipantes);
                
                while (
                    (jaSorteado(sorteados, nomes[numeroSorteado])) || (nome.equals(nomes[numeroSorteado]))) {                                    
                    numeroSorteado = rdm.nextInt(numeroParticipantes);
                }
                
                System.out.println("Voce tirou o "+nomes[numeroSorteado]);

                sorteados[nSorteado] = nomes[numeroSorteado]; 
                nSorteado++;
                nomesSorteados++;                                            
            }
        }

        scan.close();

    }           
}