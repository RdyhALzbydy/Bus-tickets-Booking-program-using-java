
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AllBooking extends javax.swing.JFrame {

    /**
     * Creates new form AllBoking
     */
    public AllBooking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Sorts = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Ticket = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sorting = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 650));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Details Booking Bus");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Sorts.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Sorts.setForeground(new java.awt.Color(0, 102, 102));
        Sorts.setText("Sort");
        Sorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortsActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Return");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Enter Code Ticket");

        Ticket.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Ticket.setForeground(new java.awt.Color(0, 102, 102));

        Sorting.setColumns(20);
        Sorting.setRows(5);
        jScrollPane1.setViewportView(Sorting);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sorts, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sorts)
                            .addComponent(Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 AllBooking a=null;
 Timer timer=new Timer();
 final long StartTime=System.currentTimeMillis();
    private void SortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortsActionPerformed
      AllBooking a=null;
 Timer timer=new Timer();
 final long StartTime=System.currentTimeMillis();
        String arr1[]={"Riydh","Dammam","Jazan","Abha","Makkah","Jeddah","Al baha"};
        int arr[]={1100,950,700,400,300,250,150};
         int n = arr.length;      
       bubbleSort(arr,n,arr1); 
       printArray(arr,n,arr1); 

         
    long endTime=System.currentTimeMillis();
           long elapsed=endTime-StartTime;
            JOptionPane.showMessageDialog(null,"Timer BubbleSort : "+elapsed);
        
  // TODO add your handling code here:
    }//GEN-LAST:event_SortsActionPerformed
 
  public static  void bubbleSort(int arr[],int n,String arr1[])  //Bubble in City And Fare 
    { 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                {  int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                  String temp1 = arr1[j]; 
                    arr1[j] = arr1[j+1]; 
                   arr1[j+1] = temp1;
       } 
  }
     void printArray(int arr[],int n,String arr1[]) 
    { 
         for (int i=0; i<n; ++i) {//name Text +append +array
             Sorting.append("\nCity"+arr1[i] +" "+"\t");
              Sorting.append(" ");
        Sorting.append("   Fare :"+arr[i] +" ");
        Sorting.append(" ");
      
    }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           dispose();
           AddBooking A1=new AddBooking();
           A1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   private ArrayList<String []> AddBooking(){
        ArrayList list =new ArrayList();
 
        try {
            File Object = new File("Details Booking Bus.txt");
            Scanner Rreader = new Scanner( Object);
            while (Rreader.hasNextLine()) {
              String line = Rreader.nextLine();
                
              list.add(line.replace("[", "").replace("]", "").split(","));
         
            }
            Rreader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An Reservation Error.");
            e.printStackTrace();
          }
        return list;
    }
    private void PrintData(String [] DataTicket){
       
        List<String[]> list = this.AddBooking();
 
        list.add(DataTicket);

         try {
            FileWriter RWriter = new FileWriter("Details Booking Bus.txt");
            for(String [] userData: list){
                RWriter.write(Arrays.toString(userData)  + "\n");
            }
            RWriter.close();
     
          } catch (IOException e) {

            e.printStackTrace();
          }}
    private String[] LinearSearch(String codeTicket){//Linear Search in code Ticket
        String[] AddData = new String[6];
        AddData[0] = "0";
         for(String[] i : this.AddBooking())
          {
           String T[] = (String []) i;
 
           if(T[0].equals(codeTicket)){
            AddData = T;           }
        }
        return AddData;
    }
    // Driver code to test above
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         dispose();
        BookingBus B1=new BookingBus();
        B1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

  
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
             AllBooking a=null;
             Timer timer=new Timer();
             final long StartTime=System.currentTimeMillis();
        String DataT = Ticket.getText();  
        String[] DataTicket = this.LinearSearch(DataT);

        if(DataTicket[0] == "0"){
            JOptionPane.showMessageDialog(null,"code Ticket does not exist");
        }else if(!DataTicket[0].equals(DataT)){
        }else{
         JOptionPane.showMessageDialog(null,"Welcome: "+DataTicket[1]+"\n Data Booking : "+DataTicket[6]);
            this.PrintData(DataTicket);
        }  
       long endTime=System.currentTimeMillis();
           long elapsed=endTime-StartTime;
            JOptionPane.showMessageDialog(null,"Timer Linear Search : "+elapsed);
    }//GEN-LAST:event_jButton5ActionPerformed

     
      
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
            java.util.logging.Logger.getLogger(AllBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Sorting;
    private javax.swing.JButton Sorts;
    private javax.swing.JTextField Ticket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}