package Bai1_JavaBasic.KTColection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DemoMap
{
    public static void main(String[] args)
    {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
        //duyệt collection
        System.out.println();
        //+ truy xuất giá trị theo từng key
        System.out.println(hashMap.get("Windows"));

        //+ truy xuất giá trị theo từng value
        for(Map.Entry<String,String> entry: hashMap.entrySet())
        {
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }




    }
}
