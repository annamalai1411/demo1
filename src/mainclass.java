import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class mainclass {
    public static void main(String[] args) {
       employee e = new employee("annamalai");
        employee e1 = new employee("annamalai2");
        ArrayList<employee> a = new ArrayList<>();
        a.add(e);
        a.add(e1);
        a.stream().filter(p -> p.getemployee().contains("2")).forEach(p -> System.out.println(p.getemployee()));
//        System.out.println(a1);
//        System.out.println(a.size());
//        String s1 = e.getemployee();
//        String s2 = e1.getemployee();
//        System.out.println(s1);
//        System.out.println(s2);

//        a.add(0,"anna");
//        a.add(1,"sam");
//        a.add(2,"bala");
//    a.stream().forEach(System.out::println);
// System.out.println(e.getemployee());System.out.println(e1.getemployee());
       // a.addAll((Collection<? extends String>) e);

    }

}
