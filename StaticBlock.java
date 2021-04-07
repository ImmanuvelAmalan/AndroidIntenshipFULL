class Sample{
    static int number=0;
    int number1=0;
    static {
        System.out.println("Static Block");
        number=103;
       // number1=0; // Non-static variables cannot be accessed
    }
    {
        System.out.println("Instance Block");
        number=104;
        number1=103;
    }
    public Sample(){
        System.out.println("Constructor");
    }
}
class StaticBlock{
    public static void main(String[] args){
        new Sample();
        System.out.println("Main Method");
    }
}

