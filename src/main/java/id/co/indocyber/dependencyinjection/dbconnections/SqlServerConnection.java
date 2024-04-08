package id.co.indocyber.dependencyinjection.dbconnections;

public class SqlServerConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to SQL Server Database!");
    }
}
