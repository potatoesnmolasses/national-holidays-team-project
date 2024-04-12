package edu.matc.persistence;


import edu.matc.entity.Holiday;
import edu.matc.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static jakarta.xml.bind.DatatypeConverter.parseInteger;
import static org.junit.jupiter.api.Assertions.*;

class HolidayDaoTest {

    GenericDao<Holiday> holidayDao;
    private final Logger logger = LogManager.getLogger(this.getClass());
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

    @Test
    void getPropertyByMonthAndDay() {
        List<Holiday> holidays = holidayDao.findByMonthAndDay(1,2);
        assertEquals(3, holidays.size());
        assertEquals("Buffet Day", holidays.get(0).getName());
    }

    @Test
    void getPropertyByTodaysDate() {
        // This is the logic I used to get the daily holiday.
        // It's not pretty, but it works.
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String today = formatter.format((new Date()));
        int month = Integer.parseInt(today.substring(0,2));
        int day = Integer.parseInt(today.substring(3,5));
        List<Holiday> holidays = holidayDao.findByMonthAndDay(month, day);

        assertEquals(2, holidays.size());
        assertEquals("Grilled Cheese Day", holidays.get(0).getName());


    }
}
