package Bai1_JavaBasic.Bien;

public class BienToanCuc {
//khai bao bien toàn cuc
    String name= "Thảo";
    int age = 25;
    public void getname(){
        System.out.println(name);
        System.out.println(age);
    };
    public void getage(){

        System.out.println(age);
    }

    public static void main(String[] args) {
    BienToanCuc bienToanCuc = new BienToanCuc();
    bienToanCuc.getname();
    bienToanCuc.getage();
        System.out.println(bienToanCuc.name);
    }
}
//bien được khai báo  K phải biến tĩnh ( k có static ở trước biến khai báo)
// thì tại hàm main phải tạo đối tượng class => in class (khởi tạo). tên biến được gọi