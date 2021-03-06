package myclass;
class CreatingObjects implements Cloneable{
    String str="Object Created";
    public static void main(String args[]) throws Exception{
        CreatingObjects object1=new CreatingObjects();   // Creating object using new keyword
        Class cl = Class.forName("myclass.CreatingObjects");                 //  Creating object using newInstance()
        CreatingObjects object2=(CreatingObjects) cl.newInstance();         //
        CreatingObjects object3=(CreatingObjects) object1.clone(); // Creating object using clone interface    
		Constructor<CreatingObjects> cons= CreatingObjects.class.getDeclaredConstructor();  //
        CreatingObjects object4=cons.newInstance();                                        //  Creating object using Constructor class
           
        
    }
}