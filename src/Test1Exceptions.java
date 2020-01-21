import java.util.HashMap;
import java.util.Map;

public class Test1Exceptions {


    public static void main(String[] args) {



        int a = 10;
        try {
            System.out.println(a / 0); // CTRL+ ALT+ T
        }
        catch (ArithmeticException e) {
            System.out.println("The exception was catched: " + e);
        }
        catch (Exception e){
            System.out.println("Some another exception:" + e);
        }
        finally {
            System.out.println("This block will de executed always in any way");
        }


        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(101, "Ivan");
        hm.put(102, "John");
        System.out.println(hm);

        for (Map.Entry h: hm.entrySet()){
            System.out.println(h.getKey() + " " + h.getValue());
        }


    }
}
