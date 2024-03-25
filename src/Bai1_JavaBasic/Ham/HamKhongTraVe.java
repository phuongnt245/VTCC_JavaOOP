package Bai1_JavaBasic.Ham;

public class HamKhongTraVe
{
    String name ="Liên";
    int age =30;
    String phone = "0123456789";
    //Khai báo hàm khong trả về
    public void ShowInfo(){
        // Viết khối lệnh gồm nhiều dòng code
        System.out.println("Tên:"+name);
        System.out.println("Tuổi: "+age);
        System.out.println("SĐT:"+phone);
    }
    public void getname()
    {
        System.out.println("Tên:"+name);
    }
    public static void main(String[] args) {
        HamKhongTraVe demoHamKhongTraVe = new HamKhongTraVe();
        demoHamKhongTraVe.ShowInfo();
        demoHamKhongTraVe.getname();


    }
}
