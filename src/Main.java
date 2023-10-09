import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Likes likes = new Likes();
        likes.print();
        likes.addLike("heart");
        likes.print();
        likes.addLike("heart");
        likes.print();
        likes.addLike("care");
        likes.print();

        System.out.println(likes.getTotalLikes());
        likes.printTypes();
    }
}