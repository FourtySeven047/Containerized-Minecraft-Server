package dev.thorben;

import dev.thorben.enums.Version;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument.");
            System.exit(1);
        }
        if (Version.isValidVersion(args[0])) {
            String url = Version.valueOf(args[0]).url;
        }
    }
}