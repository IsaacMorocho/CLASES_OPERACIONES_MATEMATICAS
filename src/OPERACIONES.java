import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class OPERACIONES {
    private double n1;
    private double n2;

    public OPERACIONES() {
    }
    public OPERACIONES(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private double getN1() {
        return n2;
    }

    public void setN1(double n2) {
        this.n2 = n2;
    }

    private double getN2() {
        return n1;
    }

    public void setN2(double n1) {
        this.n1 = n1;
    }

    //Metodos personalizados
    public void mostrarDatos(){
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }
    public double sumatoria(){
        return n1 + n2;
    }
    public void mostrarSumatoria(){
        double suma = n1+n2;
        System.out.println(suma);
    }
    public double resta(){
        return n1-n2;
    }
    public void mostrarResta(){
        double resta = n1-n2;
        System.out.println("Resultado de la resta: "+resta);
    }
    public void raiz(){
        System.out.println("Resultado de la raiz del primer numero: "+round( sqrt(n1)));
        System.out.println("Resultado de la raiz del segundo numero: "+round(sqrt(n2)));
    }
    public void multiplicar(){
        System.out.println("Resultado de la multiplicacion:"+ round(n1*n2));
    }
    public void dividir(){
        System.out.println("Resultado de la division:"+ round(n1/n2));
    }
}
