import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos días");
        System.out.println("Dame un número:");
        int num = sc.nextInt();

        int resultado = (num * 2);
        System.out.println("Resultado: " + (resultado -1));
    }
}
