class Parent{
    public double add(int a,int b,int c){
        return a+b+c;
    }
        }
class OverloadingOverriding extends Parent{
    public int add(int a){
        return a;
    }
    public float add(int a,int b){
        return a+b;
    }
    public double add(int a,int b,int c){
        return a-b-c;
    }
    public static void main(String[] args) {
        System.out.println("Overloading Single parameter: "+new OverloadingOverriding().add(100));
        System.out.println("Overloading Double parameter: "+new OverloadingOverriding().add(200,300));
        System.out.println("Overrided method: "+new OverloadingOverriding().add(400,500,600));
        System.out.println("Original parent function: "+new Parent().add(400,500,600));
    }
}