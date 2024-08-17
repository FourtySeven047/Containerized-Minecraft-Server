package dev.thorben.enums;

public enum Version {

    LATEST("https://piston-data.mojang.com/v1/objects/59353fb40c36d304f2035d51e7d6e6baa98dc05c/server.jar");

    public final String url;

     Version (String url) {
        this.url = url;
    }
}
