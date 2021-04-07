import java.io.*;
class Animal implements Serializable{
    public String name;
    public static int id=10;
    Animal(String name){
        this.name=name;
        System.out.println(name+" "+id);
    }
}
class Human extends Animal{

    Human(String name) {
        super(name);
    }
}
class Serialization{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal animal=new Animal("Tiger");
        Human human=new Human("Immanuvel");
        FileOutputStream fileOutputStream=new FileOutputStream("AnimalObject.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(animal);
        objectOutputStream.writeObject(human);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Serialized..");
        System.out.println("Deserializing..");
        FileInputStream fileInputStream=new FileInputStream("AnimalObject.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Animal obj=(Animal) objectInputStream.readObject();
        Human obj2=(Human) objectInputStream.readObject();
        System.out.println(obj2.name+" "+obj2.id);
        objectInputStream.close();

    }
}