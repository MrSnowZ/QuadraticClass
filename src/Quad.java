// ax2 + bx + c = 0
// a cannot be zero
public class Quad {

    public double a, b, c;
    public double root1, root2;


        public Quad()
        {
            a = 1;
            b = 1;
            c = 1;
        }
        
        public Quad(double a, double b, double c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean onCurve(double x, double y)
        {
            double y2 = (a*(x*x)+b*x+c);


        if(y==y2)
        {
            return true;
        }
        else
        {
            return false;
        }

        }

        public String toString()
    {
        return a + "test";
    }
    public void zeroes()
    {

        // the equation you showed us on the board
        // why does this not work?!?!?!?!?!?!!?
        double discriminant = ( b * b - 4 * a * c);
        {
            if (discriminant > 0) {

                root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
          
                System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
              
            }
            else if (discriminant == 0) {
    
                // two real and equal roots
                // discriminant is equal to 0
                // so -b + 0 == -b
                root1  = -b / (2 * a);
                System.out.format("root1 = root2 = %.2f;", root1);
              
            }
            else 
            {   
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format(" root2 = %.2f-%.2fi\n", real, imaginary);
            }
        }

        
    
    }    //x = (-b ± √(b2-4ac)) / (2a) -> quadratic equation from algebra 1
}
