package Project2;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * File         GeometriesGUI.java
 * Description  reads three vertices for a triangle and computes the perimeter
 *              and the area of the triangle if the input is valid. Otherwise,
 *              display that the input is invalid. The input is valid if the sum
 *              of any pair of two sides isgreater than the remaining side.
 * 
 *              Suppose a right triangle is placed in a planewith the right-angle
 *              point is placed at (0,0), and the other two points are placed at
 *              (c,0), and (0,b). Write a program that prompts the user to enter 
 *              a point with x- and y- coordinates and determines wheter the point
 *              is inside the triangle.
 * Project      project 2
 * Date         2/18/2021
 * @author	<i>Nguyen Vi Cao</i>
 * @version 	%1% %2%
 * @see         java.awt.Toolkit
 * @see         java.text.DecimalFormat
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class GeometriesGUI extends javax.swing.JFrame 
{
    private StringBuilder output = new StringBuilder();
    private DecimalFormat twoDecimals = new DecimalFormat("#,##0.00");
    private Triangle myTriangle;
    private Circle myCircle;
    private Rectangle myRectangle;
    private Parallelogram myParallelogram;
    private Trapezoid myTrapezoid;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     Geometries()
     * Description     Default constructor. Builds the GUI, creates instance of
     *                 the default button, and sets pi jpg as icon for the GUI
     * @author         <i>Nguyen Vi Cao</i>
     * @see            java.awt.Toolkit
     * Date            2/18/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public GeometriesGUI() {
        initComponents();
        myTriangle = new Triangle();
        myCircle = new Circle();
        myRectangle = new Rectangle();
        myParallelogram = new Parallelogram();
        myTrapezoid = new Trapezoid();
        //set as image the Scalene.png
        this.setIconImage(Toolkit.getDefaultToolkit().
                getImage("src/Images/download.png"));
        setDate();              //call a private method to set date in title bar
    }
    
    private void triangleJPanelComponentShown (java.awt.event.ComponentEvent evt)
    {
        this.getRootPane().setDefaultButton(calculateJButton);
        x1JTextField.requestFocus();
    }
    
    private void circleJPanelComponentShown (java.awt.event.ComponentEvent evt)
    {
        this.getRootPane().setDefaultButton(calculateJButton);
        radiusJTextField.requestFocus();
    }
    
    private void rectangleJPanelComponentShown (java.awt.event.ComponentEvent evt)
    {
        this.getRootPane().setDefaultButton(calculateJButton);
        widthJTextField.requestFocus();
    }
    
    private void parallelogramJPanelComponentShown (java.awt.event.ComponentEvent evt)
    {
        this.getRootPane().setDefaultButton(calculateJButton);
        aJTextField.requestFocus();
    }
    
    private void trapezoidJPanelComponentShown (java.awt.event.ComponentEvent evt)
    {
        this.getRootPane().setDefaultButton(calculateJButton);
        xJTextField.requestFocus();
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
    * Date          2/12/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        this.setTitle("Lab #6-- Triangle Calculations-- " + dateFormat.format(date));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geometryJTabbedPane = new javax.swing.JTabbedPane();
        mainJPanel = new javax.swing.JPanel();
        titleJLabel = new javax.swing.JLabel();
        selectJLabel = new javax.swing.JLabel();
        figureJComboBox = new javax.swing.JComboBox<>();
        triangleJLabel = new javax.swing.JLabel();
        rectangleJLabel = new javax.swing.JLabel();
        circleJLabel = new javax.swing.JLabel();
        parallelogramJLabel = new javax.swing.JLabel();
        trapezoidJLabel = new javax.swing.JLabel();
        triangleJPanel = new javax.swing.JPanel();
        verticesJPanel = new javax.swing.JPanel();
        x1JLabel = new javax.swing.JLabel();
        x1JTextField = new javax.swing.JTextField();
        y1JLabel = new javax.swing.JLabel();
        y1JTextField = new javax.swing.JTextField();
        x2JLabel = new javax.swing.JLabel();
        x2JTextField = new javax.swing.JTextField();
        y2JLabel = new javax.swing.JLabel();
        y2JTextField = new javax.swing.JTextField();
        x3JLabel = new javax.swing.JLabel();
        x3JTextField = new javax.swing.JTextField();
        y3JLabel = new javax.swing.JLabel();
        y3JTextField = new javax.swing.JTextField();
        instructionJScrollPane = new javax.swing.JScrollPane();
        instructionJTextArea = new javax.swing.JTextArea();
        calculateJButton = new javax.swing.JButton();
        resultJScrollPane = new javax.swing.JScrollPane();
        resultJTextArea = new javax.swing.JTextArea();
        circleJPanel = new javax.swing.JPanel();
        radiusJPanel = new javax.swing.JPanel();
        radiusJLabel = new javax.swing.JLabel();
        radiusJTextField = new javax.swing.JTextField();
        instructionJScrollPane1 = new javax.swing.JScrollPane();
        instructionJTextArea1 = new javax.swing.JTextArea();
        resultJScrollPane1 = new javax.swing.JScrollPane();
        resultJTextArea1 = new javax.swing.JTextArea();
        calculateJButton1 = new javax.swing.JButton();
        rectangleJPanel = new javax.swing.JPanel();
        dimensionJPanel = new javax.swing.JPanel();
        widthJLabel = new javax.swing.JLabel();
        widthJTextField = new javax.swing.JTextField();
        heightJLabel = new javax.swing.JLabel();
        heightJTextField = new javax.swing.JTextField();
        instructionJTextArea2 = new javax.swing.JTextArea();
        resultJTextArea2 = new javax.swing.JTextArea();
        calculateJButton2 = new javax.swing.JButton();
        parallelogramJPanel = new javax.swing.JPanel();
        dimensionJPanel1 = new javax.swing.JPanel();
        aJLabel = new javax.swing.JLabel();
        aJTextField = new javax.swing.JTextField();
        bJLabel = new javax.swing.JLabel();
        bJTextField = new javax.swing.JTextField();
        calculateJButton3 = new javax.swing.JButton();
        instructionJTextArea3 = new javax.swing.JTextArea();
        resultJTextArea3 = new javax.swing.JTextArea();
        angleJPanel = new javax.swing.JPanel();
        angleJLabel = new javax.swing.JLabel();
        angleJTextField = new javax.swing.JTextField();
        trapezoidJPanel = new javax.swing.JPanel();
        dimensionJPanel2 = new javax.swing.JPanel();
        xJLabel = new javax.swing.JLabel();
        xJTextField = new javax.swing.JTextField();
        yJLabel = new javax.swing.JLabel();
        yJTextField = new javax.swing.JTextField();
        cJLabel = new javax.swing.JLabel();
        cJTextField = new javax.swing.JTextField();
        dJLabel = new javax.swing.JLabel();
        dJTextField = new javax.swing.JTextField();
        hJLabel = new javax.swing.JLabel();
        hJTextField = new javax.swing.JTextField();
        calculateJButton4 = new javax.swing.JButton();
        resultJTextArea4 = new javax.swing.JTextArea();
        instructionJTextArea4 = new javax.swing.JTextArea();
        JMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        exitJMenuItem = new javax.swing.JMenuItem();
        geometryJMenu = new javax.swing.JMenu();
        mainPanelJMenuItem = new javax.swing.JMenuItem();
        triangleJMenuItem = new javax.swing.JMenuItem();
        circleJMenuItem = new javax.swing.JMenuItem();
        rectangleJMenuItem = new javax.swing.JMenuItem();
        parallelogramJMenuItem = new javax.swing.JMenuItem();
        trapezoidJMenuItem = new javax.swing.JMenuItem();
        drawJMenu = new javax.swing.JMenu();
        drawTriangleJMenuItem = new javax.swing.JMenuItem();
        drawCircleJMenuItem = new javax.swing.JMenuItem();
        drawRectangleJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        geometryJTabbedPane.setBackground(new java.awt.Color(255, 255, 204));
        geometryJTabbedPane.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        mainJPanel.setBackground(new java.awt.Color(255, 255, 204));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Welcome to Geometries");

        selectJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectJLabel.setText("Select geometric figure:");

        figureJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        figureJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Triangle", "Circle", "Rectangle", "Parallelogram", "Trapezoid" }));
        figureJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                figureJComboBoxItemStateChanged(evt);
            }
        });
        figureJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figureJComboBoxActionPerformed(evt);
            }
        });

        triangleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/triangle-128.jpg"))); // NOI18N
        triangleJLabel.setToolTipText("direct to Triangle page");
        triangleJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                triangleJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                triangleJLabelMouseEntered(evt);
            }
        });

        rectangleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rectangle-128.jpg"))); // NOI18N
        rectangleJLabel.setToolTipText("direct to rectangle page");
        rectangleJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectangleJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rectangleJLabelMouseEntered(evt);
            }
        });

        circleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle-128.jpg"))); // NOI18N
        circleJLabel.setToolTipText("direct to Circle page");
        circleJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circleJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                circleJLabelMouseEntered(evt);
            }
        });

        parallelogramJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/parallelogram.png"))); // NOI18N
        parallelogramJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parallelogramJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                parallelogramJLabelMouseEntered(evt);
            }
        });

        trapezoidJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trapezoid.jpg"))); // NOI18N
        trapezoidJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trapezoidJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                trapezoidJLabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout mainJPanelLayout = new javax.swing.GroupLayout(mainJPanel);
        mainJPanel.setLayout(mainJPanelLayout);
        mainJPanelLayout.setHorizontalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(triangleJLabel)
                        .addGap(38, 38, 38)
                        .addComponent(circleJLabel)
                        .addGap(38, 38, 38)
                        .addComponent(rectangleJLabel))
                    .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(mainJPanelLayout.createSequentialGroup()
                            .addComponent(selectJLabel)
                            .addGap(18, 18, 18)
                            .addComponent(figureJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainJPanelLayout.createSequentialGroup()
                            .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)))
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(parallelogramJLabel)
                        .addGap(35, 35, 35)
                        .addComponent(trapezoidJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        mainJPanelLayout.setVerticalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(figureJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectJLabel))
                .addGap(18, 18, 18)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rectangleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(circleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(triangleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(parallelogramJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(trapezoidJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        geometryJTabbedPane.addTab("Main", mainJPanel);

        triangleJPanel.setBackground(new java.awt.Color(255, 102, 102));

        verticesJPanel.setBackground(new java.awt.Color(255, 102, 102));
        verticesJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Vertices"));
        verticesJPanel.setName("Vertices"); // NOI18N
        verticesJPanel.setLayout(new java.awt.GridLayout(3, 4, 3, 3));

        x1JLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x1JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x1JLabel.setText("x1:");
        verticesJPanel.add(x1JLabel);

        x1JTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x1JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x1JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                x1JTextFieldKeyPressed(evt);
            }
        });
        verticesJPanel.add(x1JTextField);

        y1JLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y1JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y1JLabel.setText("y1:");
        verticesJPanel.add(y1JLabel);

        y1JTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y1JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y1JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y1JTextFieldKeyPressed(evt);
            }
        });
        verticesJPanel.add(y1JTextField);

        x2JLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x2JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x2JLabel.setText("x2:");
        verticesJPanel.add(x2JLabel);

        x2JTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x2JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x2JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                x2JTextFieldKeyPressed(evt);
            }
        });
        verticesJPanel.add(x2JTextField);

        y2JLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y2JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y2JLabel.setText("y2:");
        verticesJPanel.add(y2JLabel);

        y2JTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y2JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y2JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y2JTextFieldKeyPressed(evt);
            }
        });
        verticesJPanel.add(y2JTextField);

        x3JLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x3JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x3JLabel.setText("x3:");
        verticesJPanel.add(x3JLabel);

        x3JTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x3JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x3JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                x3JTextFieldKeyPressed(evt);
            }
        });
        verticesJPanel.add(x3JTextField);

        y3JLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y3JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y3JLabel.setText("y3:");
        verticesJPanel.add(y3JLabel);

        y3JTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y3JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y3JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y3JTextFieldKeyPressed(evt);
            }
        });
        verticesJPanel.add(y3JTextField);

        instructionJTextArea.setEditable(false);
        instructionJTextArea.setColumns(20);
        instructionJTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        instructionJTextArea.setLineWrap(true);
        instructionJTextArea.setRows(5);
        instructionJTextArea.setText("Enter three vertices for a triangle to compute the perimeter and the area if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than then remaining edge");
        instructionJTextArea.setWrapStyleWord(true);
        instructionJScrollPane.setViewportView(instructionJTextArea);

        calculateJButton.setBackground(new java.awt.Color(255, 255, 255));
        calculateJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculateJButton.setText("Calculate");
        calculateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButtonActionPerformed(evt);
            }
        });

        resultJTextArea.setEditable(false);
        resultJTextArea.setColumns(20);
        resultJTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resultJTextArea.setLineWrap(true);
        resultJTextArea.setRows(5);
        resultJTextArea.setWrapStyleWord(true);
        resultJScrollPane.setViewportView(resultJTextArea);

        javax.swing.GroupLayout triangleJPanelLayout = new javax.swing.GroupLayout(triangleJPanel);
        triangleJPanel.setLayout(triangleJPanelLayout);
        triangleJPanelLayout.setHorizontalGroup(
            triangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triangleJPanelLayout.createSequentialGroup()
                .addGroup(triangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verticesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(triangleJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(instructionJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(triangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(triangleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(triangleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        triangleJPanelLayout.setVerticalGroup(
            triangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, triangleJPanelLayout.createSequentialGroup()
                .addGroup(triangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(triangleJPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(calculateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(triangleJPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(verticesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(instructionJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );

        geometryJTabbedPane.addTab("Triangle", triangleJPanel);

        circleJPanel.setBackground(new java.awt.Color(255, 153, 51));

        radiusJPanel.setBackground(new java.awt.Color(255, 153, 51));
        radiusJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("radius"));

        radiusJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radiusJLabel.setText("Radius:");

        radiusJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radiusJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        radiusJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiusJTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout radiusJPanelLayout = new javax.swing.GroupLayout(radiusJPanel);
        radiusJPanel.setLayout(radiusJPanelLayout);
        radiusJPanelLayout.setHorizontalGroup(
            radiusJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radiusJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(radiusJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiusJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        radiusJPanelLayout.setVerticalGroup(
            radiusJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radiusJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(radiusJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiusJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(radiusJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        instructionJTextArea1.setEditable(false);
        instructionJTextArea1.setColumns(20);
        instructionJTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        instructionJTextArea1.setLineWrap(true);
        instructionJTextArea1.setRows(5);
        instructionJTextArea1.setText("Enter the radius of the circle in order to calculate its circumference and area.");
        instructionJTextArea1.setWrapStyleWord(true);
        instructionJScrollPane1.setViewportView(instructionJTextArea1);

        resultJTextArea1.setEditable(false);
        resultJTextArea1.setColumns(20);
        resultJTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resultJTextArea1.setLineWrap(true);
        resultJTextArea1.setRows(5);
        resultJTextArea1.setWrapStyleWord(true);
        resultJScrollPane1.setViewportView(resultJTextArea1);

        calculateJButton1.setBackground(new java.awt.Color(255, 255, 255));
        calculateJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculateJButton1.setText("Calculate");
        calculateJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circleJPanelLayout = new javax.swing.GroupLayout(circleJPanel);
        circleJPanel.setLayout(circleJPanelLayout);
        circleJPanelLayout.setHorizontalGroup(
            circleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circleJPanelLayout.createSequentialGroup()
                .addGroup(circleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circleJPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(instructionJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(circleJPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(radiusJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(circleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(calculateJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(circleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultJScrollPane1)
                        .addContainerGap())))
        );
        circleJPanelLayout.setVerticalGroup(
            circleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circleJPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(circleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculateJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiusJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(circleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circleJPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(instructionJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(circleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(resultJScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        geometryJTabbedPane.addTab("Circle", circleJPanel);

        rectangleJPanel.setBackground(new java.awt.Color(51, 153, 255));

        dimensionJPanel.setBackground(new java.awt.Color(51, 153, 255));
        dimensionJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("dimension"));
        dimensionJPanel.setLayout(new java.awt.GridLayout(2, 2, 3, 3));

        widthJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        widthJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        widthJLabel.setText("Width:");
        dimensionJPanel.add(widthJLabel);

        widthJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        widthJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        widthJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                widthJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel.add(widthJTextField);

        heightJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heightJLabel.setText("Height:");
        dimensionJPanel.add(heightJLabel);

        heightJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heightJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        heightJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel.add(heightJTextField);

        instructionJTextArea2.setEditable(false);
        instructionJTextArea2.setColumns(20);
        instructionJTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        instructionJTextArea2.setLineWrap(true);
        instructionJTextArea2.setRows(5);
        instructionJTextArea2.setText("\nEnter the width and height of the rectangle.");
        instructionJTextArea2.setWrapStyleWord(true);

        resultJTextArea2.setEditable(false);
        resultJTextArea2.setColumns(20);
        resultJTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resultJTextArea2.setLineWrap(true);
        resultJTextArea2.setRows(5);
        resultJTextArea2.setWrapStyleWord(true);

        calculateJButton2.setBackground(new java.awt.Color(255, 255, 255));
        calculateJButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculateJButton2.setText("Calculate");
        calculateJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rectangleJPanelLayout = new javax.swing.GroupLayout(rectangleJPanel);
        rectangleJPanel.setLayout(rectangleJPanelLayout);
        rectangleJPanelLayout.setHorizontalGroup(
            rectangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rectangleJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rectangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructionJTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dimensionJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rectangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rectangleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(rectangleJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultJTextArea2)
                        .addContainerGap())))
        );
        rectangleJPanelLayout.setVerticalGroup(
            rectangleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rectangleJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dimensionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(instructionJTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rectangleJPanelLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(calculateJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultJTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        geometryJTabbedPane.addTab("Rectangle", rectangleJPanel);

        parallelogramJPanel.setBackground(new java.awt.Color(0, 204, 204));

        dimensionJPanel1.setBackground(new java.awt.Color(0, 204, 204));
        dimensionJPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("dimension"));
        dimensionJPanel1.setLayout(new java.awt.GridLayout(2, 2, 3, 3));

        aJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aJLabel.setText("a:");
        dimensionJPanel1.add(aJLabel);

        aJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel1.add(aJTextField);

        bJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bJLabel.setText("b:");
        dimensionJPanel1.add(bJLabel);

        bJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel1.add(bJTextField);

        calculateJButton3.setBackground(new java.awt.Color(255, 255, 255));
        calculateJButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculateJButton3.setText("Calculate");
        calculateJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButton3ActionPerformed(evt);
            }
        });

        instructionJTextArea3.setEditable(false);
        instructionJTextArea3.setColumns(20);
        instructionJTextArea3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        instructionJTextArea3.setLineWrap(true);
        instructionJTextArea3.setRows(5);
        instructionJTextArea3.setText("Enter two sides: a, b, and the angle between the two sides of the parallelogram.");
        instructionJTextArea3.setWrapStyleWord(true);

        resultJTextArea3.setEditable(false);
        resultJTextArea3.setColumns(20);
        resultJTextArea3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resultJTextArea3.setLineWrap(true);
        resultJTextArea3.setRows(5);
        resultJTextArea3.setWrapStyleWord(true);

        angleJPanel.setBackground(new java.awt.Color(0, 204, 204));
        angleJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("angle between two sides"));
        angleJPanel.setLayout(new java.awt.GridLayout(1, 2, 3, 3));

        angleJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        angleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angleJLabel.setText("angle:");
        angleJPanel.add(angleJLabel);

        angleJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        angleJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        angleJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                angleJTextFieldKeyPressed(evt);
            }
        });
        angleJPanel.add(angleJTextField);

        javax.swing.GroupLayout parallelogramJPanelLayout = new javax.swing.GroupLayout(parallelogramJPanel);
        parallelogramJPanel.setLayout(parallelogramJPanelLayout);
        parallelogramJPanelLayout.setHorizontalGroup(
            parallelogramJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parallelogramJPanelLayout.createSequentialGroup()
                .addGroup(parallelogramJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parallelogramJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(instructionJTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parallelogramJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(parallelogramJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dimensionJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(angleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)))
                .addGroup(parallelogramJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parallelogramJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(parallelogramJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultJTextArea3)
                        .addContainerGap())))
        );
        parallelogramJPanelLayout.setVerticalGroup(
            parallelogramJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(parallelogramJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dimensionJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(angleJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(instructionJTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(parallelogramJPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(calculateJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(resultJTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        geometryJTabbedPane.addTab("Parallelogram", parallelogramJPanel);

        trapezoidJPanel.setBackground(new java.awt.Color(255, 153, 255));

        dimensionJPanel2.setBackground(new java.awt.Color(255, 153, 255));
        dimensionJPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("dimension"));
        dimensionJPanel2.setLayout(new java.awt.GridLayout(5, 2, 3, 3));

        xJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xJLabel.setText("x:");
        dimensionJPanel2.add(xJLabel);

        xJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel2.add(xJTextField);

        yJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yJLabel.setText("y:");
        dimensionJPanel2.add(yJLabel);

        yJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel2.add(yJTextField);

        cJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cJLabel.setText("c:");
        dimensionJPanel2.add(cJLabel);

        cJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel2.add(cJTextField);

        dJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dJLabel.setText("d:");
        dimensionJPanel2.add(dJLabel);

        dJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel2.add(dJTextField);

        hJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hJLabel.setText("h:");
        dimensionJPanel2.add(hJLabel);

        hJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hJTextFieldKeyPressed(evt);
            }
        });
        dimensionJPanel2.add(hJTextField);

        calculateJButton4.setBackground(new java.awt.Color(255, 255, 255));
        calculateJButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculateJButton4.setText("Calculate");
        calculateJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButton4ActionPerformed(evt);
            }
        });

        resultJTextArea4.setEditable(false);
        resultJTextArea4.setColumns(20);
        resultJTextArea4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        resultJTextArea4.setLineWrap(true);
        resultJTextArea4.setRows(5);
        resultJTextArea4.setWrapStyleWord(true);

        instructionJTextArea4.setEditable(false);
        instructionJTextArea4.setColumns(20);
        instructionJTextArea4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        instructionJTextArea4.setLineWrap(true);
        instructionJTextArea4.setRows(5);
        instructionJTextArea4.setText("Enter four sides with x, y are the top and bottom sides; c, d are the two sides and the height of the trapezoid.");
        instructionJTextArea4.setWrapStyleWord(true);

        javax.swing.GroupLayout trapezoidJPanelLayout = new javax.swing.GroupLayout(trapezoidJPanel);
        trapezoidJPanel.setLayout(trapezoidJPanelLayout);
        trapezoidJPanelLayout.setHorizontalGroup(
            trapezoidJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trapezoidJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trapezoidJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trapezoidJPanelLayout.createSequentialGroup()
                        .addComponent(dimensionJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateJButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trapezoidJPanelLayout.createSequentialGroup()
                        .addComponent(instructionJTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultJTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))))
        );
        trapezoidJPanelLayout.setVerticalGroup(
            trapezoidJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trapezoidJPanelLayout.createSequentialGroup()
                .addGroup(trapezoidJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trapezoidJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dimensionJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(trapezoidJPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(calculateJButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(trapezoidJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trapezoidJPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(instructionJTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trapezoidJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultJTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        geometryJTabbedPane.addTab("Trapezoid", trapezoidJPanel);

        fileJMenu.setMnemonic('f');
        fileJMenu.setText("File");

        clearJMenuItem.setMnemonic('c');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setMnemonic('p');
        printJMenuItem.setText("Print");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        exitJMenuItem.setMnemonic('e');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("Exit the program");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        JMenuBar.add(fileJMenu);

        geometryJMenu.setMnemonic('g');
        geometryJMenu.setText("Geometry");

        mainPanelJMenuItem.setMnemonic('m');
        mainPanelJMenuItem.setText("Main Panel");
        mainPanelJMenuItem.setToolTipText("direct to Main Panel");
        mainPanelJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPanelJMenuItemActionPerformed(evt);
            }
        });
        geometryJMenu.add(mainPanelJMenuItem);

        triangleJMenuItem.setMnemonic('t');
        triangleJMenuItem.setText("Triangle");
        triangleJMenuItem.setToolTipText("direct to Triangle page");
        triangleJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleJMenuItemActionPerformed(evt);
            }
        });
        geometryJMenu.add(triangleJMenuItem);

        circleJMenuItem.setMnemonic('c');
        circleJMenuItem.setText("Circle");
        circleJMenuItem.setToolTipText("direct to Circle page");
        circleJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleJMenuItemActionPerformed(evt);
            }
        });
        geometryJMenu.add(circleJMenuItem);

        rectangleJMenuItem.setMnemonic('r');
        rectangleJMenuItem.setText("Rectangle");
        rectangleJMenuItem.setToolTipText("direct to Rectangle page");
        rectangleJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleJMenuItemActionPerformed(evt);
            }
        });
        geometryJMenu.add(rectangleJMenuItem);

        parallelogramJMenuItem.setMnemonic('p');
        parallelogramJMenuItem.setText("Parallelogram");
        parallelogramJMenuItem.setToolTipText("direct to Parallelogram page");
        parallelogramJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelogramJMenuItemActionPerformed(evt);
            }
        });
        geometryJMenu.add(parallelogramJMenuItem);

        trapezoidJMenuItem.setMnemonic('z');
        trapezoidJMenuItem.setText("Trapezoid");
        trapezoidJMenuItem.setToolTipText("direct to Trapezoid page");
        trapezoidJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapezoidJMenuItemActionPerformed(evt);
            }
        });
        geometryJMenu.add(trapezoidJMenuItem);

        JMenuBar.add(geometryJMenu);

        drawJMenu.setMnemonic('d');
        drawJMenu.setText("Draw Figures");

        drawTriangleJMenuItem.setMnemonic('t');
        drawTriangleJMenuItem.setText("Draw Triangle");
        drawTriangleJMenuItem.setToolTipText("");
        drawJMenu.add(drawTriangleJMenuItem);

        drawCircleJMenuItem.setMnemonic('c');
        drawCircleJMenuItem.setText("Draw Circle");
        drawJMenu.add(drawCircleJMenuItem);

        drawRectangleJMenuItem.setMnemonic('r');
        drawRectangleJMenuItem.setText("Draw Rectangle");
        drawJMenu.add(drawRectangleJMenuItem);

        JMenuBar.add(drawJMenu);

        helpJMenu.setMnemonic('h');
        helpJMenu.setText("Help");

        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        JMenuBar.add(helpJMenu);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geometryJTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geometryJTabbedPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        aboutJMenuItemActionPerformed()
    * Description   event handler for aboutJMenuItem to show the About form
    * @parem        evt ActionEvent
    * @author       <i>Nguyen Vi Cao</i>
    * Date          2/18/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        //display About form
        About myAbout = new About(this,true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void mainPanelJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPanelJMenuItemActionPerformed
        geometryJTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_mainPanelJMenuItemActionPerformed

    private void triangleJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleJMenuItemActionPerformed
        geometryJTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_triangleJMenuItemActionPerformed

    private void circleJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleJMenuItemActionPerformed
        geometryJTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_circleJMenuItemActionPerformed

    private void rectangleJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleJMenuItemActionPerformed
        geometryJTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_rectangleJMenuItemActionPerformed
    
    private void figureJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_figureJComboBoxItemStateChanged
        //select appropriate tab
        int figureIndex = figureJComboBox.getSelectedIndex();
        geometryJTabbedPane.setSelectedIndex(figureIndex);
    }//GEN-LAST:event_figureJComboBoxItemStateChanged

    private void triangleJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleJLabelMouseClicked
        figureJComboBox.setSelectedIndex(1);
    }//GEN-LAST:event_triangleJLabelMouseClicked

    private void circleJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleJLabelMouseClicked
        figureJComboBox.setSelectedIndex(2);
    }//GEN-LAST:event_circleJLabelMouseClicked

    private void rectangleJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangleJLabelMouseClicked
        figureJComboBox.setSelectedIndex(3);
    }//GEN-LAST:event_rectangleJLabelMouseClicked
    
    private void triangleJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleJLabelMouseEntered
        triangleJLabel.setToolTipText("Click on triangle figure open triangle JPanel");
    }//GEN-LAST:event_triangleJLabelMouseEntered

    private void circleJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circleJLabelMouseEntered
        circleJLabel.setToolTipText("Click on circle figure open circle JPanel");
    }//GEN-LAST:event_circleJLabelMouseEntered

    private void rectangleJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangleJLabelMouseEntered
        rectangleJLabel.setToolTipText("Click on rectangle figure open rectangle JPanel");
    }//GEN-LAST:event_rectangleJLabelMouseEntered

    private void calculateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButtonActionPerformed
        double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
    }//GEN-LAST:event_calculateJButtonActionPerformed

    private void calculateJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButton1ActionPerformed
        double r, area, perimeter;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            r = Double.parseDouble(radiusJTextField.getText());
            myCircle = new Circle(r);
            if (r <= 0)
                throw new NumberFormatException();
            perimeter = myCircle.getPerimeter();
            area = myCircle.getArea();
            String isFilled = (myCircle.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the circle with radius " + myCircle.getR() +
                    " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same circle is: " + twoDecimals.format(area)
                    + "\nThe circle's color is "
                        + myCircle.getColor() + "\nThe circle's filled is "
                        + myCircle.isFilled() + 
                        "\nThe circle's date create is " + 
                        myCircle.getDateCreated());
            resultJTextArea1.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Radius must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            radiusJTextField.requestFocus();
            radiusJTextField.selectAll();
        }
    }//GEN-LAST:event_calculateJButton1ActionPerformed

    private void calculateJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButton2ActionPerformed
        double width, height, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            width = Double.parseDouble(widthJTextField.getText());
            height = Double.parseDouble(heightJTextField.getText());
            myRectangle = new Rectangle (width, height);
            if (width <= 0 || height <= 0)
                throw new NumberFormatException();
            perimeter = myRectangle.getPerimeter();
            area = myRectangle.getArea();
            String isFilled = (myRectangle.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the rectangle with width " + 
                    width + " and height " + height + " is: " + 
                    twoDecimals.format(perimeter) + 
                    "\nThe area of the same rectangle is: " + twoDecimals.format(area)
                    + "\nThe rectangle's color is "
                        + myRectangle.getColor() + "\nThe rectangle's filled is "
                        + myRectangle.isFilled() + 
                        "\nThe rectangle's date create is " + 
                        myRectangle.getDateCreated());
            resultJTextArea2.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            widthJTextField.requestFocus();
            widthJTextField.selectAll();
        }
    }//GEN-LAST:event_calculateJButton2ActionPerformed

    private void x1JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
        }
    }//GEN-LAST:event_x1JTextFieldKeyPressed

    private void y1JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
        }
    }//GEN-LAST:event_y1JTextFieldKeyPressed

    private void x2JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
        }
    }//GEN-LAST:event_x2JTextFieldKeyPressed

    private void y2JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
        }
    }//GEN-LAST:event_y2JTextFieldKeyPressed

    private void x3JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x3JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
        }
    }//GEN-LAST:event_x3JTextFieldKeyPressed

    private void y3JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y3JTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double vertexX1, vertexY1, vertexX2, vertexY2, vertexX3, vertexY3,
                side1, side2, side3, perimeter, area;
        boolean goodTriangle = false;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            vertexX1 = Double.parseDouble(x1JTextField.getText());
            vertexY1 = Double.parseDouble(y1JTextField.getText());
            vertexX2 = Double.parseDouble(x2JTextField.getText());
            vertexY2 = Double.parseDouble(y2JTextField.getText());
            vertexX3 = Double.parseDouble(x3JTextField.getText());
            vertexY3 = Double.parseDouble(y3JTextField.getText());
            myTriangle = new Triangle(vertexX1, vertexY1, vertexX2, vertexY2,
                vertexX3, vertexY3);
            //calculate edge
            side1 = myTriangle.distance(vertexX1, vertexY1, vertexX2, vertexY2);
            side2 = myTriangle.distance(vertexX1, vertexY1, vertexX3, vertexY3);
            side3 = myTriangle.distance(vertexX2, vertexY2, vertexX3, vertexY3);
            //verify if valid triangle
            goodTriangle = myTriangle.isValidTriangle(side1, side2, side3);
            //calculate perimeter and area
            if(goodTriangle)
            {
                perimeter = myTriangle.getPerimeter();  //side1+side2+side3
                //calculate area via Heron's formula
                area = myTriangle.getArea();
                
                String isFilled = (myTriangle.isFilled() ? "is filled" :
                        "is not filled");
                output.append("The perimeter of the triangle with vertices " +
                        "(" + vertexX1 + ", " + vertexY1 + "), (" + vertexX2 +
                        ", " + vertexY2 + "), (" + vertexX3 + ", " + vertexY3 +
                        ") is " + twoDecimals.format(perimeter) + 
                        "\nThe area of the same triangle is " + 
                        twoDecimals.format(area) + "\nThe triangle's color is "
                        + myTriangle.getColor() + "\nThe triangle's filled is "
                        + myTriangle.isFilled() + 
                        "\nThe triangle's date create is " + 
                        myTriangle.getDateCreated());
            }
            else
                output.append("Illegal sides for the triangle!");
            
            resultJTextArea.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Coordinates must be doubles",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            x1JTextField.requestFocus();
            x1JTextField.selectAll();
        }
        }
    }//GEN-LAST:event_y3JTextFieldKeyPressed

    private void radiusJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radiusJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double r, area, perimeter;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            r = Double.parseDouble(radiusJTextField.getText());
            myCircle = new Circle(r);
            if (r <= 0)
                throw new NumberFormatException();
            perimeter = myCircle.getPerimeter();
            area = myCircle.getArea();
            String isFilled = (myCircle.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the circle with radius " + myCircle.getR() +
                    " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same circle is: " + twoDecimals.format(area)
                    + "\nThe circle's color is "
                        + myCircle.getColor() + "\nThe circle's filled is "
                        + myCircle.isFilled() + 
                        "\nThe circle's date create is " + 
                        myCircle.getDateCreated());
            resultJTextArea1.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Radius must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            radiusJTextField.requestFocus();
            radiusJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_radiusJTextFieldKeyPressed

    private void widthJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double width, height, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            width = Double.parseDouble(widthJTextField.getText());
            height = Double.parseDouble(heightJTextField.getText());
            myRectangle = new Rectangle (width, height);
            if (width <= 0 || height <= 0)
                throw new NumberFormatException();
            perimeter = myRectangle.getPerimeter();
            area = myRectangle.getArea();
            String isFilled = (myRectangle.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the rectangle with width " + 
                    width + " and height " + height + " is: " + 
                    twoDecimals.format(perimeter) + 
                    "\nThe area of the same rectangle is: " + twoDecimals.format(area)
                    + "\nThe rectangle's color is "
                        + myRectangle.getColor() + "\nThe rectangle's filled is "
                        + myRectangle.isFilled() + 
                        "\nThe rectangle's date create is " + 
                        myRectangle.getDateCreated());
            resultJTextArea2.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            widthJTextField.requestFocus();
            widthJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_widthJTextFieldKeyPressed

    private void heightJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double width, height, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            width = Double.parseDouble(widthJTextField.getText());
            height = Double.parseDouble(heightJTextField.getText());
            myRectangle = new Rectangle (width, height);
            if (width <= 0 || height <= 0)
                throw new NumberFormatException();
            perimeter = myRectangle.getPerimeter();
            area = myRectangle.getArea();
            String isFilled = (myRectangle.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the rectangle with width " + 
                    width + " and height " + height + " is: " + 
                    twoDecimals.format(perimeter) + 
                    "\nThe area of the same rectangle is: " + twoDecimals.format(area)
                    + "\nThe rectangle's color is "
                        + myRectangle.getColor() + "\nThe rectangle's filled is "
                        + myRectangle.isFilled() + 
                        "\nThe rectangle's date create is " + 
                        myRectangle.getDateCreated());
            resultJTextArea2.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            widthJTextField.requestFocus();
            widthJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_heightJTextFieldKeyPressed

    private void aJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        double a, b, angle = 0, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            a = Double.parseDouble(aJTextField.getText());
            b = Double.parseDouble(bJTextField.getText());
            angle = Double.parseDouble(angleJTextField.getText());
            myParallelogram = new Parallelogram (a, b, angle);
            if (a <= 0 || b <= 0 || angle <= 0)
                throw new NumberFormatException();
            perimeter = myParallelogram.getPerimeter();
            area = myParallelogram.getArea();
            String isFilled = (myParallelogram.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the parallelogram with a " + 
                    a + " and b " + b + " and the angle between them angle = " +
                    angle + " is: " +
                    twoDecimals.format(perimeter) + "\nThe area of the same parallelogram is: "
                    + twoDecimals.format(area) + "\nThe parallelogram's color is "
                        + myParallelogram.getColor() + "\nThe parallelogram's filled is "
                        + myParallelogram.isFilled() + 
                        "\nThe parallelogram's date create is " + 
                        myParallelogram.getDateCreated());
            resultJTextArea3.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            aJTextField.requestFocus();
            aJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_aJTextFieldKeyPressed

    private void bJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        double a, b, angle = 0, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            a = Double.parseDouble(aJTextField.getText());
            b = Double.parseDouble(bJTextField.getText());
            angle = Double.parseDouble(angleJTextField.getText());
            myParallelogram = new Parallelogram (a, b, angle);
            if (a <= 0 || b <= 0 || angle <= 0)
                throw new NumberFormatException();
            perimeter = myParallelogram.getPerimeter();
            area = myParallelogram.getArea();
            String isFilled = (myParallelogram.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the parallelogram with a " + 
                    a + " and b " + b + " and the angle between them angle = " +
                    angle + " is: " +
                    twoDecimals.format(perimeter) + "\nThe area of the same parallelogram is: "
                    + twoDecimals.format(area) + "\nThe parallelogram's color is "
                        + myParallelogram.getColor() + "\nThe parallelogram's filled is "
                        + myParallelogram.isFilled() + 
                        "\nThe parallelogram's date create is " + 
                        myParallelogram.getDateCreated());
            resultJTextArea3.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            aJTextField.requestFocus();
            aJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_bJTextFieldKeyPressed

    private void calculateJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButton3ActionPerformed
        double a, b, angle = 0, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            a = Double.parseDouble(aJTextField.getText());
            b = Double.parseDouble(bJTextField.getText());
            angle = Double.parseDouble(angleJTextField.getText());
            myParallelogram = new Parallelogram (a, b, angle);
            if (a <= 0 || b <= 0 || angle <= 0)
                throw new NumberFormatException();
            perimeter = myParallelogram.getPerimeter();
            area = myParallelogram.getArea();
            String isFilled = (myParallelogram.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the parallelogram with a " + 
                    a + " and b " + b + " and the angle between them angle = " +
                    angle + " is: " +
                    twoDecimals.format(perimeter) + "\nThe area of the same parallelogram is: "
                    + twoDecimals.format(area) + "\nThe parallelogram's color is "
                        + myParallelogram.getColor() + "\nThe parallelogram's filled is "
                        + myParallelogram.isFilled() + 
                        "\nThe rectangle's date create is " + 
                        myParallelogram.getDateCreated());
            resultJTextArea3.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            aJTextField.requestFocus();
            aJTextField.selectAll();
        }
    }//GEN-LAST:event_calculateJButton3ActionPerformed

    private void parallelogramJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelogramJMenuItemActionPerformed
        geometryJTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_parallelogramJMenuItemActionPerformed

    private void figureJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figureJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_figureJComboBoxActionPerformed

    private void parallelogramJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parallelogramJLabelMouseClicked
        figureJComboBox.setSelectedIndex(4);
    }//GEN-LAST:event_parallelogramJLabelMouseClicked

    private void parallelogramJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parallelogramJLabelMouseEntered
        parallelogramJLabel.setToolTipText("Click on parallelogram figure open parallelogram JPanel");
    }//GEN-LAST:event_parallelogramJLabelMouseEntered

    private void angleJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angleJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double a, b, angle = 0, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            a = Double.parseDouble(aJTextField.getText());
            b = Double.parseDouble(bJTextField.getText());
            angle = Double.parseDouble(angleJTextField.getText());
            myParallelogram = new Parallelogram (a, b, angle);
            if (a <= 0 || b <= 0 || angle <= 0)
                throw new NumberFormatException();
            perimeter = myParallelogram.getPerimeter();
            area = myParallelogram.getArea();
            String isFilled = (myParallelogram.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the parallelogram with a " + 
                    a + " and b " + b + " and the angle between them angle = " +
                    angle + " is: " +
                    twoDecimals.format(perimeter) + "\nThe area of the same parallelogram is: "
                    + twoDecimals.format(area) + "\nThe parallelogram's color is "
                        + myParallelogram.getColor() + "\nThe parallelogram's filled is "
                        + myParallelogram.isFilled() + 
                        "\nThe parallelogram's date create is " + 
                        myParallelogram.getDateCreated());
            resultJTextArea3.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            aJTextField.requestFocus();
            aJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_angleJTextFieldKeyPressed

    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        x1JTextField.setText("");
        y1JTextField.setText("");
        x2JTextField.setText("");
        y2JTextField.setText("");
        x3JTextField.setText("");
        y3JTextField.setText("");
        resultJTextArea.setText("");
        radiusJTextField.setText("");
        resultJTextArea1.setText("");
        widthJTextField.setText("");
        heightJTextField.setText("");
        resultJTextArea2.setText("");
        aJTextField.setText("");
        bJTextField.setText("");
        angleJTextField.setText("");
        resultJTextArea3.setText("");
        xJTextField.setText("");
        yJTextField.setText("");
        cJTextField.setText("");
        dJTextField.setText("");
        hJTextField.setText("");
        resultJTextArea4.setText("");
    }//GEN-LAST:event_clearJMenuItemActionPerformed

    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        //PrintUtilities.printComponent(this);
        JTextArea output = new JTextArea();
        output.setText(resultJTextArea.getText() + "\n" +
                resultJTextArea1.getText() + "\n" +
                resultJTextArea2.getText() + "\n" +
                resultJTextArea3.getText() + "\n" +
                resultJTextArea4.getText());        
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

    private void trapezoidJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapezoidJMenuItemActionPerformed
        geometryJTabbedPane.setSelectedIndex(5);
    }//GEN-LAST:event_trapezoidJMenuItemActionPerformed

    private void trapezoidJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trapezoidJLabelMouseClicked
        figureJComboBox.setSelectedIndex(5);
    }//GEN-LAST:event_trapezoidJLabelMouseClicked

    private void trapezoidJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trapezoidJLabelMouseEntered
         trapezoidJLabel.setToolTipText("Click on trapezoid figure open trapezoid JPanel");
    }//GEN-LAST:event_trapezoidJLabelMouseEntered

    private void calculateJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButton4ActionPerformed
        double x, y, c, d, h, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            x = Double.parseDouble(xJTextField.getText());
            y = Double.parseDouble(yJTextField.getText());
            c = Double.parseDouble(cJTextField.getText());
            d = Double.parseDouble(dJTextField.getText());
            h = Double.parseDouble(hJTextField.getText());
            myTrapezoid = new Trapezoid (x, y, c, d, h);
            if (x <= 0 || y <= 0 || c <= 0 || d <= 0 || h <= 0)
                throw new NumberFormatException();
            perimeter = myTrapezoid.getPerimeter();
            area = myTrapezoid.getArea();
            String isFilled = (myTrapezoid.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the trapezoid with x = " + 
                    x + ", y = " + y + ", c = " + c + ", d = " + d + ", h = " + h
                    + " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same trapezoid is: "
                    + twoDecimals.format(area) + "\nThe trapezoid's color is "
                        + myTrapezoid.getColor() + "\nThe trapezoid's filled is "
                        + myTrapezoid.isFilled() + 
                        "\nThe trapezoid's date create is " + 
                        myTrapezoid.getDateCreated());
            resultJTextArea4.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            xJTextField.requestFocus();
            xJTextField.selectAll();
        }
    }//GEN-LAST:event_calculateJButton4ActionPerformed

    private void xJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double x, y, c, d, h, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            x = Double.parseDouble(xJTextField.getText());
            y = Double.parseDouble(yJTextField.getText());
            c = Double.parseDouble(cJTextField.getText());
            d = Double.parseDouble(dJTextField.getText());
            h = Double.parseDouble(hJTextField.getText());
            myTrapezoid = new Trapezoid (x, y, c, d, h);
            if (x <= 0 || y <= 0 || c <= 0 || d <= 0 || h <= 0)
                throw new NumberFormatException();
            perimeter = myTrapezoid.getPerimeter();
            area = myTrapezoid.getArea();
            String isFilled = (myTrapezoid.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the trapezoid with x = " + 
                    x + ", y = " + y + ", c = " + c + ", d = " + d + ", h = " + h
                    + " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same trapezoid is: "
                    + twoDecimals.format(area) + "\nThe trapezoid's color is "
                        + myTrapezoid.getColor() + "\nThe trapezoid's filled is "
                        + myTrapezoid.isFilled() + 
                        "\nThe trapezoid's date create is " + 
                        myTrapezoid.getDateCreated());
            resultJTextArea4.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            xJTextField.requestFocus();
            xJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_xJTextFieldKeyPressed

    private void yJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double x, y, c, d, h, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            x = Double.parseDouble(xJTextField.getText());
            y = Double.parseDouble(yJTextField.getText());
            c = Double.parseDouble(cJTextField.getText());
            d = Double.parseDouble(dJTextField.getText());
            h = Double.parseDouble(hJTextField.getText());
            myTrapezoid = new Trapezoid (x, y, c, d, h);
            if (x <= 0 || y <= 0 || c <= 0 || d <= 0 || h <= 0)
                throw new NumberFormatException();
            perimeter = myTrapezoid.getPerimeter();
            area = myTrapezoid.getArea();
            String isFilled = (myTrapezoid.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the trapezoid with x = " + 
                    x + ", y = " + y + ", c = " + c + ", d = " + d + ", h = " + h
                    + " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same trapezoid is: "
                    + twoDecimals.format(area) + "\nThe trapezoid's color is "
                        + myTrapezoid.getColor() + "\nThe trapezoid's filled is "
                        + myTrapezoid.isFilled() + 
                        "\nThe trapezoid's date create is " + 
                        myTrapezoid.getDateCreated());
            resultJTextArea4.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            xJTextField.requestFocus();
            xJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_yJTextFieldKeyPressed

    private void cJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double x, y, c, d, h, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            x = Double.parseDouble(xJTextField.getText());
            y = Double.parseDouble(yJTextField.getText());
            c = Double.parseDouble(cJTextField.getText());
            d = Double.parseDouble(dJTextField.getText());
            h = Double.parseDouble(hJTextField.getText());
            myTrapezoid = new Trapezoid (x, y, c, d, h);
            if (x <= 0 || y <= 0 || c <= 0 || d <= 0 || h <= 0)
                throw new NumberFormatException();
            perimeter = myTrapezoid.getPerimeter();
            area = myTrapezoid.getArea();
            String isFilled = (myTrapezoid.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the trapezoid with x = " + 
                    x + ", y = " + y + ", c = " + c + ", d = " + d + ", h = " + h
                    + " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same trapezoid is: "
                    + twoDecimals.format(area) + "\nThe trapezoid's color is "
                        + myTrapezoid.getColor() + "\nThe trapezoid's filled is "
                        + myTrapezoid.isFilled() + 
                        "\nThe trapezoid's date create is " + 
                        myTrapezoid.getDateCreated());
            resultJTextArea4.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            xJTextField.requestFocus();
            xJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_cJTextFieldKeyPressed

    private void dJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double x, y, c, d, h, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            x = Double.parseDouble(xJTextField.getText());
            y = Double.parseDouble(yJTextField.getText());
            c = Double.parseDouble(cJTextField.getText());
            d = Double.parseDouble(dJTextField.getText());
            h = Double.parseDouble(hJTextField.getText());
            myTrapezoid = new Trapezoid (x, y, c, d, h);
            if (x <= 0 || y <= 0 || c <= 0 || d <= 0 || h <= 0)
                throw new NumberFormatException();
            perimeter = myTrapezoid.getPerimeter();
            area = myTrapezoid.getArea();
            String isFilled = (myTrapezoid.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the trapezoid with x = " + 
                    x + ", y = " + y + ", c = " + c + ", d = " + d + ", h = " + h
                    + " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same trapezoid is: "
                    + twoDecimals.format(area) + "\nThe trapezoid's color is "
                        + myTrapezoid.getColor() + "\nThe trapezoid's filled is "
                        + myTrapezoid.isFilled() + 
                        "\nThe trapezoid's date create is " + 
                        myTrapezoid.getDateCreated());
            resultJTextArea4.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            xJTextField.requestFocus();
            xJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_dJTextFieldKeyPressed

    private void hJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hJTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            double x, y, c, d, h, perimeter, area;
        try
        {
            //clear output
            output.delete(0, output.length());
            //get input
            x = Double.parseDouble(xJTextField.getText());
            y = Double.parseDouble(yJTextField.getText());
            c = Double.parseDouble(cJTextField.getText());
            d = Double.parseDouble(dJTextField.getText());
            h = Double.parseDouble(hJTextField.getText());
            myTrapezoid = new Trapezoid (x, y, c, d, h);
            if (x <= 0 || y <= 0 || c <= 0 || d <= 0 || h <= 0)
                throw new NumberFormatException();
            perimeter = myTrapezoid.getPerimeter();
            area = myTrapezoid.getArea();
            String isFilled = (myTrapezoid.isFilled() ? "is filled" :
                        "is not filled");
            output.append("The circumference of the trapezoid with x = " + 
                    x + ", y = " + y + ", c = " + c + ", d = " + d + ", h = " + h
                    + " is: " + twoDecimals.format(perimeter) + 
                    "\nThe area of the same trapezoid is: "
                    + twoDecimals.format(area) + "\nThe trapezoid's color is "
                        + myTrapezoid.getColor() + "\nThe trapezoid's filled is "
                        + myTrapezoid.isFilled() + 
                        "\nThe trapezoid's date create is " + 
                        myTrapezoid.getDateCreated());
            resultJTextArea4.setText(output.toString());
        }
        catch (NumberFormatException exp)
        {
            JOptionPane.showMessageDialog(this, "Input must be doubles and "
                    + "greater than 0",
                    "Input error", JOptionPane.ERROR_MESSAGE);
            xJTextField.requestFocus();
            xJTextField.selectAll();
        }
        }
    }//GEN-LAST:event_hJTextFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Splash mySplash = new Splash(3000);
        mySplash.showSplash();
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
            java.util.logging.Logger.getLogger(GeometriesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeometriesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeometriesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeometriesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeometriesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JLabel aJLabel;
    private javax.swing.JTextField aJTextField;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JLabel angleJLabel;
    private javax.swing.JPanel angleJPanel;
    private javax.swing.JTextField angleJTextField;
    private javax.swing.JLabel bJLabel;
    private javax.swing.JTextField bJTextField;
    private javax.swing.JLabel cJLabel;
    private javax.swing.JTextField cJTextField;
    private javax.swing.JButton calculateJButton;
    private javax.swing.JButton calculateJButton1;
    private javax.swing.JButton calculateJButton2;
    private javax.swing.JButton calculateJButton3;
    private javax.swing.JButton calculateJButton4;
    private javax.swing.JLabel circleJLabel;
    private javax.swing.JMenuItem circleJMenuItem;
    private javax.swing.JPanel circleJPanel;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JLabel dJLabel;
    private javax.swing.JTextField dJTextField;
    private javax.swing.JPanel dimensionJPanel;
    private javax.swing.JPanel dimensionJPanel1;
    private javax.swing.JPanel dimensionJPanel2;
    private javax.swing.JMenuItem drawCircleJMenuItem;
    private javax.swing.JMenu drawJMenu;
    private javax.swing.JMenuItem drawRectangleJMenuItem;
    private javax.swing.JMenuItem drawTriangleJMenuItem;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JComboBox<String> figureJComboBox;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu geometryJMenu;
    private javax.swing.JTabbedPane geometryJTabbedPane;
    private javax.swing.JLabel hJLabel;
    private javax.swing.JTextField hJTextField;
    private javax.swing.JLabel heightJLabel;
    private javax.swing.JTextField heightJTextField;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JScrollPane instructionJScrollPane;
    private javax.swing.JScrollPane instructionJScrollPane1;
    private javax.swing.JTextArea instructionJTextArea;
    private javax.swing.JTextArea instructionJTextArea1;
    private javax.swing.JTextArea instructionJTextArea2;
    private javax.swing.JTextArea instructionJTextArea3;
    private javax.swing.JTextArea instructionJTextArea4;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JMenuItem mainPanelJMenuItem;
    private javax.swing.JLabel parallelogramJLabel;
    private javax.swing.JMenuItem parallelogramJMenuItem;
    private javax.swing.JPanel parallelogramJPanel;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JLabel radiusJLabel;
    private javax.swing.JPanel radiusJPanel;
    private javax.swing.JTextField radiusJTextField;
    private javax.swing.JLabel rectangleJLabel;
    private javax.swing.JMenuItem rectangleJMenuItem;
    private javax.swing.JPanel rectangleJPanel;
    private javax.swing.JScrollPane resultJScrollPane;
    private javax.swing.JScrollPane resultJScrollPane1;
    private javax.swing.JTextArea resultJTextArea;
    private javax.swing.JTextArea resultJTextArea1;
    private javax.swing.JTextArea resultJTextArea2;
    private javax.swing.JTextArea resultJTextArea3;
    private javax.swing.JTextArea resultJTextArea4;
    private javax.swing.JLabel selectJLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel trapezoidJLabel;
    private javax.swing.JMenuItem trapezoidJMenuItem;
    private javax.swing.JPanel trapezoidJPanel;
    private javax.swing.JLabel triangleJLabel;
    private javax.swing.JMenuItem triangleJMenuItem;
    private javax.swing.JPanel triangleJPanel;
    private javax.swing.JPanel verticesJPanel;
    private javax.swing.JLabel widthJLabel;
    private javax.swing.JTextField widthJTextField;
    private javax.swing.JLabel x1JLabel;
    private javax.swing.JTextField x1JTextField;
    private javax.swing.JLabel x2JLabel;
    private javax.swing.JTextField x2JTextField;
    private javax.swing.JLabel x3JLabel;
    private javax.swing.JTextField x3JTextField;
    private javax.swing.JLabel xJLabel;
    private javax.swing.JTextField xJTextField;
    private javax.swing.JLabel y1JLabel;
    private javax.swing.JTextField y1JTextField;
    private javax.swing.JLabel y2JLabel;
    private javax.swing.JTextField y2JTextField;
    private javax.swing.JLabel y3JLabel;
    private javax.swing.JTextField y3JTextField;
    private javax.swing.JLabel yJLabel;
    private javax.swing.JTextField yJTextField;
    // End of variables declaration//GEN-END:variables
}
