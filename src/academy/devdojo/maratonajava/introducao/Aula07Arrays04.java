package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
  public static void main(String[] args) {
    // 1, 2, 3, 4, 5 meses
    // 31, 28, 31, 30 dias
    int[][] dias = new int[3][3];
    dias[0][0] = 31;
    dias[0][1] = 28;
    dias[0][2] = 30;
    System.out.println(dias[0]); // endereço de memória
    System.out.println(dias[0][0]);
    System.out.println(dias[0][1]);
    System.out.println(dias[0][2]);

    for (int i = 0; i < dias.length; i++) {
      //      System.out.println(dias[i]);
      for (int j = 0; j < dias[0].length; j++) {
        System.out.println(dias[i][j]);
      }
    }
  }
}
