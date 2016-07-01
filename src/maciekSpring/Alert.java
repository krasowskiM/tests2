package maciekSpring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Alert{
    private static int ID;
    private int powerDrop;
    private String type;
    private String startDate;
    private String finishDate;
    protected Calendar calendar=Calendar.getInstance();

    public Alert(){}

    public Alert(int powerDrop, String startDate, String finishDate) {
        this.powerDrop = powerDrop;
        this.startDate = startDate;
        this.finishDate = finishDate;
        ID++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Alert.ID = ID;
    }

    public int getPowerDrop() {
        return powerDrop;
    }

    public void setPowerDrop(int powerDrop) {
        this.powerDrop = powerDrop;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }


    public Date returnStartDate() throws ParseException{
        //Date startDate = new Date(this.startDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Date sDate = ;
        calendar.setTime(sdf.parse(this.startDate));
        return calendar.getTime();
    }

    public Date returnFinishDate() throws ParseException{
        //Date finishDate = new Date(this.finishDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Date fDate = ;
        calendar.setTime(sdf.parse(this.finishDate));
        return calendar.getTime();
    }
}