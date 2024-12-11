package Source;
public class Ride_Fair_Calculator {

    public double initial_fare = 5;
    public double time;
    public double miles;
    public String ride_type;
    public Ride_Fair_Calculator(int time, int miles, String ride_type)
    {
        this.time = time;
        this.miles = miles;
        this.ride_type = ride_type;
    }

    public double total_fare()
    {
        double sum = initial_fare + (time*0.5);
        if(ride_type=="economy ride")
        {
            sum += (1.75*miles);
        }
        else
        {
            sum += (3*miles);
            sum += (0.2*sum);
            if(time>10)
            {
                sum -= (sum*0.1);
            }
        }
        return sum;

    }

}
