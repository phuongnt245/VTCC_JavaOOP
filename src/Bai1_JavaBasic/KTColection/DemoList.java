package Bai1_JavaBasic.KTColection;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(2);
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");
        for(int number : arrayList)
        {
            System.out.println(number);
        }
        //duyệt giá trị trong colection - vòng for đơn giản - có thể gọi dùng trực tiếp theo vị trí)
        for (int i=0;i <arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

    }
}
