module org.ningopensource.OfflineReader {
    requires transitive javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.web;
    requires transitive javafx.media;
    requires transitive javafx.swing;
    requires transitive javafx.graphics;
    requires transitive kotlin.stdlib;
//    requires transitive kotlin.reflect;
//    requires transitive io.netty.all;
//    requires transitive tornadofx;
//    requires tornadofx;
    opens org.ningopensource.OfflineReader;
    exports org.ningopensource.OfflineReader;
}