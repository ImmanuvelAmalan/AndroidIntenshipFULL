class Parent{
    int number;String name;
    public Parent(int number,String name){
        this.name=name;this.number=number;
    }
}
class ThisKeyword{
    public static void main(String[] args) {
        System.out.println(new Parent(103,"Immanuvel").name);

    }
}