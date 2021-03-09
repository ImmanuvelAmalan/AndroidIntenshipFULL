interface VehicleType{             // Abstraction using Interface
    public void car();
    public void bike();
}
abstract class Vehicle implements VehicleType{     // Abstraction using abstract class
    protected int gear=0;
    public abstract void speedUp();
    public void speedDown(){
        if(gear==0){
            System.out.println("N");
        }
        else{
            gear-=1;
        System.out.println("Downing the speed.. Gear:"+gear);
    }}
}
class AbstractionClass extends Vehicle{
    public void car() {                                      
        System.out.println("Vehicle Type: Car");
    }
    public void bike() {
        System.out.println("Vehicle Type: Bike");
    }
    public void speedUp(){
        gear+=1;
        System.out.println("Speed Up.. Gear:"+gear);
    }
    public static void main(String[] args) {
        AbstractionClass car=new AbstractionClass();
        car.speedDown();
        car.speedUp();
        car.speedUp();
        car.speedDown();
        car.car();
    }

}