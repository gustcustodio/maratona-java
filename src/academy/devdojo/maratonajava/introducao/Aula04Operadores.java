package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
  public static void main(String[] args) {
    // + - / *
    int numero01 = 10;
    int numero02 = 20;
    int resultado = numero01 + numero02;
    System.out.println(numero02 - numero01);
    // %
    int resto = 20 % 2;
    System.out.println(resto);
    // < > <= >= == !=
    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualVinte = 10 == 20;
    boolean isDezDiferenteDez = 10 != 20;
    System.out.println(isDezMaiorQueVinte);
    System.out.println(isDezMenorQueVinte);
    System.out.println(isDezIgualVinte);
    System.out.println(isDezDiferenteDez);
    // && || !
    int idade = 35;
    float salario = 3500F;
    boolean isDentroDaLei = idade > 30 && salario >= 4612;
    boolean isDentroDaLei02 = idade < 30 && salario >= 3381;
    System.out.println(isDentroDaLei);
    System.out.println(isDentroDaLei02);
    double valorTotalContaCorrente = 200;
    double valorTotalContaPoupanca = 10000;
    float valorPlaystation = 5000F;
    boolean isPlaystationCincoCompravel =
        valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
    // = += -= *= /= %=
    double bonus = 2000;
    bonus += 1000;
    System.out.println(bonus);
    // ++ --
    int contador = 0;
    // contador++;
    System.out.println(contador++);
    System.out.println(contador);
  }
}
