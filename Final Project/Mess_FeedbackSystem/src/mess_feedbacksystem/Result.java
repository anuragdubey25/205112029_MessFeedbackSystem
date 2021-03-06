/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_feedbacksystem;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anurag
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    private Statement statement;
    private ResultSet resultset;
    private String mess_id;
    int history;
    public Result(Statement stmnt) {
       statement=stmnt;
        initComponents();
        jLabel3.setVisible(false);
        try {
            resultset=statement.executeQuery("select mess_id from mess_info");
            int index=0;
            jComboBox1.removeAllItems();
            while(resultset.next()){
                jComboBox1.insertItemAt(resultset.getString(1),index);
                index++;    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dish iD", "Dish Name", "Ratting"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("History");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Select Mess ID");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Today", "Last Day", "Last 1 Week", "Last 2 Week", "Last 3 Week", "All" }));

        jButton2.setText("GO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mess");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            System.out.println("INside GO");
            mess_id=(String) jComboBox1.getSelectedItem();
            resultset=statement.executeQuery("select mess_name from mess_info where mess_id='"+mess_id+"'");
            if(resultset.next()){
                String mess_name=resultset.getString(1);
                jLabel3.setText(mess_name);
                jLabel3.setVisible(true);
            }
            System.out.println("INside GO...");
            history=jComboBox2.getSelectedIndex();
            
            System.out.println("switch");
            switch(history){
                case 0: resultset=statement.executeQuery("select dish_id,dish_name,rate_value from dish_info natural join ratting_info where mess_id="+mess_id+" and rate_date=curdate()");
                        break;
                case 1: resultset=statement.executeQuery("select dish_id,dish_name,rate_value from dish_info natural join ratting_info where mess_id="+mess_id+" and rate_date >= date_sub(current_date(),interval 1 day)");
                        break;
                case 2: resultset=statement.executeQuery("select dish_id,dish_name,rate_value from dish_info natural join ratting_info where mess_id="+mess_id+" and rate_date >= date_sub(current_date(),interval 7 day)");
                        break;
                case 3: resultset=statement.executeQuery("select dish_id,dish_name,rate_value from dish_info natural join ratting_info where mess_id="+mess_id+" and rate_date >= date_sub(current_date(),interval 14 day)");
                        break;
                case 4: resultset=statement.executeQuery("select dish_id,dish_name,rate_value from dish_info natural join ratting_info where mess_id="+mess_id+" and rate_date >= date_sub(current_date(),interval 1 month)");
                        break;
                case 5: resultset=statement.executeQuery("select dish_id,dish_name,rate_value from dish_info natural join ratting_info where mess_id="+mess_id+"");
                        break;
            }
           
              /*ResultSetMetaData meta=resultset.getMetaData();
              DefaultTableModel dtm=new DefaultTableModel();
              int numberOfColumns=meta.getColumnCount();
              // jTable1.setModel();
              while(resultset.next()){
                  Object [] rowData=new Object[numberOfColumns];
                  for(int i=0;i<rowData.length;i++){
                      rowData[i]=resultset.getObject(i+1);
                  }
                  dtm.addRow(rowData);
               }
              jTable1.setModel(dtm);
              dtm.fireTableDataChanged();
              System.out.println("table populated");*/
                 ResultSetMetaData md = resultset.getMetaData();
                 int columnCount = md.getColumnCount();
                 Vector data = new Vector(columnCount);
                 Vector row = new Vector(columnCount);
                 Vector columnNames = new Vector(columnCount);


    for (int i = 1; i <= columnCount; i++) {
        columnNames.addElement(md.getColumnName(i));
    }
    while (resultset.next()) {
        for (int i = 1; i <= columnCount; i++) {
            row.addElement(resultset.getObject(i));

        }
        data.addElement(row);
        row = new Vector(columnCount); // Create a new row Vector
    }
    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    jTable1.setModel( model );  
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login(statement).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
