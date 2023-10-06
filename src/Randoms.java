import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    public static class RandomsIterator implements Iterator<Integer> {
        Random r = new Random();

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return r.nextInt();
        }
    }
}
