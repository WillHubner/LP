import java.util.Scanner;

public class Game{
    public static void main(String[] args){     
        Scanner scan = new Scanner(System.in);

        boolean vezPlayer1 = true;
        int rodada = 1;

        System.out.println("Digite o nome do player 1:");           
        String nomePlayer1 = scan.nextLine();
        Personagem player1  = new Personagem();
        player1.nome = nomePlayer1;        
        System.out.println("Bem vindo "+player1.nome);

        System.out.println("Digite o nome do player 2:");
        String nomePlayer2 = scan.nextLine();
        Personagem player2 = new Personagem();
        player2.nome = nomePlayer2;
        System.out.println("Bem vindo "+player2.nome);

        while (player1.vivo && player2.vivo) {
            System.out.println("-------------------Rodada "+rodada+"----------------");
            if (vezPlayer1){
               System.out.println(player1.nome+" digite o comando: 1 para atacar, 2 para treinar, 3 para recuperar");
               int comando = scan.nextInt();
                
               if (comando == 1){
                    player1.atacar(player2);
               } else if (comando == 2){
                    player1.treinar();
               } else if (comando == 3){
                    player1.recuperar();
               } else {
                    System.out.println("Perdeu a vez.");
               }
            } else {
                System.out.println(player2.nome+" digite o comando: 1 para atacar, 2 para treinar, 3 para recuperar");
                int comando = scan.nextInt();
                 
                if (comando == 1){
                     player2.atacar(player1);
                 } else if (comando == 2){
                     player2.treinar();
                 } else if (comando == 3){
                     player2.recuperar();
                 } else {
                     System.out.println("Perdeu a vez.");
                 }                   
            }

            vezPlayer1 = !vezPlayer1; 
            rodada++;           
        }

        scan.close();
    }
}