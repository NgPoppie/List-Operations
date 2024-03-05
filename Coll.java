import java.util.*;
import java.io.*;

class MyCollection {
    public void sum() {
        List<Integer> k = Arrays.asList(5, 71, 56);
        int su = 0;
        for (int x : k) {
            su += x;
        }
        System.out.println(su);

        List<String> reg = new ArrayList<>();
        reg.add("EURJPY");
        reg.add("USDJPY");
        reg.add("Near Resistancee");
        String output = reg.get(0) + reg.get(1) + reg.get(2);
        System.out.println(output);
    }

    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }

    public <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        MyCollection vd = new MyCollection();
        vd.sum();

        // Call map method within a method or constructor
        List<Integer> l = vd.map(Arrays.asList("lambdas ", "in mmotion"), (String s) -> s.length());
        System.out.println(l);
    }
}
