import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ansi {
    private final String[] codes;
    private final String codesStr;

    public Ansi(String... codes) {
        this.codes = codes;
        StringBuilder sb = new StringBuilder();
        for (String code : codes) {
            sb.append(code);
        }
        this.codesStr = sb.toString();
    }

    public Ansi and(Ansi other) {
        List<String> both = new ArrayList<>();
        Collections.addAll(both, this.codes);
        Collections.addAll(both, other.codes);
        return new Ansi(both.toArray(new String[0]));
    }

    public String colorize(String text) {
        return codesStr + text + AnsiColors.SANE;
    }

    public String format(String template, Object... args) {
        return colorize(String.format(template, args));
    }
}
