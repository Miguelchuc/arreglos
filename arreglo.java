import java.util.Scanner;

public class arreglo {
    private int[][] ventas;
    private String[] meses;
    public arreglo() {
       
        ventas = new int[][]{
            {500, 300, 150},  
            {400, 250, 200},  
            {350, 450, 300},  
            {600, 350, 250},  
            {700, 300, 350},  
            {550, 400, 450},  
            {600, 500, 400},  
            {650, 550, 300},  
            {620, 350, 250},  
            {590, 300, 300},  
            {560, 270, 200},  
            {700, 350, 150}   
        };
        meses = new String[]{
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
    }

    public Integer buscarVentas(int mes, int departamento) {
        if (mes >= 0 && mes < 12 && departamento >= 0 && departamento < 3) {
            return ventas[mes][departamento];
        } else {
            System.out.println("Mes o departamento fuera de rango.");
            return null;
        }
    }

    public void eliminarVentas(int mes, int departamento) {
        if (mes >= 0 && mes < 12 && departamento >= 0 && departamento < 3) {
            ventas[mes][departamento] = 0;
        } else {
            System.out.println("Mes o departamento fuera de rango.");
        }
    }

    public void imprimirVentas() {
        System.out.printf("%-12s %-10s %-10s %-10s%n", "Mes", "Ropa", "Deportes", "Juguetería");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s %-10d %-10d %-10d%n",
                    meses[i], ventas[i][0], ventas[i][1], ventas[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arreglo ventas = new arreglo();

        System.out.println("Ventas iniciales:");
        ventas.imprimirVentas();

      
        System.out.println("Buscar ventas:");
        System.out.print("Ingrese el mes (0-11): ");
        int mesBuscar = scanner.nextInt();
        System.out.print("Ingrese el departamento (0: Ropa, 1: Deportes, 2: Juguetería): ");
        int depBuscar = scanner.nextInt();
        Integer resultado = ventas.buscarVentas(mesBuscar, depBuscar);
        if (resultado != null) {
            System.out.println("Ventas: " + resultado);
        }

      
        System.out.println("Eliminar ventas:");
        System.out.print("Ingrese el mes (0-11): ");
        int mesEliminar = scanner.nextInt();
        System.out.print("Ingrese el departamento a eliminar (0: Ropa, 1: Deportes, 2: Juguetería): ");
        int depEliminar = scanner.nextInt();
        ventas.eliminarVentas(mesEliminar, depEliminar);
        System.out.println("Ventas después de eliminar:");
        ventas.imprimirVentas();

        scanner.close();
    }
}
