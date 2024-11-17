public class Ch1Ex13
{
    public static void main(String[] args) 
    {
        double a=3.4;
        double b=50.2;
        double e=44.5;
        double c=2.1;
        double d=0.55;
        double f=5.9;
        double ansr=(a*d)-(b*c);
        if(ansr!=0) 
        {
            double x=((e*d)-(b*f))/ansr;
            double y=((a*f)-(e*c))/ansr;
            System.out.println("The value of x is = "+x);
            System.out.println("The value of y is = "+y);
        } 
        else 
        {
            System.out.println("The equations has no solution");
        }
    }
}
