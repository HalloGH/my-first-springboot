import java.util.HashSet;
import java.util.Set;

public class MyTest {
    public static void main(String[] args)
    {
        System.out.println("test1");

        A a = new A();
        A b = a;
        B c = new B();
        A d = new A();
        System.out.println(a.a.equals(c.a));

        System.out.println("test2");

        Set<String> aSet = new HashSet<String>();
        aSet.add(a.a);
        aSet.add(d.a);
        System.out.println(aSet.size());

        System.out.println("test3");
    }

    private static class A
    {
        public String a = "a";
        public String b = "b";
    }

    private static class B
    {
        public String a = "a";
        public String b = "b";
    }
}

