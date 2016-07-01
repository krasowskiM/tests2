package maciekSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Maciek on 2016-06-27.
 */
public class Test {

    public static void main(String[] args) throws ParseException{
        Resource res = new ClassPathResource("maciekSpring/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Calendar calendar = Calendar.getInstance();


        PStationManager manager = (PStationManager)factory.getBean("powerStationManager");
        System.out.println("Witaj w systemie informacji energetycznej. Podaj datę pomiaru mocy: (DD/MM/RRRR)");
        Scanner in = new Scanner(System.in);
        String qDate = in.nextLine();
        Date date = sdf.parse(qDate);
        //calendar.setTime(date);
        //calendar.getTime())
        System.out.println("Dzisiejsza moc zainstalowana to: "+manager.countInstalledPower(date));

    }
}
