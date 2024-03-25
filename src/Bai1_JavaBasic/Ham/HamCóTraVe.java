package Bai1_JavaBasic.Ham;

public class HamCóTraVe {
    int a= 10;
    int b= 20;
    public int cong2so(){
        return (a+b);
    }
    public static void main(String[] args) {
        HamCóTraVe demoHamCóTraVe = new HamCóTraVe();
        System.out.println(demoHamCóTraVe.cong2so());
    }
}
