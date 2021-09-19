/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.BienLaiDAO;
import DAO.NhanVienDAO;
import Helpers.MessaDialogHelper;
import Models.BienLai;

/**
fse
    public TrangChu() {
        initComponents();
    }

dfgsgfsd

        
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldsdt = new javax.swing.JTextField();
        jButtontracuu = new javax.swing.JButton();
        jButtonphanhoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtongioithieu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldaccount = new javax.swing.JTextField();
        jTextFieldpassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtondangnhap = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN THU TIỀN NƯỚC SINH HOẠT");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/logonuoc.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("CÔNG TY NƯỚC SẠCH HÀ NỘI");

df
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(df)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(dfgdf.GroupLayout.Alignment.LEADING)
df)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Số điện thoại");

        jTextFieldsdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtontracuu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtontracuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/search.png"))); // NOI18N
        jButtontracuu.setText("Tra cứu");
        jButtontracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontracuuActionPerformed(evt);
            }
        });

        jButtonphanhoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonphanhoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/pen.png"))); // NOI18N
        jButtonphanhoi.setText("Phản hồi khách hàng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tại đây, bạn có thể tra cứu và phản hồi lại cho chúng tôi. Cảm ơn quý khách hàng rất nhiều !");

        jButtongioithieu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtongioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/edit.png"))); // NOI18N
        jButtongioithieu.setText("Giới thiệu");
        jButtongioithieu.addActionListener(new java.awt.event.ActionListener() {
            public ?��d
                                .addGap(33, 33, 33)
                                .addComponent(jButtontracuu))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtongioithieu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonphanhoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
sdfsdjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.�dfjButtontracuu)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)))
                .addGap(76, 76, 76)
                .addComponent(jButtonphanhoi)
                .addGap(45, 45, 45)
                .addComponent(jButtongioithieu)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ĐĂNG NHẬP VỚI TƯ CÁCH QUẢN TRỊ VIÊN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên đăng nhập");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mật khẩu");

        jTextFieldaccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/padlock.png"))); // NOI18N

        jButtondangnhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
adsf�df
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondangnhapActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/refresh.png"))); // NOI18N
        jButton6.setText("Thoát");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)ds�createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(366, 366, 366))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.�df�dfsdf�                                    .addComponent(jTextFieldaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()f�df
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .�d�          f�df          .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButtondangnhap))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);df.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)�df�d
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .�djavax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fadsfjButtondangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondangnhapActionPerformed
        // TODO add your handling code here:
        doCheckUser();
    }//GEN-LAST:event_jButtondangnhapActionPerformed

    private void jButtontracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontracuuActionPerformed
        // TODO add your handling code here:
        doTraCuu();
    }//GEN-�d
    void goToGioiThieu()
    {
       GioiThieuDialog gioithieu = new GioiThieuDialog();
       gioithieu.setVisible(true);
       this.dispose();
    }
    
    void doTraCuu()
    {
         BienLai bienlai = BienLaiDAO.Search(jTextFieldsdt.getText());
         if(bienlai != null)
         {
             TraCuu tracuu = new �dTraCuu(bienlai,jTextFieldsdt.getText());
             tracuu.setVisible(true);
             this.dispose();
         }
    }
    
    void doCheckUser()
    {
       int loginrole = NhanVienDAO.CheckUser(jTextFieldaccount.getText(), jTextFieldpassword.getText());
       if(loginrole >0)
       {
�d            �df�f