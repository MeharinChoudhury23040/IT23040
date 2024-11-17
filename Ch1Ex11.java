public class Ch1Ex11
{
    public static void main(String[] args) 
    {
       long p=312032486;
       int tSec=365*24*60*60;
       double birth=tSec/7.0;  
       double death=tSec/13.0;
       double immigrant=tSec/45.0;
       double pchange=birth+immigrant-death;
       for(int i=1;i<=5;i++)
       {
	p=p+(long)pchange;
        System.out.println("Population of year "+i+" is= "+p);
       }
    }
}
