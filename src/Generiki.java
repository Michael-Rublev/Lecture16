import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Generiki {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 45, 6, -9, -222); // изменяемый иютбл коллекшен
        System.out.println(onlyPositiveInteger(ints));
        System.out.println(ints.get(4));

        ints.sort(Comparator.naturalOrder());
        System.out.println(ints);

        List<String> stringss = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "   ");
        stringss.sort(Comparator.naturalOrder()); // компарабл - сравнивает с типом того же типа,
        // если он определяет кампорабл, то мы можем его сортировать
        System.out.println(stringss);


        List<Yokozuna> wrestlers = Arrays.asList(
                new Yokozuna("Takonaha", 200),
                new Yokozuna("Anunsasimary", 190),
                new Yokozuna("Gurmanaka", 250),
                new Yokozuna("Brabaris", 179)
        );

        wrestlers.sort(Comparator.naturalOrder());
        System.out.println(wrestlers);

        wrestlers.sort(Comparator.reverseOrder());
        System.out.println(wrestlers);
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
