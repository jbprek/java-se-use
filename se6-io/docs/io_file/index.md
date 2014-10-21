Use of java.io.File class
=========================

1. Separators- provides static final variables returning char and String for:
    * separator of directories in a path
    * separating paths in OS's pathlist
2.  A file object represents an  **abstract pathname** 
    1. Four constructors:
    
    ```    
    
    void File(String pathname);
    
    void File(String parent, String pathname);
    
    void File(File parent, String pathname);
    
    void File(URI uri);
    
    
    ```
    
