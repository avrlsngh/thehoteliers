
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Shreyash Haritashya
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setCurrentLoginDetails();
        toggleEmployeeButton();
    }
    
    public void setCurrentLoginDetails(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "select emp_id from logged_in_hotel_id";
            ResultSet rs0 = st.executeQuery(r);
            if(rs0.next()){
                r = "select emp_name, is_admin, emp_id from employee where emp_id = '"+ rs0.getString("emp_id") +"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                    if(rs1.getString("is_admin").equals("1")){
                        emp_name_label.setText("Admin Name -");
                    }
                    emp_name_detail.setText(rs1.getString("emp_name"));
                    emp_id_detail.setText(rs1.getString("emp_id"));
                }
            }
        } catch(Exception e){
            System.out.print(e);
        }

    }
    
    public void toggleEmployeeButton(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "select emp_id from logged_in_hotel_id";
            ResultSet rs0 = st.executeQuery(r);
            if(rs0.next()){
                r = "select is_admin from employee where emp_id = '"+ rs0.getString("emp_id") +"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                    if(rs1.getString("is_admin").equals("0")){
                        EmployeeButton.setEnabled(false);
                    }
                }
            }
        } catch(Exception e){
            System.out.print(e);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        AppIcon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        HomeImage = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        SubmitButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        BookingButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        EmployeeButton = new javax.swing.JButton();
        SubmitButton2 = new javax.swing.JButton();
        SubmitButton3 = new javax.swing.JButton();
        emp_name_label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        emp_name_detail = new javax.swing.JLabel();
        emp_id_detail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1260, 720));

        topPanel.setBackground(new java.awt.Color(89, 95, 239));
        topPanel.setAlignmentX(0.0F);
        topPanel.setAlignmentY(0.0F);

        AppIcon.setBackground(new java.awt.Color(255, 255, 255));
        AppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/AppIcon.jpg"))); // NOI18N
        AppIcon.setText("Image");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("The Hoteliers");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Welcome to, Hotel Sinjara");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(14, 14, 14))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14))
        );

        HomeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/HomeImage.jpg"))); // NOI18N

        CenterPanel.setBackground(new java.awt.Color(242, 242, 242));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(89, 95, 239));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Book Now");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 53, 69));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enter Customer's Phone Number");

        phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(112, 112, 112));
        phone.setBorder(null);

        SubmitButton.setBackground(new java.awt.Color(255, 140, 66));
        SubmitButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Book Now");
        SubmitButton.setBorder(null);
        SubmitButton.setBorderPainted(false);
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton.setFocusPainted(false);
        SubmitButton.setOpaque(true);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        SubmitButton1.setBackground(new java.awt.Color(255, 255, 255));
        SubmitButton1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        SubmitButton1.setForeground(new java.awt.Color(255, 140, 66));
        SubmitButton1.setText("Add New Customer");
        SubmitButton1.setBorder(null);
        SubmitButton1.setBorderPainted(false);
        SubmitButton1.setContentAreaFilled(false);
        SubmitButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton1.setFocusPainted(false);
        SubmitButton1.setOpaque(true);
        SubmitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton1ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("or");

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phone)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(42, 42, 42)
                .addComponent(jLabel12)
                .addGap(25, 25, 25)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addGap(15, 15, 15)
                .addComponent(SubmitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(45, 53, 69));
        sidePanel.setAlignmentX(0.0F);
        sidePanel.setAlignmentY(0.0F);

        HomeButton.setBackground(new java.awt.Color(45, 53, 69));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(89, 95, 239));
        HomeButton.setText("Home");
        HomeButton.setBorder(null);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setFocusPainted(false);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        BookingButton.setBackground(new java.awt.Color(45, 53, 69));
        BookingButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        BookingButton.setForeground(new java.awt.Color(255, 255, 255));
        BookingButton.setText("Bookings");
        BookingButton.setBorder(null);
        BookingButton.setContentAreaFilled(false);
        BookingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookingButton.setFocusPainted(false);
        BookingButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BookingButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingButtonActionPerformed(evt);
            }
        });

        CustomerButton.setBackground(new java.awt.Color(45, 53, 69));
        CustomerButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerButton.setText("Customers");
        CustomerButton.setBorder(null);
        CustomerButton.setContentAreaFilled(false);
        CustomerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerButton.setFocusPainted(false);
        CustomerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        PaymentButton.setBackground(new java.awt.Color(45, 53, 69));
        PaymentButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        PaymentButton.setForeground(new java.awt.Color(255, 255, 255));
        PaymentButton.setText("Rooms");
        PaymentButton.setBorder(null);
        PaymentButton.setContentAreaFilled(false);
        PaymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentButton.setFocusPainted(false);
        PaymentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PaymentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        EmployeeButton.setBackground(new java.awt.Color(45, 53, 69));
        EmployeeButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        EmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeButton.setText("Employees");
        EmployeeButton.setBorder(null);
        EmployeeButton.setContentAreaFilled(false);
        EmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmployeeButton.setFocusPainted(false);
        EmployeeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeButtonActionPerformed(evt);
            }
        });

        SubmitButton2.setBackground(new java.awt.Color(255, 51, 0));
        SubmitButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton2.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton2.setText("Log Out");
        SubmitButton2.setBorder(null);
        SubmitButton2.setBorderPainted(false);
        SubmitButton2.setContentAreaFilled(false);
        SubmitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton2.setFocusPainted(false);
        SubmitButton2.setOpaque(true);
        SubmitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton2ActionPerformed(evt);
            }
        });

        SubmitButton3.setBackground(new java.awt.Color(89, 95, 239));
        SubmitButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton3.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton3.setText("Update Password");
        SubmitButton3.setBorder(null);
        SubmitButton3.setBorderPainted(false);
        SubmitButton3.setContentAreaFilled(false);
        SubmitButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton3.setFocusPainted(false);
        SubmitButton3.setOpaque(true);
        SubmitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(PaymentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BookingButton)
                .addGap(40, 40, 40)
                .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(EmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(SubmitButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        emp_name_label.setBackground(new java.awt.Color(255, 255, 255));
        emp_name_label.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_name_label.setForeground(new java.awt.Color(112, 112, 112));
        emp_name_label.setText("Employee Name -");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(112, 112, 112));
        jLabel16.setText("ID -");

        emp_name_detail.setBackground(new java.awt.Color(255, 255, 255));
        emp_name_detail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_name_detail.setForeground(new java.awt.Color(112, 112, 112));
        emp_name_detail.setText("Shayam Singh");

        emp_id_detail.setBackground(new java.awt.Color(255, 255, 255));
        emp_id_detail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_id_detail.setForeground(new java.awt.Color(112, 112, 112));
        emp_id_detail.setText("10235");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(HomeImage)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(emp_name_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_name_detail)
                            .addComponent(emp_id_detail))
                        .addGap(14, 14, 14))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_name_label)
                            .addComponent(emp_name_detail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(emp_id_detail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeImage)
                        .addGap(78, 78, 78))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
         SubmitButton.setBorderPainted( false );
         String cust_phone = phone.getText();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
        String q = "select cust_id from customer where cust_phone = '"+ cust_phone +"'";
        ResultSet rs = st.executeQuery(q);
        if(rs.next()){
            String q1 = "update logged_in_hotel_id set cust_id = '"+ rs.getString("cust_id") +"'";
            st.executeUpdate(q1);
            Home.this.setVisible(false);
            NewBooking n= new NewBooking();
            n.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "User Not Found! Create New One");
        }
        } catch(Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void SubmitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton1ActionPerformed
        Home.this.setVisible(false);
        new AddNewCustomer().setVisible(true);
    }//GEN-LAST:event_SubmitButton1ActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void BookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingButtonActionPerformed
        Home.this.setVisible(false);
        new Bookings().setVisible(true);
    }//GEN-LAST:event_BookingButtonActionPerformed

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        Home.this.setVisible(false);
        new Customers().setVisible(true);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        Home.this.setVisible(false);
        new Rooms().setVisible(true);
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void EmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeButtonActionPerformed
        Home.this.setVisible(false);
        new Employees().setVisible(true);
    }//GEN-LAST:event_EmployeeButtonActionPerformed

    private void SubmitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton2ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "delete from logged_in_hotel_id";
            st.executeUpdate(r);
            Home.this.setVisible(false);
            new LogInPage().setVisible(true);
        } catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_SubmitButton2ActionPerformed

    private void SubmitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton3ActionPerformed
        new UpdatePassword().setVisible(true);
    }//GEN-LAST:event_SubmitButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppIcon;
    private javax.swing.JButton BookingButton;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton EmployeeButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel HomeImage;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton1;
    private javax.swing.JButton SubmitButton2;
    private javax.swing.JButton SubmitButton3;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel emp_id_detail;
    private javax.swing.JLabel emp_name_detail;
    private javax.swing.JLabel emp_name_label;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JTextField phone;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
