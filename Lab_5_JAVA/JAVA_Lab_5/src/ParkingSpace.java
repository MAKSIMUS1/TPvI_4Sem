import java.util.Random;

public class ParkingSpace {
    private int connectID;

    public ParkingSpace(int id) {
        super();
        this.connectID = id;
    }

    public int getConnectID() {
        return connectID;
    }

    public void setConnectID(int id) {
        this.connectID = id;
    }

    public void using() {
        try {
// использование соединения
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
