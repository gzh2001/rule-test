package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;


public class Main {

    private static final Pattern MIME_PATTERN = Pattern.compile("^(application|audio|image|message|multipart|text|video)/[a-zA-Z0-9.+-]+$", Pattern.CASE_INSENSITIVE);
    private static final Set<String> MIMETYPES = new HashSet<>(Arrays.asList(
            "audio/aac",
            "application/x-abiword",
            "image/apng",
            "application/x-freearc",
            "image/avif",
            "video/x-msvideo",
            "application/vnd.amazon.ebook",
            "application/octet-stream",
            "image/bmp",
            "application/x-bzip",
            "application/x-bzip2",
            "application/x-cdf",
            "application/x-csh",
            "text/css",
            "text/csv",
            "application/msword",
            "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
            "application/vnd.ms-fontobject",
            "application/epub+zip",
            "application/gzip",
            "image/gif",
            "text/html",
            "image/vnd.microsoft.icon",
            "text/calendar",
            "application/java-archive",
            "image/jpeg",
            "text/javascript",
            "application/json",
            "application/ld+json",
            "audio/midi",
            "audio/x-midi",
            "audio/mpeg",
            "video/mp4",
            "video/mpeg",
            "application/vnd.apple.installer+xml",
            "application/vnd.oasis.opendocument.presentation",
            "application/vnd.oasis.opendocument.spreadsheet",
            "application/vnd.oasis.opendocument.text",
            "audio/ogg",
            "video/ogg",
            "application/ogg",
            "audio/opus",
            "font/otf",
            "image/png",
            "application/pdf",
            "application/x-httpd-php",
            "application/vnd.ms-powerpoint",
            "application/vnd.openxmlformats-officedocument.presentationml.presentation",
            "application/vnd.rar",
            "application/rtf",
            "application/x-sh",
            "image/svg+xml",
            "application/x-tar",
            "image/tiff",
            "video/mp2t",
            "font/ttf",
            "text/plain",
            "application/vnd.visio",
            "audio/wav",
            "audio/webm",
            "video/webm",
            "image/webp",
            "font/woff",
            "font/woff2",
            "application/xhtml+xml",
            "application/vnd.ms-excel",
            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
            "application/xml",
            "application/vnd.mozilla.xul+xml",
            "application/zip",
            "video/3gpp",
            "audio/3gpp",
            "video/3gpp2",
            "audio/3gpp2",
            "application/x-7z-compressed"
    ));


    public static void main(String[] args) {
        String[] strings = {
                "audio/aac",
                "application/x-abiword",
                "image/apng",
                "application/x-freearc",
                "image/avif",
                "IMAGE/AVIF",};
        for (String stringLiteral: strings) {
            if (MIME_PATTERN.matcher(stringLiteral.toLowerCase()).find()) {
                if(MIMETYPES.contains(stringLiteral.toLowerCase().strip())) {
                    System.out.println(stringLiteral+" is MIME.");;
                }
        }

//      return false;
        }
        }
    }
