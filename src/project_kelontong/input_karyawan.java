/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_kelontong;

import com.toedter.calendar.JDateChooser;
import database.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class input_karyawan extends javax.swing.JFrame {
    private Statement St;
    private Connection Con = new koneksi().connect();
    private ResultSet Rs;
    private String sql;
    private JDateChooser dateChooser;
    private DefaultTableModel tabmode;
    /**
     * Creates new form data_karyawan
     */
    public input_karyawan() {
        initComponents();
        tabelKaryawan();
    }
    private void clearFields() {
    txtNama.setText("");
    txtId.setText("");
    txtAlamat.setText("");
    txtPassword.setText("");
    txtUsername.setText("");
    }
    private void tabelKaryawan(){
        DefaultTableModel tb= new DefaultTableModel();
        // Memberi nama pada setiap kolom tabel
        tb.addColumn("ID");
        tb.addColumn("Nama");
        tb.addColumn("Alamat");
        tb.addColumn("Username");
        tb.addColumn("Password");
        tb.addColumn("Tanggal Daftar");
        tabelKaryawan.setModel(tb);
        try{
            // Mengambil data dari database
            St = Con.createStatement();
            Rs=St.executeQuery("select * from karyawan");

            while (Rs.next())
            {
            // Mengambil data dari database berdasarkan nama kolom pada tabel
            // Lalu di tampilkan ke dalam JTable
            tb.addRow(new Object[]{
            Rs.getString("id"),
            Rs.getString("nama"),
            Rs.getString("alamat"),
            Rs.getString("username"),
            Rs.getString("password"),
            Rs.getString("tanggal_pendaftaran")
            });
            }

        }catch (Exception e){
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnTanggal = new com.toedter.calendar.JDateChooser();
        add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        clear1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        refresh1 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT DATA KARYAWAN ");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 410, 40));

        jLabel2.setText("NAMA");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jDesktopPane1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 371, -1));

        jLabel4.setText("ALAMAT");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 371, 60));

        jLabel5.setText("USERNAME");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        jDesktopPane1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 372, -1));

        jLabel6.setText("PASSWORD");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));
        jDesktopPane1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 372, -1));

        jLabel7.setText("Tanggal Pendaftaran");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel8.setText("ID");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 23));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 348, -1));

        btnTanggal.setDateFormatString("yyyy-MM-dd");
        jDesktopPane1.add(btnTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 370, -1));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jDesktopPane1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelKaryawan);

        jDesktopPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 570, 340));

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jButton6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledBackground"));
        jButton6.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_kelontong/png/icons8_Login_35px.png"))); // NOI18N
        jButton6.setText("KEMBALI");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, -1));

        refresh1.setText("Refresh");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String nama = txtNama.getText();
        String alamat = txtAlamat.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(btnTanggal.getDate()));
         if (nama.isEmpty() || id.isEmpty() || alamat.isEmpty() || tanggal.isEmpty() || password.isEmpty() || username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Mohon isi semua field!");
            return;
        }
        try {

            // Membuat pernyataan SQL untuk menambahkan data barang
            sql = "INSERT INTO karyawan (id, nama, alamat, username, password, tanggal_pendaftaran) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = Con.prepareStatement(sql);
            
            stmt.setString(1, id);
            stmt.setString(2, nama);
            stmt.setString(3, alamat);
            stmt.setString(4, username);
            stmt.setString(5, password);
            stmt.setString(6, tanggal);
            
            // Menjalankan pernyataan SQL
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data barang berhasil ditambahkan ke database.");
                // Mengosongkan field setelah data berhasil ditambahkan
                clearFields();
                tabelKaryawan();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data barang ke database.");
            }

            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan stok dan harga dengan benar!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan database: " + e.getMessage());
        }
    }//GEN-LAST:event_addActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clear1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        admin_poenya adminpoenya = new admin_poenya();
        adminpoenya.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        // TODO add your handling code here:
        tabelKaryawan();
    }//GEN-LAST:event_refresh1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelKaryawan.getModel();
        int row = tabelKaryawan.getSelectedRow();
        if (row >= 0) {
            // Mendapatkan ID atau kunci unik (misalnya kolom ID_Barang) dari tabel yang akan dihapus
            String id = tabelKaryawan.getValueAt(row, 0).toString();
            model.removeRow(row);
            try {

                sql = "DELETE FROM karyawan WHERE id = ?";
                PreparedStatement preparedStatement = Con.prepareStatement(sql);
                preparedStatement.setString(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                System.out.println("Dihapus Dari Database Success");
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus.");
        }
    }//GEN-LAST:event_btnHapusActionPerformed
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
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnHapus;
    private com.toedter.calendar.JDateChooser btnTanggal;
    private javax.swing.JButton clear1;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refresh1;
    private javax.swing.JTable tabelKaryawan;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
