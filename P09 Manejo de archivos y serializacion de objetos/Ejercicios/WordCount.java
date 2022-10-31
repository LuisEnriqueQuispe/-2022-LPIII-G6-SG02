package wordcount;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

  
public class WordCount {
    public static void main(String[] args)
        throws IOException
    {
        File file = new File("C:\\Users\\user\\Downloads\\fichero\\contador.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;
  
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
        }
        if (sentenceCount >= 1) {
            paraCount++;
        }
        
        System.out.println("Total de palabras = "+ wordCount);
        System.out.println("Total number de lineas = "+ sentenceCount);
        System.out.println("Total de caracteres = "+ characterCount);
        System.out.println("Total numeros de espacios = "+ whiteSpaceCount);
    }
}


