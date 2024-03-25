package Bai1_JavaBasic.StatictTrongJava;

import java.sql.SQLOutput;

public class

DemoStatic
{
    static String name ="ánh";
    static int age =30;
    String address ="HỒ CHÍ MINH";

    public static void getInfo()
{
    System.out.println(name);
    System.out.println(age);
}
    public String getAddress()
    {
        System.out.println(name);
        return address;
    }

    public static void main(String[] args) {
        DemoStatic demoStatic = new DemoStatic();
        System.out.println(demoStatic.address);
        //demoStatic.getAddress();
        getInfo();
    }

}
