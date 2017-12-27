
package com.tomek.domek.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class LocalEMFB {

	@Bean
	public LocalContainerEntityManagerFactoryBean createLocalCEMFB(DataSource ds, JpaVendorAdapter adapter) {
		LocalContainerEntityManagerFactoryBean eFactoryB = new LocalContainerEntityManagerFactoryBean();
		
		eFactoryB.setPersistenceUnitName("spring");
		eFactoryB.setDataSource(ds);
		eFactoryB.setJpaVendorAdapter(adapter);
		eFactoryB.setPackagesToScan("com.tomek.domek");
		

		return eFactoryB;

	}

	@Bean
	public JpaVendorAdapter createVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		return adapter;
	}

	@Bean
	public DataSource createDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/lib1");
		ds.setUsername("root");
		ds.setPassword("admin");
		
		
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setInitialSize(5);
		return ds;
	}

}
