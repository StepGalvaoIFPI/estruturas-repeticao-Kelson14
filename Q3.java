import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = Double.valueOf(scanner.nextLine());
        double inss;
        double imposto_renda;

        if (salario > 2000) {
            imposto_renda = salario * 0.15;
            inss = salario * 0.10;
        } else {
            inss = 0;
            imposto_renda = 0;
        }

        System.out.println("Salario:"+ salario);
        System.out.println("Imposto de renda:"+ imposto_renda);
        System.out.println("INSS:"+ inss);
        
    }
}
