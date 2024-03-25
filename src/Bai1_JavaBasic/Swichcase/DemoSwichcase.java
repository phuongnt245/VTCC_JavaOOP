package Bai1_JavaBasic.Swichcase;

public class DemoSwichcase {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 40;
        switch (number1+ number2) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

    }
}
