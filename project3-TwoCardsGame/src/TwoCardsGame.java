
package Project3;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         TwoCardsGame
* File          TwoCardsGame.java
* Description   Two Cards game simulator - Win if we can get two same cards
* @author       <i>Nguyen Vi Cao</i>
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          3/9/2021
* @version      1.0.0
* History Log:  3/9/2021
*</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class TwoCardsGame extends javax.swing.JFrame {
    DeckOfCards myDeck = new DeckOfCards();
    //class instance ArrayList of Opera objects
    private TreeSet<Player> players = new TreeSet<Player>();
    //external file name for operas
    private String fileName = "src/Project3/Players.txt";
    private NumberFormat dollars = NumberFormat.getCurrencyInstance();
    private Random myRandom = new Random();
    private Player myPlayer;
    private final double ODDS = 20;
    private final int NUM_CARDS = 2;
    private int[] cards = new int[NUM_CARDS];
    private int[] cardValue = new int [NUM_CARDS];
    
    Cards cards1 = new Cards(Cards.shuffle());
    Cards cards2 = new Cards(Cards.shuffle());
    final int WON = 0, LOST = 1, CONTINUE = 2;
    int gameStatus = CONTINUE;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor      TwoCardsGame()--default constructor
    * Description      Create a GUI form and displayed it centered with icon and
    *                  drawJButton set as default.
    * @author          <i>Nguyen Vi Cao</i>
    * Date             3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public TwoCardsGame() {
        initComponents();
        this.getRootPane().setDefaultButton(drawJButton);
        // set icon form
        this.setIconImage(Toolkit.getDefaultToolkit().
        getImage("src/Project3/52cards.png"));
        // center the form at start
        this.setLocationRelativeTo(null);
        setDate(); 
        //Read from an external text file Players.txt and populate the ArrayList 
        //of Player type
        readFromFile(fileName);
        //show the member list in the JList and display data for selected player
        displayPlayers();
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       readFromFile
     * Description  Reads players from a text file that is comma delimited and
     *              creates an instance of the Player class with the data read.
     *              Then the newly created player is added to the players database.
     *              Uses an object from the ReadFile class to read record.
     * @author      <i>Nguyen Vi Cao</i>
     * @param       file
     * Date         3/9/2021
     * History log  3/9/2021
     * @see         java.util.Scanner
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void readFromFile (String file){
        players.clear();             //clear the ArrayList
        try 
        {
            //read while there is data
            Scanner input = new Scanner (new File(file));   //alternative to FileReader and BufferedReader
            String line = "";
            Player metropolis = null;
            StringTokenizer token = null;
            while(input.hasNextLine())
            {
                line = input.nextLine();
                metropolis = new Player();
                token = new StringTokenizer(line, ",");
                while (token.hasMoreElements())
                {
                    metropolis.setName(token.nextToken());
                    metropolis.setAge(Integer.parseInt(token.nextToken()));
                    metropolis.setBalance(Double.parseDouble(token.nextToken()));
                }
                //add opera to arraylist
                players.add(metropolis);
            }
            input.close();
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, file + "does not exist",
                    "File input Error", JOptionPane.WARNING_MESSAGE);
            //bring up JFileChooser to select file in current directory
            JFileChooser chooser = new JFileChooser("src/Project3");
            //filter only txt file
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Txt Files", "txt");
            chooser.setFileFilter(filter);
            int choice = chooser.showOpenDialog(null);
            if (choice == JFileChooser.APPROVE_OPTION)
            {
                File chosenFile = chooser.getSelectedFile();
                file = "src/Project3/" + chosenFile.getName();
                System.out.println("file = " + file);
                readFromFile(file);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Unable to read file",
                        "File input error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>>
     * Method       displayPlayersList
     * Description  Displays players in JList sorted by level = 0 using 
     *              selection sort algorithm or last name = 1 using the 
     *              insertion sort algorithm.
     * @author      <i>Nguyen Vi Cao</i>
     * Date         3/9/2021
     * History log  3/9/2021
     * @see         #selectionSort
     * @see         #insetionSort
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void displayPlayers()
    {
        int location = playersJList.getSelectedIndex();      //get index of current player
        int index = 0;
        Player aPlayer = null; //used only to omit players whosebalance is inadequate
        String[] playersList = new String[players.size()];    //array with names only
        Iterator iterator = players.iterator();
        while (iterator.hasNext())
        {
            aPlayer = (Player)iterator.next(); 
            if (aPlayer.getBalance() > 0)
            {
                playersList[index] = aPlayer.getName();
            }
            index++;
        }
        playersJList.setListData(playersList);    // populate JList with players   
        if(location < 0)
            playersJList.setSelectedIndex(0);
        else
            playersJList.setSelectedIndex(location);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       displayCards
     * Description  gets two random cards
     * @author      <i>Nguyen Vi Cao</i>
     * Date         3/9/2021
     * History log  3/9/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void displayCards()
    {
//        for (int i = 0; i < cards.length; i++)
//        {
//            cards[i] = myDeck.getRandomCard);
//            if(cards[i]%13 == 0)
//                cardValue[i] = 13;
//            else
//                cardValue[i] = cards[i] % 13;
//        }
//        //display the cards
//        setImage("src/Cards/" + cards[0] + ".jpg", cards1JLabel);
//        setImage("src/Cards/" + cards[1] + ".jpg", cards2JLabel);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setDate()
    * Description   Private method to set current date in the title bar of main
    *               form in mm/dd/yy style
    * @see          java.text.DateFormat
    * @see          java.text.SimpleDateFormat
    * @see          java.util.Date
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        this.setTitle("Project 3 -- Two Cards Game --  " + dateFormat.format(date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLable = new javax.swing.JLabel();
        cards1JLabel = new javax.swing.JLabel();
        cards2JLabel = new javax.swing.JLabel();
        clearJButton = new javax.swing.JButton();
        drawJButton = new javax.swing.JButton();
        instructionJScrollPane = new javax.swing.JScrollPane();
        instructionJTextArea = new javax.swing.JTextArea();
        betJLabel = new javax.swing.JLabel();
        betJTextField = new javax.swing.JTextField();
        resultJScrollPane = new javax.swing.JScrollPane();
        resultJTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        playersJList = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        newJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        printFormJMenuItem = new javax.swing.JMenuItem();
        saveJMenuItem = new javax.swing.JMenuItem();
        exitJMenuItem = new javax.swing.JMenuItem();
        playerJMenu = new javax.swing.JMenu();
        addJMenuItem = new javax.swing.JMenuItem();
        editJMenuItem = new javax.swing.JMenuItem();
        deleteJMenuItem = new javax.swing.JMenuItem();
        searchJMenuItem = new javax.swing.JMenuItem();
        detailsJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        titleJLable.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        titleJLable.setForeground(new java.awt.Color(255, 51, 51));
        titleJLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLable.setText("Welcome to Two Cards Game");

        cards1JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/14.jpg"))); // NOI18N

        cards2JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20.jpg"))); // NOI18N

        clearJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearJButton.setText("Clear");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        drawJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drawJButton.setText("Draw Cards");
        drawJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawJButtonActionPerformed(evt);
            }
        });

        instructionJScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instruction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        instructionJTextArea.setEditable(false);
        instructionJTextArea.setColumns(20);
        instructionJTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructionJTextArea.setLineWrap(true);
        instructionJTextArea.setRows(5);
        instructionJTextArea.setText("Enter amount willing to bet in order to play this game: two cards are drawn randomly without replacement. If they are the same value, you win 20 times you bet; else you lose your bet. Click on Draw Cards when ready.");
        instructionJTextArea.setWrapStyleWord(true);
        instructionJScrollPane.setViewportView(instructionJTextArea);

        betJLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        betJLabel.setText("What is your bet:");

        resultJScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        resultJTextArea.setEditable(false);
        resultJTextArea.setColumns(20);
        resultJTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultJTextArea.setLineWrap(true);
        resultJTextArea.setRows(5);
        resultJTextArea.setWrapStyleWord(true);
        resultJScrollPane.setViewportView(resultJTextArea);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Players", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        playersJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                playersJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(playersJList);

        fileJMenu.setText("File");

        newJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newJMenuItem.setMnemonic('N');
        newJMenuItem.setText("New");
        newJMenuItem.setToolTipText("New Form");
        newJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(newJMenuItem);

        printJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setToolTipText("Print the result");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        printFormJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        printFormJMenuItem.setMnemonic('f');
        printFormJMenuItem.setText("Print Form");
        printFormJMenuItem.setToolTipText("Print the GUI");
        printFormJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printFormJMenuItem);

        saveJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveJMenuItem.setMnemonic('S');
        saveJMenuItem.setText("Save");
        saveJMenuItem.setToolTipText("Save the result");
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitJMenuItem.setMnemonic('e');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("Exit the Form");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        jMenuBar1.add(fileJMenu);

        playerJMenu.setText("Players Database");

        addJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        addJMenuItem.setMnemonic('a');
        addJMenuItem.setText("Add New Player");
        addJMenuItem.setToolTipText("Add a New Player");
        addJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJMenuItemActionPerformed(evt);
            }
        });
        playerJMenu.add(addJMenuItem);

        editJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editJMenuItem.setMnemonic('e');
        editJMenuItem.setText("Edit Player");
        editJMenuItem.setToolTipText("Edit a Player");
        editJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJMenuItemActionPerformed(evt);
            }
        });
        playerJMenu.add(editJMenuItem);

        deleteJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deleteJMenuItem.setMnemonic('d');
        deleteJMenuItem.setText("Delete Player");
        deleteJMenuItem.setToolTipText("Delete a Player");
        deleteJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJMenuItemActionPerformed(evt);
            }
        });
        playerJMenu.add(deleteJMenuItem);

        searchJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        searchJMenuItem.setMnemonic('r');
        searchJMenuItem.setText("Search Player");
        searchJMenuItem.setToolTipText("Search for a Player");
        searchJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJMenuItemActionPerformed(evt);
            }
        });
        playerJMenu.add(searchJMenuItem);

        detailsJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        detailsJMenuItem.setMnemonic('y');
        detailsJMenuItem.setText("Player Details");
        detailsJMenuItem.setToolTipText("About the player");
        detailsJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsJMenuItemActionPerformed(evt);
            }
        });
        playerJMenu.add(detailsJMenuItem);

        jMenuBar1.add(playerJMenu);

        helpJMenu.setMnemonic('h');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("");

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setMnemonic('A');
        aboutMenuItem.setText("About");
        aboutMenuItem.setToolTipText("About the Game");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutMenuItem);

        jMenuBar1.add(helpJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(titleJLable, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cards1JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cards2JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(drawJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(betJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(betJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructionJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLable, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cards1JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cards2JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(betJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(betJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(instructionJScrollPane)
                    .addComponent(resultJScrollPane))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        ExitJMenuItemActionPerformed()
    * Description   Calls the ExitJButtonActionPerformed to end the application
    * Date          3/9/2021
    * History Log   3/9/2021
    * @author       <i>Nguyen Vi Cao</i>	
    * @param        evt java.awt.event.ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        savePlayers(fileName);
        System.exit(0);
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        saveJMenuItemActionPerformed()
    * Description   Saves the content of the resultJTextArea to an external file 
    *               with the player.
    * Date          3/9/2021
    * History Log   3/9/2021
    * @author       <i>Nguyen Vi Cao</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          java.io.FileWriter  
    * @see          java.io.PrintWriter
    * @see          java.io.IOException 
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
        try
        {
            FileWriter filePointer = new FileWriter("src/Project3/Result.txt", false);
            PrintWriter output = new PrintWriter(filePointer, true);
            output.write(resultJTextArea.getText());
            output.close();
        }
        catch (IOException exp)
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_saveJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *	Method          printJMenuItemActionPerformed()
    *	Description     Print the result.
    *	Date            3/9/2021
    *   History Log     3/9/2021
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@param		evt java.awt.event.ActionEvent
    *   @see            java.awt.event.ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        JTextArea output = new JTextArea();
        output.setText(resultJTextArea.getText());
        try
        {
            output.print();
        }
        catch (PrinterException ex)
        {
            JOptionPane.showMessageDialog(this, "Unable to print", 
                    "Printer Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_printJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *	Method          printJMenuItemActionPerformed()
    *	Description     Print the GUI.
    *	Date            3/9/2021
    *   History Log     3/9/2021
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@param		evt java.awt.event.ActionEvent
    *   @see            java.awt.event.ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printFormJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormJMenuItemActionPerformed
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printFormJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        newJMenuItemActionPerformed()
    * Description   show a JFileChooser with an OpenDialog to select a different
    *               plyaer Database
    * @parem        evt ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          3/9/2021
     * History log  3/9/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void newJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJMenuItemActionPerformed
        JFileChooser chooser = new JFileChooser("src/Project3");
        //Filter only txt files
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Txt files", "txt");
        chooser.setFileFilter(filter);
        int choice = chooser.showOpenDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION)
        {
            //clear existing operas ArrayList and JList
            players.clear();
            playersJList.removeAll();
            File chosenFile = chooser.getSelectedFile();
            String file = "src/Project3/" + chosenFile.getName();
            
            //need to update fileName to save changes in coorect file --cannot be final
            fileName = file;
            
            System.out.println("file = " + file);
            readFromFile(file);
            displayPlayers();
        }
        else
        {
//            JOptionPane.showMessageDialog(null, "Unable to read file",
//                    "File input error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_newJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        aboutJMenuItemActionPerformed()
    * Description   Creates and shows the About form
    * Date          3/9/2021
    * History Log   3/9/2021
    * @author       <i>Nguyen Vi Cao</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          java.text.DecimalFormat
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        About myAbout = new About(this, true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        drawJButtonActionPerformed()
    * Description   shuffle the deck as well as calculate the balance of each
    *               plyaer
    * Date          3/9/2021
    * History Log   3/9/2021
    * @author       <i>Nguyen Vi Cao</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void drawJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawJButtonActionPerformed
        for (int i = 0; i < 1; i++)
        {
            // shuffle deck
            cards1.setCard(Cards.shuffle());
            cards2.setCard(Cards.shuffle());
        }
        // set image to labels
        setLabel(cards1JLabel, "src/Images/", cards1.getCard());
        setLabel(cards2JLabel, "src/Images/", cards2.getCard());
        
        String selectedPlayerName = playersJList.getSelectedValue();
        Player currentPlayer = searchPlayer(selectedPlayerName);
        
        String betString = betJTextField.getText();
        
        if(Validation.isDouble(betString, 0, currentPlayer.getBalance()) 
            || betString.equals(null) || betString.equals(""))
        {
            double bet = 0;
            if (!(betString.equals(null) || betString.equals("")))
                bet = Integer.parseInt(betString);
            displayCards();
            
            if (cards1 == cards2)
            {
                currentPlayer.setBalance(currentPlayer.getBalance() + ODDS * bet);
                resultJTextArea.setText("You Won!!" + currentPlayer.getName()
                    + ".\nCurrent balance = " + currentPlayer.getBalance());
            }
            else
            {
                currentPlayer.setBalance(currentPlayer.getBalance() - bet);
                resultJTextArea.setText("You Lost!!" + currentPlayer.getName()
                    + ".\nCurrent balance = " + currentPlayer.getBalance());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Illegal Amount -- amount must be > 0 and "
            + " <= " + dollars.format(currentPlayer.getBalance()),
                "Input error", JOptionPane.WARNING_MESSAGE);
            betJTextField.requestFocus();
            betJTextField.selectAll();
        }
        //reset card deck
        //myDeck = new DeckOfCards();
    }//GEN-LAST:event_drawJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          deleteJMenuItemActionPerformed()
    *	Description     event handler for deleteJButton to delete selected player
    *	Date            9/3/2021
    *   History log     9/3/2021
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		evt ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void deleteJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJMenuItemActionPerformed
        String playerName = playersJList.getSelectedValue();
        
        int commaIndex = playerName.indexOf(',');
        if (commaIndex > -1)
            playerName = playerName.substring(0, commaIndex);
        int result = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to delete " + playerName + "?", "Delete Player",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (result == JOptionPane.OK_OPTION)
        {
            Player playerToBeRemoved = searchPlayer(playerName);
            players.remove(playerToBeRemoved);
            displayPlayers();
            savePlayers(fileName);
        }
        playersJList.setSelectedIndex(0);
    }//GEN-LAST:event_deleteJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          savePlayers()
    *	Description     write player to a text file that is comma delimited
    *   @parem          file String
    *	Date            9/3/2021
    *   History log     9/3/2021 
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@see            java.io.FileWriter
    *   @see            java.io.PrintWriter
    *   @see            Player
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void savePlayers (String file)
    {
        try
        {
            //writeToFile(fileName);
            FileWriter filePointer = new FileWriter (file, false);
            PrintWriter output = new PrintWriter (filePointer);
            for (int index = 0; index < players.size(); index++)
            {
                Player tempPlayer = new Player();
                String line = "";
                Iterator iterator = players.iterator();
                while (iterator.hasNext())
            {
                tempPlayer = (Player)iterator.next(); 
                line = tempPlayer.getName() + "," + 
                       tempPlayer.getAge() + "," + tempPlayer.getBalance();
            }
                // don't add an extra blank line to end of file
                if (index == players.size() - 1)
                    output.write(line);
                else
                    output.write(line + "\n");
            }
            output.close();
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Player not saved", "Save Error",
                    JOptionPane.WARNING_MESSAGE);
            playersJList.setVisible(true);
            playersJList.setSelectedIndex(0);
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          searchJMenuItemActionPerformed()
    *	Description     event handler for searchJMenuItem. It calls searchPlayer 
    *                   method
    *	Date            9/3/2021
    *   History log     9/3/2021
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		evt ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void searchJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJMenuItemActionPerformed
        String playerName = JOptionPane.showInputDialog(null, 
                "Enter name of player: ", "Search Player by Name", 
                JOptionPane.INFORMATION_MESSAGE);
        Player aPlayer = searchPlayer(playerName);
        if (aPlayer != null)
            playersJList.setSelectedValue(aPlayer.getName(), true);
        else
            JOptionPane.showConfirmDialog(null, playerName +
                    " is not in the Database!", "Player Not Found",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_searchJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        addJMenuItemActionPerformed()
    * Description   event handler for adding a player by invoking the AddPlayer
    *               form. No empty or duplicate player is added. The new player is
    *               added to the JList and saved in the Players.txt file
    * @parem        evt--ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          9/3/2021
    * History log   9/3/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void addJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJMenuItemActionPerformed
        //add new player
        try
        {
            //create and display a new AddDialog
            AddPlayer addPlayer = new AddPlayer(this, true);
            addPlayer.setVisible(true);
            
            //the modal dialog takes focus, upon regaining focus
            Player newPlayer = addPlayer.getPlayer();
            //System.out.println("Opera exist: " + operas.contains(newOpera));
            if (newPlayer != null) //&& !players.contains(newPlayer))
            //if (newOpera != null && !opera.contains(newOpera))
            {
                //add the new opera to the database
                players.add(newPlayer);
                displayPlayers();                //refresh GUI
                //searchPlayer(newPlayer.getName());  //highlight added player
                playersJList.setSelectedValue(newPlayer.getName(), true);
                //save new player to file
                savePlayers(fileName);
                //saveXMLOperas("src\Project1\AltOperas.xml";
            }
            else 
            {
                //JOptionPane.showMessageDialog(null, "Opera not Added", 
                //"Opera is null or already exists", JOptionPane.WARNING_MESSAGE);
                playersJList.setVisible(true);
                playersJList.setSelectedIndex(0);
            }
        }
        catch (NullPointerException nullex)
        {
            JOptionPane.showMessageDialog(null, "Player not added", 
                    "Input Error", JOptionPane.WARNING_MESSAGE);
            playersJList.setVisible(true);
            playersJList.setSelectedIndex(0);
        }
    }//GEN-LAST:event_addJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        playersJListValueChanged()
    * Description   Event handler for playersJListValueChanged to update 
    *               information on selected player
    * @parem        evt ListSelectionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          9/3/2021
    * History log   9/3/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void playersJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_playersJListValueChanged
        String selectedPlayerName = playersJList.getSelectedValue();
        Player selectedPlayer = searchPlayer(selectedPlayerName);
        if(selectedPlayer != null)
        resultJTextArea.setText(selectedPlayer.toString());
    }//GEN-LAST:event_playersJListValueChanged

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        editJMenuItemActionPerformed()
    * Description   event handler to edit selected opera
    * @parem        evt--ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          9/3/2021
    * History log   9/3/2021 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void editJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJMenuItemActionPerformed
        try
        {
            //get name of selected player
            String playerName = playersJList.getSelectedValue().toString();
            //remove population if edit mode is on sorted operas by population
            if (playerName.contains("'"))
                playerName = playerName.substring(0, playerName.indexOf(','));
            
            //create a temp player to populate fields of form
            Player playerToEdit = new Player(searchPlayer(playerName));
            int index = playersJList.getSelectedIndex();
            
            //pass player info to EditPlayer constructor and view Edit form
            EditPlayer editedPlayer = new EditPlayer(playerToEdit);
            editedPlayer.setVisible(true);
            
            //get edited player and add to array list
            if (editedPlayer.getPlayer() != null)
            {
                //remove old player from ArrayList
                players.remove(index);
                
                //add edited player to ArrayList
                players.add(editedPlayer.getPlayer());
                
                //save new player list to file and display new player in JList
                savePlayers(fileName);
                displayPlayers();
            }
        }
        catch (NullPointerException nullex)
        {
            JOptionPane.showMessageDialog(null, "Player not edited",
                    "Input Error", JOptionPane.WARNING_MESSAGE);
            playersJList.setVisible(true);
            playersJList.setSelectedIndex(0);
        }
    }//GEN-LAST:event_editJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        detailsJMenuItemActionPerformed()
    * Description   Creates and shows the playerDetail form
    * Date          3/9/2021
    * History Log   3/9/2021
    * @author       <i>Nguyen Vi Cao</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          java.text.DecimalFormat
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void detailsJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsJMenuItemActionPerformed
        PlayerDetails playerQuote;
        int index = playersJList.getSelectedIndex();
        if(index >= 0)
        {
            String playerName = playersJList.getSelectedValue();
            Player player = new Player(searchPlayer(playerName));
            playerQuote = new PlayerDetails(player);
            playerQuote.setVisible(true);
        }
    }//GEN-LAST:event_detailsJMenuItemActionPerformed

    
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        betJTextField.setText("");
    }//GEN-LAST:event_clearJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          playerExists()
    *	Description     boolean method to determine if an player to be added exists
    *	Date            9/3/2021
    *   History log     9/3/2021
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@param		aPlayer Player
    *   @return         thereIsOne boolean
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public boolean playerExists(Player aPlayer)
    {
        return players.contains(aPlayer);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          searchPlayer()
    *	Description     Search for a player by name and highlight if found
    *	Date            9/3/2021
    *   History Log     9/3/2021  
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		playerName String
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private Player searchPlayer(String playerName)
    {
        if((playerName != null) && (playerName.length() > 0))
        {
            boolean found = false;
            Player aPlayer = null;
            
            Iterator iterator = players.iterator();
            
            while (iterator.hasNext() && !found)
            {
                aPlayer = (Player)iterator.next();
                
                if(aPlayer.getName().toLowerCase().contains(playerName.toLowerCase()))
                {
                    found = true;
                    return aPlayer;
                }
            }
        }
        return null;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          linearSearch()
    *	Description     event handler to search player by name using the linear
    *                   serach algorithm and to display its index if found and 
    *                   -1 if not found
    *   @return         index int
    *   @param          playerArray String[]
    *   @param          playerName String
    *	Date            3/9/2021
    *   History log     3/9/2021
    *	@author         <i>Nguyen Vi Cao</i>
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private int linearSearch (String[] playerArray, String playerName)
    {
        int index = -1;
        boolean found = false;
        for (int i = 0; i < playerArray.length && !found; i++)
        {
            if(playerArray[i].toLowerCase().contains(playerName.toLowerCase()))
            {
                index = i;
                found = true;
            }
        }
        return index;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *	Method          setLabel()
    *	Description     Method to set the correct image on the given label.
    *   @param          label Jlabel
    *   @param          folder String
    *   @param          num int
    *   @see            java.awt.event.ActionEvent
    *	Date            3/9/2021
    *   History Log     3/9/2021
    *	@author         <i>Nguyen Vi Cao</i>	
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setLabel(JLabel label, String folder, int num)
    {
        String image = folder + num + ".jpg";
        label.setIcon(new ImageIcon(image));
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
            java.util.logging.Logger.getLogger(TwoCardsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoCardsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoCardsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoCardsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        Splash mySplash = new Splash(3500);
        mySplash.showSplash();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoCardsGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem addJMenuItem;
    private javax.swing.JLabel betJLabel;
    private javax.swing.JTextField betJTextField;
    private javax.swing.JLabel cards1JLabel;
    private javax.swing.JLabel cards2JLabel;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem deleteJMenuItem;
    private javax.swing.JMenuItem detailsJMenuItem;
    private javax.swing.JButton drawJButton;
    private javax.swing.JMenuItem editJMenuItem;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JScrollPane instructionJScrollPane;
    private javax.swing.JTextArea instructionJTextArea;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newJMenuItem;
    private javax.swing.JMenu playerJMenu;
    private javax.swing.JList<String> playersJList;
    private javax.swing.JMenuItem printFormJMenuItem;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JScrollPane resultJScrollPane;
    private javax.swing.JTextArea resultJTextArea;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JMenuItem searchJMenuItem;
    private javax.swing.JLabel titleJLable;
    // End of variables declaration//GEN-END:variables
}
