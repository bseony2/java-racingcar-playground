package utils;

import java.util.Arrays;
import java.util.List;

public class Splitter {
    private final String splitter;

    public Splitter(String flag) {
        this.splitter = "[" + flag + "]";
    }

    public List<String> split(String s) {
        return Arrays.asList(s.split(splitter));
    }
}
