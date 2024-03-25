package Bai1_JavaBasic.Bien;

public class BienCucBo {
    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }
    public static void main(String[] args) {
        BienCucBo B = new BienCucBo();
        B.sayHello();

    }

}
