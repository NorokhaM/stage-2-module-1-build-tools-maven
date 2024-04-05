package com.epam.utils;
import org.apache.commons.lang3.math.NumberUtils;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) && NumberUtils.toDouble(str) > 0;
    }
}
