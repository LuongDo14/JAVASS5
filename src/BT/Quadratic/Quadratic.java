package BT.Quadratic;
import java.util.Scanner;
public class Quadratic {

    private double a;
    private double b;
    private double c;

    public Quadratic() {
    }
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminat(){
        return Math.pow(this.b,2) - 4* this.a* this.c;
    }
    public double getR1(){
        return (-this.b + Math.sqrt((Math.pow(this.b, 2) - 4 * this.a * this.c))) / (2 * this.a);
    }
    public double getR2(){
        return (-this.b - Math.sqrt((Math.pow(this.b, 2) - 4 * this.a * this.c))) / (2 * this.a);
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào giá trị ban đầu của phương trình bậc hai");
        System.out.println("Nhập a: ");
        this.a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b: ");
        this.b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c: ");
        this.c = Double.parseDouble(scanner.nextLine());
    }
    public void display(){
        if (getDiscriminat()==0){
            System.out.printf("Phương trình có 1 nghiệm: %f\n", getR1());
        } else if (getDiscriminat()>0) {
            System.out.printf("Phương trình có 2 nghiệm là: %f và %f\n",getR1(),getR2());
        }else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
