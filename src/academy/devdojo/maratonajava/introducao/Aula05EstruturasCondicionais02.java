package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
  public static void main(String[] args) {
    // idade < 15 categoria infantil
    // idade >= 15 && idade < 18 categoria juvenil
    // idade >= 18 categoria adulto
    int idade = 20;
    String categoria;

    if (idade < 15) {
      categoria = "Infantil";
    } else if (idade >= 15 && idade < 18) {
      categoria = "Juvenil";
    } else {
      categoria = "Adulto";
    }
  }
}

