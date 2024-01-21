/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module12lab;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.ArrayList; 
/**
 *
 * @author chrisf
 */
public class Module12Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        ArrayList<Student> studentList = new ArrayList<>(); 
        try {
        Scanner fileScanner = new Scanner(new File("inputData.txt"));  
        String line;
//        while (fileScanner.hasNext()) {
//            line = fileScanner.nextLine();
//            System.out.println(line);
//        }
        
while (fileScanner.hasNext()) {
            line = fileScanner.nextLine();
            if (line.contains("stu")){
                String[] fields = line.split(","); 
                Student s = new Student(fields[1],fields[2],Integer.parseInt(fields[3]), fields[4], Double.parseDouble(fields[5]), Integer.parseInt(fields[6]));
                studentList.add(s); 
            }
        } 
        Collections.sort(studentList);
        System.out.println("Students sorted by GPA");
        for(Student s : studentList) {
            s.display();
            System.out.println();
        }
        fileScanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Caught FileNotFoundException for inputData.txt. Try again making sure the file name and path are correct");
        }
        
        try {
            FileOutputStream fs = new FileOutputStream("ScholarshipCandidates.txt");
            PrintWriter outFS = new PrintWriter(fs);
            outFS.println("Our top candidates for the scholarship are: ");
            for (Student s : studentList) {
                if (s.getGPA() >= 3.5){
                    outFS.println("Name: " + s.getFirstName() + " " + s.getLastName());
                    outFS.println("GPA: " + s.getGPA());
                    outFS.println("Major: " + s.getMajor());
                    outFS.println();
                }
            }
            outFS.println("Our middle candidates for the scholarship are: ");
            for (Student s : studentList) {
                if (s.getGPA() < 3.5 && s.getGPA() >= 3.2){
                    outFS.println("Name: " + s.getFirstName() + " " + s.getLastName());
                    outFS.println("GPA: " + s.getGPA());
                    outFS.println("Major: " + s.getMajor());
                    outFS.println();
                }
            }
            outFS.println("Our ineligible candidates for the scholarship are: ");
            for (Student s : studentList) {
                if (s.getGPA() < 3.2){
                    outFS.println("Name: " + s.getFirstName() + " " + s.getLastName());
                    outFS.println("GPA: " + s.getGPA());
                    outFS.println("Major: " + s.getMajor());
                    outFS.println();
                }
            }
            outFS.close();
            fs.close();
        } 
        catch ( FileNotFoundException ex) {
            System.out.println("Caught FileNotFoundException for inputData.txt. Try again making sure the file name and path are correct");
        }
        catch (IOException ex) {
            System.out.println("Caught IOException when closing output stream. try again");
        }
    
    }
    

}   
