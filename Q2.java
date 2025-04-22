public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = Double.valueOf(scanner.nextLine());
        double aumento;
        double salario_final;

        if (salario > 1250) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }

        salario_final = salario + aumento;

        System.out.println("Seu aumento foi de :"+ aumento);
        System.out.println("Seu salario final é de:"+ salario_final);
       
        
    }
}
