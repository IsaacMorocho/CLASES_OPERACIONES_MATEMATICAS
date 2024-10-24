import static java.lang.Math.*;

public class SenoCosenoTangente {
    private int b;

    public SenoCosenoTangente(double grados) {
        this.b = toRadians(grados);
    }
    public int getNumero1() {
        return toDegrees(b);
    }

    public void setNumero1(double grados) {
        this.b = toRadians(grados);
    }

    public double seno(){
        return sin(b);
    }
    public double coseno(){
        return cos(b);
    }
    public double tangente(){
        return tan(b);
    }

    // Personalizado
    public void mostrarSCT(){
        System.out.println("El seno del numero "+getNumero1() +" es: "+seno());
        System.out.println("El coseno del numero "+getNumero1() +" es: "+coseno());
        System.out.println("La tangente del numero "+getNumero1()+" es: " +tangente());
    }
}
