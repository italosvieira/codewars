import java.util.*;

public class Crypto {
    public static String wordPattern(final String word){
        LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<>();
        StringJoiner sb = new StringJoiner(".");

        word.chars().forEach(c -> {
            String s = String.valueOf((char)c).toLowerCase();
            Integer entry = dictionary.get(s);

            if (entry != null) {
                sb.add(String.valueOf(entry));
            } else {
                List<Integer> values = new ArrayList<>(dictionary.values());
                Integer newValue = values.size() > 0 ? values.get(values.size() - 1) + 1 : 0;

                dictionary.put(s, newValue);
                sb.add(String.valueOf(newValue));
            }
        });

        return sb.toString();
    }
}
