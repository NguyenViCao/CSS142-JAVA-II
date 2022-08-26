
package Project3;

import java.awt.Color;
import java.awt.Toolkit;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        AddPlayer
 * File         AddPlayer.java
 * Project      Two Cards Game
 * Description  A class uses to add new player
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         3/9/2021
 * History log  3/9/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	%1% %2%
 * @see     	java.awt.Color
 * @see         java.awt.Toolkit
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class EditPlayer extends javax.swing.JDialog 
{
    private Player newPlayer;                   //player to be created
    private boolean error = false;              //checking for errors in input
    private String errorMessage = "";           //error message
    private final int MIN_AGE = 18;             //Minimum age 
    private final int MAX_BALANCE = 10000;       //Maximum balance 
    private final Color white = Color.WHITE;    //default background color for input textfield
    private final Color pink = Color.PINK;      //background color for bad input textfield
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     AddPlayer()
     * Description     Create an instance of the GUI form , set the default
     *                 JButton to be saveJButton, set icon image, centers form,
     *                 and sets the JDialog form to modal
     * @author         <i>Nguyen Vi Cao</i>
     * Date            3/9/2021
     * History log     3/9/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public EditPlayer() {
        //super(parent, modal);
        initComponents();
        this.getRootPane().setDefaultButton(saveJButton);
        //set icon
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Project3/52cards.png"));
        //centers form
        this.setLocationRelativeTo(null);
        nameJTextField.requestFocus();
        newPlayer = null;
        setAlwaysOnTop(true);
        setModal(true);
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     EditPlayer()--overloaded copy constructor
     * Description     calls the default constructor to create an instance of 
     *                 the GUI form and populates the data fields for the 
     *                 selected player.
     * @param          player Player
     * @author         <i>Nguyen Vi Cao</i>
     * Date            1/27/2021
     * History log     1/10/2021, 1/20/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public EditPlayer(Player player)
    {
        this();
        nameJTextField.setText(player.getName());
        ageJTextField.setText(String.valueOf(player.getAge()));
        balanceJTextField.setText(String.valueOf(player.getBalance()));
        nameJTextField.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayJPanel = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        ageJLabel = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        balanceJLabel = new javax.swing.JLabel();
        balanceJTextField = new javax.swing.JTextField();
        cancelJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        logoJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new Opera");
        setResizable(false);

        displayJPanel.setLayout(new java.awt.GridLayout(3, 2, 3, 3));

        nameJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJLabel.setText("Name of player");
        displayJPanel.add(nameJLabel);

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJTextFieldFocusLost(evt);
            }
        });
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        displayJPanel.add(nameJTextField);

        ageJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageJLabel.setText("Age");
        displayJPanel.add(ageJLabel);

        ageJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageJTextFieldFocusLost(evt);
            }
        });
        displayJPanel.add(ageJTextField);

        balanceJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        balanceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceJLabel.setText("Balance");
        displayJPanel.add(balanceJLabel);

        balanceJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        balanceJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                balanceJTextFieldFocusLost(evt);
            }
        });
        displayJPanel.add(balanceJTextField);

        cancelJButton.setMnemonic('c');
        cancelJButton.setText("Cancel");
        cancelJButton.setToolTipText("Dispose form");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        saveJButton.setMnemonic('s');
        saveJButton.setText("Save");
        saveJButton.setToolTipText("Save new Opera");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        titleJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 30)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(51, 0, 0));
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Edit Player");

        logoJLabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        logoJLabel.setForeground(new java.awt.Color(51, 0, 0));
        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project3/52cards.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(displayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed

    }//GEN-LAST:event_nameJTextFieldActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        cancelJButtonActionPerformed()
    * Description   Event handler to cancel adding a new opera: do nothing and
    *               leave newOpera as null
    * @param        evt ActionWvent
    * @see          java.awt.event.ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    * History log   3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        saveJButtonActionPerformed()
    * Description   Event handler to create a new opera provided data inputed
    *               are valid
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    * History log   3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        //local variables needed
        String name = "";
        int age = 0;
        int balance = 0;
        
        //read all inputs as strings
        String playerName = nameJTextField.getText();
        String Age = ageJTextField.getText();
        String Balance = balanceJTextField.getText();
        //call appropriate Validation methods to verify input
        if (!Validation.isValidName(playerName))
        {
            errorMessage += "Invalid Player Name\n";
            nameJTextField.requestFocus();
            error = true;
            nameJTextField.setToolTipText(nameJTextField.getToolTipText() + 
                    "--Invalid Player Name");
        }
        else if(!Validation.isInteger(Age, 0, MIN_AGE))
        {
            errorMessage += "Invalid Age\n";
            ageJTextField.requestFocus();
            error = true;
            ageJTextField.setToolTipText(nameJTextField.getToolTipText() + 
                    "--You must be older than 18 to play");
        }
        else if(!Validation.isInteger(Balance, 0, MAX_BALANCE))
        {
            errorMessage += "Invalid Balance\n";
            balanceJTextField.requestFocus();
            error = true;
            balanceJTextField.setToolTipText(nameJTextField.getToolTipText() + 
                    "--Invalid Balance");
        }
        else 
            error = false;
        if(!error)
        {
            try
            {
                name = nameJTextField.getText();
                age = Integer.parseInt(ageJTextField.getText());
                balance = Integer.parseInt(balanceJTextField.getText());
                newPlayer = new Player(name, age, balance);
                this.dispose();
            }
            catch (Exception ex)
            {
                throw new RuntimeException ("Error parsing input");
            }
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        nameJTextFieldFocusLost()
    * Description   Event handler for the nameJTextField. It changes 
    *               color if input is not valid.
    * @param        evt FocusEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    * History log   3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void nameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJTextFieldFocusLost
        //set background textfiled color
        String input = nameJTextField.getText();
        if(Validation.isValidName(input))
            nameJTextField.setBackground(white);
        else
            nameJTextField.setBackground(pink);
    }//GEN-LAST:event_nameJTextFieldFocusLost

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        ageJTextFieldFocusLost()
    * Description   Event handler for the ageJTextField. It changes 
    *               color if input is not valid.
    * @param        evt FocusEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    * History log   3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void ageJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageJTextFieldFocusLost
        //set background textfiled color
        String input = ageJTextField.getText();
        if(Validation.isInteger(input, 0, MIN_AGE))
            ageJTextField.setBackground(white);
        else
            ageJTextField.setBackground(pink);
    }//GEN-LAST:event_ageJTextFieldFocusLost

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        balanceJTextFieldFocusLost()
    * Description   Event handler for the balanceJTextField. It changes 
    *               color if input is not valid.
    * @param        evt FocusEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    * History log   3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void balanceJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_balanceJTextFieldFocusLost
        //set background textfiled color
        String input = balanceJTextField.getText();
        if(Validation.isInteger(input, 0, MAX_BALANCE))
            balanceJTextField.setBackground(white);
        else
            balanceJTextField.setBackground(pink);
    }//GEN-LAST:event_balanceJTextFieldFocusLost

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        getPlayer()
    * Description   get method to return getPlayer
    * @return       getPlayer Player
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    * History log   3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Player getPlayer()
    {
        return newPlayer;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JLabel balanceJLabel;
    private javax.swing.JTextField balanceJTextField;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
