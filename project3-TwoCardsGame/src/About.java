
package Project3;

import java.awt.Toolkit;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* @author           <i>Nguyen Vi Cao</i>
* Project Number    3
* Due date          3/16/2021
*</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         About
* File          About.java
* Description   Information about the Two Cards Game
* @author       <i>Nguyen Vi Cao</i>
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          3/16/2021
* @version      1.0.0
* History Log:  13/16/2021
*</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class About extends javax.swing.JFrame {

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Constructor      About()--default constructor
* Description      Create a GUI form and displayed it centered and set
*                  CloseJButton as default.
* @author          <i>Nguyen Vi Cao</i>
* Date             11/30/2020
* @param           parent java.awt.Frame
* @param           modal boolean
*</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public About(java.awt.Frame parent, boolean modal) 
    {
        //super(parent, modal);
        initComponents();
        // center the form at start
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().
                getImage("src/Project3/52cards.png"));
        // set CloseJButton as default
        this.getRootPane().setDefaultButton(CloseJButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AboutJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        CloseJButton = new javax.swing.JButton();
        CopyrightJLabel = new javax.swing.JLabel();
        CopyrightJLabel1 = new javax.swing.JLabel();
        AuthorJLabel = new javax.swing.JLabel();
        AuthorJLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("About Two Cards Game ");

        AboutJLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        AboutJLabel.setForeground(new java.awt.Color(255, 0, 0));
        AboutJLabel.setText("Two Cards Game About Form");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project3/52cards.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("A player is invited to draw two cards from a well-shuffled dec of cards (without replacement). The player must decide before the drawing how much to bet (0 to maximum they have). The player wins if both cards have the same numerical value (e.g., two queens, two kings, and so on) and is rewarded 20 times the amount of the money they bet. If the two drawn cards are not the same, they lose the money they bet. In other words, this is a 20-to-1 and not 20-for-1 of payoff game.\n\nThe player has the option of playing the game without betting any money but cannot bet more money than they have. The plyaer can bet different amount for each game, quit at any time after completing a game or after they run out of money.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        CloseJButton.setBackground(new java.awt.Color(153, 255, 153));
        CloseJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CloseJButton.setMnemonic('c');
        CloseJButton.setText("Close");
        CloseJButton.setToolTipText("Close the About Form");
        CloseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseJButtonActionPerformed(evt);
            }
        });

        CopyrightJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CopyrightJLabel.setText("Copyright: Free");

        CopyrightJLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CopyrightJLabel1.setText("Version 3.1.1");

        AuthorJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AuthorJLabel.setText("Author: Nguyen Vi Cao");

        AuthorJLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AuthorJLabel1.setText("Date: 3/16/2021");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(AboutJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CopyrightJLabel)
                            .addComponent(CopyrightJLabel1))
                        .addGap(162, 162, 162)
                        .addComponent(CloseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AuthorJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AuthorJLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloseJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CopyrightJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CopyrightJLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AuthorJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AuthorJLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        CloseJButtonActionPerformed()
    * Description   Closes the About form only
    * Date          3/16/2021
    * History Log   3/16/2021
    * @author       <i>Nguyen Vi Cao</i>	
    * @param        evt java.awt.event.ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void CloseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseJButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                About dialog = new About(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutJLabel;
    private javax.swing.JLabel AuthorJLabel;
    private javax.swing.JLabel AuthorJLabel1;
    private javax.swing.JButton CloseJButton;
    private javax.swing.JLabel CopyrightJLabel;
    private javax.swing.JLabel CopyrightJLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}