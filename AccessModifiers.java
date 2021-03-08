class Parent{
    private void fun(){
        System.out.println("Private");
    }
    protected void fun2(){
        System.out.println("Protected");
    }
    void fun3(){
        System.out.println("Default");
    }
    public void fun4(){
        System.out.println("Public");
    }
}
class AccessModifiers{
    public static void main(String[] args) {
        Parent parent=new Parent();
        //parent.fun(); // we cant access coz of private access modifier
        parent.fun2();
        parent.fun3();
        parent.fun4();

    }
}