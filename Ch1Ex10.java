public class Ch1Ex10
{
    public static void main(String[] args) 
    {
       double dkm=14.0;
       double kmtoMiles=(1.0/1.6);
       double dMiles=dkm*kmtoMiles;  
       double tMin=45.0;
       double tSec=30.0;
       double tHour=(tMin+(tSec/60.0))/60.0;
       double avrgSpeed=dMiles/tHour;
       System.out.println("Average speed in Miles per Hour is= "+avrgSpeed);
    }
}
