package BT.Circle;
import java.util.Scanner;
public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }
    public double getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double chuVi(){
        return 2*Math.PI*this.banKinh;
    }
    public double dienTich(){
        return Math.PI*Math.pow(this.banKinh,2);
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào bán kinh");
        this.banKinh = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc");
        this.mauSac = scanner.nextLine();
    }
    public void displayData(){
        System.out.printf("Chu vi: %f - Diện tích: %f - Màu sắc: %s", chuVi(),dienTich(),this.mauSac);
    }
}