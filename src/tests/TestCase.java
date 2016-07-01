package tests;

import static org.junit.Assert.*;
import maciekSpring.PStationManager;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Maciek on 2016-07-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/maciekSpring/applicationContext.xml")
public class TestCase {

    public Date parseDate(String qDate)throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(qDate);
            return date;
    }

    @Test
    public void testCountInstalledPower()throws ParseException{
        assertEquals(300, PStationManager.countInstalledPower(parseDate("21/01/2016")));
        assertEquals(240, PStationManager.countInstalledPower(parseDate("27/05/2016")));
        assertEquals(250, PStationManager.countInstalledPower(parseDate("27/06/2016")));
    }
}
