interface LivingThings{              // ABSTRACTION
    public boolean isLivingThing();
    public boolean isNotLivingthing();
}
class Animals implements LivingThings{           // CLASS
    String name;                   // ENCAPSULATION
    public void eat(String food){
        System.out.println("Eating flesh");
    }
    public void eat(String food1,String food2){   // PLOYMORPHISM - OVERLOADING
        System.out.println("Eating flesh.. + "+food1+" "+food2);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {   // METHODS
        this.name=name;
    }
    public boolean isLivingThing(){
        return true;
    }
    public boolean isNotLivingthing() {
        return false;
    }
}
class Human extends Animals{     // INHERITANCE
    public String getName() {     // POLYMORPHISM - OVERRIDING
        System.out.print("GJ");
		return null;
    }
    public void setName(String name) {   
        this.name=name;
    }
}
class OopsConcepts{
    public static void main(String[] args) {
        Animals human=new Human();    // OBJECTS
        human.setName("Immanuvel");
        System.out.println("Name: "+human.getName());
        human.eat("Pizza","Biriyani");
        System.out.println(human.isLivingThing());
    }
}