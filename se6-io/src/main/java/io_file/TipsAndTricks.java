package io_file;

import java.io.File;

/**
 * Created by jvp on 10/17/14.
 */
public class TipsAndTricks {

    /**
     * File tip -  get reference to current working dir
     */
    public static File getCurrentWorkingDirectory() {
        File currDir = new File(System.getProperty("user.dir"));
        // Another form could be with the added cost of  IOException handling
        // currDir = new File(".").getCanonicalFile();
        return currDir;
    }


    /**
     * Tip load a resource
     */


    /**
     * Copy a file into a byte array
     */


    /**
     * Copy a text file into a string
     */
}
