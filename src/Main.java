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
        do{
                int opcion;
                System.out.println("**** Menu ****");
                System.out.println("1) Suma de dos números");
                System.out.println("2) Raíz cuadrada");
                System.out.println("3) Seno, coseno, tangente");
                System.out.println("4) Salir");
                System.out.println("Ingrese la opción: ");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("**** SUMA ****");
                        System.out.println("Ingrese el primer numero: ");
                        int n1 = scanner.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        int n2 = scanner.nextInt();
                        OPERACIONES op = new OPERACIONES(n1,n2);
                        op.mostrarSumatoria();
                        break;
                    case 2:
                        System.out.println("**** RAIZ ****");
                        System.out.println("Ingrese un numero: ");
                        int a = scanner.nextInt();
                        raiz a = new raiz(a);
                        op.mostrarRaiz();
                        break;
                    case 3:
                        System.out.println("**** SENO - COSENO - TANGENTE ****");
                        System.out.println("Ingrese un número: ");
                        int b = sc.nextInt();
                        SenoCosenoTangente n = new SenoCosenoTangente(b);
                        n.mostrarSCT();
                        break;
                case 4:
                    System.out.println("**** MUCHAS GRACIAS ****");
                    break;
                default:
                    System.out.println("Opción no válida... REINTENTAR");                    
                }

        } while(opcion!=4);

        sc.close();
    }

}