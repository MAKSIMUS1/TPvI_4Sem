public class Car extends Thread {
    private boolean reading = false;
    private ParkingPool<ParkingSpace> poolFirst;
    private ParkingPool<ParkingSpace> poolSecond;

    public Car(ParkingPool<ParkingSpace> poolFirst, ParkingPool<ParkingSpace> poolSecond) {
        this.poolFirst = poolFirst;
        this.poolSecond = poolSecond;
    }
    public void run() {
        FirstParkovka();
    }
    private void FirstParkovka(){
        ParkingSpace connect = null;
        try {
            connect = poolFirst.getResource(1400); // изменить на 100
            reading = true;
            System.out.println("Автомобиль #" + this.getId()
                    + " занял место #" + connect.getConnectID() + " на I парковке");
            connect.using();
        } catch (Exception e) {
            System.out.println("Автомобиль #" + this.getId() +
                    " отказано в месте на I парковке ->"
                    + e.getMessage());
            SecondParkovka();
        } finally {
            if (connect != null) {
                reading = false;
                System.out.println("Автомобиль #" + this.getId() + " : уехал с I парковки c места #"
                        + connect.getConnectID());
                poolFirst.returnResource(connect);
            }
        }
    }

    private void SecondParkovka(){
        ParkingSpace connect = null;
        try {
            connect = poolSecond.getResource(100); // изменить на 100
            reading = true;
            System.out.println("Автомобиль #" + this.getId()
                    + " занял место #" + connect.getConnectID() + " на II парковке");
            connect.using();
        } catch (Exception e) {
            System.out.println("Автомобиль #" + this.getId() +
                    " отказано в месте на II парковке->"
                    + e.getMessage());
            FirstParkovka();
        } finally {
            if (connect != null) {
                reading = false;
                System.out.println("Автомобиль #" + this.getId() + " : уехал с II парковки c места #"
                        + connect.getConnectID());
                poolSecond.returnResource(connect);
            }
        }
    }

    public boolean isReading() {
        return reading;
    }
}
