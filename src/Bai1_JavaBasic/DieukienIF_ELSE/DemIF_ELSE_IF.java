package Bai1_JavaBasic.DieukienIF_ELSE;

public class DemIF_ELSE_IF {
    public static void main(String[] args) {
        float DTB = 7.5F;
        if (DTB >= 8F) {
            System.out.println("Gioi");
        } else if (DTB < 8 && DTB >= 6) {
            System.out.println("Trung Bình");
        } else if (DTB < 6 && DTB >= 5) {
            System.out.println("Yếu");
        } else
        {
            System.out.println("ở lại lớp");

        }
    }
}
