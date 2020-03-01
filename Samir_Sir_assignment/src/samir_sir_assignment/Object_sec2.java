package samir_sir_assignment;

public class Object_sec2 {
    public Object_sec2(int initial_v, int final_v, int time)
    {
        int diff = final_v - initial_v;
        
        System.out.println("Acceleration is: " + diff/time);
    }
}
