class SingleClass{
    private SingleClass(){}  // private constructor
    private static SingleClass singleClass=null; // SingleClass object reference
    public static SingleClass getSingleClass(){
        if(singleClass==null){
            singleClass=new SingleClass();
        }
        return singleClass;
    }
}
class SingletonExample{
public static void main(String[]args){
    SingleClass object=SingleClass.getSingleClass();  // Object creation
    System.out.println(object);
    SingleClass object1=SingleClass.getSingleClass();
    System.out.println(object1);
}}