import java.util.Scanner;

public class Media{
    public static void main(String[] args){            
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a N1:");
        double n1 = scan.nextDouble();
        System.out.println("Digite a N2:");
        double n2 = scan.nextDouble();
        System.out.println("Digite a N3:");
        double n3 = scan.nextDouble();        
                
        double total = n1 + n2 + n3;
        double media = total / 3;                

        if (media >= 70) {
            System.out.println("Voce esta aprovado!");            
        } else {
            System.out.println("Voce esta de exame!");

            double exame = 100 - media;

            System.out.println("Voce precisa tirar "+exame);
        }                    
    }
}