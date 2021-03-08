class Parent{
    int number;String name;
    final int id=10; // Final
    static String companyName="FULL Creative"; // Static     
     public Parent(int number,String name){
        this.name=name;this.number=number;
    }
}
class StaticAndFinal{
    public static void main(String[] args) {
        Parent parent1=new Parent(103,"Immanuvel");
        Parent parent2=new Parent(104,"Becca");
    }
}