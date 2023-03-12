/*Defina uma classe Aluno que faça operação do cálculo da média, uma vez que as
notas serão inicializadas na programação (definidos pelo programador). Ao final,
exiba (na classe principal) a média. Em seguida, ainda na classe principal, informe
se ele está aprovado, reprovado ou na final. Se a média for >= 70 está aprovado,
abaixo de 40 está reprovado, senão, está na final*/

package ques02;

public class Aluno {

    Double nota1 = 7.5;
    Double nota2 = 7.4;

public Double media() {
    Double media = (nota1 + nota2) / 2;
    return media;
}
}
