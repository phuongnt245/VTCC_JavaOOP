package Bai1_JavaBasic.Mang;

public class DemoMangString {
    public static void main(String[] args) {
        String Mangname[] = {"Hoài", "Hương", "Linh"};
        //TRuy xuất giá trị
        for (int i = 0; i < Mangname.length; i++) {
            System.out.println(Mangname[i] + " ");

        }
        // vòng for phức tạp
        for (String ten : Mangname) {
            System.out.println(ten);
        }
    }
}
