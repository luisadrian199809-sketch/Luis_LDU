/**
 * Refactor Note:
 * This file was automatically refactored to improve readability and structure
 * without changing behavior.
 * Refactor ID: IWDZ4B35
 * Date: 2026-01-27 00:58:45
 */

package lasb.transschool.util;

public class StringUtils {

    private StringUtils() {
        // Utility class
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static String capitalize(String value) {
        if (isNullOrEmpty(value)) return value;
        return value.substring(0,1).toUpperCase() + value.substring(1);
    }
}
