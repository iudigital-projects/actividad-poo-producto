public class App {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Panel Solar Portátil", "Energía Renovable", 780000, 10, true, "Bajo");
        Producto prod2 = new Producto("Cargador Solar", "Accesorios", 160000, 10, true, "Bajo");
        Producto prod3 = new Producto("Laptop Eficiente Energética", "Computación", 2700000, 3, true, "Medio");
        Producto prod4 = new Producto("Bombillo LED Inteligente", "Iluminación", 65000, 15, true, "Bajo");
        Producto prod5 = new Producto("Batería Recargable Ecológica", "Energía", 120000, 8, false, "Bajo");

        prod1.mostrarInformacion();
        prod2.mostrarInformacion();
        prod3.mostrarInformacion();
        prod4.mostrarInformacion();
        prod5.mostrarInformacion();

        prod1.aplicarDescuento(15);
        prod2.registrarCompra(7);
        prod3.registrarVenta(2);
        prod5.marcarDisponible();
        prod4.registrarVenta(20);

        prod1.mostrarEtiquetaEcologica();
        prod2.mostrarEtiquetaEcologica();
        prod5.mostrarEtiquetaEcologica();
    }
}