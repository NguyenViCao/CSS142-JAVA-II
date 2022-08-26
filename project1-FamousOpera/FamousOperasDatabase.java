package Project1;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        FamousOperasDatabase.java
 * Project      Famous Operas Database
 * Description  A class representing the GUI used in a maintaining a operas 
 *              database obtained from a text file, Operas.txt with 6 fields:
 *              Composer, Name of famous composition, year first performed, 
 *              city where first performed, Sypnosis, link to YouTube. 
 *              Functionalities include: viewing of the data for selected opera,
 *              add, delete, edit, sort by name, year, and search for cpecified 
 *              opeara.
 * File         FamousOperasDatabase.java
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds Community College
 * Date         1/27/2021
 * History log  1/10/2021, 1/20/2021
 *
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	%1% %2%
 * @see     	javax.swing.JFrame
 * @see         java.awt.Toolkit
 * @see         java.util.ArrayList
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class FamousOperasDatabase extends javax.swing.JFrame 
{
    //class instance ArrayList of Opera objects
    private ArrayList<Opera> operas = new ArrayList<Opera>();
    //external file name for operas
    private String fileName = "src/Project1/Operas.txt";
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     FamousOperasDatabase()-default constructor
     * Description     Create an instance of the FamousOperasDatabase class , 
     *                 set the default JButton to be addJButton, set icon image,
     *                 centers form.
     * @author         <i>Nguyen Vi Cao</i>
     * Date            1/27/2021
     * History Log     1/10/2021, 1/20/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public FamousOperasDatabase() 
    {
        initComponents();
        this.getRootPane().setDefaultButton(addJButton); //set addJButton as default
        this.setIconImage(Toolkit.getDefaultToolkit().
                getImage("src/Project1/rigoletto-1024x623.jpg"));
        //centers the form at start.
        setLocationRelativeTo(null);
        //Read from an external text file Operas.txt and populate the ArrayList 
        //of Opera type
        readFromFile(fileName);
//        show the member list in the JList and display data for selected opera
        displayOperas();
        int index = operasJList.getSelectedIndex();
        if(index>=0)
            showOperaData(operasJList.getSelectedIndex());
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       readFromFile
     * Description  Reads operas from a text file that is comma delimited and
     *              creates an instance of the Opera class with the data read.
     *              Then the newly created opera is added to the operas database.
     *              Uses an object from the ReadFile class to read record.
     * @author      <i>Nguyen Vi Cao</i>
     * @param       file
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * @see         java.util.Scanner
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void readFromFile (String file)
    {
        operas.clear();             //clear the ArrayList
        //Create a OperaFileReader object to read city data
        //OperaFileReader fileReader = new OperaFileReader(file);
        //Scanner keyboard = null;  //first attemp with no OperaFileReader
        //if (fileReader.getFileExists())
        try 
        {
            //FileReader inputFile = new FileReader(file);
            //BufferedReader input = new BufferedReader(inputFile);
            //read while there is data
            Scanner input = new Scanner (new File(file));   //alternative to FileReader and BufferedReader
            String line = "";
            Opera metropolis = null;
            StringTokenizer token = null;
            while(input.hasNextLine())
            {
                line = input.nextLine();
                metropolis = new Opera();
                token = new StringTokenizer(line, "|");
                while (token.hasMoreElements())
                {
                    metropolis.setName(token.nextToken());
                    metropolis.setComposer(token.nextToken());                    
                    metropolis.setYear(Integer.parseInt(token.nextToken()));
                    metropolis.setCity(token.nextToken());
                    metropolis.setSypnosis(token.nextToken());
                    metropolis.setLink(token.nextToken());
                }
                //add opera to arraylist
                operas.add(metropolis);
            }
            input.close();
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, file + "does not exist",
                    "File input Error", JOptionPane.WARNING_MESSAGE);
            //bring up JFileChooser to select file in current directory
            JFileChooser chooser = new JFileChooser("src/Project1");
            //filter only txt file
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Txt Files", "txt");
            chooser.setFileFilter(filter);
            int choice = chooser.showOpenDialog(null);
            if (choice == JFileChooser.APPROVE_OPTION)
            {
                File chosenFile = chooser.getSelectedFile();
                file = "src/Project1/" + chosenFile.getName();
                System.out.println("file = " + file);
                readFromFile(file);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Unable to read file",
                        "File input error", JOptionPane.WARNING_MESSAGE);
            }
        }
//        catch(IOException e)
//        {
//            JOptionPane.showMessageDialog(null, "Unable to read file",
//                        "File input error", JOptionPane.WARNING_MESSAGE);
//            System.exit(0);
//        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>>
     * Method       displayOperasList
     * Description  Displays operas in JList sorted by level = 0 using 
     *              selection sort algorithm or last name = 1 using the 
     *              insertion sort algorithm.
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * @see         #selectionSort
     * @see         #insetionSort
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void displayOperas()
    {
        int location = operasJList.getSelectedIndex();      //get index of current opera
        String[] operasList = new String[operas.size()];    //array with names only
        if (byYearJRadioButtonMenuItem.isSelected())
        {
            //sort by size using selection sort in descending order and display name and year
            //sort by population using quick sort in descending order and display name and year
            selectionSort(operas);
            //quickSort(operas);
            for (int index = 0; index < operas.size(); index++)
            {
                operasList[index] = operas.get(index).getName() + ", "
                        + operas.get(index).getYear();
            }
        }
        else
        {
            //sort by opera name using insertion sort and display name only
            insertionSort(operas);
            //sort by opera name using merg sort and display name only
            //mergeSort(operas);
            for(int index = 0; index < operas.size(); index++)
            {
                operasList[index] = operas.get(index).getName();
            }
        }
        operasJList.setListData(operasList);
        if(location < 0)
            operasJList.setSelectedIndex(0);
        else
            operasJList.setSelectedIndex(location);
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>>
     * Method       showOperaData()
     * Description  display information about selected opera
     * @param       index int
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    private void showOperaData (int index)
    {
        if(index >= 0 && index < operas.size())
        {
            composerJTextField.setText(operas.get(index).getName());
            nameJTextField.setText(operas.get(index).getComposer());
            yearJTextField.setText(String.valueOf(operas.get(index).getYear()));
            cityJTextField.setText(operas.get(index).getCity());
            sypnosisJTextField.setText(operas.get(index).getSypnosis());
            linkJTextField.setText(operas.get(index).getLink());
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       insertionSort
     * Description  Sorts ArrayList operas in ascending order by name. Uses 
     *              the insertion sort algorithm which inserts city at correct 
     *              position and shuffles everyone else below that position.
     * @param       operas ArrayList
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public static void insertionSort(ArrayList <Opera> operas)
    {
        int i, j;
        for (i = 0; i < operas.size(); i++)
        {
            Opera temp = operas.get(i);
            j = i - 1;
            while (j >= 0 && operas.get(j).getName().compareToIgnoreCase(temp.getName()) > 0)
            {
                operas.set (j + 1, operas.get(j));
                j--;
            }
            operas.set(j + 1, temp);
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       selectionSort
     * Description  Sorts ArrayList operas in descending order by population. 
     *              Calls findsMaximum to find city with maximum population in 
     *              each pass and swap to exchange cities when necessary.
     * @param       operas ArrayList
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/             
    public void selectionSort(ArrayList < Opera > operas)
    {
        int max = 0;
        for (int i = 0; i < operas.size(); i++)
        {
            max = findMaximum(operas, i);
            //swap(operas, i , max)
            Opera temp = operas.get(i);
            operas.set(i, operas.get(max));
            operas.set(max, temp);
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       findMaximum
     * Description  Called by selectionSort to find the index of the member 
     *              with the most recent year from a given index to the end 
     *              of the ArrayList
     * @param       operas ArrayList
     * @param       i index from which to search for the max greater than 0
     * @return      int i
     * @author      <i>Nguyen Vi Cao</i>
     * Date         1/27/2021
     * History log  1/10/2021, 1/20/2021
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public int findMaximum (ArrayList < Opera > operas, int i)
    {
        int j, max = i;
        for (j = i + 1; j < operas.size(); j++)
        {
            if (operas.get(j).getYear() > operas.get(max).getYear())
                max = j;
        }
        return max;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchingJButtonGroup = new javax.swing.ButtonGroup();
        titleJPanel = new javax.swing.JPanel();
        logoJLabel = new javax.swing.JLabel();
        titleJLabel = new javax.swing.JLabel();
        logoJLabel1 = new javax.swing.JLabel();
        displayJPanel = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        composerJLabel = new javax.swing.JLabel();
        composerJTextField = new javax.swing.JTextField();
        yearJLabel = new javax.swing.JLabel();
        yearJTextField = new javax.swing.JTextField();
        cityJLabel = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        synopsisJLabel = new javax.swing.JLabel();
        sypnosisJTextField = new javax.swing.JTextField();
        linkJLabel = new javax.swing.JLabel();
        linkJTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        addJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        operasJList = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        newJMenuItem = new javax.swing.JMenuItem();
        printFormJMenuItem = new javax.swing.JMenuItem();
        printOperaJMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        sortingJMenu = new javax.swing.JMenu();
        byNameJRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        byYearJRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        databaseJMenu = new javax.swing.JMenu();
        addJMenuItem = new javax.swing.JMenuItem();
        deleteJMenuItem = new javax.swing.JMenuItem();
        editJMenuItem = new javax.swing.JMenuItem();
        searchJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Famous Operas Database");

        logoJLabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        logoJLabel.setForeground(new java.awt.Color(51, 0, 0));
        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/unnamed.jpg"))); // NOI18N

        titleJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 48)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(51, 0, 0));
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Famous Operas");

        logoJLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        logoJLabel1.setForeground(new java.awt.Color(51, 0, 0));
        logoJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/rigoletto-1024x623.jpg"))); // NOI18N

        javax.swing.GroupLayout titleJPanelLayout = new javax.swing.GroupLayout(titleJPanel);
        titleJPanel.setLayout(titleJPanelLayout);
        titleJPanelLayout.setHorizontalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleJPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(logoJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(logoJLabel))
        );
        titleJPanelLayout.setVerticalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoJLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        displayJPanel.setLayout(new java.awt.GridLayout(6, 2, 3, 3));

        nameJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJLabel.setText("Name of famous opera");
        displayJPanel.add(nameJLabel);

        nameJTextField.setEditable(false);
        nameJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        displayJPanel.add(nameJTextField);

        composerJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        composerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        composerJLabel.setText("Composer");
        displayJPanel.add(composerJLabel);

        composerJTextField.setEditable(false);
        composerJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayJPanel.add(composerJTextField);

        yearJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearJLabel.setText("Year first performed");
        displayJPanel.add(yearJLabel);

        yearJTextField.setEditable(false);
        yearJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayJPanel.add(yearJTextField);

        cityJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityJLabel.setText("City where first performed");
        displayJPanel.add(cityJLabel);

        cityJTextField.setEditable(false);
        cityJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayJPanel.add(cityJTextField);

        synopsisJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        synopsisJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        synopsisJLabel.setText("Sypnopsis");
        displayJPanel.add(synopsisJLabel);

        sypnosisJTextField.setEditable(false);
        sypnosisJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sypnosisJTextField.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                sypnosisJTextFieldMouseWheelMoved(evt);
            }
        });
        displayJPanel.add(sypnosisJTextField);

        linkJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        linkJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkJLabel.setText("Link to YouTube");
        displayJPanel.add(linkJLabel);

        linkJTextField.setEditable(false);
        linkJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayJPanel.add(linkJTextField);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 3, 3));

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addJButton);

        editJButton.setText("Edit");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(editJButton);

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleteJButton);

        exitJButton.setText("Exit");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(exitJButton);

        operasJList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        operasJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                operasJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(operasJList);

        fileJMenu.setText("File");

        newJMenuItem.setText("New");
        newJMenuItem.setToolTipText("Open a new Database");
        newJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(newJMenuItem);

        printFormJMenuItem.setText("Print Form");
        printFormJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printFormJMenuItem);

        printOperaJMenuItem.setText("Print Opera");
        printOperaJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOperaJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printOperaJMenuItem);
        fileJMenu.add(jSeparator1);

        exitJMenuItem.setText("Exit");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        jMenuBar1.add(fileJMenu);

        sortingJMenu.setText("Sorting");

        searchingJButtonGroup.add(byNameJRadioButtonMenuItem);
        byNameJRadioButtonMenuItem.setSelected(true);
        byNameJRadioButtonMenuItem.setText("By Name");
        byNameJRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byNameJRadioButtonMenuItemActionPerformed(evt);
            }
        });
        sortingJMenu.add(byNameJRadioButtonMenuItem);

        searchingJButtonGroup.add(byYearJRadioButtonMenuItem);
        byYearJRadioButtonMenuItem.setText("By Year");
        byYearJRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byYearJRadioButtonMenuItemActionPerformed(evt);
            }
        });
        sortingJMenu.add(byYearJRadioButtonMenuItem);

        jMenuBar1.add(sortingJMenu);

        databaseJMenu.setText("Database Management");

        addJMenuItem.setText("Add new Opera");
        addJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJMenuItemActionPerformed(evt);
            }
        });
        databaseJMenu.add(addJMenuItem);

        deleteJMenuItem.setText("Delete Opera");
        deleteJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJMenuItemActionPerformed(evt);
            }
        });
        databaseJMenu.add(deleteJMenuItem);

        editJMenuItem.setText("Edit Opera");
        editJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJMenuItemActionPerformed(evt);
            }
        });
        databaseJMenu.add(editJMenuItem);

        searchJMenuItem.setText("Search Opera");
        searchJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJMenuItemActionPerformed(evt);
            }
        });
        databaseJMenu.add(searchJMenuItem);

        jMenuBar1.add(databaseJMenu);

        helpJMenu.setText("Help");

        aboutJMenuItem.setText("About");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        jMenuBar1.add(helpJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 208, Short.MAX_VALUE)
                    .addComponent(displayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(displayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        aboutJMenuItemActionPerformed()
    * Description   event handler for aboutJMenuItem to show the About form
    * @parem        evt ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        //display About form
        About aboutWindow = new About(this,true);
        aboutWindow.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        exitJButtonActionPerformed()
    * Description   Event handler to close the application
    * @param        evt ActionWvent
    * @see          java.awt.event.ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        exitJMenuItemActionPerformed()
    * Description   Call the exitJButtonActionPerformed event handler to exit
    * @param        evt ActionWvent
    * @see          java.awt.event.ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        exitJButtonActionPerformed(evt);
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        operasJListValueChanged()
    * Description   Event handler for operasJListValueChanged to update 
    *               information on selected opera
    * @parem        evt ListSelectionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void operasJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_operasJListValueChanged
        int index = (operasJList.getSelectedIndex());
        if (index >= 0)
            showOperaData(index);
    }//GEN-LAST:event_operasJListValueChanged

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        byNameJRadioButtonMenuItemActionPerformed()
    * Description   event handler for byNameJRadioButtonMenuItemActionPerformed 
    *               to display operas
    * @parem        evt ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void byNameJRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byNameJRadioButtonMenuItemActionPerformed
        //display operas sorted by last name
        displayOperas();
    }//GEN-LAST:event_byNameJRadioButtonMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        byYearJRadioButtonMenuItemActionPerformed()
    * Description   event handler for byYearJRadioButtonMenuItemActionPerformed 
    *               to display operas
    * @parem        evt ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void byYearJRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byYearJRadioButtonMenuItemActionPerformed
        displayOperas();
    }//GEN-LAST:event_byYearJRadioButtonMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        printFormJMenuItemActionPerformed()
    * Description   event handler for printFormJMenuItemActionPerformed to print 
    *               the form as a GUI
    * @parem        evt--ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021  
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printFormJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormJMenuItemActionPerformed
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printFormJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        printOperaJMenuItemActionPerformed()
    * Description   event handler for printOperaJMenuItemActionPerformed to print 
    *               the opera
    * @parem        evt ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021  
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printOperaJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOperaJMenuItemActionPerformed
        int index = operasJList.getSelectedIndex();
        JTextArea printOpera = new JTextArea();
        if (index >= 0)
        {
            try
            {
                Opera temp = new Opera(operas.get(index));
                String output = "Composer: " + temp.getComposer() + "\n" +
                "Name: " + temp.getName() + "\n" + 
                "Year: " + temp.getYear() + "\n" +
                "City: " + temp.getCity() + "\n" + 
                "Sypnosis: " + temp.getSypnosis() + "\n" +
                "Link: " + temp.getLink() +  "\n";
                printOpera.setText(output);
                printOpera.print();
            }
            catch (PrinterException ex)
            {
                JOptionPane.showMessageDialog(null, "Opera not printed",
                        "Print Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_printOperaJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        newJMenuItemActionPerformed()
    * Description   show a JFileChooser with an OpenDialog to delect a different
    *               operas Database
    * @parem        evt ActionWvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void newJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJMenuItemActionPerformed
        JFileChooser chooser = new JFileChooser("src/Project1");
        //Filter only txt files
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Txt files", "txt");
        chooser.setFileFilter(filter);
        int choice = chooser.showOpenDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION)
        {
            //clear existing operas ArrayList and JList
            operas.clear();
            operasJList.removeAll();
            File chosenFile = chooser.getSelectedFile();
            String file = "src/Project1/" + chosenFile.getName();
            
            //need to update fileName to save changes in coorect file --cannot be final
            fileName = file;
            
            System.out.println("file = " + file);
            readFromFile(file);
            displayOperas();
        }
        else
        {
//            JOptionPane.showMessageDialog(null, "Unable to read file",
//                    "File input error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_newJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          deleteJMenuItemActionPerformed()
    *	Description     event handler for deleteJButton to delete selected opera
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021 
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		evt ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // Delete selected city, do nothing on cancel
        int index = operasJList.getSelectedIndex();
        String name = operas.get(index).getName();
        int result = JOptionPane.showConfirmDialog (null, 
                "Are you sure you want to delete " + name + "?", "Delete Opera",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (result == JOptionPane.YES_OPTION)   //confirm delete selected city
        {
            index = operasJList.getSelectedIndex();
            operas.remove(index);
            displayOperas();
            saveOperas(fileName);
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          searchJMenuItemActionPerformed()
    *	Description     event handler for searchJMenuItem. It calls serachOpera 
    *                   method
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021 
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		evt ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void searchJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJMenuItemActionPerformed
        String operaName = JOptionPane.showInputDialog("Enter name of Opera");
        searchOpera(operaName);
    }//GEN-LAST:event_searchJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        addJButtonActionPerformed()
    * Description   event handler for adding a opera by invoking the AddOpera 
    *               form. No empty or duplicate opera is added. The new opera is
    *               added to the JList and saved in the Operas.txt file
    * @parem        evt--ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
    * History log   1/10/2021, 1/20/2021 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        //add new opera
        try
        {
            //create and display a new AddDialog
            AddOpera addOpera = new AddOpera(this, true);
            addOpera.setVisible(true);
            
            //the modal dialog takes focus, upon regaining focus
            Opera newOpera = addOpera.getOpera();
            //System.out.println("Opera exist: " + operas.contains(newOpera));
            if (newOpera != null && !operaExists(newOpera))
            //if (newOpera != null && !opera.contains(newOpera))
            {
                //add the new opera to the database
                operas.add(addOpera.getOpera());
                displayOperas();                //refresh GUI
                searchOpera(newOpera.getComposer());  //highlight added opera
                
                //save new opera to file
                saveOperas(fileName);
                //saveXMLOperas("src\Project1\AltOperas.xml";
            }
            else 
            {
                //JOptionPane.showMessageDialog(null, "Opera not Added", 
                //"Opera is null or already exists", JOptionPane.WARNING_MESSAGE);
                operasJList.setVisible(true);
                operasJList.setSelectedIndex(0);
            }
        }
        catch (NullPointerException nullex)
        {
            JOptionPane.showMessageDialog(null, "Opera not added", 
                    "Input Error", JOptionPane.WARNING_MESSAGE);
            operasJList.setVisible(true);
            operasJList.setSelectedIndex(0);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        editJButtonActionPerformed()
    * Description   event handler for editJButton to edit selected opera
    * @parem        evt--ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
    * History log   1/10/2021, 1/20/2021  
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        try
        {
            //get name of selected opera
            String operaName = operasJList.getSelectedValue().toString();
            //remove population if edit mode is on sorted operas by population
            if (operaName.contains("'"))
                operaName = operaName.substring(0, operaName.indexOf(','));
            
            //create a temp opera to populate fields of form
            Opera operaToEdit = new Opera(findOpera(operaName));
            int index = operasJList.getSelectedIndex();
            
            //pass city info to EditCity constructor and view Edit form
            EditOpera editedOpera = new EditOpera(operaToEdit);
            editedOpera.setVisible(true);
            
            //get edited opera and add to array list
            if (editedOpera.getOpera() != null)
            {
                //remove old opera from ArrayList
                operas.remove(index);
                
                //add edited opera to ArrayList
                operas.add(editedOpera.getOpera());
                
                //save new city list to file and display new city in JList
                saveOperas(fileName);
                displayOperas();
            }
        }
        catch (NullPointerException nullex)
        {
            JOptionPane.showMessageDialog(null, "Opera not edited",
                    "Input Error", JOptionPane.WARNING_MESSAGE);
            operasJList.setVisible(true);
            operasJList.setSelectedIndex(0);
        }
    }//GEN-LAST:event_editJButtonActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        addJMenuItemActionPerformed()
    * Description   calls the addJButtonActionPerformed
    * @parem        evt--ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
     * History log  1/10/2021, 1/20/2021   
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void addJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJMenuItemActionPerformed
        addJButtonActionPerformed(evt);        
    }//GEN-LAST:event_addJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        editJMenuItemActionPerformed()
    * Description   calls the editJMenuItemActionPerformed
    * @parem        evt--ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
    * History log  1/10/2021, 1/20/2021 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void editJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJMenuItemActionPerformed
        editJButtonActionPerformed(evt);
    }//GEN-LAST:event_editJMenuItemActionPerformed

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          deleteJMenuItemActionPerformed()
    *	Description     event handler for addJMenuItem to invoke the deleteJMenuItem
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021   
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@param		evt ActionEvent
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void deleteJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJMenuItemActionPerformed
        deleteJButtonActionPerformed(evt);
    }//GEN-LAST:event_deleteJMenuItemActionPerformed

    private void sypnosisJTextFieldMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_sypnosisJTextFieldMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sypnosisJTextFieldMouseWheelMoved
            
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          findOpera()
    *	Description     Search for an opera by name and return the opera if found
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021 
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		operaName String
    *   @return         Opera
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private Opera findOpera(String operaName)
    {
        int index = -1;
        //make sure JList is sorted by name
        byNameJRadioButtonMenuItem.doClick();
        for (int i = 0; i < operas.size(); i++)
        {
            if (operaName.equals(operas.get(i).getName()))
                index = i;
        }
        if (index >= 0)
        {
            operasJList.setSelectedIndex(index);
            return operas.get(index);
        }
        else 
            return null;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          operaExists()
    *	Description     boolean method to determine if an opera to be added exists
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021 
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@param		metropolis Opera
    *   @return         thereIsOne boolean
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private boolean operaExists(Opera metropolis)
    {
        boolean thereIsOne = false;
        for(int index = 0; index < operas.size() && !thereIsOne; index++)
        {
            if (operas.get(index).equals(metropolis))
            thereIsOne = true;
        }
        return thereIsOne;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          searchOpera()
    *	Description     Search for an opera by name and highlight if found
    *	Date            1/8/2021
    *   History Log     1/5/2021, 1/8/2021  
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@parem		cityName String
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void searchOpera(String operaName)
    {
        if((operaName != null) && (operaName.length() > 0))
        {
            //sort the JList of city name by name
            byNameJRadioButtonMenuItem.setSelected(true);
            displayOperas();
            
            //create a String array of city by name
            String[] operaArray = new String[operas.size()];
            for (int i = 0; i < operaArray.length; i++)
                operaArray[i] = operas.get(i).getName();
            
            //find index of opera
            //int index = binarySearch(operaArray, operaName.toLowerCase());
            int index = linearSearch(operaArray, operaName);
            if (index < -1)
            {
                JOptionPane.showMessageDialog(null, "Opera " + operaName + 
                        " not Found", "Search Result", JOptionPane.WARNING_MESSAGE);
                operasJList.setSelectedIndex(0);
            }
            else
                operasJList.setSelectedIndex(index);
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          linearSearch()
    *	Description     event handler to search opera by name using the linear
    *                   serach algorithm and to display its index if found and 
    *                   -1 if not found
    *   @return         index int
    *   @param          operaArray String[]
    *   @param          operaName String
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021 
    *	@author         <i>Nguyen Vi Cao</i>
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private int linearSearch (String[] operaArray, String operaName)
    {
        int index = -1;
        boolean found = false;
        for (int i = 0; i < operaArray.length && !found; i++)
        {
            if(operaArray[i].toLowerCase().contains(operaName.toLowerCase()))
            {
                index = i;
                found = true;
            }
        }
        return index;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          binarySearch()
    *	Description     search by opera name using the binary search method.
    *                   Returns -1 if opera is not found
    *   @param          array String[]
    *   @param          key String
    *   @return         middle int, index of where opera is found
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021 
    *	@author         <i>Nguyen Vi Cao</i>
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static int binarySearch(String[] array, String key)
    {
        int low = 0;
        int high = array.length - 1;
        int middle;
        
        while (low <= high)
        {
            middle = (low + high) / 2;
            //if (key.equalsIgnoreCase(array([middle]))     //exact match
            if (array[middle].contains(key))                //partial match
                return middle;
            else if (key.compareToIgnoreCase(array[middle]) < 0)
                high = middle - 1;              //search low end of array
            else 
                low = middle + 1;               //search high end of array
        }
        return -1;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *   Method          saveOperas()
    *	Description     write opera to a text file that is comma delimited
    *   @parem          file String
    *	Date            1/27/2021
    *   History log     1/10/2021, 1/20/2021  
    *	@author         <i>Nguyen Vi Cao</i>	
    *	@see            java.io.FileWriter
    *   @see            java.io.PrintWriter
    *   @see            City
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveOperas (String file)
    {
        try
        {
            //writeToFile(fileName);
            FileWriter filePointer = new FileWriter (file, false);
            PrintWriter output = new PrintWriter (filePointer);
            for (int index = 0; index < operas.size(); index++)
            {
                Opera tempOpera = operas.get(index);
                String line = tempOpera.getName() + "|" + 
                       tempOpera.getComposer() + "|" + tempOpera.getYear() + 
                       "|" + tempOpera.getCity() + "|" + tempOpera.getSypnosis()
                       + "|" + tempOpera.getLink();
                // don't add an extra blank line to end of file
                if (index == operas.size() - 1)
                    output.write(line);
                else
                    output.write(line + "\n");
            }
            output.close();
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Opera not saved", "Save Error",
                    JOptionPane.WARNING_MESSAGE);
            operasJList.setVisible(true);
            operasJList.setSelectedIndex(0);
        }
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        main()
    * Description   Call the contructor to create an instance of the form
    * @param        args are the command line strings
    * @author       <i>Nguyen Vi Cao</i>
    * Date          1/27/2021
    * History log   1/10/2021, 1/20/2021 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public static void main(String args[]) {
        //</editor-fold>
        Splash mySplash = new Splash(3000);
        mySplash.showSplash();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FamousOperasDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JButton addJButton;
    private javax.swing.JMenuItem addJMenuItem;
    private javax.swing.JRadioButtonMenuItem byNameJRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem byYearJRadioButtonMenuItem;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JLabel composerJLabel;
    private javax.swing.JTextField composerJTextField;
    private javax.swing.JMenu databaseJMenu;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JMenuItem deleteJMenuItem;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JButton editJButton;
    private javax.swing.JMenuItem editJMenuItem;
    private javax.swing.JButton exitJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel linkJLabel;
    private javax.swing.JTextField linkJTextField;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JLabel logoJLabel1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JMenuItem newJMenuItem;
    private javax.swing.JList<String> operasJList;
    private javax.swing.JMenuItem printFormJMenuItem;
    private javax.swing.JMenuItem printOperaJMenuItem;
    private javax.swing.JMenuItem searchJMenuItem;
    private javax.swing.ButtonGroup searchingJButtonGroup;
    private javax.swing.JMenu sortingJMenu;
    private javax.swing.JLabel synopsisJLabel;
    private javax.swing.JTextField sypnosisJTextField;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JLabel yearJLabel;
    private javax.swing.JTextField yearJTextField;
    // End of variables declaration//GEN-END:variables
}
