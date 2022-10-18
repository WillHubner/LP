import java.text.Normalizer.Form;

public class Projeto{
    public static void main(String[] args){
       //System.out.println("Olá Turma de ADS");
       
    //    Aluno aluno01 = new Aluno();
    //    aluno01.nome = "Willian";
    //    aluno01.semestre = 1;
    //    aluno01.idade = 18;

//       aluno01.informacoesAluno();    

        // Garrafa pet = new Garrafa();

        // pet.volume();

        // pet.encher("agua", 500);
        
        // pet.volume();
        
        // pet.tomar(100);
        
        // pet.volume();   
        
        Bhaskara formula = new Bhaskara();
        formula.a = 1;
        formula.b = 3;
        formula.c = 2;

        formula.calcularDelta();
        formula.calcularX1();
        formula.calcularX2();

        System.out.println("O valor de delta e:"+formula.delta);
        System.out.println("O valor de x1 e:"+formula.x1);
        System.out.println("O valor de x2 e:"+formula.x2);
    }
}