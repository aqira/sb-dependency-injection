package id.co.indocyber.dependencyinjection.dbconnections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DatabaseConfiguration {

    @Profile("mysql")
    @Bean
    public DatabaseConnection mySqlConnection() {
        System.out.println("You are now using MySQL Database.");
        return new MySqlConnection();
    }

    @Profile("sqlserver")
    @Bean
    public DatabaseConnection sqlServerConnection() {
        System.out.println("You are now using SQL Server Database.");
        return new SqlServerConnection();
    }
}
