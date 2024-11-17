public class Ch1Ex12 
{
    public static void main(String[] args) 
    {
        double dMiles=24.0;
        double MilestoKm=1.6;
        double dkm=dMiles*MilestoKm;
        int hours=1;
        int mins=40;
        int secs=35;
        double tHours=hours+(mins/60.0)+(secs/3600.0);
        double avrgSpeed=dkm/tHours;
        System.out.printf("Average speed in kilometers per hour is = "+avrgSpeed);
    }
}
