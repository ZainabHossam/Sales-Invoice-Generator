
package sig.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import static javax.swing.text.StyleConstants.Size;
import sig.model.InvoiceTableElements;

/**
 *
 * @author Zainab
 * All Button Actions will be in this class
 */
public class HandelActions implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("This is an action Called!");
        switch(e.getActionCommand()){
            case "Load File":
            {
                try {
                    LoadFile();
                } catch (IOException ex) {
                    Logger.getLogger(HandelActions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

                
            case "Save File":
            {
                try {
                    SaveFile();
                } catch (IOException ex) {
                    Logger.getLogger(HandelActions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

                
            case "Create New Invoice":
                newInvoice();
                break;
                
            case "Delete Invoice":
                DelInvoice();
                break;
            case "Save":
                SaveInvoice();
                break;
                
            case "Cacel":
                CancelChanges();
                break;
        }
    }

    private void newInvoice() {
        
    }

    private void DelInvoice() {
    }

    private void SaveInvoice() {
    }

    private void LoadFile() throws FileNotFoundException, IOException {
        JFileChooser File;
        File = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File.showOpenDialog(null);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .csv files", "csv");
           File.addChoosableFileFilter(restrict);
           
           if( File.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                String Path=File.getSelectedFile().getPath();
                FileInputStream fileStream= new FileInputStream(Path);
                int size=fileStream.available();
                    byte[] b= new byte[size];
                    fileStream.read(b);
        
                    fileStream.close();
                }

               }

    private void SaveFile() throws FileNotFoundException, IOException {
        JFileChooser File;
        File = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File.showOpenDialog(null);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .csv files", "csv");
           File.addChoosableFileFilter(restrict);
           if( File.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                String Path=File.getSelectedFile().getPath();
            try (FileInputStream fileStream = new FileInputStream(Path)) {
                int size=fileStream.available();
                byte[] b= new byte[size];
               // fileStream.write(b);
            }
                }

    }

    private void CancelChanges() {
      
    }
    
}
