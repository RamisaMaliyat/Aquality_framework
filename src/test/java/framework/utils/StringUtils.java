package framework.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {
    private final String DOUBLE_REGEX = "[^\\d.]";

    public static Double getDoubleFromString(String text) {
        return Double.parseDouble(text.replaceAll(DOUBLE_REGEX, ""));
    }
}
