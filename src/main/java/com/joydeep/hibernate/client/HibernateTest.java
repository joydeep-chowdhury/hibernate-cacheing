package com.joydeep.hibernate.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.joydeep.hibernate.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        UserDetails uds=session.get(UserDetails.class, 5);
        uds.setAddress("Updated address");
        UserDetails uds2=session.get(UserDetails.class, 5);
        System.out.println(uds2);
        session.getTransaction().commit();
        session.close();
      
	}

}
