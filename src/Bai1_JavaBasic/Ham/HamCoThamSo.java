package Bai1_JavaBasic.Ham;

public class HamCoThamSo
{
    int a = 10;
    int b = 20;

    public int cong2so()
    {
        return (a + b);
    }
    public int conghaiso(int number1, int number2)
    {
        return (number1+number2);
    }

    public static void main(String[] args)
    {
        HamCoThamSo demoHamCoThamSo = new HamCoThamSo();
        System.out.println(demoHamCoThamSo.cong2so());
        System.out.println(demoHamCoThamSo.conghaiso(20,30));
    }
}
