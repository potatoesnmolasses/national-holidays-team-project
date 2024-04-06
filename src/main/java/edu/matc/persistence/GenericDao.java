package edu.matc.persistence;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Expression;
<<<<<<< HEAD
=======
import jakarta.persistence.criteria.Predicate;
>>>>>>> main
import jakarta.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import java.time.LocalDate;
import java.util.List;

public class GenericDao<T> {
    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * instantiates a new Generic dao
     *
     * @param type the entity type (e.g. user)
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    /**
     * Returns an open session from the SessionFactory
     *
     * @return session
     */
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    /**
     * Get entity by id
     *
     * @param id the id to search by
     * @return an entity
     */
    public <T> T getById(int id) {
        Session session = getSession();
        T entity = (T) session.get(type, id);
        session.close();
        logger.debug("The entity found by id: " + entity);
        return entity;
    }

    /**
     * update entity
     *
     * @param entity entity to be updated
     */
    public void update(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.merge(entity);
        transaction.commit();
        session.close();
    }

    public int insertEntity(T entity) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (Integer) session.save(entity);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete an entity
     *
     * @param entity entity to be deleted
     */
    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.remove(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Return a list of all entities
     *
     * @return all the entities
     */
    public List<T> getAll() {

        Session session = getSession();

        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        List<T> list = session.createSelectionQuery(query).getResultList();

        logger.debug("The list: " + list);
        session.close();

        return list;
    }

    /**
     * Finds entities by one of its properties.
<<<<<<< HEAD
     *
     * @param propertyName the property name.
     * @param value        the value by which to find.
     * @return the list of all entities found matching the criteria
     */
    public List<T> getByPropertyEqual(String propertyName, Object value) {
=======
     * @param propertyName the property name.
     * @param value the value by which to find.
     * @return the list of all entities found matching the criteria
     */
    public List<T> findByPropertyEqual(String propertyName, Object value) {
>>>>>>> main
        Session session = getSession();
        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
<<<<<<< HEAD
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<T> items = session.createSelectionQuery(query).getResultList();
=======
        query.select(root).where(builder.equal(root.get(propertyName),value));
        List<T> items = session.createSelectionQuery( query ).getResultList();
>>>>>>> main
        session.close();
        return items;
    }

    /**
     * Get user by property (like)
     * sample usage: getByPropertyLike("lastname", "C")
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();

<<<<<<< HEAD
        logger.debug("Searching for holiday with {} = {}", propertyName, value);
=======
        logger.debug("Searching for holiday with {} = {}",  propertyName, value);
>>>>>>> main

        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

<<<<<<< HEAD
=======
        List<T> items = session.createQuery( query ).getResultList();
        session.close();
        return items;
    }
    //TODO units test this method
    public List<T> findByMonthAndDay(int month, int day) {
        Session session = getSession();
        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<LocalDate> dateExpression = root.get("date");
        Predicate monthPredicate = builder.equal(builder.function("month", Integer.class, dateExpression), month);
        Predicate dayPredicate = builder.equal(builder.function("day", Integer.class, dateExpression), day);
        query.select(root).where(builder.and(monthPredicate, dayPredicate));
>>>>>>> main
        List<T> items = session.createQuery(query).getResultList();
        session.close();
        return items;
    }
}
