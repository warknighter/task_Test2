package com.company;

import java.sql.*;
import java.util.Properties;

public class Database {

    public Connection ConDB() throws SQLException, ClassNotFoundException{


        Connection con = null;
        try{
            String URL = "jdbc:MySQL://213.159.210.74:3306/simki24?serverTimezone=Europe/Moscow&useSSL=true";
            String Username = "testjava";
            String Password = "0H2a7J5y";
            con = DriverManager.getConnection(URL, Username, Password);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
       }


        return con;
    }

    public ResultSet test(){
        String Query = "SELECT * FROM goipSmsParts";
        PreparedStatement pr = null;
        ResultSet rs = null;
        try {
            pr  = ConDB().prepareStatement(Query);
            rs = pr.executeQuery();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            return rs;
        }
    }



}
