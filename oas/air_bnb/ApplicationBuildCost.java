package oas.air_bnb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationBuildCost {
    public static List<String> appBuildCost(List<String> apps) {
        Map<String, Integer> map = new HashMap<>();
        for (String app : apps) {
            String[] builds = app.split("");
            int i = 1;
            String parent = builds[0];
            if (!map.containsKey(parent)) {
                map.put(parent, 1);
            }
            while (i < builds.length) {
                if(map.containsKey(builds[i])){
                    map.put(builds[i], map.get(builds[i]) + 1);
                }
                else{
                    map.put(builds[i], map.get(parent) + 1);
                }
                i++;
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getKey() + "," + entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> apps = new ArrayList<>();
        apps.add("AENS");
        apps.add("SHN");
        apps.add("EN");
        apps.add("H");
        apps.add("N");
        System.out.println(appBuildCost(apps).toString());
    }
}
