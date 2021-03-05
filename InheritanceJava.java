class Animals{
	void sayHello(){
		System.out.println("HELLO");
	}

}
class Birds extends Animals{
	void eat(){
		System.out.println("Eating");
	}
}

/* Single Inheritance

 class InheritanceJava extends Animals{
	 public static void main(String args[])
	 {
		new Animals().sayHello();
	 }
 }
 */
 
/* Multilevel Inheritance
 class InheritanceJava extends Animals{
	 public static void main(String args[])
	 {
		new Birds().sayHello();
	 }
 }	 
 */

 /* Hierarchical Inheritance
 class InheritanceJava extends Birds{
	 public static void main(String args[])
	 {
		new Birds().sayHello();
	 }
 }
 */
 
 /* Multiple Inheritance Using Interface
 interface LivingThings{
	public void iAmAlive();
 }
class Humans{
	void iAmHuman(){
		System.out.println("I AM HUMAN");
	}
}
class InheritanceJava extends Humans implements LivingThings{
	public void iAmAlive(){
		System.out.println("I AM ALIVE");
	}
	public static void main(String args[])
	 {
		new Humans().iAmHuman();
		InheritanceJava iJ=new InheritanceJava();
		iJ.iAmAlive();
	 }
 }
 */
 
/* Hybride Inheritance */
 
 interface LivingThings{
	public void iAmAlive();
 }
class Humans extends Animals{
	void iAmHuman(){
		System.out.println("I AM HUMAN");
	}
}
class InheritanceJava extends Humans implements LivingThings{
	public void iAmAlive(){
		System.out.println("I AM ALIVE");
	}
	public static void main(String args[])
	 {
		new Humans().iAmHuman();
		new Humans().sayHello();
		InheritanceJava iJ=new InheritanceJava();
		iJ.iAmAlive();
	 }
 }