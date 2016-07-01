package maciekSpring;

/**
 * Created by Maciek on 2016-06-27.
 */
public class PStation{
    private static int ID;
    private int power;
    private String name;
    private Alert alert;

    public PStation(){}

    public PStation(String name, Alert alert, int power) {
        this.name = name;
        this.alert = alert;
        this.power = power;
        ID++;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        PStation.ID = ID;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alert getAlert() {
        return alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }


}

