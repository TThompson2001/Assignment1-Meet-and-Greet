import javafx.stage.FileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.*;
public class PersonReader {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            // JFile code
            JFileChooser chooser = new JFileChooser("classmates.csv");

            int returnValue = chooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = chooser.getSelectedFile();

                BufferedReader objReader = new BufferedReader(new FileReader(selectedFile));
                String line;


                boolean first = true;
                // run and print
                while ((line = objReader.readLine()) != null) {
                    String[] info = line.split(",");
                    int numofitems = info.length;
                    for (int i = 0; i < numofitems; i++) {
                        String column = info[i];
                        if (first) {
                            System.out.printf("%-20s", column.toUpperCase());
                        } else {
                            System.out.printf("%-20s", column);
                        }
                    }
                    System.out.println("  ");
                    first = false;
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
