public class quadraticTester {
    
    public static void main(String[] args) throws Exception
    {
        //code 
        Quad q1 = new Quad();
        Quad q2 = new Quad(1,1,1);
        Quad q3 = new Quad(2,2,2);
        System.out.println(q1.onCurve(1,1));
        q1.zeroes();
        q2.zeroes();
        q3.zeroes();
        System.out.println(q1);
    }
}
