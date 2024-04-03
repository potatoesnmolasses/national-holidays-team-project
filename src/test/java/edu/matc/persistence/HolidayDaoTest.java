package edu.matc.persistence;


import edu.matc.entity.Holiday;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HolidayDaoTest {

    GenericDao<Holiday> holidayDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleanDB.sql");
        holidayDao = new GenericDao<>(Holiday.class);
    }

    @Test
    void getById() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void insert() {
    }

    @Test
    void getAll() {
        List<Holiday> holidayList = holidayDao.getAll();
        assertNotNull(holidayList);
        assertEquals(432, holidayList.size());
    }
}
