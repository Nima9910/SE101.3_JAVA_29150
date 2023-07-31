
package com.mycompany.exceptionhandlingq03;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingQ03
{

    public static void main(String[] args) 
    {
        try
        {
            
            File file= new File("newfile.txt");
            Scanner scanner=new Scanner(file);
            
            while(scanner.hasNextLine())
            {
                 String line=scanner.nextLine();
                 System.out.println(line);
            }
           
        
            scanner.close();
        }  
          catch(FileNotFoundException e)
          {
               System.out.println("Error file not found"+e);
          }      
    }
}
