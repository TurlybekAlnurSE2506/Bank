import java.sql.*;

public class ApplicationMain {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "0000";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()){
             // Read

//             ResultSet rs = statement.executeQuery("select * from customer")) {
//
//            while (rs.next()) {
//                System.out.println(
//                        rs.getLong("customer_id") + " " +
//                        rs.getString("name") + " " +
//                        rs.getString("surname") + " " +
//                        rs.getLong("bank_id")
//                );
//            }
            // Update

             int sql = statement.executeUpdate(
                     "update bankAccount set password = 'ssap321' where bankAcc_id = 1");

             ResultSet rs = statement.executeQuery("select * from bankaccount");

            while (rs.next()) {
            System.out.println(
                    rs.getLong("bankacc_id") + " " +
                            rs.getString("username") + " " +
                            rs.getString("password") + " " +
                            rs.getDouble("balance")
            );
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
