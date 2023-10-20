import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryStreamFilter {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String chosenClass = sc.nextLine();
        DirectoryStream.Filter<Path> filter = file -> file.toString().equals(chosenClass);

        String chosenPath = sc.nextLine();
        var dirName = Paths.get(chosenPath);

        var paths = Files.newDirectoryStream(dirName, filter);

        paths.forEach(path -> {
            if(path.toString().equals(chosenClass))
            {
                System.out.println("The class " + chosenClass + " exists in the path " + chosenPath);
            }
        });
    }
}