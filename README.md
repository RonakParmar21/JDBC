# JDBC
 JDBC


# Requirement
- java (any java version)
- required install database (any version)
- JDBC Driver : mysql-connector
- any IDE

# Setup jar file
- mysql jar file

# steps to connect with database
- import java.sql.*;

- Load driver
    - Class.forName("com.mysql.jdbc.driver-name") # Syntax
    - Class.forName("com.mysql.jdbc.Driver") # mysql driver load

    - second way :-
    - DriverManager.registerDriver(new com.mysql.jdbc.Driver());

- Create a Connection :-
    - Connection con = DriverManager.getConnection("url", "username", "password") -- give connection object
    
    - Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-name", "root", "ronak"); -- mysql url

- Create a query, Create Statement, Create Prepared Statement, Callable Statement :-
    - String query = "select * from tablename";
    - Statement st = con.createStatement();
    - ResultSet rs = st.executeQuery(); || st.

Statement use for simple query
Prepared Statement use for dynamic query like ? mark query (parameterized query)
Callable Statement use for store procedure etc..


executeQuery() :- select query (get data)
executeUpdate() :- insert, update, delete (not get data)


- Process the data :- (with help of ResultSet)
    - this is for select records :-
        - while(rs.next()) { // next() use for if next record availble or not.
            int id = rs.getInt("column-number", "Column-name") // both are table 
            int name = rs.getString("column-number", "column-name")

            System.out.println("ID and Name " + id + " " + name)
        }


- Close the connection :-
    - con.Close();
