package OOP;

import java.util.Scanner;

public class Book_UngDung {
    private int bookId;
    private String bookName;
    private float price;
    private String title;
    private String author;
    private int year;
    private boolean status;

    public Book_UngDung(int bookId, String bookName, float price, String title, String author, int year, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập mã sách");
        this.bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sách");
        this.bookName = scanner.nextLine();
        System.out.println("Nhâp giá tiền sách");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập tiêu đề sách");
        this.title = scanner.nextLine();
        System.out.println("Nhập tác giả sách");
        this.author = scanner.nextLine();
        System.out.println("Nhập năm xuất bản");
        this.year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trạng thái sách");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
    public  void  displayData(){
        System.out.printf("Mã sách : %d - Tên sách : %s - Giá tiền sách : %f - Tiêu đề : %s - Tác giả : %s",this.bookId,this.bookName,this.price,this.title,this.author );
        System.out.printf("Năm xuất bản : %d - Trạng thái sách : %b", this.year,this.status);
    }
    public int calAge(int currentYear){
       return currentYear - this.year;
    }
}
