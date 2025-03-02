package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
  public static void main(String[] args) {
    double salarioAnual = 70000;
    double primeiraFaixa = 9.70 / 100;
    double segundaFaixa = 37.48 / 100;
    double terceiraFaixa = 49.50 / 100;
    double imposto;

    if (salarioAnual <= 38441) {
      imposto = salarioAnual * primeiraFaixa;
    } else if (salarioAnual >= 38441 && salarioAnual <= 76817) {
      imposto = salarioAnual * segundaFaixa;
    } else {
      imposto = salarioAnual * terceiraFaixa;
    }
    System.out.println(imposto);
  }
}
