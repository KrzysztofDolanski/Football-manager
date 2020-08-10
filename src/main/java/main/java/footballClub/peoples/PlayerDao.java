package main.java.footballClub.peoples;

import main.java.footballClub.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.Set;

public class PlayerDao {


    HibernateFactory hibernateFactory = new HibernateFactory();

    public void save(Player player){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(player);
        transaction.commit();
        session.close();
    }

    public Set<Player> getAll(){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Set<Player> players = (Set<Player>) session.createQuery("From Player", Player.class).list();
        session.close();
        return players;
    }

    public void update(Player player){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(player);
        transaction.commit();
        session.close();
    }

    public Player get(int id){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Player author = session.get(Player.class, id);
        session.close();
        return author;
    }

    public void delete(Player player){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(player);
        transaction.commit();
        session.close();
    }

    public void deletebyId(int id){
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Player player = session.get(Player.class, id);
        session.delete(player);
        transaction.commit();
        session.close();
    }
}
