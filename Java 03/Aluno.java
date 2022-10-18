public class Aluno {
    String nome;
    int idade;
    int semestre;
                
    public void informacoesAluno(){
        System.out.println("O nome do aluno e "+ nome);
        System.out.println("A idade dele e "+idade);
        System.out.println("ele esta no "+ semestre +" semestre");
    }

    // int vida = 100;
    // int ataque = 10;

    // public void atacar(Aluno oponente){
    //     oponente.vida = oponente.vida - this.ataque;

    //     System.out.println(this.nome + " atacou "+ oponente.nome + " tirou " + this.ataque + " de vida");
    //     System.out.println(oponente.nome +" - vida: "+ oponente.vida);

    //     if (oponente.vida <= 0) {
    //         System.out.println(oponente.nome+ " morreu!");
    //     }
    // }

    // public void treinar(){        
    //     this.ataque = this.ataque + 10;

    //     System.out.println(this.nome + " treinou, o novo ataque é "+this.ataque);
    // }
}