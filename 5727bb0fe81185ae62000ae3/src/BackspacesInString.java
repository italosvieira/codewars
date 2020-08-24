import java.util.Arrays;

public class BackspacesInString {
    public String cleanString(String s) {
        return new StringBuilder(Arrays.stream(new StringBuilder(s.substring(0, s.lastIndexOf('#') + 1)).reverse().toString().split(""))
                .reduce("", (a, b) -> {
                    if (a.contains("#") && !"#".equals(b)) {
                        return a.replaceFirst("#", "");
                    }

                    return a + b;
                }).replaceAll("#", "")).reverse() + s.substring(s.lastIndexOf('#') + 1);
    }
}
