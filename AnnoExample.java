package myclass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    int value();
}
class Animal{
    @MyAnnotation(value=10)
    public void eatSomething(){System.out.println("eating something");}
    @Deprecated
   public void talkSomething(){System.out.println("Hello!");}
}
class Dog extends Animal{
    @Override
    public void eatSomething(){System.out.println("eating foods");}//should be eatSomething
}
class AnnoExample{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws NoSuchMethodException {
        Animal a=new Animal();
        a.eatSomething();
        ArrayList list=new ArrayList();
        list.add("Dog");
        list.add("Cat");
        list.add("Horse");
        for(Object obj:list)
            System.out.println(obj);
        a.talkSomething();
        Method method=a.getClass().getMethod("eatSomething");
        MyAnnotation manno=method.getAnnotation(MyAnnotation.class);
        System.out.println("value is: "+manno.value());
    }

    }

