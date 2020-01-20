package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Database db = new Database();
        try {
            db.ConDB();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        ResultSet rs = db.test();
        String text = "";
        try {
            while(rs.next()){
                text = text + rs.getString("text") + " ";
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.print(text);

    }
}
