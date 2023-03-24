package Employee.Management.system;


import java.sql.*;

/*------for driver of jdbc , we have to import jar file of jdbc and mysql connector------*/

/*------------- 5 steps of Databse connection with any software
1-----> register the driver class
2-----> creating the connection string
3-----> creating statment
4-----> executing mysql queries(--this step is performed in mysql----------)
5-----> closing the connection

---------------*/

public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {

            /*--------- register the driver class--------------*/
            Class.forName("com.mysql.cj.jdbc.Driver");

            /*--------creating the connection string------------*/
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "HelloAnkit#20268");

            /*----------creating statment----------------------*/
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*----------closing step is in Login class -----------------*/