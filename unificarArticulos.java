import java.util.Scanner;

public class unificarArticulos {

    public static Objbodega[][] crearMatriz(int n) {

        return new Objbodega[n][n];
    }

    public static void llenarMatriz(Objbodega[][] matriz, String Almacen) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a llenar los datos del " + Almacen);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("Ingrese el nombre del articulo: ");
                String articulos = sc.next();
                System.out.println("Ingrese la cantidad o el stock del producto: ");
                int stock = sc.nextInt();
                Objbodega o = new Objbodega();
                o.setArticulos(articulos);
                o.setStock(stock);
                matriz[i][j] = o;
            }
        }
    }

    public static Objbodega[][] fusionar(Objbodega[][] a1, Objbodega[][] a2) {

        int n = a1.length;
        Objbodega[][] resultado = new Objbodega[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                Objbodega o1 = a1[i][j];
                Objbodega o2 = a2[i][j];

                if (o1.getArticulos().equalsIgnoreCase(o2.getArticulos())) {

                    Objbodega nuevo = new Objbodega();

                    nuevo.setArticulos(o1.getArticulos());
                    nuevo.setStock(o1.getStock() + o2.getStock());

                    resultado[i][j] = nuevo;
                    resultado[i][j] = o1;
                    resultado[i][j] = o2;
                } else {
                 
                    resultado[i][j] = o1;
                    resultado[i][j] = o2;

                }
            }

        }
        return resultado;
    }
}
