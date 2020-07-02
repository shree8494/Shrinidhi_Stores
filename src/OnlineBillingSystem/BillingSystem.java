
package OnlineBillingSystem;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class BillingSystem extends javax.swing.JFrame {

    
    public Connection cn;
    public Statement st;
    PreparedStatement pst=null;
    PreparedStatement psti=null;
    ResultSet rs=null;
    ResultSet rsi=null;
    float total;
    float g_total;
    public BillingSystem() {
        initComponents();
        try{
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shrinidhi_stores?zeroDateTimeBehavior=convertToNull","root","");
           st=cn.createStatement();
           JOptionPane.showMessageDialog(null,"Connected");
           Headder();
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Not Connected");   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        items = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        Add_menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customer_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clear_btn = new javax.swing.JButton();
        Generate_Recipt = new javax.swing.JButton();
        Done = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Print_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SHRINDIHI STORES");

        items.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });

        quantity.setToolTipText("");
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        cost.setToolTipText("");
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        Add_menu.setText("ADD");
        Add_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_menuActionPerformed(evt);
            }
        });

        jLabel2.setText("ITEM");

        jLabel3.setText("QUANTITY");

        jLabel4.setText("COST");

        customer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_idActionPerformed(evt);
            }
        });

        jLabel5.setText("CUSTOMER_ID");

        clear_btn.setText("CLEAR");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        Generate_Recipt.setText("Generate");
        Generate_Recipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_ReciptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Add_menu)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clear_btn)
                                .addGap(30, 30, 30)
                                .addComponent(Generate_Recipt))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(quantity)
                                .addComponent(items)
                                .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(customer_id)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Done)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customer_id)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generate_Recipt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Done)
                .addGap(53, 53, 53))
        );

        Print_area.setColumns(20);
        Print_area.setRows(5);
        jScrollPane1.setViewportView(Print_area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_menuActionPerformed
        // TODO add your handling code here:
        try{
            String sql ; 
            String c=cost.getText();
            String q=quantity.getText();
            float Total_cost=Float.parseFloat(c);
            float Total_quantity=Float.parseFloat(q);
            total=Total_quantity*Total_cost;
            sql ="INSERT INTO stocks (customer_id,item, quantity, cost, total)"+" VALUES ('"+customer_id.getText()+"','"+items.getText()+"','"+quantity.getText()+"','"+cost.getText()+"','"+total+"')";
            st.executeUpdate(sql);
            
            items.setText("");
            quantity.setText("");
            cost.setText("");
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"cannot be connected");
        }
    }//GEN-LAST:event_Add_menuActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemsActionPerformed

    private void customer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_idActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        items.setText("");
        quantity.setText("");
        cost.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed
    public JTextField getItem()
    {
        return items;
    }
    public JTextField getQuantity()
    {
        return quantity;
    }
    public JTextField getCost()
    {
        return cost;
    }
    private void Generate_ReciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate_ReciptActionPerformed
        float qu;
        float tot;
        float g_total1;
        g_total=0;
        items.setText("");
        quantity.setText("");
        cost.setText("");
            Headder();
        try{
            String sqli;
            sqli="SELECT customer_id,item, quantity, cost FROM stocks WHERE customer_id="+customer_id.getText();
            rs = st.executeQuery(sqli);
           // ResultSetMetaData rsmd = rs.getMetaData();

                String customer_id = "";
                String item = "";
                String quantity = "";
                String cost="";
                String total="";
            while(rs.next()){
        
                        customer_id = rs.getString("customer_id");
                        item  = rs.getString("item");
                        quantity  = rs.getString("quantity");
                        cost  = rs.getString("cost");
                        qu=Float.parseFloat(quantity);
                        tot=Float.parseFloat(cost);
                        g_total1=qu*tot;
                        g_total=g_total1+g_total;
                        Print_area.setText(Print_area.getText()+"\n        "+item+"\t       "+quantity+"\t          "+g_total1);

                                }
                Print_area.setText(Print_area.getText()); 
                Print_area.setText(Print_area.getText()+"\n****************************************************************\n\n TOTAL: "+g_total+"\n\nCustomer id :"+customer_id+"\n***************************************************************\n\n\tThank You Visit Again");   
        }
        catch (SQLException e ) {
                    JOptionPane.showMessageDialog(null, e);

                }
        
        
    }//GEN-LAST:event_Generate_ReciptActionPerformed
public void Headder(){
        Print_area.setText("****************************************************************\n\n");
        Print_area.setText(Print_area.getText()+"                               sHRINIDHI STORES                      \n\n");
        Print_area.setText(Print_area.getText()+"****************************************************************");
        
        Date obj = new Date();
        String date=obj.toString();
        Print_area.setText(Print_area.getText()+"\n"+date+"\n");
        
        Print_area.setText(Print_area.getText()+"\n****************************************************************");
        Print_area.setText(Print_area.getText()+"\n           ITEM           QUANTITY(KG)        PRICE");
}

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_menu;
    private javax.swing.JLabel Done;
    private javax.swing.JButton Generate_Recipt;
    private javax.swing.JTextArea Print_area;
    private javax.swing.JButton clear_btn;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField customer_id;
    private javax.swing.JTextField items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
