package edu.matc.scraper;

import edu.matc.entity.Holiday;
import edu.matc.util.PropertiesLoader;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

@Data
public class ScrapeDemo implements PropertiesLoader {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private  Properties properties;
    private List<String> nameList = new ArrayList<>();
    private List<Date> dateList = new ArrayList<>();
    private List<Holiday> holidayList = new ArrayList<>();
    public void getNews() throws IOException {
        properties = loadProperties("/log4j2.properties");
        Document doc = Jsoup.connect("https://www.timeanddate.com/holidays/fun/").get();
        logger.debug(doc.title());
        Elements newsHeadlines = doc.select("table[class=\"zebra fw tb-hover\"] tbody tr:not(.tb-sub)");

        SimpleDateFormat formatter = new SimpleDateFormat("MMM d");
        for (Element headline : newsHeadlines) {
            String dateString = headline.getElementsByTag("th").text();
            headline.getElementsByTag("td").first().empty();
            String nameString = headline.getElementsByTag("td").text();
            nameList.add(nameString);
            try {
                Date date = formatter.parse(dateString);
                dateList.add(date);
                Instant instant = date.toInstant();
                LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                Holiday holiday = new Holiday(localDate, nameString);
                holidayList.add(holiday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public void scrapeWiki() throws IOException {
        getNews();
    }
}
