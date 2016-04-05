import java.sql.*;

 

public class Main {

 public static void main(String [] args)

 {

  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";

  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=K610C-I7-D2-PC";

  String userName="eclipse";

  String userPwd="eclipse";

  try

  {

   Class.forName(driverName);

   Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);

    System.out.println("连接数据库成功");

  }

  catch(Exception e)

  {

   e.printStackTrace();

   System.out.print("连接失败");

  }    

 }

}
