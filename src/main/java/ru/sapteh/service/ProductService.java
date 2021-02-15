package ru.sapteh.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.sapteh.Dao.Dao;
import ru.sapteh.model.Product;

import java.util.List;

public class ProductService implements Dao<Product, Integer> {
    private final SessionFactory factory;

    public ProductService(SessionFactory factory){
        this.factory = factory;
    }


    @Override
    public Product read(Integer id) {
        try(Session session = factory.openSession()){
            Product product = session.get(Product.class, id);
            return product;
        }
    }

    @Override
    public List<Product> findByAll() {
        try(Session session = factory.openSession()){
            Query<Product> result = session.createQuery("FROM product");
            return result.list();
        }
    }

    @Override
    public void create(Product product) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Product product) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Product product) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(product);
            session.getTransaction().commit();
        }
    }
}


