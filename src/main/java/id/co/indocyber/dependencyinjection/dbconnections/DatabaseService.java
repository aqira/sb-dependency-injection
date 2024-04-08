package id.co.indocyber.dependencyinjection.dbconnections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //sama seperti @Component
public class DatabaseService {
    private final DatabaseConnection databaseConnection;

    @Autowired
    public DatabaseService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
        this.databaseConnection.connect();
    }

    public void useDatabaseConnection() {
        databaseConnection.connect();
    }
}
