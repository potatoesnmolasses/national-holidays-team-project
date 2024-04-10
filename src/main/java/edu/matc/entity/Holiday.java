package edu.matc.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * creates a Holiday for RESTful webservice
 * author @jgruel
 * obtained from https://www.timeanddate.com/holidays/fun/ using jsoup web scraper
 */
@Data
@Entity
@Table(name = "holiday")
public class Holiday {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "name")
    private String name;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d");

    /**
     * creates a holiday with date and name
     *
     * @param date the holiday date
     * @param holidayName the name
     */
    public Holiday(LocalDate date, String holidayName) {
        this.date = date;
        this.name = holidayName;
    }

    /**
     * no arg constructor for Holiday objects
     *
     */
    public Holiday() {

    }

    /**
     * writes Holiday attributes to string
     */
    public String toString() {

        String formattedDate = date.format(formatter);

        return "Holiday(id=" + id + ", date=" + formattedDate + ", name=" + name + ")";
    }
}
