import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Example how a bifunction works
        BiFunction<String, String, Integer> hashFunction = (key, value) -> (int) key.charAt(0) - 'a' + (int )value.charAt(0) - 'a';

        System.out.println(hashFunction.apply("a", "a"));
        System.out.println(hashFunction.apply("a", "b"));
        System.out.println(hashFunction.apply("a", "c"));
    }
}
