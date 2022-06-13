
package test;

import control.Control;
import model.ConsultPerson;
import model.Person;
import view.MainFrame;

public class Main {

    public static void main(String[] args) {        
        MainFrame mainFrame = new MainFrame();
        Control control = new Control(mainFrame, new Person(), new ConsultPerson());
        
        control.init();
        mainFrame.setVisible(true);
    }
    
}
