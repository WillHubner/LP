import java.util.Scanner;

public class Switch {    
    public static void main(String[] args){    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu sexo: 1 para masculino, 2 para feminino.");                
        
        int inputSexo = scan.nextInt();
        String sexo;

        switch (inputSexo) { 
            case 1 : {
                sexo = "Masculino";
                break;
            }
            case 2 : {
                sexo = "Feminino";
                break;
            }
            default : sexo = "Outros";
        }
        
        System.out.println("O sexo escolhido e: "+sexo);    
    }
}
