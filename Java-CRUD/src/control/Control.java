
package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ConsultPerson;
import model.Person;
import view.MainFrame;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Control implements ActionListener{
    MainFrame mainFrame;
    Person person;
    ConsultPerson consultPerson;

    public Control(MainFrame mainFrame, Person person, ConsultPerson consultPerson) {
        this.mainFrame = mainFrame;
        this.person = person;
        this.consultPerson = consultPerson;
        
        mainFrame.getInsertButton().addActionListener(this);
        mainFrame.getCleanButton().addActionListener(this);
        mainFrame.getExitButton().addActionListener(this);
        mainFrame.getButtonSearch().addActionListener(this);
        mainFrame.getUpdateButton().addActionListener(this);
        mainFrame.getDeleteButton().addActionListener(this);
    }
    
    public void init(){
        mainFrame.setTitle("CRUD");
        mainFrame.setSize(540, 490);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.getContentPane().setBackground(new Color(51,51,51));
        mainFrame.setResizable(false);
        mainFrame.getFieldID().setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mainFrame.getInsertButton()){
            person.setKey(mainFrame.getFieldKey().getText());
            person.setName(mainFrame.getFieldName().getText());
            person.setAddress(mainFrame.getFieldAddress().getText());
            person.setCellphone(mainFrame.getFieldNumber().getText());
            person.setEmail(mainFrame.getFieldEmail().getText());
            person.setDate(Date.valueOf(mainFrame.getFieldBirthday().getText()));
            person.setGender(mainFrame.getComboGender().getSelectedItem().toString());
            
            if(consultPerson.inserPerson(person)){
                JOptionPane.showMessageDialog(null, "Sucessfully registered.");
                cleanFields();
            }else{
                JOptionPane.showMessageDialog(null, "Error trying to insert data.");
            }
        }
        
        if(e.getSource() == mainFrame.getCleanButton()){
            cleanFields();
        }
        
        if(e.getSource() == mainFrame.getExitButton()){
            System.exit(0);
        }
    }
    
    private void cleanFields(){
        mainFrame.getFieldKey().setText("");
        mainFrame.getFieldName().setText("");
        mainFrame.getFieldAddress().setText("");
        mainFrame.getFieldNumber().setText("");
        mainFrame.getFieldEmail().setText("");
        mainFrame.getFieldBirthday().setText("");
        mainFrame.getComboGender().setSelectedIndex(0);
    }
}
