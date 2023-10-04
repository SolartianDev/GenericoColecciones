package genericoscolecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContarProductos {
    // Mapa para almacenar el recuento de productos por número de pieza
    private Map<String, Long> mapConteoProductos = new HashMap<>();
    // Mapa para relacionar los nombres de productos con sus números de pieza
    private Map<String, String> nombreProductos = new TreeMap<>();

    // Constructor que recibe un mapa de nombreProductos
    public ContarProductos(Map nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    // Método principal
    public static void main(String[] args) {
        // Array de referencias de productos
        String[] referencias = new String[]{"1S01","1S01","1S01","1S01","1S01",
            "1S02","1S02","1S02","1H01","1H01","1H01","1S02","1S01","1S01","1H01","1H01",
            "1H01","1S02","1S02","1M02","1M02","1M02","1M02","1M02"};

        // Mapa que relaciona nombres de productos con números de pieza
        Map<String, String> nombreProductos = new TreeMap();
        nombreProductos.put("Smart TV LG","1H01");
        nombreProductos.put("Celular Huawei", "1S01");
        nombreProductos.put("Portatil Lenovo", "1M02");
        nombreProductos.put("Celular Samsung", "1S02");

        // Crear una instancia de ContarProductos
        ContarProductos piezas = new ContarProductos(nombreProductos);

        // Procesar la lista de referencias
        piezas.procesoDeLista(referencias);

        // Imprimir el informe
        piezas.imprimirReporte();
    }

    // Método para procesar la lista de referencias y contar los productos
    public void procesoDeLista(String[] referencias) {
        long valor = 0;
        for (String numeroItem : referencias) {
            if (mapConteoProductos.containsKey(numeroItem)) {
                valor = mapConteoProductos.get(numeroItem);
                valor++;
                mapConteoProductos.put(numeroItem, new Long(valor));
            } else {
                mapConteoProductos.put(numeroItem, new Long(1));
            }
        }
    }

    // Método para imprimir el informe de productos y su recuento
    public void imprimirReporte() {
        System.out.println("\t\t\t==== Reporte De Productos ====");
        for (String key : nombreProductos.keySet()) {
            System.out.print("Nombre: " + key);
            System.out.println("\t\t\tConteo: " + mapConteoProductos.get(nombreProductos.get(key)));
        }
    }
}
