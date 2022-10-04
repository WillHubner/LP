import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args){    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu sexo: 1 para masculino, 2 para feminino.");                        
        
        String sexo = (scan.nextInt() == 1 ? "Masculino" : "Feminino"); 
        
        System.out.println("O sexo escolhido e: "+sexo);    
    }    

}