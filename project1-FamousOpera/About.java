package Project1;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        About.java
 * Description  A class representing the About form used by the FamousOperasDatabase
 *              A much better choice for the About form would be a JDialogue
 * Project      Project1
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         1/27/2021
 * History log  1/10/2021, 1/20/2021
 *
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	%1% %5%
 * @see         java.awt.Toolkit
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class About extends javax.swing.JDialog 
{

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     About()
     * Description     Create an instance of the GUI form, set the default JButton
     *                 to be closeJButton and center the form
     * @param          parent java.awt.Frame
     * @param          modal boolean
     * @author         <i>Nguyen Vi Cao</i>
     * Date            1/27/2021
     * History log     1/10/2021, 1/20/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public About(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        //center form
        this.setLocationRelativeTo(null);
        //set closeJButton as default
        this.getRootPane().setDefaultButton(closeJButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        infoJScrollPane = new javax.swing.JScrollPane();
        infoJTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Large USA Cities About");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        titleJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(51, 0, 0));
        titleJLabel.setText("Famous Opera");

        infoJTextArea.setEditable(false);
        infoJTextArea.setBackground(new java.awt.Color(240, 240, 240));
        infoJTextArea.setColumns(20);
        infoJTextArea.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        infoJTextArea.setLineWrap(true);
        infoJTextArea.setRows(5);
        infoJTextArea.setText("This program manages famous composers database with ability to display, add, edit, delete and search composers saved in an external Composers.txt text file. Six relevant fields are displayed for the selected composer: composer name, famous piece, year first performed, city where first performed, sypnosis, and link to YouTube performance of the piece. The program allows to sort the operas by name (ascending) and by year first performed (descending).");
        infoJTextArea.setWrapStyleWord(true);
        infoJScrollPane.setViewportView(infoJTextArea);

        jLabel1.setText("Author: Nguyen Vi Cao");

        jLabel2.setText("Date: 01/11/2021");

        jLabel3.setText("Copyright: not free to use");

        jLabel4.setText("Version 3.1.5");

        closeJButton.setBackground(new java.awt.Color(153, 204, 255));
        closeJButton.setMnemonic('c');
        closeJButton.setText("Close");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/1.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleJLabel)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(infoJScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        closeJButtonActionPerformed()
    * Description   Event handler to close the About form
    * @parem        evt ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/8/2021
    * History Log   1/5/2021, 1/8/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeJButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JScrollPane infoJScrollPane;
    private javax.swing.JTextArea infoJTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
