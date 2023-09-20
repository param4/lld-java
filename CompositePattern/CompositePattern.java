package CompositePattern;

import CompositePattern.FileSystem.Directory;
import CompositePattern.FileSystem.File;

public class CompositePattern {
    public static void main(String[] args) {
        Directory grandParent = new Directory("Grand Parent");
        
        Directory parent = new Directory("Parent");
        File parentFile = new File("Parent File");
        grandParent.add(parentFile);
        grandParent.add(parent);

        File firstChild = new File("First Child");
        File secondChild = new File("Second Child");
        parent.add(firstChild);
        parent.add(secondChild);

        grandParent.ls();
    }
}
