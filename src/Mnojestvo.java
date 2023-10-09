import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mnojestvo {

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4);
        System.out.println(new HashSet<>(ints));

//        List<Integer> ints = List.of(1, 2, 3, 4);
//        Set<Integer> ints = new HashSet<>();
//                ints.add(1);
//                ints.add(2);
//                ints.add(3);
//                ints.add(10);
//                ints.add(15);
//                ints.add(25);
//                ints.add(5);
//                ints.add(4);
//                ints.add(1); //
//        System.out.println(ints);
    }

    static List<Integer> onlyPositiveInteger(List<Integer> list) {
        List<Integer> result = new ArrayList<>(); //дженерики работают с объектными типами, поэтому интеджер а не инт
        for (Integer i : list) { //for loop и итеребл (самый короткий и самый удобный способ перечисления лучше фор (и)
            if (i > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
