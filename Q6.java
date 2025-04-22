import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero inteiro:");
        int number = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<number;i++ ){
        System.out.println(i);
   }
  }
}
