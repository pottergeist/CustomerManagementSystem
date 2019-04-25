/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class DB
{
    public static void main(String[] args) 
    {
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","ragon");        
                PreparedStatement stmt=con.prepareStatement("Create Database db78302");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Use db78302");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Products(PID int,Name varchar(20),Packing varchar(20),Price int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Customers(CID int,Name varchar(20),Address varchar(20),Mobile varchar(10))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Orders(OID int,ODate Date,CName varchar(20),TotalAmt int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table OrderDetails(OID int,PName varchar(20),Price int,Qty int,Amt int)");
                stmt.executeUpdate();
                System.out.println("Done");
        }catch(Exception ee){System.out.println(ee);}
    }
}
