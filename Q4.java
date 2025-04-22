import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = Double.valueOf(scanner.nextLine());
        double inss;
        double imposto_renda;

        if (salario < 1000) {
            imposto_renda = 0;
            inss = 0;
        }if (1000 <= salario && salario < 2000 ) {
            imposto_renda = salario * 0.10;
            inss = salario * 0.11;
        }if (2000 >= salario  && salario < 3000) {
            imposto_renda = salario * 0.20;
            inss = salario * 0.15;
        } else {
            inss = salario * 0.20;
            imposto_renda = salario * 0.27;
        }
    
        System.out.println("Valor a pagar de Imposto:"+ imposto_renda);
        System.out.println("Valor a pagar de INSS:"+ inss);
        
    }
}
