package com.chwyatt.commonlib.logger;

import java.util.IllegalFormatException;
import java.util.Locale;

public class Log {

    public static final String TAG = "CommonLibLog";
    private static final boolean FORCE_LOGGING = true; // Stop shipping if true

    public static boolean DEBUG = isLoggable(android.util.Log.DEBUG);
    public static boolean INFO = isLoggable(android.util.Log.INFO);
    public static boolean VERBOSE = isLoggable(android.util.Log.VERBOSE);
    public static boolean WARN = isLoggable(android.util.Log.WARN);
    public static boolean ERROR = isLoggable(android.util.Log.ERROR);

    // Debug for lifecycle components such as Activity or Fragment
    public static boolean DEBUG4LIFECYCLE = true; // Stop shipping if true

    public static void d(String prefix, String format, Object... args) {
        if (DEBUG) {
            android.util.Log.d(TAG, buildMessage(prefix, format, args));
        }
    }

    public static void d(Object objectPrefix, String format, Object... args) {
        if (DEBUG) {
            android.util.Log.d(TAG, buildMessage(getPrefixFromObject(objectPrefix), format, args));
        }
    }

    public static void d4lifecycle(Object objectPrefix, String format, Object... args) {
        if (DEBUG4LIFECYCLE) {
            android.util.Log.d(TAG, /*objectPrefix +*/ buildMessage(getPrefixFromObject(objectPrefix), format, args));
        }
    }

    public static void i(String prefix, String format, Object... args) {
        if (INFO) {
            android.util.Log.i(TAG, buildMessage(prefix, format, args));
        }
    }

    public static void i(Object objectPrefix, String format, Object... args) {
        if (INFO) {
            android.util.Log.i(TAG, buildMessage(getPrefixFromObject(objectPrefix), format, args));
        }
    }

    public static void e(String prefix, Throwable tr, String format, Object... args) {
        if (ERROR) {
            android.util.Log.e(TAG, buildMessage(prefix, format, args), tr);
        }
    }

    public static void e(Object objectPrefix, Throwable tr, String format, Object... args) {
        if (ERROR) {
            android.util.Log.e(TAG, buildMessage(getPrefixFromObject(objectPrefix), format, args),
                    tr);
        }
    }

    private static String buildMessage(String prefix, String format, Object... args) {
        String msg;
        try {
            msg = (args == null || args.length == 0) ? format
                    : String.format(Locale.US, format, args);
        } catch (IllegalFormatException ife) {
            e(TAG, ife, "Log: IllegalFormatException: formatString='%s' numArgs=%d", format,
                    args.length);
            msg = format + " (An error occurred while formatting the message.)";
        }
        return String.format(Locale.US, "%s: %s", prefix, msg);
    }

    private static String getPrefixFromObject(Object obj) {
        return obj == null ? "<null>" : obj.getClass().getSimpleName();
    }

    public static boolean isLoggable(int level) {
        return FORCE_LOGGING || android.util.Log.isLoggable(TAG, level);
    }
}
