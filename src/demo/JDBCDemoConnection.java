package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemoConnection {
    public static void main(String[] args) {
        try{
            //step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object
            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@ec2sfodb3d.dev.eomsys.cloud.corp.telstra.com:1521:SFOAD","REFDBUSER","REFDBUSERWelcome1");

            //step3 create the statement object
            Statement stmt=con.createStatement();

//step4 execute query
            ResultSet rs=stmt.executeQuery("select * from oss_ref_attribute");
            System.out.println("Saurabh " +rs.next());
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
