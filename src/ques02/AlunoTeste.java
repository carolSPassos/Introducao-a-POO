package ques02;
import java.text.DecimalFormat;

public class AlunoTeste {
    public static final DecimalFormat df = new DecimalFormat();
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.media();
        System.out.println("média: " + df.format(a1.media()));

        if(a1.media() < 4.0) {
            System.out.println("Reprovado");
        } else if (a1.media() >= 7.0) {
            System.out.println("Aprovado por média");
        } else {
            System.out.println("Final");
        }

    }
}
