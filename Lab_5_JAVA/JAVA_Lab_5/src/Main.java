import java.util.LinkedList;
import java.util.concurrent.Semaphore;

class Client extends Thread
{
    Semaphore sem;
    int id;
    Client(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }

    public void run()
    {
        try {
            sem.acquire();
            System.out.println("Клиент " + id + " разговаривает");
            sleep(750);
            System.out.println("Клиент " + id + " перестает разговаривать");
            sem.release();
        }
        catch(InterruptedException e)
        {
            System.out.println ("У клиента" + id + " проблемы");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ///1

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Client(sem,i).start();
        ///2
        LinkedList<ParkingSpace> list = new LinkedList<ParkingSpace>() {
            {
                this.add(new ParkingSpace(1));
                this.add(new ParkingSpace(2));
                this.add(new ParkingSpace(3));
            }
        };
        LinkedList<ParkingSpace> list2 = new LinkedList<ParkingSpace>() {
            {
                this.add(new ParkingSpace(1));
                this.add(new ParkingSpace(2));
                this.add(new ParkingSpace(3));
            }
        };
        ParkingPool<ParkingSpace> pool = new ParkingPool<>(list);
        ParkingPool<ParkingSpace> pool2 = new ParkingPool<>(list2);
        for (int i = 0; i < 10; i++) {
            new Car(pool, pool2).start();
        }
    }
}