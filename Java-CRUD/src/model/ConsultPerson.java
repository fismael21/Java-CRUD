
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultPerson extends ConnectionMySQL{
    
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public boolean inserPerson(Person person){
        Connection connection = getConnection();
        
        try{
            preparedStatement = connection.prepareStatement("insert into person (keyPerson, namePerson, address, cellphone, email, birthday, gender) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, person.getKey());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setString(3, person.getAddress());
            preparedStatement.setString(4, person.getCellphone());
            preparedStatement.setString(5, person.getEmail());
            preparedStatement.setDate(6, person.getDate());
            preparedStatement.setString(7, person.getGender());
            
            int result = preparedStatement.executeUpdate();
            
            return result != 0; //If result is different from 0, return "true".
            
        }catch(SQLException ex){
            System.err.println("Error: " + ex);
            return false;
        }finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                System.err.println("Error: " + ex);
            }
        }
        
    }
}
