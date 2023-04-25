import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String word ="sffsd dsfsdf sfsdf  dfsdf";
        word = Arrays.toString(word.split("\\s"));
        System.out.println(word);
    }
}
