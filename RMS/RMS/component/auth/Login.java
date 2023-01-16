package RMS.component.auth;

import javax.swing.JOptionPane;
import RMS.MainMenu;

public class Login extends javax.swing.JFrame {

  public Login() {
    initComponents();

    setDefaultUserName();
  }

  private void setDefaultUserName() {
    this.userNameField.setText("Leander");
    this.passwordField.setText("Leanderpogi123");
  }

  private void initComponents() {

    loginPanel = new javax.swing.JPanel();
    userNameLabel = new javax.swing.JLabel();
    userNameField = new javax.swing.JTextField();
    passwordLabel = new javax.swing.JLabel();
    loginButton = new javax.swing.JButton();
    passwordField = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    loginPanel.setBackground(new java.awt.Color(153, 153, 255));
    loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Landrix Resto",
        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
        new java.awt.Font("Arial", 0, 13), new java.awt.Color(0, 0, 204)));
    loginPanel.setForeground(new java.awt.Color(153, 153, 255));
    loginPanel.setToolTipText("");
    loginPanel.setName("");

    userNameLabel.setBackground(new java.awt.Color(255, 153, 153));
    userNameLabel.setForeground(new java.awt.Color(0, 0, 255));
    userNameLabel.setText("User Name: ");

    userNameField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        userNameFieldActionPerformed(evt);
      }
    });

    passwordLabel.setForeground(new java.awt.Color(0, 0, 204));
    passwordLabel.setText("Password :");

    loginButton.setText("Log In");
    loginButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loginButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
    loginPanel.setLayout(loginPanelLayout);
    loginPanelLayout.setHorizontalGroup(
        loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE)));
    loginPanelLayout.setVerticalGroup(
        loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addContainerGap(34, Short.MAX_VALUE)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addContainerGap(67, Short.MAX_VALUE)));

    loginPanel.getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }

  private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (userNameField.getText().equalsIgnoreCase("Leander")) {
      JOptionPane.showMessageDialog(this, "Access granted");
      this.dispose();
      MainMenu mainMenu = new MainMenu();
      mainMenu.setVisible(true);
    } else {
      userNameField.setText("");
      passwordField.setText("");
      JOptionPane.showMessageDialog(this, userNameField.getText() + " Access Denied");
    }

  }

  private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//
  }

  public static void main(String args[]) {

    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(() -> {
      new Login().setVisible(true);
    });
  }

  private javax.swing.JButton loginButton;
  private javax.swing.JPanel loginPanel;
  private javax.swing.JPasswordField passwordField;
  private javax.swing.JLabel passwordLabel;
  private javax.swing.JTextField userNameField;
  private javax.swing.JLabel userNameLabel;

}