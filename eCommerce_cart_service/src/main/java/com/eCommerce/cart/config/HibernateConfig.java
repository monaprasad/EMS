package com.eCommerce.cart.config;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SuppressWarnings("deprecation")
@EnableTransactionManagement
@ComponentScan({"configure"})
@PropertySource({"classpath:application.properties"})
@Configuration
public class HibernateConfig {

	
//	 @Bean 
//	 public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf)
//	     { 
//		 return hemf.getSessionFactory();
//		 }
//	 
	/*@Bean
	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
	    HibernateJpaSessionFactoryBean factory = new HibernateJpaSessionFactoryBean();
	    factory.setEntityManagerFactory(emf);
	    return factory;
	}*/
}
