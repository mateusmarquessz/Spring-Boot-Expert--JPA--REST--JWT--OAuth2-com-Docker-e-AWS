package io.github.mateusmarquessz.librayapi.config;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.driver}")
    String driver;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }

    @Bean
    public DataSource hirakiDataSource() {
        HikariConfig config = new HikariConfig();
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);
        config.setJdbcUrl(url);

        config.setMaximumPoolSize(10); //Maximo de conexoes liberadas
        config.setMinimumIdle(1); //Tamanho inicial do pool
        config.setPoolName("library-db-pool"); //nome da minha pool
        config.setMaxLifetime(600000); // 600 mil de ms (10 mil minutos)
        config.setConnectionTimeout(100000); // 100 mil de ms para dar timeout no banco de dados
        config.setConnectionTestQuery("SELECT 1"); //Query de teste

        return new HikariDataSource(config);
    }
}
