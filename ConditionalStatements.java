 import java.util.Scanner;
class ConditionalStatements{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=scanner.nextInt();
        if(age>18){  // IF
            System.out.println("Eligible to vote");
        }
        if(age>18){  // IF - ESLE
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
        int number=age;
        if(number<10){  // ELSE - IF
            System.out.println("less than 10");
        }
        else if(number<20)
        {
            System.out.println("less than 20");
        }

        else if(number<30)
        {
            System.out.println("less than 30");
        }
        else {
            System.out.println("Invalid number");
        }
        if(number>18){  // NESTED IF
            if(number>27){
                System.out.println("You cant get government job");
            }
            else {
                System.out.println("you can get government job");
            }
        }
        System.out.println("Enter number 1-3:");
        number=scanner.nextInt();
        switch (number){    // SWITCH
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            case 3:
                System.out.println("Three");break;
            default:
                System.out.println("Invalid");
        }
    }
}