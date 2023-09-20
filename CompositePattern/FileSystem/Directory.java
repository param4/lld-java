package CompositePattern.FileSystem;

import java.util.*;

public class Directory implements FileSystem {
    private String directoryName;
    List<FileSystem> fileSystemList = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystemObj) {
        this.fileSystemList.add(fileSystemObj);
    }

    public void ls() {
        System.out.println("Directory Name: " + this.directoryName);

        for (FileSystem fileSystemObj:fileSystemList) {
            fileSystemObj.ls();
        }
    }
}
