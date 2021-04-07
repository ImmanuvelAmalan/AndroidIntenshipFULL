import java.util.Locale;
class StringExample{
public static void main(String[]args){
       String str=" Immanuvel Amalan "; // Traditional method of creating string
	   String str2=" Immanuvel Amalan ";
       String str1=new String("Immanuvel Amalan");
       if(str==str1){       // Reference comparision
           System.out.println("Equal");
       }
       else{
           System.out.println("Not Equal");
       }
    if(str.equals(str1)){       // Content comparision
        System.out.println("Equal");
    }
    else{
        System.out.println("Not Equal");
    }
    System.out.println(str.length());  // String length
    System.out.println(str.toUpperCase()); // Upper case
    System.out.println(str.toLowerCase()); // Lower case
   // System.out.println(str.trim()); // eliminate whitespace at begining and in end
    System.out.println(str.replace("m","Beca")); // replace
    System.out.println(str.isEmpty()); // Empty
    System.out.println(str1.endsWith("an")); // Endswith
    StringBuilder stringBuilder=new StringBuilder("Immanuel Amalan");
    System.out.println(stringBuilder.append("J"));
    System.out.println(stringBuilder.reverse());
    StringBuffer stringBuffer=new StringBuffer("Immanuel Amalan");
    System.out.println(stringBuffer.append("J"));
    System.out.println(stringBuffer.reverse());
}}