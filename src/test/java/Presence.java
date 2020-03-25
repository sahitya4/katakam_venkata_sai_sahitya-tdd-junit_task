import static org.junit.jupiter.api.Assertions.assertEquals;

public class Presence
{


    /*
       TODO list
       1.presence of A in first place : "ABCD"--"BCD".
       2.presence of A in second place : "BACD"--"BCD".
       3.presence of A in first  TWO place : "AACD"--"CD".
       4.No presence of A in first two places :"BBCD:--"BBCD".
     */

    Presence Presence;
    public void setup()
    {
        Presence = new Presence();
    }

    public void presenceofAin0indexonly()
    {
        assertEquals("BCD",Presence.finding("ABCD"));
    }
    public void presenceofAin1indexonly()
    {
        assertEquals("BCD",Presence.finding("BACD"));
    }
    public void presenceofAin0_1indexes()
    {
        assertEquals("CD",Presence.finding("AACD"));
    }
    public void nopresenceofAin0_1()
    {
        assertEquals("BBCD",Presence.finding("BBCD"));
    }
}
