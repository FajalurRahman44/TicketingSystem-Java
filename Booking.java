package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String PassName;
    int busno;
    Date date;
    Booking()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        PassName = sc.next();
        System.out.println("Enter your bus number:");
        busno=sc.nextInt();
        System.out.println("Enter the Date(dd-mm-yyyy):");
        String datesamp=sc.next();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=format.parse(datesamp);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public boolean isAvailable(ArrayList<Booking> booking,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
          if(bus.getbusno()==busno){
              capacity = bus.getcap();
          }
        }
        int bookked=0;
        for(Booking boo:booking){
            if(boo.busno==busno&&boo.date.equals(date)){
                bookked++;
            }
        }
        return bookked<capacity ? true:false;
    }
}
