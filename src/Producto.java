public class Producto {

  private String nombre;
  private String categoria;
  private double precio;
  private int stock;
  private boolean disponible;
  private String impactoAmbiental;

  public Producto(
      String nombre,
      String categoria,
      double precio,
      int stock,
      boolean disponible,
      String impactoAmbiental) {
    this.nombre = nombre;
    this.categoria = categoria;
    this.precio = precio;
    this.stock = stock;
    this.disponible = disponible;
    this.impactoAmbiental = impactoAmbiental;
  }

  public void mostrarInformacion() {
    System.out.println("nombre: " + nombre);
    System.out.println("categoria: " + categoria);
    System.out.println("precio: " + precio);
    System.out.println("stock: " + stock);
    System.out.println("disponible: " + disponible);
    System.out.println("impactoAmbiental: " + impactoAmbiental);
    System.out.println("\n---------------------------\n");
  }

  public void aplicarDescuento(double porcentaje) {
    this.precio -= this.precio * porcentaje / 100;
    System.out.println("Nuevo precio con descuento: $" + precio);
    System.out.println("\n---------------------------\n");
  }

  public void registrarCompra(int cantidad) {
    this.stock += cantidad;
    System.out.println("Stock actualizado: " + stock);
    System.out.println("\n---------------------------\n");
  }

  public void marcarDisponible() {
    this.disponible = !this.disponible;
    System.out.println("disponible: " + (this.disponible ? "Disponible" : "No Disponible"));
    System.out.println("\n---------------------------\n");
  }

  public void registrarVenta(int cantidad) {
    if (cantidad <= this.stock) {
      this.stock -= cantidad;
      System.out.println("Venta realizada. Stock restante: " + this.stock);
      System.out.println("\n---------------------------\n");
    } else {
      System.out.println("Stock insuficiente.");
      System.out.println("\n---------------------------\n");
    }
  }

  public void mostrarEtiquetaEcologica() {
    System.out.println("Producto ecológico con impacto ambiental: " + impactoAmbiental);
  }
}
