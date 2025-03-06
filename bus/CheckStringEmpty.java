package bus;

public class CheckStringEmpty  extends IllegalArgumentException {
    public CheckStringEmpty(String message) {
        super(message);
    }
    public CheckStringEmpty(String BookingTime, String TravelDate, String ReturnDate) throws CheckStringEmpty{
        if(BookingTime.isEmpty() || TravelDate.isEmpty() || ReturnDate.isEmpty()){
            throw new CheckStringEmpty("Booking Time, Travel Date and Return Date cannot be empty");
        }
    }
    public CheckStringEmpty(String[] inpuStrings) {
        for(String str: inpuStrings){
            if(str.isEmpty()){
                throw new CheckStringEmpty("Booking Time, Travel Date and Return Date cannot be empty");
            }
        }
    }

}
