
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author ferna
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        key = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        birthday = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        fieldKey = new javax.swing.JTextField();
        fieldID = new javax.swing.JTextField();
        fieldName = new javax.swing.JTextField();
        fieldAddress = new javax.swing.JTextField();
        fieldNumber = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldBirthday = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        comboGender = new javax.swing.JComboBox<>();
        panel2 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setLayout(new java.awt.GridBagLayout());

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("CRUD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(title, gridBagConstraints);

        key.setForeground(new java.awt.Color(255, 255, 255));
        key.setText("Key");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(key, gridBagConstraints);

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(name, gridBagConstraints);

        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(address, gridBagConstraints);

        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setText("Phone Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(phone, gridBagConstraints);

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(email, gridBagConstraints);

        birthday.setForeground(new java.awt.Color(255, 255, 255));
        birthday.setText("Birthday:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(birthday, gridBagConstraints);

        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(gender, gridBagConstraints);

        fieldKey.setPreferredSize(new java.awt.Dimension(94, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldKey, gridBagConstraints);

        fieldID.setPreferredSize(new java.awt.Dimension(22, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldID, gridBagConstraints);

        fieldName.setPreferredSize(new java.awt.Dimension(234, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldName, gridBagConstraints);

        fieldAddress.setPreferredSize(new java.awt.Dimension(234, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldAddress, gridBagConstraints);

        fieldNumber.setPreferredSize(new java.awt.Dimension(234, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldNumber, gridBagConstraints);

        fieldEmail.setPreferredSize(new java.awt.Dimension(234, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldEmail, gridBagConstraints);

        fieldBirthday.setPreferredSize(new java.awt.Dimension(234, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(fieldBirthday, gridBagConstraints);

        buttonSearch.setBackground(new java.awt.Color(102, 102, 102));
        buttonSearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearch.setText("Search");
        buttonSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSearch.setPreferredSize(new java.awt.Dimension(82, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(buttonSearch, gridBagConstraints);

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Male", "Female", "Other" }));
        comboGender.setMinimumSize(new java.awt.Dimension(142, 22));
        comboGender.setPreferredSize(new java.awt.Dimension(142, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel.add(comboGender, gridBagConstraints);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new java.awt.GridBagLayout());

        insertButton.setBackground(new java.awt.Color(102, 102, 102));
        insertButton.setForeground(new java.awt.Color(255, 255, 255));
        insertButton.setText("Insert");
        insertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertButton.setMinimumSize(new java.awt.Dimension(82, 22));
        insertButton.setPreferredSize(new java.awt.Dimension(82, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel2.add(insertButton, gridBagConstraints);

        updateButton.setBackground(new java.awt.Color(102, 102, 102));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.setMinimumSize(new java.awt.Dimension(82, 22));
        updateButton.setPreferredSize(new java.awt.Dimension(82, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel2.add(updateButton, gridBagConstraints);

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setMinimumSize(new java.awt.Dimension(82, 22));
        deleteButton.setPreferredSize(new java.awt.Dimension(82, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel2.add(deleteButton, gridBagConstraints);

        cleanButton.setBackground(new java.awt.Color(102, 102, 102));
        cleanButton.setForeground(new java.awt.Color(255, 255, 255));
        cleanButton.setText("Clean");
        cleanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanButton.setMinimumSize(new java.awt.Dimension(82, 22));
        cleanButton.setPreferredSize(new java.awt.Dimension(82, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel2.add(cleanButton, gridBagConstraints);

        exitButton.setBackground(new java.awt.Color(102, 102, 102));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setMinimumSize(new java.awt.Dimension(82, 22));
        exitButton.setPreferredSize(new java.awt.Dimension(82, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panel2.add(exitButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public JButton getButtonSearch() {
        return buttonSearch;
    }

    public void setButtonSearch(JButton buttonSearch) {
        this.buttonSearch = buttonSearch;
    }

    public JButton getCleanButton() {
        return cleanButton;
    }

    public void setCleanButton(JButton cleanButton) {
        this.cleanButton = cleanButton;
    }

    public JComboBox<String> getComboGender() {
        return comboGender;
    }

    public void setComboGender(JComboBox<String> comboGender) {
        this.comboGender = comboGender;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void setExitButton(JButton exitButton) {
        this.exitButton = exitButton;
    }

    public JTextField getFieldAddress() {
        return fieldAddress;
    }

    public void setFieldAddress(JTextField fieldAddress) {
        this.fieldAddress = fieldAddress;
    }

    public JTextField getFieldBirthday() {
        return fieldBirthday;
    }

    public void setFieldBirthday(JTextField fieldBirthday) {
        this.fieldBirthday = fieldBirthday;
    }

    public JTextField getFieldEmail() {
        return fieldEmail;
    }

    public void setFieldEmail(JTextField fieldEmail) {
        this.fieldEmail = fieldEmail;
    }

    public JTextField getFieldID() {
        return fieldID;
    }

    public void setFieldID(JTextField fieldID) {
        this.fieldID = fieldID;
    }

    public JTextField getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(JTextField fieldKey) {
        this.fieldKey = fieldKey;
    }

    public JTextField getFieldName() {
        return fieldName;
    }

    public void setFieldName(JTextField fieldName) {
        this.fieldName = fieldName;
    }

    public JTextField getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(JTextField fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public JButton getInsertButton() {
        return insertButton;
    }

    public void setInsertButton(JButton insertButton) {
        this.insertButton = insertButton;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(JButton updateButton) {
        this.updateButton = updateButton;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel birthday;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton cleanButton;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel email;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldBirthday;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldKey;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldNumber;
    private javax.swing.JLabel gender;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel key;
    private javax.swing.JLabel name;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
