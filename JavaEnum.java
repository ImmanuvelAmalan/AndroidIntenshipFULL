package myclass;
enum Days{
    SUNDAY(),
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY()
}
enum TrafficLights{
    RED("STOP"),YELLOW("READY TO GO"),GREEN("GO"); // Enum with fields
    private String a;
    TrafficLights(String a){         // Enum Constructor
        this.a=a;
    }
    protected String getSignal(){         // Enum with methods
        return a;
    }
}
enum Posting{           // Enum with abstract method
    MANAGER{
        protected void getPosition() {
            System.out.println("Position MANAGER");
        }
    },
    PROGRAMMER{
        protected void getPosition(){
            System.out.println("Position PROGRAMMER");
        }
    };
    protected abstract void getPosition();
}
class JavaEnum{
    public static void main(String[]args){
        for(Days d:Days.values()) {                 // Enum iteration using for each
            System.out.print(d + " ");
        }
        System.out.println();
        for(TrafficLights t:TrafficLights.values()) {                 // Enum iteration using for each
            System.out.print(t+" Value is "+t.getSignal()+", ");
        }
        System.out.println();
        System.out.println(Days.valueOf("MONDAY"));    // valueof()
        System.out.println(Days.valueOf("FRIDAY").ordinal()); // ordinal()
        Days e=Days.MONDAY;
        switch (e) {
            case MONDAY -> System.out.println("1st day");break;
            case TUESDAY -> System.out.println("2nd day");break;
            default -> System.out.println("Other day");
        }
        System.out.println(TrafficLights.RED.getSignal());
        Posting.MANAGER.getPosition();
    }}