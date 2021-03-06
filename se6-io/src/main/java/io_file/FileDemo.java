package io_file;

import java.io.File;
import java.io.IOException;

import static java.lang.System.out;

/**
 * java.io.File usage
 */
public class FileDemo {

    public static void main(String[] args) {
        out.print("File.separatorChar->");
        out.println(File.separatorChar);
        out.print("File.pathSeparatorChar->");
        out.println(File.pathSeparatorChar);
        separatorDemo();
    }

    /**
     * Use of File
     */
    public static void separatorDemo() {
        out.print("File.separatorChar->");
        out.println(File.separatorChar);
        out.print("File.pathSeparatorChar->");
        out.println(File.pathSeparatorChar);
    }

    /**
     * TIP get reference to current working dir
     */
    public static File getCurrentWorkingDirectory() {
        File currDir = new File(System.getProperty("user.dir"));
        // Another form could be with the added cost of  IOException handling
        // currDir = new File(".").getCanonicalFile();
        return currDir;
    }

    /**
     * TIP Create temporary dir, temporary file. mark it for deletion on program exit
     */
    public static File createRuntimeTemporary(String fname, String... dirPath) {
        return null;
    }

    /**
     * Demonstrated queries on a file object
     *
     * @param File f
     * @return
     */
    public static String showFileInfo(File f) throws IOException {


        StringBuilder bui = new StringBuilder();


        bui.append("Name :").append(f.getName()).append("\n")
                .append("Path :").append(f.getPath()).append("\n")
                .append("Absolute Path :").append(f.getAbsolutePath()).append("\n")
                .append("Canonical Path :").append(f.getCanonicalPath()).append("\n")


        ;
        return bui.toString();

    }
}
