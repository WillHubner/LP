public class Bhaskara {

    int a;
    int b;
    int c;
    double delta;
    double x1;
    double x2;

    public void calcularDelta(){        
        this.delta = (this.b * this.b) - (4 * this.a * this.c);
    }

    public void calcularX1(){
        this.x1 = (-1 * this.b + Math.sqrt(this.delta)) / (2 * this.a);
    }

    public void calcularX2(){
        this.x2 = (-1 * this.b - Math.sqrt(this.delta)) / (2 * this.a);
    }
    
}
