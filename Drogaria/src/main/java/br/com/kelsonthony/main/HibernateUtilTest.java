package br.com.kelsonthony.main;

import org.hibernate.Session;

import br.com.kelsonthony.drogaria.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();
		HibernateUtil.getSessionFactory().close();
	}
}