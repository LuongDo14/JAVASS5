package BT.Circle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.2,"Vàng");
        double dienTich1 = circle1.dienTich();
        double chuVi1 = circle1.chuVi();
        System.out.println("Thông tin hình tròn ban đầu: ");
        circle1.displayData();
        Circle circle2 = new Circle();
        System.out.println("Nhập thông tin hình tròn số 2");
        Scanner scanner = new Scanner(System.in);
        circle2.inputData(scanner);
        System.out.println("Thông tin hình tròn 2 là:");
        circle2.displayData();
        System.out.println();
        System.out.println("Diện tích hình tròn là" + dienTich1);
        System.out.println("Chu vi hình tròn là" + chuVi1);
    }
}