import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
class Array
{
  public static List<String> readFileInList(String fileName)
  {
    List<String> lines = Collections.emptyList();
    try
    {
		lines =
    	Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
    }
  
    catch (IOException e)
    {
  
      // do something
      e.printStackTrace();
    }
    return lines;
  }
}