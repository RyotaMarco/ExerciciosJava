import java.util.Scanner;

public class decima_sexta {
    public static void main(String[] args) {
        int x;
        String dia;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Dia da semana: "+ dia);
    }
}
