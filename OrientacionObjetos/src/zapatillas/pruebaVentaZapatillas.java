package zapatillas;

/**
 *
 * @author DAM1
 */
public class pruebaVentaZapatillas {
    public static void main(String[] args) {
        ventaZapatillas miVenta = new ventaZapatillas();
        miVenta.cargarDatos("src/zapatillas/descuentos.txt");
        System.out.println(miVenta.venta("Adidas", 1, 15, false));
        System.out.println(miVenta.venta("Nke", 3, 33, false));
        System.out.println(miVenta.mostrarInventario());
        System.out.println(miVenta.mostrarVentasTarjRestantes());
        
    }
}
