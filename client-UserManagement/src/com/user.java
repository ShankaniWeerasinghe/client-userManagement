



package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class user {
	
	//A common method to connect to the DB
		private Connection connect() 
		 { 
		 Connection con = null; 
		 try
		 { 
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
		 
		 //Provide the correct details: DBServer/DBName, username, password 
		 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user?useTimezone=true&serverTimezone=UTC", "root", ""); 
		 } 
		 catch (Exception e) 
		 {e.printStackTrace();
		 return con; 
		 }
		return con;
		 }
	public String readUser()
	{ 
	 String output = ""; 
	try
	 { 
	 Connection con = connect(); 
	 if (con == null) 
	 { 
	 return "Error while connecting to the database for reading."; 
	 } 
	 // Prepare the html table to be displayed
	 output = "<table border='1'><tr><th>User Email</th>" 
	 +"<th>First Name</th>"
	 + "<th>Last Name</th>" 
	 +"<th>Type</th>"
	 +"<th>Contact Number</th>"
	 +"<th>Password</th>"
	 + "<th>Update</th><th>Remove</th></tr>";

	 
	 String query = "select * from users"; 
	 Statement stmt = con.createStatement(); 
	 ResultSet rs = stmt.executeQuery(query); 
	 
	 // iterate through the rows in the result set
	 while (rs.next()) 
	 { 
	 String firstName = rs.getString("firstName"); 
	 String lastName = rs.getString("lastName"); 
	 String type = rs.getString("type"); 
	 String phone = rs.getString("phone"); 
	 String password = rs.getString("password");
	 String UserEmail = rs.getString("UserEmail");
	 
	 // Add a row into the html table
	 output += "<tr><td>" + firstName + "</td>"; 
	 output += "<td>" + lastName + "</td>"; 
	 output += "<td>" + type + "</td>";
	 output += "<td>" + phone + "</td>";
	 output += "<td>" + password + "</td>";
	 output += "<td>" + UserEmail + "</td>";
	 

	// buttons
	 output += "<td><input name='btnUpdate' type='button' value='Update' "
	 + "class='btnUpdate btn btn-secondary' data-itemid='" + UserEmail + "'></td>"
	 + "<td><input name='btnRemove' type='button' value='Remove' "
	 + "class='btnRemove btn btn-danger' data-itemid='" + UserEmail + "'></td></tr>"; 
	  } 
	  con.close(); 
	  // Complete the html table
	  output += "</table>"; 
	  } 
	
	 catch (Exception e) 
	  { 
	  output = "Error while reading the items."; 
	  System.err.println(e.getMessage()); 
	  } 
	 return output; 
	 }
	
	public String insertUser(String UserEmail,String firstName, String lastName, String type, String phone, String password)
			 { 
			 String output = ""; 
			 try
			 { 
			 Connection con = connect(); 
			 if (con == null) 
			 { 
			 return "Error while connecting to the database for inserting."; 
			 } 
			
			 PreparedStatement preparedStmt = con.prepareStatement(query); 
			 // binding values
			 preparedStmt.setString(1,UserEmail);
			 preparedStmt.setString(2, firstName); 
			 preparedStmt.setString(3, lastName); 
			 preparedStmt.setString(4,type); 
			 preparedStmt.setString(5, phone);
			 preparedStmt.setString(6, password);
			 
			// execute the statement
			 preparedStmt.execute(); 
			 con.close(); 
			 
			 String newUser = readUser(); 
			 output = "{\"status\":\"success\", \"data\": \"" + 
			 newUser + "\"}"; 
			
			
			 } 
			 catch (Exception e) 
			 { 
			 output = "Error while inserting the item."; 
			 System.err.println(e.getMessage()); 
			 } 
			 return output; 
			 } 


		
		 public String updateUser(String UserEmail, String firstName, String lastName, String type,String phone, String password) 
		 { 
			 String output = ""; 
			 try
			 { 
			 Connection con = connect(); 
			 if (con == null) 
			 { 
			 return "Error while connecting to the database for updating."; 
			 }
			 
			// create a prepared statement
			 String query = "UPDATE users SET firstName=?,lastName=?,type=?,phone=?,password=? WHERE UserEmail=?"; 
			 
			 PreparedStatement preparedStmt = con.prepareStatement(query); 
			
			 // binding values
			preparedStmt.setString(1,UserEmail);
			preparedStmt.setString(2, firstName); 
			preparedStmt.setString(3, lastName); 
			preparedStmt.setString(4,type); 
			preparedStmt.setString(5, phone);
			preparedStmt.setString(6, password);
		
		 // execute the statement
		 preparedStmt.execute(); 
		 con.close(); 
		 String newItems = readUser(); 
		 output = "{\"status\":\"success\", \"data\": \"" + 
		 newItems + "\"}"; 
		 } 
		 catch (Exception e) 
		 { 
		 output = "{\"status\":\"error\", \"data\": \"Error while updating the item.\"}"; 
		 System.err.println(e.getMessage()); 
		 } 
		 return output;
		 }
		 
		 public String deleteItem(String itemID) 
		 { 
		 String output = ""; 
		 try
		 { 
		 Connection con = connect(); 
		 if (con == null) 
		 { 
		 return "Error while connecting to the database for deleting."; 
		 }
		// create a prepared statement
		 String query = "delete from items where UseEmail=?"; 
		 PreparedStatement preparedStmt = con.prepareStatement(query); 
		 // binding values
		 preparedStmt.setInt(1, Integer.parseInt(itemID)); 
		 // execute the statement
		 preparedStmt.execute(); 
		 con.close(); 
		 String newUser = readUser(); 
		 output = "{\"status\":\"success\", \"data\": \"" + newUser + "\"}"; 
		 } 
		 catch (Exception e) 
		 { 
		 output = "{\"status\":\"error\", \"data\":  \"Error while deleting the item.\"}"; 
		 System.err.println(e.getMessage()); 
		 } 
		 return output; 
		 } 
		}

