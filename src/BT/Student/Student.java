package BT.Student;

import java.util.Scanner;
public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private int phone;
    public Student() {
    }
    public Student(int id, String name, int age, String address, int phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void input(Scanner scanner){
        System.out.println("++Hãy nhập thông tin sinh viên++");
        System.out.println();
        System.out.println("Nhập Id sinh viên:");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên sinh viên:");
        this.name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Địa chỉ:");
        this.address = scanner.nextLine();
        System.out.println("iện thoại:");
        this.phone = Integer.parseInt(scanner.nextLine());
    }
    public void display(){
        System.out.printf("Sinh viên %s - ID %d - %d Tuổi - Địa chỉ %s - Sđt %d\n",this.name,this.id,this.age,this.address,this.phone );
    }
}