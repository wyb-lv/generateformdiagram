
import java.util.*;

/**
 * 
 */
public class Flight {

    /**
     * Default constructor
     */
    public Flight() {
    }

    /**
     * 
     */
    protected ArrayList<Flight> FL FL;

    /**
     * 
     */
    protected String ID;

    /**
     * 
     */
    protected String LocateStart;

    /**
     * 
     */
    protected String LocateEnd;

    /**
     * 
     */
    protected String Status;

    /**
     * 
     */
    protected String Airline_Name;

    /**
     * 
     */
    protected LocalDateTime datetimeStart;

    /**
     * 
     */
    protected LocalDateTime datetimeEnd;

    /**
     * 
     */
    protected int Chairs = 0;

    /**
     * 
     */
    public String FILE_PATH = "Flight.csv" {final};

    /**
     * 
     */
    public void dt_format: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy") {final};

    /**
     * @param ...
     */
    public void Flight(void ...) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getID() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getLocateStart() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getLocateEnd() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getStatus() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getAirline_Name() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public LocalDateTime getDatetimeStart() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public LocalDateTime getDatetimeEnd() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getChairs() {
        // TODO implement here
        return 0;
    }

}