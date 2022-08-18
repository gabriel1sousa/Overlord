public class atvmod10 {

    public static void main(String[] args) {

        int nota = 10;
        int nota2 = 6;
        int nota3 = 8;
        int nota4 = 6;
        int divisor = 4;

        int media = (nota + nota2 + nota3 + nota4) / divisor;

        System.out.println(media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        }

        else if (media <= 5) {
            System.out.println("Reprovado");
        }




     }
    }

