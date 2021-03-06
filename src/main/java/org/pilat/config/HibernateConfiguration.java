/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Pilat
 */
@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

    @Bean()
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws URISyntaxException {

        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("org.pilat.model");
        em.setPersistenceUnitName("entityManagerFactory");
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());
        return em;
    }

    @Bean
    public DataSource dataSource() throws URISyntaxException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://mysql01.maciekpilat.beep.pl/KANCELARIA_DATABASE");
        dataSource.setUsername("pilat2");
        dataSource.setPassword("aktsok12");
        return dataSource;
    }

    Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.useUnicode", "true");
        properties.setProperty("hibernate.CharSet", "utf-8");
        properties.setProperty("hibernate.characterEncoding", "utf-8");
        return properties;
    }
}
