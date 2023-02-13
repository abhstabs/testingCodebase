package ai.privado.test.aws;

import com.amazonaws.services.redshift.AmazonRedshift;
import com.amazonaws.services.redshift.AmazonRedshiftClientBuilder;

import java.sql.*;

public class RedshiftSink {

    private static final String JDBC_DRIVER = "com.amazon.redshift.jdbc.Driver";
    private static final String DB_URL = "jdbc:redshift://{cluster_endpoint}:{port}/{database_name}";

    private Connection conn = null;
    private AmazonRedshift redshiftClient = AmazonRedshiftClientBuilder.defaultClient();

    // Function to establish connection to Redshift
    public void establishConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, {username}, {password});
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to find Redshift JDBC driver class");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Unable to establish connection to Redshift");
            e.printStackTrace();
        }
    }

    // Function to insert personal data into Redshift
    public void insertPersonalData(String firstName, String lastName, int age, String address) {
        try {
            if (conn == null) {
                establishConnection();
            }

            String sql = "INSERT INTO personal_data (first_name, last_name, age, address) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setInt(3, age);
            statement.setString(4, address);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while inserting personal data into Redshift");
            e.printStackTrace();
        }
    }

    // Function to retrieve personal data from Redshift
    public void retrievePersonalData() {
        try {
            if (conn == null) {
                establishConnection();
            }

            String sql = "SELECT * FROM personal_data";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                int age = result.getInt("age");
                String address = result.getString("address");
                System.out.println(firstName + " " + lastName + " " + age + " " + address);
            }
        } catch (SQLException e) {
            System.out.println("Error while retrieving personal data from Redshift");
            e.printStackTrace();
        }
    }
}



