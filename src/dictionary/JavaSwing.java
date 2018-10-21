package dictionary;


import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuangNguyen
 */
public class JavaSwing extends javax.swing.JFrame {
    
    public DefaultListModel listdata = new DefaultListModel();;
    public LinkedHashMap<String,String> maplist;
    
    /**
     * Creates new form JavaSwing
     */
    
    public JavaSwing() {
        initComponents();
//           DefaultListModel listdata;
//        LinkedHashMap<String,String> maplist;
        Dictionary dic = new Dictionary();
        maplist = new LinkedHashMap<String,String>();
        dic.saveWord(maplist);
       // listdata = new DefaultListModel();
        //Map<String,String> treemap = new TreeMap<String,String>(maplist);
        
        
//       for(Map.Entry<String,String>entry :maplist.entrySet())
//       Set<String> getkey = maplist.keySet();
//       for(String key : getkey)
//        {
//            listdata.addElement(key);
//        }

        Set set = maplist.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry)iterator.next();
            listdata.addElement(entry.getKey());
        }
        
//         Map<String,String> sortmap = new TreeMap<String,String>(maplist);
//            
//        for(Map.Entry<String,String> entry : sortmap.entrySet())
//        {
//             listdata.addElement(entry.getKey());
//        }
//                
        jList1.setModel(listdata);
        this.setLocationRelativeTo(null);  
        
    }
     
      
          
          
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DICTIONARY");
        setBackground(new java.awt.Color(47, 78, 147));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        add.setText("Thêm");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/drawing.png"))); // NOI18N
        jButton2.setText("Sửa");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        delete.setText("Xóa");
        delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png"))); // NOI18N
        jButton4.setText("EXIT");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("VNI-Fato", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 87, 211));
        jLabel2.setText("QN");

        jLabel3.setBackground(new java.awt.Color(240, 88, 152));
        jLabel3.setFont(new java.awt.Font("VNI-Algerian", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(189, 72, 131));
        jLabel3.setText("DICTIONArY");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton5.setText("SEARCH");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPane1.setForeground(new java.awt.Color(105, 144, 166));
        jTabbedPane1.setFont(new java.awt.Font("VNI-Bazooka", 2, 10)); // NOI18N

        jScrollPane3.setViewportView(jEditorPane2);

        jTabbedPane1.addTab("RESULT", jScrollPane3);

        jLabel4.setFont(new java.awt.Font("VNI-Shadow", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(150, 19, 41));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-java-50.png"))); // NOI18N
        jLabel4.setText(" DICTIONARY JAVA SWING OOP 2018");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setIconTextGap(6);
        jLabel4.setName(""); // NOI18N
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel6.setText("NGUYỄN HỮU NAM ");

        jLabel5.setText("NGUYỄN HỮU MINH QUANG ");

        jLabel7.setFont(new java.awt.Font("VNI-Lithos", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 221, 25));
        jLabel7.setText("QN DICTIONARY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(78, 78, 78))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("INTRODUCE", jPanel3);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Homepage-Hero-Car-Mobile.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel1))
                                    .addComponent(jButton5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(add)
                                .addGap(22, 22, 22)
                                .addComponent(jButton2)
                                .addGap(29, 29, 29)
                                .addComponent(delete)
                                .addGap(30, 30, 30)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("QN DICTIONARY");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:           
    }//GEN-LAST:event_formWindowOpened

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        JTextField key = new JTextField();
        JTextField value = new JTextField();
        Object[] objects = {"Từ Tiếng Anh thêm",key,"Nghĩa Tiếng Việt",value};
        JOptionPane pane = new JOptionPane(objects,JOptionPane.PLAIN_MESSAGE,
                                                   JOptionPane.OK_CANCEL_OPTION);
        pane.createDialog(null,"Thêm Từ").setVisible(true);
        
     
        
        
            String ky = key.getText().trim();
            String va = value.getText().trim();
        
        String s = ky + " "+ va;
        DictionaryManagement dm = new DictionaryManagement();
       if(!key.getText().isEmpty() && !value.getText().isEmpty())
       {
            dm.addWriteFile(s);
         JOptionPane.showMessageDialog(this, "Thêm thành công");
       }
           else
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập từ muốn thêm");
        }      
         
            jList1.setModel(listdata);
           listdata.addElement(key.getText().trim());
    }//GEN-LAST:event_addActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       int i = JOptionPane.showConfirmDialog(this, "Bạn có thật sự muốn thoát không");
        if(i==0)
        {
            String[] options = {"Bad","Good","Very Good"};
            ImageIcon icon = new ImageIcon("src/images/like.png");
            String n = (String)JOptionPane.showInputDialog(null, 
                    "Đánh giá độ hài lòng với từ điển của chúng tôi",
                    "Đánh giá",JOptionPane.QUESTION_MESSAGE,icon,options,options[2]);
            System.out.println(n);
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           JTextField key = new JTextField();
        JTextField value = new JTextField();
        Object[] objects = {"Từ Tiếng Anh sửa",key,"Nghĩa Tiếng Việt",value};
        JOptionPane pane = new JOptionPane(objects,JOptionPane.PLAIN_MESSAGE,
                                                   JOptionPane.OK_CANCEL_OPTION);
        pane.createDialog(null,"Sửa Từ").setVisible(true);
        
     
        
        
            String ky = key.getText().trim();
            String va = value.getText().trim();
        
        String s = ky + " "+ va;
        DictionaryManagement dm = new DictionaryManagement();
       if(!key.getText().isEmpty() && !value.getText().isEmpty())
       {
            dm.addWriteFile(s);
         JOptionPane.showMessageDialog(this, "Sửa thành công");
       }
           else
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập từ muốn sửa");
        }      
         
            jList1.setModel(listdata);
           listdata.addElement(key.getText().trim());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
         Dictionary dic = new Dictionary();
         maplist = new LinkedHashMap<String,String>();
         dic.saveWord(maplist);
       int pos = this.jList1.getSelectedIndex();
       String s = (new ArrayList<String>(maplist.values())).get(pos);
       this.jEditorPane2.setText(s);     
       this.jEditorPane2.setCaretPosition(0);
    }//GEN-LAST:event_jList1ValueChanged

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        Dictionary dic = new Dictionary();
        maplist = new LinkedHashMap<String,String>();
        dic.saveWord(maplist);
        
        DictionaryCommandline dc = new DictionaryCommandline();  
  
     int location = dc.dictionarySearcher(maplist, jTextField1.getText().toLowerCase());
        
//        System.out.println(location);
//        System.out.println(jTextField1.getText());
        jList1.setSelectedIndex(location);
        jList1.ensureIndexIsVisible(location);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        JFrame frame = new JFrame("InputDialog Example #2");
       String s =  JOptionPane.showInputDialog(frame,"Xóa Từ","DELETE",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(this, "Xóa thành công");
        jList1.setModel(listdata);
         listdata.removeElement(s);
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(JavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaSwing().setVisible(true);    
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

//    private void close() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}