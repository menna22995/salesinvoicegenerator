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

            case "Delete Invoice":
              DeleteButton();
                break;
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
   System.exit(0);
    }

    private void createInvoiceBtn(ActionEvent e) {
        System.out.println("");
    }


    private void DeleteButton() {
     try  {         
    File f= new File("D:/invoicehHeader.csv");           
    if(f.delete())                       
            {   System.out.println(f.getName() + " deleted");   }  
    else  {  System.out.println("failed"); }  
    }  
    catch(Exception e)  
    {    e.printStackTrace();   }
        
    }
}
