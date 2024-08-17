package dev.thorben.core;

import dev.thorben.enums.Version;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class UrlParser {

        public static String parseUrl(String version) {
            try {
                JSONParser parser = new JSONParser();
                JSONArray array = (JSONArray) parser.parse(new FileReader("resources/versions.json"));
                for (Object o : array) {
                    JSONObject obj = (JSONObject) o;
                    if (obj.get("version").equals(version)) {
                        return (String) obj.get("url");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print("Version not found, using latest version ... ");
            return Version.LATEST.url;
        }
}
