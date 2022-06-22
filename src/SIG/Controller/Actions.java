/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIG.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author ProBook G7
 */
public class Actions extends JFrame implements ActionListener {

    private JTextArea ta;

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Save file":
                Save();
                break;

            case "Load file": {
                Load();
            }
            break;

            case "Create New Voice":
                createInvoiceBtn(e);
                break;

//            case "Delete Invoice":
//              DeleteButton();
//                break;
            case "Save":
                SaveButton();
                break;

            case "Cancel":
                CancelButton();
                break;
        }
    }

    private void Load() {

        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                ta.setText(new String(b));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }

        }

    }

    private void Save() {

        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(path);
                byte[] b = ta.getText().getBytes();
                fos.write(b);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fos.close();
                } catch (IOException e) {
                }
            }
        }

    }

    private void SaveButton() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(path);
                byte[] b = ta.getText().getBytes();
                fos.write(b);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fos.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private void CancelButton() {
//   System.exit(0);
    }

    private void createInvoiceBtn(ActionEvent e) {
        System.out.println("inside");
    }

//    private void Newbtn(String filePath) {
//    
//	// first create file object for file placed at location
//	// specified by filepath
//	File file = new File(filePath);
//	try {
//		// create FileWriter object with file as parameter
//		FileWriter outputfile = new FileWriter(file);
//
//		// create CSVWriter object filewriter object as parameter
//		CSVWriter writer = new CSVWriter(outputfile);
//
//		// adding header to csv
//		String[] header = { "Name", "Class", "Marks" };
//		writer.writeNext(header);
//
//		// add data to csv
//		String[] data1 = { "Aman", "10", "620" };
//		writer.writeNext(data1);
//		String[] data2 = { "Suraj", "10", "630" };
//		writer.writeNext(data2);
//
//		// closing writer connection
//		writer.close();
//	}
//	catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
//    private void DeleteButton() {
//
//         File file
//            = new File("C:\\Users\\Mayank\\Desktop\\1.txt");
// 
//        if (file.delete()) {
//            System.out.println("File deleted successfully");
//        }
//        else {
//            System.out.println("Failed to delete the file");
//        }
//    }
}
