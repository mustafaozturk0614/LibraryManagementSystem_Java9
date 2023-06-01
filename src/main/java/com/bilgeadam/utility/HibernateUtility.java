package com.bilgeadam.utility;
import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.entity.Borrow;
import com.bilgeadam.repository.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {

    private static final SessionFactory SESSION_FACTORY=createSessionFactoryHibernate();

    private static SessionFactory createSessionFactoryHibernate() {

        try {
            Configuration configuration=new Configuration();
            configuration.addAnnotatedClass(Book.class);
            configuration.addAnnotatedClass(Author.class);
            configuration.addAnnotatedClass(Borrow.class);
            configuration.addAnnotatedClass(User.class);
            SessionFactory sessionFactory=configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return  sessionFactory;
        } catch (HibernateException e) {
            e.printStackTrace();
            return  null;
        }
    }

    public  static  SessionFactory getSessionFactory(){
        return  SESSION_FACTORY;

    }

}
