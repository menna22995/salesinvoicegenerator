package SIG.View;

import SIG.Model.InvoiceHeader;
import SIG.Model.InvoiceHeaderModel;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import static java.lang.String.valueOf;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ProBook G7
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        
        handler=new Actions(this);
        initComponents();
    }

      private JTextArea ta;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Header = new javax.swing.JTable();
        createInvoiceBtn = new javax.swing.JButton();
        createInvoiceBtn.addActionListener(handler);
        DeleteButton = new javax.swing.JButton();
        DeleteButton.addActionListener(handler);
        invoicebtn = new javax.swing.JLabel();
        customerbtn = new javax.swing.JLabel();
        Datebtn = new javax.swing.JLabel();
        Totalbtn = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        CustomerLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        TotalLAbel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Line = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        SaveButton.addActionListener(handler);
        CancelButton = new javax.swing.JButton();
        CancelButton.addActionListener(handler);
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenue = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        Save.addActionListener(handler);
        Load = new javax.swing.JMenuItem();
        Load.addActionListener(handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Header);

        createInvoiceBtn.setText("Create New Voice");
        createInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceBtnActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete Invoice");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        invoicebtn.setText("Invoice Number");

        customerbtn.setText("Customer");

        Datebtn.setText("Invoice Date");

        Totalbtn.setText("Total");

        numberLabel.setText("jLabel5");
        numberLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                numberLabelInputMethodTextChanged(evt);
            }
        });

        CustomerLabel.setText("jLabel6");

        DateLabel.setText("jLabel7");

        TotalLAbel.setText("jLabel8");

        Line.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Line);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");

        FileMenue.setText("File");
        FileMenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileMenueActionPerformed(evt);
            }
        });

        Save.setText("Save file");
        Save.setActionCommand("Save File");
        FileMenue.add(Save);

        Load.setMnemonic('n');
        Load.setText("Load File");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        FileMenue.add(Load);

        jMenuBar1.add(FileMenue);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerbtn)
                                    .addComponent(invoicebtn)
                                    .addComponent(Datebtn)
                                    .addComponent(Totalbtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(CustomerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TotalLAbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createInvoiceBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton)
                        .addGap(39, 39, 39)
                        .addComponent(SaveButton)
                        .addGap(108, 108, 108)
                        .addComponent(CancelButton)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicebtn)
                            .addComponent(numberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerbtn)
                            .addComponent(CustomerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Datebtn)
                            .addComponent(DateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Totalbtn)
                            .addComponent(TotalLAbel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createInvoiceBtn)
                            .addComponent(DeleteButton)
                            .addComponent(SaveButton)
                            .addComponent(CancelButton))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
  
    
    
    
    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_LoadActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void createInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceBtnActionPerformed
        

        
          try {
            String file_path = "D:/invoicehLine.csv";
            FileWriter mFileWriter = new FileWriter(file_path, true);
            CSVWriter csvwrite = new CSVWriter(mFileWriter, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            CSVReader reader = new CSVReader(new FileReader(file_path));
            
            List allExcel = reader.readAll();
            String[] line= {String.valueOf(allExcel.size() + 1),"tea ", "5 LE", "2","10"};
            List<String[]> list = new ArrayList<String[]>();
            list.add(line);
            csvwrite.writeAll(list);
            csvwrite.close();
            System.out.println("File Created successfully");

             
        
            fetchLineInvoices();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_createInvoiceBtnActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
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
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void FileMenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileMenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileMenueActionPerformed

    private void numberLabelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_numberLabelInputMethodTextChanged
  
        // TODO add your handling code here:
    }//GEN-LAST:event_numberLabelInputMethodTextChanged
   
       

    

    private void fetchAllInvoices() {

        try {
//            List<String[]> list = new ArrayList<String[]>();

   
            DefaultTableModel dtm = new DefaultTableModel(0, 4);

            //Instantiating the CSVReader class
            CSVReader reader = new CSVReader(new FileReader("D:/invoicehHeader.csv"));
            //Reading the contents of the csv file
            List excelSheet = reader.readAll();
            //Getting the Iterator object
            Iterator it = excelSheet.iterator();
            Header.setModel(dtm);
            while (it.hasNext()) {
                String[] str = (String[]) it.next();
                System.out.println(str[0].split(";"));
                dtm.addRow(str[0].split(";"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     private void fetchLineInvoices() {

        try {
//            List<String[]> list = new ArrayList<String[]>();

   
            DefaultTableModel dtm = new DefaultTableModel(0, 5);

            //Instantiating the CSVReader class
            CSVReader reader = new CSVReader(new FileReader("D:/invoicehLine.csv"));
            //Reading the contents of the csv file
            List excelSheet = reader.readAll();
            //Getting the Iterator object
            Iterator it = excelSheet.iterator();
            Line.setModel(dtm);
            while (it.hasNext()) {
                String[] str = (String[]) it.next();
                System.out.println(str[0].split(";"));
                dtm.addRow(str[0].split(";"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CustomerLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel Datebtn;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JMenu FileMenue;
    private javax.swing.JTable Header;
    private javax.swing.JTable Line;
    private javax.swing.JMenuItem Load;
    private javax.swing.JMenuItem Save;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TotalLAbel;
    private javax.swing.JLabel Totalbtn;
    private javax.swing.JButton createInvoiceBtn;
    private javax.swing.JLabel customerbtn;
    private javax.swing.JLabel invoicebtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numberLabel;
    // End of variables declaration//GEN-END:variables
private Actions handler ;
private ArrayList<InvoiceHeader>invoiceHeaderList;
private InvoiceHeaderModel headerTableModel;

    public Actions getHandler() {
        return handler;
        
    }

   
    public ArrayList<InvoiceHeader> getInvoiceHeaderList() {
        return invoiceHeaderList;
    }

    public void setInvoiceHeaderList(ArrayList<InvoiceHeader> invoiceHeaderList) {
        this.invoiceHeaderList = invoiceHeaderList;
        headerTableModel=new InvoiceHeaderModel(invoiceHeaderList);
        this.Header.setModel(headerTableModel);
    }

    public JTable getHeader() {
        return Header;
    }

    public JTable getLine() {
        return Line;
    }
    


}
