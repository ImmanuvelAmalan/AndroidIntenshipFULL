import java.sql.*;
import java.util.Scanner;
class JavaDatabase{
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        String uname="root";        // Database admin username
        String pass="root";         // Database admin password
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student",uname,pass); // Allocate a database 'Connection' object
        Statement statement=connection.createStatement();
        
        try {
            String createTable = "create table student(firstname varchar(20),lastname varchar(20),regno int,cgpa float)";  // Creating table
            statement.execute(createTable);
        }
        catch (SQLSyntaxErrorException e){
            System.out.println("Table already exists");}
        
        try {
            String alterTable="alter table student add primary key (regno)";   // Altering table
            statement.executeUpdate(alterTable);
        }
        catch (SQLException e){
            System.out.println("Already a primary key");
        }
        
        Scanner scanner=new Scanner(System.in);         // Inserting into table
        System.out.print("First Name:");
        String firstName=scanner.next();
        System.out.print("Last Name:");
        String lastName=scanner.next();
        System.out.print("Reg.No:");
        int regNo=scanner.nextInt();
        System.out.print("CGPA:");
        float cgpa=scanner.nextFloat();
        try {
            statement.executeUpdate(String.format("insert into student values('%s','%s','%d','%f')",firstName,lastName,regNo,cgpa));
        }
        catch (SQLException e){
            System.out.println("Duplicate Entry found");
        }
        
        ResultSet resultSet=statement.executeQuery("select * from student");  // Printing the table
        while (resultSet.next()){
            System.out.println();
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+
                    resultSet.getFloat(4));
        }
        connection.close();   // closing the connection
    }
}