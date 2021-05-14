



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
	 {e.printStackTrace();} 
	 return con; 
	 } 
		
		//====================User=============================================
		
		//=============insert User Method===============
		
		public String insertUser(String UserEmail,String firstName, String lastName, String type, String phone, String password)
		{
			String output = "";
			try
			{
				Connection con = connect();
				if (con == null)
				{
					return "Error while connecting to the database";
				}

				// create a prepared statement
				String query =  " insert into users(`UserEmail`,`firstName`,`lastName`,`type`,`phone`,`password`)values (?, ?, ?, ?, ?,?)";

				
				
				PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setString(1,UserEmail);
				 preparedStmt.setString(2, firstName); 
				 preparedStmt.setString(3, lastName); 
				 preparedStmt.setString(4,type); 
				 preparedStmt.setString(5, phone);
				 preparedStmt.setString(6, password);

				//execute the statement
				preparedStmt.execute();
			
				con.close();
				
		 		String newUser = readusers(); 
				 output = "{\"status\":\"success\", \"data\": \"" + 
				            newUser + "\"}"; 
			}
			catch (Exception e)
			{
				output = "{\"status\":\"error\", \"data\": \"Error while inserting the Users.\"}";
				System.err.println(e.getMessage());
			}
			return output;
		}
		
		//=============Read all Users ===============
		
		public String readusers()
		 {
			 String output = "";
			 try
			 {
				 Connection con = connect();
			 if (con == null)
			 {
				 return "Error while connecting to the database for reading."; }
			 
			 // Prepare the html table to be displayed
			 output = "<table border='1'><tr>"+
			"<th>Email</th>" +
			"<th>First Name</th>" +
			 "<th>Last Name</th>" +
			 "<th>Phone Number</th>" +
			 "<th>Type</th>" +
			 "<th>Password</th>"
			 + "<th>Update</th><th>Remove</th></tr>";
			
			 String query = "select * from users";
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery(query);
			 
			 // iterate through the rows in the result set
			 while (rs.next())
			 {
				 String email = rs.getString("UserEmail");
				 String firstName = rs.getString("firstName"); 
				 String lastName = rs.getString("lastName"); 
				 String type = rs.getString("type");
				 String phoneNo = rs.getString("phone"); 
				 String password = rs.getString("password");
				 
				// Add into the html table
				 output += "<tr><td><input id='hidItemIDUpdate' name='hidItemIDUpdate' type='hidden' value='" + UserEmail+ "'>" + firstName + "</td>";
				 output += "<td>" + lastName + "</td>"; 
				 output += "<td>" + phoneNo + "</td>"; 
				 output += "<td>" + type + "</td>"; 
				 output += "<td>" + password + "</td>";





				 
				 // buttons
		            output += "<td><input name='btnUpdate' type='button' value='Update' class=' btnUpdate btn btn-secondary' data-userid='" + UserEmail + "'></td>"
		            		+ "<td><input name = 'btnRemove' type='button' value = 'Remove' "
		            		+ "class = 'btnRemove btn btn-danger' data-userid='" + UserEmail + "'>"
		            		+"</td></tr>";
		            		
		 }
			 con.close();
			 
			 // Complete the html table
			 output += "</table>";
		 }
		 catch (Exception e)
		 {
			 output = "Error while reading Users.";
			 System.err.println(e.getMessage());
		 }
			 return output;
		 }
		
		//=============Updating a User Method===============

		public String updateUser(String UserEmail, String firstName, String lastName, String type,String phone, String password)
		{
			 String output = "";
			 try
			 {
			 Connection con = connect();
			 if (con == null)
			 {
				 return "Error while connecting to the database for updating."; }
				
			 	// create a prepared statement
			 String query = "UPDATE users SET firstName=?,lastName=?,type=?,phone=?,password=? WHERE UserEmail=?"; 
				 PreparedStatement preparedStmt = con.prepareStatement(query);
				 
				 
				 preparedStmt.setString(1, firstName); 
				 preparedStmt.setString(2, lastName); 
				 preparedStmt.setString(3, type); 
				 preparedStmt.setString(4, phone); 
				 preparedStmt.setString(5, password); 
				 preparedStmt.setString(6, UserEmail);
				 // execute the statement
				 
				 preparedStmt.setInt(7, Integer.parseInt(UserEmail));
				 
				 // execute the statement
				 preparedStmt.execute();
				 con.close();
				 
			 		String newUser = readusers(); 
					 output = "{\"status\":\"success\", \"data\": \"" + 
					             newUser + "\"}"; 
			 }
			 catch (Exception e)
			 {
					output = "{\"status\":\"error\", \"data\": \"Error while updating the User.\"}";
					System.err.println(e.getMessage());
			 }
			 	return output;
			 }
		
		
		//=============Deleting User Method===============
		
		public String deleteUser(String UserEmail)
		 {
			String output = "";
		 try
		 {
			 Connection con = connect();
			 if (con == null)
			 {
				 return "Error while connecting to the database for deleting."; }
				 
			 	// create a prepared statement
				 String query = "delete from user where UserEmail=?";
				 PreparedStatement preparedStmt = con.prepareStatement(query);
				 
				 // binding values
				 preparedStmt.setInt(1, Integer.parseInt(UserEmail));
				 
				 // execute the statement
				 preparedStmt.execute();
				 con.close();
					String newUser = readusers(); 
					 output = "{\"status\":\"success\", \"data\": \"" + 
					               newUser + "\"}"; 
			 }
			 catch (Exception e)
			 {
					output = "{\"status\":\"error\", \"data\": \"Error while deleting the User.\"}";
					System.err.println(e.getMessage());
			 }
			 	return output;
			 }

}
