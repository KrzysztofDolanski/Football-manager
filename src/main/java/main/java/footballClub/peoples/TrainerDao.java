package main.java.footballClub.peoples;

import main.java.footballClub.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TrainerDao {

    HibernateFactory hibernateFactory = new HibernateFactory();

    public void save(Trainer author){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
    }

    public List<Trainer> getAll(){
        Session session = hibernateFactory.getSessionFactory().openSession();
        List<Trainer> authors = session.createQuery("From Trainer", Trainer.class).list();
        session.close();
        return authors;
    }

    public void update(Trainer author){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
    }

    public Trainer get(int id){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Trainer author = session.get(Trainer.class, id);
        session.close();
        return author;
    }

    public void delete(Trainer trainer){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(trainer);
        transaction.commit();
        session.close();
    }

    public void deletebyId(int id){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Trainer trainer = session.get(Trainer.class, id);
        session.delete(trainer);
        transaction.commit();
        session.close();
    }
}

