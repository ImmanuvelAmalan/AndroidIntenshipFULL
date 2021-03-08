class Parent{
    int number;
    String name;
    long phone;
    public int getNumber() {            // Getters
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {         // Setters
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
}
class SetterGetter extends Parent{
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.setName("Immanuvel");
        parent.setNumber(103);
        parent.setPhone(979606349);
        System.out.println("NAME: "+parent.getName()+"\nNUMBER: "+parent.getNumber()+"\nPHONE: "+parent.getPhone());
    }
}