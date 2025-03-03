package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
  public static void main(String[] args) {
    int[] numeros = {1, 2, 3};
    //    System.out.println(numeros.length);
    //    for (int i = 0; i < numeros.length; i++) {
    //      System.out.println(numeros[i]);
    //    }

    // forEach
    for (int num : numeros) {
      System.out.println(num);
    }
  }
}
