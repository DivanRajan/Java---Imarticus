package Assessment_2;

class MethodOverload
{
    void area(float a)
    {
        System.out.println("THE AREA OF THE SQUARE IS"+Math.pow(a, 2)+" sq units");
    }
    void area(float a, float b)
    {
        System.out.println("THE AREA OF THE RECTANGLE IS "+a*b+" sq units");
    }
    void area(double a)
    {
        double c = 3.14 * a * a;
        System.out.println("THE AREA OF THE CIRCLE IS "+c+" sq units");
    }
}
class Method_Overloading_8 
{
     public static void main(String args[]) 
	{
	   MethodOverload s = new MethodOverload();
	   s.area(5);
	   s.area(11,12);
	   s.area(2.5);
        }
}