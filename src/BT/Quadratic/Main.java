package BT.Quadratic;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Quadratic phuongTrinh1 = new Quadratic();
        Scanner scanner = new Scanner(System.in);
        phuongTrinh1.inputData(scanner);
        phuongTrinh1.display();
    }
}
