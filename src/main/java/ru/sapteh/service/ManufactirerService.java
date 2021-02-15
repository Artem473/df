package ru.sapteh.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.sapteh.Dao.Dao;
import ru.sapteh.model.Manufacturer;

import java.util.List;

public class ManufactirerService implements Dao<Manufacturer, Integer> {
    private final SessionFactory factory;

    public ManufactirerService(SessionFactory factory){
        this.factory = factory;
    }


    @Override
    public Manufacturer read(Integer id) {
        try(Session session = factory.openSession()){
            Manufacturer manufacturer = session.get(Manufacturer.class, id);
            return manufacturer;
        }
    }

    @Override
    public List<Manufacturer> findByAll() {
        try(Session session = factory.openSession()){
            Query<Manufacturer> result = session.createQuery("FROM manufacturer");
            return result.list();
        }
    }

    @Override
    public void create(Manufacturer manufacturer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(manufacturer);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Manufacturer manufacturer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(manufacturer);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Manufacturer manufacturer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(manufacturer);
            session.getTransaction().commit();
        }
    }
}




