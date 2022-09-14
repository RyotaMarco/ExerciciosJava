import java.util.Scanner;

public class decima_quarta {
    public static void main(String[] args) {
        double salario, diferenca, total, somas, dif;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");
        salario = sc.nextDouble();
        if (salario <= 2000) {
            System.out.println("Voce esta isento de imposto!");
        } else {
            if (salario >= 2000.01 && salario <= 3000 ){
                diferenca = salario - 2000;
                total = diferenca * 0.08;
                System.out.println("O imposto pago e:R$ " + total);

            } else{
                if(salario>= 3000.01 && salario<= 4500){
                    diferenca = (salario - 3000) * 0.18;
                    dif = (salario - 2000) * 0.08;
                    total = dif + diferenca;
                    System.out.println("O imposto pago e:R$ " + total);
                }
            }
        }
    }
}

