package dev.thorben.enums;

import java.util.HashMap;

public enum Version {

    V1_21_1("1.12.2", "1.21.1");

    public final String argument;
    public final String url;

    public static final HashMap<String, String> versionMap = new HashMap<>();

    static {
        for (Version version : Version.values()) {
            versionMap.put(version.argument, version.url);
        }
    }

     Version (String argument, String url) {
        this.argument = argument;
        this.url = url;
    }

    public static boolean isValidVersion(String version) {
         return versionMap.containsKey(version);
    }
}
