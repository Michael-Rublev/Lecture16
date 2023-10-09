import java.util.HashMap;
import java.util.Map;

public class Likes {
    /*
     * Key: value
     * likes: 20,
     * laugh: 15,
     * care: 35,
     * heart: 60
     * */
    Map<String, Integer> likes = new HashMap<>();



    public void addLike(String likeType) {
        int counter = likes.getOrDefault(likeType, 0); // выбрали кому присвоить
//        int counter = 0; // old method getOrDefault
//        if (likes.containsKey(likeType)) {
//            counter = likes.get(likeType);
//        }
        counter++; // присвоили значение +1
        likes.put(likeType, counter); // записали и сохранили значение
    }

    public int getTotalLikes() {
        int total = 0;
//        for (Map.Entry<String, Integer> record : likes.entrySet()) {
        for (int count : likes.values()) {
//            total = total + record.getValue();
            total = total + count;
        }
        return total;
    }


    public void printTypes() {
        for (String likeTypes : likes.keySet()) {
            System.out.println(likeTypes);
        }
    }

    public void print() {
        System.out.println(likes);
    }

}
