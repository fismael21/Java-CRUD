
package control;

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
    }
    
    public void init(){
        mainFrame.setTitle("CRUD");
        mainFrame.setSize(500, 480);
        mainFrame.setLocationRelativeTo(null);
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
            }else{
                JOptionPane.showMessageDialog(null, "Error trying to insert data.");
            }
        }
    }
    

}
