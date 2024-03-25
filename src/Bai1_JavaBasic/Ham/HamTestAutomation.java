package Bai1_JavaBasic.Ham;

public class HamTestAutomation
{
    public static void clickelement(String elementname)
    {  //Dùng code để thao tác click vào phần tử trên wb/mobi
        System.out.println("click on element" + elementname);

    }
    public static void setText(String elementName, String Value)
    {
        System.out.println("Set Text to input:"+ elementName);
        System.out.println("Value:"+ Value);
    }
    public static void main(String[] args) {
        setText("email input","admin@example.com");
        setText("Password","123456");
        clickelement(" Button login");
    }
}
