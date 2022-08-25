import java.util.Scanner;

public class atvdmod_9 {

    public static void main(String[] args) {

        //Boxing

        Long exemplocpf  = 1234567l;

        Integer idade = 18;

        Double peso = 70.23;

        //Unboxing

        long exemplocpf2 = exemplocpf.longValue();

        int idade2 = idade.intValue();

        double peso2 =peso.doubleValue();


        Scanner Dados = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = Dados.nextInt();

        System.out.println("Digite seu cpf:");
        Long Digiteseucpf = Dados.nextLong();


        System.out.println("Digite seu peso:");
        peso = Dados.nextDouble();
    }
}
