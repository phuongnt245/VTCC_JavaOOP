package Bai1_JavaBasic.KTColection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {

        //khai báo đối tượng kiểu HashSet trong bộ Set//
        Set<String> hashSet = new HashSet<String>();

        //thêm giá trị vào HashSet
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        //  Hiển thị giá trị của 1 cục data
        System.out.print("\t" + hashSet + "\n");

        //duyệt giá trị trong collection - vòng for cải tiến (phức tạp)
        for (String ProgrammingName : hashSet)
        {
            System.out.println(ProgrammingName);
        }
    }
}
