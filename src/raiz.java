import static java.lang.Math.*;
import static java.lang.Math.round;
public class raiz {
    private int a;

    public raiz(int a) {
        this.a = a;
    }

    public double raiz(){
        return sqrt(a);
    }
    // Personalizado
    public void mostrarRaiz(){
        System.out.println("Resultado de la raiz del primer numero: "+round( sqrt(a)));

    }
}
