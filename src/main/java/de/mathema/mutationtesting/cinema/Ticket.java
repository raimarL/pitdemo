package de.mathema.mutationtesting.cinema;

/**
 * Created by rai on 24.04.17.
 */
public class Ticket {

    private int price;

    private boolean isFSK18;

    private boolean isOverlong;

    private boolean is3D;

    private boolean isDeluxeSeat;

    private boolean isStorniert;

    public Ticket(int price, boolean isFSK18, boolean isOverlong,
                  boolean is3D, boolean isDeluxeSeat, boolean isStorniert) {
        this.price = price;
        this.isFSK18 = isFSK18;
        this.isOverlong = isOverlong;
        this.is3D = is3D;
        this.isDeluxeSeat = isDeluxeSeat;
        this.isStorniert = isStorniert;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFSK18() {
        return isFSK18;
    }

    public void setFSK18(boolean FSK18) {
        isFSK18 = FSK18;
    }

    public boolean isOverlong() {
        return isOverlong;
    }

    public void setOverlong(boolean overlong) {
        isOverlong = overlong;
    }

    public boolean is3D() { return is3D;}

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean isDeluxeSeat() {
        return isDeluxeSeat;
    }

    public void setDeluxeSeat(boolean deluxeSeat) {
        isDeluxeSeat = deluxeSeat;
    }

    public boolean isStorniert() {
        return isStorniert;
    }

    public void setStorniert(boolean storniert) {
        isStorniert = storniert;
    }
}
