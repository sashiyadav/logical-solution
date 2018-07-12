import java.util.Enumeration;
import java.util.Vector;


public class VectorExample {
    public static void main(String[] args)
    {
        Vector<Integer> vec=new Vector();
        vec.add(1);
        vec.add(23);
        vec.add(46);
        vec.add(81);
        vec.add(89);
        vec.add(52);
        Enumeration e=vec.elements();
        while(e.hasMoreElements())
        {
            int temp=(Integer)e.nextElement();
            if(temp%2==0)
            {
                System.out.println(temp);
            }
        }
    }
}
