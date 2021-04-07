import java.util.Scanner;
class MyException extends Exception{    // User defined exception
    MyException(){
        System.out.println("User defined exception");
    }
}
class ExceptionsExample{
    public static void main(String[]args) throws ArithmeticException{

        try{
            int number=10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally always works");
        }
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        if(str.equals("hi")){
            try {
                throw new MyException();
            } catch (MyException e) {
            }
        }
}}