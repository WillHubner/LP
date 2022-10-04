public class Comparadores {
    public static void main(String[] args){
            
        double nota1 = 65;
        double nota2 = 50;
        double nota3 = 50;        

        boolean maior = (nota1 > nota2);        //true
        boolean menor = (nota1 < nota2);        //false
        boolean igual = (nota2 == nota3);       //true
        boolean diferente = (nota1 != nota2);   //true
        
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(igual);
        System.out.println(diferente);                  
    }    
}
