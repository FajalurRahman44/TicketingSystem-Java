package BusReservation;
import java.util.*;
public class BusDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> Buses = new ArrayList<Bus>();
        ArrayList<Booking> Bookings = new ArrayList<Booking>();
        Buses.add(new Bus(1,true,2));
        Buses.add(new Bus(2,false,23));
        Buses.add(new Bus(3,true,20));
        for(Bus b:Buses){
            b.displayBusInfo();
        }
        int userOpt;
        do{
            System.out.println("Enter 1 to Book and 2 to Exit");
             userOpt=sc.nextInt();
            if(userOpt==1){
            Booking booking = new Booking();
            if(booking.isAvailable(Bookings,Buses
                    )){
                Bookings.add(booking);
                System.out.println(
                       "Your booking Confirmed"
                );
            }
            else{
                System.out.println("Ticket Unavailable due to previous bookings on the date&bus that you mentioned");
            }
            }
        }while(userOpt==1);
    }
}
