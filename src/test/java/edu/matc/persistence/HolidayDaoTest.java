package edu.matc.persistence;


import edu.matc.entity.Holiday;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
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
        Holiday retrievedHoliday = holidayDao.getById(1);
        assertNotNull(retrievedHoliday);
        assertEquals("Polar Bear Plunge Day", retrievedHoliday.getName());
    }

    @Test
    void update() {
        Holiday holidayToUpdate = holidayDao.getById(1);
        holidayToUpdate.setName("New Holiday");
        holidayDao.update(holidayToUpdate);
        Holiday updatedHoliday = holidayDao.getById(1);
        assertEquals("New Holiday", updatedHoliday.getName());
    }

    @Test
    void delete() {
        holidayDao.delete(holidayDao.getById(1));
        assertNull(holidayDao.getById(1));
    }

    @Test
    void insert() {
        LocalDate holidayDate = LocalDate.of(1970, 4, 15);
        Holiday holidayToInsert = new Holiday(holidayDate,"Your mom");
        int insertedUserId = holidayDao.insertEntity(holidayToInsert);
        assertNotEquals(0, holidayToInsert);
    }

    @Test
    void getAll() {
        List<Holiday> holidayList = holidayDao.getAll();
        assertNotNull(holidayList);
        assertEquals(432, holidayList.size());
    }

    @Test
    void getByPropertyLike() {
        List<Holiday> holidays = holidayDao.getByPropertyLike("name", "Polar");
        assertEquals(2, holidays.size());
    }

    @Test
    void getByPropertyEqual() {
        List<Holiday> holidays = holidayDao.getByPropertyEqual("name", "Polar Bear Plunge Day");
        assertEquals(1, holidays.size());
    }
}
