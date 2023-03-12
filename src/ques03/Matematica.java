/*Defina um sistema onde o usuário informe (na classe principal, através do
teclado) qual opção deseja visualizar. Caso informe 1 ele vai ver a soma de dois
números. Caso informe 2, vai ver a subtração, 3 divisão e 4 multiplicação.
Observação: Estas operações deverão ser realizadas em uma classe chamada
Matemática.
DESAFIO: Faça o usuário poder ver quantas vezes ele desejar estas operações,
para isso, basta digitar o número 0.*/


package ques03;

public class Matematica {

    int numero1 = 10;
    int numero2 = 5;

    public int soma() {
        int soma = numero1 + numero2;
        return soma;
    }

    public int subtracao() {
        int subtracao = numero1 - numero2;
        return subtracao;
    }


    public Double divisao(){
        int divisao = numero1 / numero2;
        return (double) divisao;
    }

    public int multiplicacao() {
        int multiplicacao = numero1 * numero2;
        return multiplicacao;
    }
}
