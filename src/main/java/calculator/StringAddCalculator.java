package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String s) {
        int result;
        if(s == null || "".equals(s)) {
            return 0;
        }
        String[] arr = s.split("[,:]");
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        if(m.find()) {
            String customDelimiter = m.group(1);
            arr = m.group(2).split("[,:]");
        }

        validateInput(arr);
        result = sumArr(arr);

        return result;
    }

    private static void validateInput(String[] input) {
        if(Arrays.stream(input).mapToInt(Integer::parseInt).anyMatch(val -> val<0)) {
            throw new RuntimeException("음수 들어갔어요~");
        }
    }

    private static int sumArr(String[] arr) {
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}
