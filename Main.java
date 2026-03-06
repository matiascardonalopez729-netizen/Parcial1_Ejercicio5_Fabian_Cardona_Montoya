import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de las matrices: ");
        int n = sc.nextInt();

        Objbodega[][] Almacen1 = unificarArticulos.crearMatriz(n);
        Objbodega[][] Almacen2 = unificarArticulos.crearMatriz(n);

        unificarArticulos.llenarMatriz(Almacen1, "Almacen1");
        unificarArticulos.llenarMatriz(Almacen2, "Almacen2");

        Objbodega[][] fusion = unificarArticulos.fusionar(Almacen1, Almacen2);
        System.out.println("Matriz fusionada: ");

        for (int i = 0; i < fusion.length; i++) {
            for (int j = 0; j < fusion.length; j++) {

              
                System.out.println(fusion[i][j].getArticulos() + fusion[i][j].getStock());

            }
        }

    }
}
