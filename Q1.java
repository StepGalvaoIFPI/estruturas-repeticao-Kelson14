import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua velocidade: ");
        int velocidade = Integer.parseInt(scanner.nextLine());

        if (velocidade <= 80) {
            System.out.println("verde");
        } else {
            System.out.println("vermelho");
        }
    }
}
