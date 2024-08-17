package dev.thorben;

import dev.thorben.core.Downloader;
import dev.thorben.core.UrlParser;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument.");
            System.exit(1);
        }
        System.out.print("Trying to pull server version " + args[0] + " ... ");
        Downloader.download(UrlParser.parseUrl(args[0]));
        System.out.print("Server version pulled successfully!");
    }
}