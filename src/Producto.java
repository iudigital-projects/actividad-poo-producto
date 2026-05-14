public class Producto {
  
  // ATRIBUTOS
  private String nombre;
  private int stock;
  private String categoria;
  private double precio;
  private boolean disponible;
  private String impactoAmbiental;
  
  // CONSTRUCTOR
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
  
  // MÉTODOS
  
  // Muestra la información del producto 
  public void mostrarInformacion() {
    System.out.println("nombre: " + nombre);
    System.out.println("categoria: " + categoria);
    System.out.println("precio: " + precio);
    System.out.println("stock: " + stock);
    System.out.println("disponible: " + disponible);
    System.out.println("impactoAmbiental: " + impactoAmbiental);
    System.out.println("\n---------------------------\n");
  }

  
  // Calcula el descuento y lo aplica al precio
  public void aplicarDescuento(double porcentaje) {
    precio -= precio * porcentaje / 100;
    System.out.println("Nuevo precio con descuento: $" + precio);
    System.out.println("\n---------------------------\n");
  }
  
  // Agrega cantidad al stock
  public void registrarCompra(int cantidad) {
    stock += cantidad;
    System.out.println("Stock actualizado: " + stock);
    System.out.println("\n---------------------------\n");
  }
  
  // Cambia el estado a disponible o no disponible
  public void marcarDisponible() {
    disponible = !disponible;
    System.out.println("disponible: " + (disponible ? "Disponible" : "No Disponible"));
    System.out.println("\n---------------------------\n");
  }

  // Resta cantidad al stock
  public void registrarVenta(int cantidad) {
    if (cantidad <= stock) {
      stock -= cantidad;
      System.out.println("Venta realizada. Stock restante: " + stock);
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
