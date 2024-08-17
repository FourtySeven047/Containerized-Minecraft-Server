package dev.thorben.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class Downloader {

    public static void download (String urlString) {
        try {
            URL url = new URL(urlString);
            ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("server.jar");
            FileChannel fileChannel = fileOutputStream.getChannel();
            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);
        }
    }
}
