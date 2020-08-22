import java.util.Arrays;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) Arrays.stream(text.split(""))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .values().stream().filter(v -> v > 1).count();
    }
}
