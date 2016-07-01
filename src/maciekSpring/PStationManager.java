package maciekSpring;

import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Maciek on 2016-06-27.
 */
public class PStationManager {
    private int id;
    private String name;
    private static Map<PStation,Alert> pStations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<PStation, Alert> getpStations() {
        return pStations;
    }

    public void setpStations(Map<PStation, Alert> pStations) {
        this.pStations = pStations;
    }

    public static int countInstalledPower(Date queryDate){
        Set<Map.Entry<PStation,Alert>> set=pStations.entrySet();
        Iterator<Map.Entry<PStation,Alert>> itr=set.iterator();
        int sum=0;

        while (itr.hasNext()){
            Map.Entry<PStation,Alert> entry=itr.next();
            PStation ps = entry.getKey();
            Alert al = entry.getValue();
            try {
                if (queryDate.before(al.returnStartDate()) || queryDate.after(al.returnFinishDate())) {
                    sum += ps.getPower();
                }
                else {
                    sum = sum + ps.getPower() - al.getPowerDrop();
                }
            }
            catch (ParseException ex){
                ex.printStackTrace();
            }
        }

        return sum;
    }
}
