package org.example;


public final class ContentTypeConstants {

    // Text Content Types
    public static final String TEXT_PLAIN = "text/plain";
    public static final String TEXT_HTML = "text/html";
    public static final String TEXT_CSS = "text/css";
    public static final String TEXT_JAVASCRIPT = "text/javascript";

    // Image Content Types
    public static final String IMAGE_PNG = "image/png";
    public static final String IMAGE_JPEG = "image/jpeg";
    public static final String IMAGE_GIF = "image/gif";
    public static final String IMAGE_BMP = "image/bmp";
    public static final String IMAGE_SVG_XML = "image/svg+xml";

    // Application Content Types
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION_XML = "application/xml";
    public static final String APPLICATION_PDF = "application/pdf";
    public static final String APPLICATION_ZIP = "application/zip";
    public static final String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

    // Audio Content Types
    public static final String AUDIO_MPEG = "audio/mpeg";
    public static final String AUDIO_OGG = "audio/ogg";
    public static final String AUDIO_WAV = "audio/wav";

    // Video Content Types
    public static final String VIDEO_MP4 = "video/mp4";
    public static final String VIDEO_WEBM = "video/webm";
    public static final String VIDEO_OGG = "video/ogg";

    // Multipart Content Types
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
    public static final String MULTIPART_MIXED = "multipart/mixed";
    public static final String MULTIPART_SPECIAL = "multipart/mixed;encode=utf8";

    private static final String DATE1 = "yyyy/MM/dd";
    private static final String DATE2 = "MM/dd/yyyy";
    private static final String DATE3 = "dd/MM/yyyy";
    private static final String DATE1_1 = "yy/MM/dd hh:mm:ss";
    private static final String DATE2_1 = "MM/dd/yyyy HH:mm:ss";
    private static final String DATE3_1 = "dd/MM/yyyy hh:mm:ss";

    // Private constructor to prevent instantiation
    private ContentTypeConstants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

