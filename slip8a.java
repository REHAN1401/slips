import java.io.File;
import java.util.Arrays;
public class slip8a{
    public static void main(String []args)
    {
        String directoryPath="C:/Users/sayye/OneDrive/Desktop/java";
        File directory= new File(directoryPath);
        if(directory.exists() && directory.isDirectory())
        {
            File[] files= directory.listFiles();
            for (File file:files)
            {
                if(file.isFile() && file.getName().toLowerCase().endsWith(".txt"))
                {
                    System.out.println(file.getName());
                }
            }
        }
    else{
        System.out.println("directory not found");
    }
}
}

