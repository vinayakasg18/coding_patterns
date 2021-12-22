package leet_code;
import java.util.*;

class Logger {
    
    Map<String, Integer> map;

    public Logger() {
        map = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)){
            map.put(message, timestamp + 10);
            return true;
        }
        if (timestamp >= map.get(message)){
            map.put(message, timestamp + 10);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Logger log = new Logger();

        log.shouldPrintMessage(1, "foo");
        log.shouldPrintMessage(2, "foo");
        log.shouldPrintMessage(3, "bar");
        log.shouldPrintMessage(11, "foo");
    }
}
