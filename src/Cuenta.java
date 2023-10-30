import java.util.Scanner;

public class Cuenta {
  String Titular;
  double Cantidad;
  Scanner sc = new Scanner(System.in);
  public Cuenta() {
    System.out.println("Ingresa titualar de la cuenta");
    setTitular(sc.nextLine());
    System.out.println("Ingresa cantidad para empezar cuenta");
    setCantidad(Double.parseDouble(sc.nextLine()));

  }
  public Cuenta(String titular, double cantidad) {
    Titular = titular;
    Cantidad = cantidad;
  }

  public void ingresar(){
    System.out.println("Ingresa cantidad");
    double cantidad = Double.parseDouble(sc.nextLine());
    if (cantidad < 0){
      System.out.println("Ingresa cantidad válida");
    }else{
      this.Cantidad += cantidad;
    }
    System.out.println("Tu saldo actual es: " + getCantidad());
  }
  public void retirar(){
    System.out.println("Cuanto deseas retirar?");
    double cantidad = Double.parseDouble(sc.nextLine());
    this.Cantidad -= cantidad;
    if (Cantidad < 0){
      this.Cantidad = 0;
    }
    System.out.println("Tu saldo acutal es: " + getCantidad());
  }
  public String getTitular() {
    return Titular;
  }

  public void setTitular(String titular) {
    Titular = titular;
  }

  public double getCantidad() {
    return Cantidad;
  }

  public void setCantidad(double cantidad) {
    Cantidad = cantidad;
  }
}
