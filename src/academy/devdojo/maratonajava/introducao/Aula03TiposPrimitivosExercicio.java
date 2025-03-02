package academy.devdojo.maratonajava.introducao;

/*
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>,
 * na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
  public static void main(String[] args) {
    String name = "Gustavo";
    String adress = "Rua Ruazinha";
    String date = "01/03/2025";
    double salary = 4000.0;
    System.out.println(
        "Eu "
            + name
            + ", morando no endereço "
            + adress
            + ", confirmo que recebi o salário de "
            + salary
            + ", na data "
            + date);
  }
}
