package info.inetsolv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args)
	{
		Employee emp=new Employee(13,"Rohit", 35000d);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(emp);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}