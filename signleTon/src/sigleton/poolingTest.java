package sigleton;

import java.sql.Connection;

public class poolingTest {
    
   DatabaseConnection pool  = DatabaseConnection.getInstance();

   Connection connection1 = pool .getConnection();





};


