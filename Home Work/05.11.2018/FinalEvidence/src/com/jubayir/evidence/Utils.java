package com.jubayir.evidence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Utils {

    public static void writeToFile(String filename, List<Student> students) throws Exception {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("we need to create file");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", "
                        + s.getPassword() + ", " + s.getGender() + ", " + s.getHobby()
                        + ", " + s.getRound() + ", " + s.getMsg() + "\n");
                out.close();;
            }

        } catch (Exception e) {
        }
    }
    
    public static void displayForm(String filename, DefaultTableModel model){
    String line;
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) !=null){
            model.addRow(line.split(", "));
            reader.close();
            }
        } catch (Exception e) {
        }
    }
}
