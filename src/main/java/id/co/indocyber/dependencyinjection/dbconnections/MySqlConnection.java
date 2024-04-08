package id.co.indocyber.dependencyinjection.dbconnections;

public class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database!");
    }
}
