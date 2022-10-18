public class Personagem {
    boolean vivo = true;
    int vida = 100;
    int poderAtaque = 5;    
    int defesa = 2;
    int nivel = 1;
    int experiencia = 0;
    String nome;

    public void atacar(Personagem alvo){
        System.out.println(this.nome+" atacou "+alvo.nome);

        int dano = this.poderAtaque - alvo.defesa;
        if (dano > 0) {
            alvo.sofrerDano(dano);                     
            System.out.println(alvo.nome+" ficou com "+alvo.vida);
            this.subirXP(10);                        
        } else {
            System.out.println("O oponente é forte demais, nenhum dano foi causado!");
        }
    }

    public void sofrerDano(int dano){
        this.vida -= dano;   
        if (this.vida <= 0){
            this.vivo = false;
            System.out.println(this.nome+" morreu!");
            System.out.println("Parabéns você venceu!");
        }        
    }

    public void verXP(){
        if (this.experiencia >= 100) {
            this.subirNivel();
        }
    }

    public void subirNivel(){
        this.nivel++;
        this.defesa += 2;
        this.poderAtaque += 5;            
        this.experiencia = this.experiencia - 100;
        System.out.println(this.nome+" subiu um nivel, seu nivel atual é "+this.nivel);
        this.recuperar();
    }

    public void treinar(){
        this.subirXP(50);
        System.out.println(this.nome+" treinou.");        
    }

    public void subirXP(int XP){
        this.experiencia =+ XP;
        this.verXP();
    }
   
    public void recuperar(){        
        this.vida += 20;

        if (this.vida > 100){
            this.vida = 100;
        }

        System.out.println(this.nome+" se recuperou, sua vida agora é: "+this.vida);        
    }
}
