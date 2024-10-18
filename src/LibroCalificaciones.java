
public class LibroCalificaciones {
    private String nombreDelCurso;
    private String periodo;
    private int año;
    private double promedio;
    //Constructor
    public LibroCalificaciones(String nombreDelCurso, String periodo, int año, double promedio) {
        this.nombreDelCurso = nombreDelCurso;
        this.periodo = periodo;
        this.año = año;
        this.promedio = promedio;
    }

    //Setter
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre;
    }
    public void establecerPeriodo(String periodo) {
        periodo = periodo;
    }

    public void establecerAño(int año) {
        año= año;
    }
    public void establecerPromedio(double promedio) {
        promedio = promedio;
    }

    //Getter
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }
    public String obtenerPeriodo() {
        return periodo;
    }
    public int obtenerAño(){
        return año;
    }
    public double obtenerPromedio(){
        return promedio;
    }
    //Personalizado
    public void mostrarMensaje(){
        System.out.printf("Bienvenid@");
        System.out.printf("Nombre del curso: ",nombreDelCurso);
        System.out.printf("Periodo del curso: ",periodo);
        System.out.printf("Año del curso: ",año);
        System.out.printf("Promedio del curso: ",promedio);
    }
    public void metodo1(){}
    private void metodo2(){}
}
