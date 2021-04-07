package myclass;
class OuterClass{
    public OuterClass(int number){
        this.number=number;
        System.out.println("Number Outerclass:"+number);
    }
    private int number=0;
    static class InnerClass{
        private int number=0;
        InnerClass(int number){
            this.number=number;
            System.out.println("Number Innerclass:"+number);
        }
    }
}
class InnerClassThis{
    public static void main(String[]args){
        OuterClass outerClass=new OuterClass(10);
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass(20);
    }}