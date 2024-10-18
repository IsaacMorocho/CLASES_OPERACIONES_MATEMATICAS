import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
/*         System.out.println("Ingrese el nombre del curso: ");
        String nombreDelCurso = scanner.nextLine();
        System.out.println("Ingrese el periodo del curso: ");
        String periodo = scanner.nextLine();
        System.out.println("Ingrese el año del curso: ");
        int año = scanner.nextInt();
        System.out.println("Ingrese el promedio del curso: ");
        double promedio = scanner.nextDouble();
        LibroCalificaciones miLibroCalificaciones =
                new LibroCalificaciones(nombreDelCurso,periodo,año,promedio);
*//*
        miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
        miLibroCalificaciones.establecerPeriodo(periodo);
        miLibroCalificaciones.establecerAño(año);
        miLibroCalificaciones.establecerPromedio(promedio);

 *//*
        miLibroCalificaciones.mostrarMensaje();
        LibroCalificaciones miLibro2=
                new LibroCalificaciones();
        miLibro2.mostrarMensaje();*/

        //CREAR OBJETO:

        System.out.println("Ingrese el primer numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = scanner.nextInt();
        OPERACIONES op = new OPERACIONES(n1,n2);
        op.mostrarDatos();
        System.out.println(op.sumatoria());
        op.mostrarSumatoria();
        op.mostrarResta();
        op.raiz();
        op.multiplicar();
        op.dividir();





    }

}