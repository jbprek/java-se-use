package io_file;

import java.io.File;
import java.io.IOException;

/**
 * Created by jvp on 10/5/14.
 */
public class FileTestDrive {
    public static void main(String[] args) throws IOException {
        /* Separators */
        System.out.println("File.separator:\"" + File.separator + "\" File.pathSeparator:\"" + File.pathSeparator + "\"");
        String sep = File.separator;
        /* File System Query */
        /* TIP Get a reference to current dir */
        File currDir = new File(System.getProperty("user.dir"));
        File f = currDir;
        printFSQueryFull(f, "current dir System property user.dir");
        File a = currDir.getAbsoluteFile();
        printFSQueryFull(a, "current dir System property user.dir.getAbsolute()");
        File c = currDir.getCanonicalFile();
        printFSQueryFull(c, "current dir System property user.dir");
        /* TIP 2 avoid reference to ./  */
        currDir = new File(".");
        f = currDir;
        printFSQueryFull(f, "current dir System property user.dir");
        a = currDir.getAbsoluteFile();
        printFSQueryFull(a, "current dir System property user.dir.getAbsolute()");
        c = currDir.getCanonicalFile();
        printFSQueryFull(c, "current dir System property user.dir.getCanonicalFile()");


        // Create a directory
        File tmpDir = new File("tmp");
//        tmpDir.cr


    }

    /**
     * Demonstrates File's fs  query methods
     * @param f
     * @throws java.io.IOException
     */
    public static void printFSQueryFull(File f, String tag) throws IOException {
        System.out.println("######### "+tag+" #########");
        System.out.println("Name :"+f.getName()+" Path "+f.getPath()+"\nAbsolute Path:"+f.getAbsolutePath()+ "\nCanonical Path:"+f.getCanonicalPath()+ "\nParent dir "+f.getParent() +"\nIs Absolute:"+f.isAbsolute());
    }
}
