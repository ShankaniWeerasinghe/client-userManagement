



package com;

import java.sql.Connection;
import java.sql.DriverManager;
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
}
