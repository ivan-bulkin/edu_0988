public class Room {
    private boolean wc;
    private int sleepingPlace;
    private boolean conditioner;
    private boolean wifi;
    private int roomNumber;
    private boolean reserved;

    public Room() {
    }

    public Room(boolean wc, int sleepingPlace, boolean conditioner, boolean wifi,int roomNumber) {
        this.wc = wc;
        this.sleepingPlace = sleepingPlace;
        this.conditioner = conditioner;
        this.wifi = wifi;
        this.roomNumber = roomNumber;
        this.reserved = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isWc() {
        return wc;
    }

    public void setWc(boolean wc) {
        this.wc = wc;
    }

    public int getSleepingPlace() {
        return sleepingPlace;
    }

    public void setSleepingPlace(int sleepingPlace) {
        this.sleepingPlace = sleepingPlace;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
