/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationclient;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Client extends javax.swing.JFrame {
    
    static BigInteger p;
    static BigInteger q;
    static BigInteger n;
    static BigInteger phi;
    static BigInteger e;
    static BigInteger d;
    static BigInteger message;
    static Socket socket;
    static ServerSocket serversocket;
    static DataInputStream entreSocket;
    static DataOutputStream sortieSocket;
    //static String ipad=ip.getText();
    //public static int valport=Integer.parseInt(port.getText());
    


    /**
     * Creates new form Client
     */
    public Client() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        importer = new java.awt.Button();
        chiffrer = new java.awt.Button();
        connect = new java.awt.Button();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        taille = new javax.swing.JTextField();
        generer = new java.awt.Button();
        partager = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        inpute = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputn = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ip = new javax.swing.JTextField();
        envoyer = new java.awt.Button();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        dechiffrer = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMMUNICATION RESEAU (CLIENT)");

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));

        jPanel2.setBackground(new java.awt.Color(87, 104, 253));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("INPUT");

        input.setColumns(20);
        input.setRows(5);
        jScrollPane1.setViewportView(input);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        importer.setBackground(new java.awt.Color(0, 255, 64));
        importer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        importer.setLabel("IMPORTER");

        chiffrer.setBackground(new java.awt.Color(0, 255, 64));
        chiffrer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        chiffrer.setLabel("CHIFFRER");
        chiffrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiffrerActionPerformed(evt);
            }
        });

        connect.setBackground(new java.awt.Color(0, 255, 64));
        connect.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        connect.setLabel("CONNECT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connect, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(importer, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(chiffrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(connect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(importer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(chiffrer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel5.setBackground(new java.awt.Color(197, 202, 254));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("GENERATION DE CLE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TAILLE");

        generer.setBackground(new java.awt.Color(0, 255, 64));
        generer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        generer.setForeground(new java.awt.Color(87, 105, 253));
        generer.setLabel("GENERER");
        generer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genererActionPerformed(evt);
            }
        });

        partager.setBackground(new java.awt.Color(0, 255, 64));
        partager.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        partager.setLabel("PARTAGER");
        partager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partagerActionPerformed(evt);
            }
        });

        jLabel7.setText("e:");

        jLabel8.setText("d:");

        jLabel9.setText("n:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inpute, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(inputn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(taille, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(generer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(partager, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(inputd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(inputn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generer, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(taille, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(217, 255, 217));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PORT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("IP");

        envoyer.setBackground(new java.awt.Color(0, 255, 64));
        envoyer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        envoyer.setLabel("ENVOYER");
        envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(port))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ip))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(envoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 33, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(envoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(87, 105, 253));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("OUTPUT");

        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        dechiffrer.setBackground(new java.awt.Color(0, 255, 64));
        dechiffrer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dechiffrer.setLabel("DECHIFFRER");
        dechiffrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dechiffrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(dechiffrer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(dechiffrer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genererActionPerformed
      // TODO add your handling code here:
        if(taille.getText().isEmpty()){
            input.setText("");
            input.append("Veuillez entre la taille de votre clé!!!!!!!");
        }else{
            int tail=Integer.parseInt(taille.getText());
            genkeypairs(tail);
            //output.append(genkeypairs(tail));
        }
    }//GEN-LAST:event_genererActionPerformed

    private void partagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partagerActionPerformed
       //if((port.getText().isEmpty())||(ip.getText().isEmpty())){
           // input.setText("");
            //input.setText("Aucune valeur port ou addresse");
       // }else{
           
           //String ipaddress=ip.getText();
         //int valeurPort=Integer.parseInt(port.getText());
        //partager(ipaddress,valeurPort);
        
            
            String messageE="";
            String messageN="";
            messageE=inpute.getText();
            messageN=inputn.getText();
            try{
                sortieSocket.writeUTF(messageE);
                sortieSocket.writeUTF(messageN);
                
                
            }catch(IOException e){
               // 
            }
        //}
    }//GEN-LAST:event_partagerActionPerformed

    private void envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerActionPerformed
        // TODO add your handling code here:
        String messageOut="";
        messageOut=input.getText();
        try {
            sortieSocket.writeUTF(messageOut);
            //jTextFieldInput.setText("");
        } catch (IOException ex) {
            //Logger.getLogger(InterfaceServeur.class.getName()).log(Level.SEVERE, null, ex);
        }
        //envoyer(valport);
        //envoyer();
      // }
                
    }//GEN-LAST:event_envoyerActionPerformed

    private void dechiffrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dechiffrerActionPerformed
        if(output.getText().isEmpty()){
            output.setText("champs vide");
        }else{
            String msgIn="";
            msgIn=output.getText();
            byte[] msgInByte=msgIn.getBytes();
            BigInteger msgBig= new BigInteger(msgInByte);
            BigInteger[] plaintextBig = new BigInteger[msgBig.byteValue()];
            String valeurD=inputd.getText();
            String valeurN=inputn.getText();
            byte[] valD=valeurD.getBytes();
            byte[] valN=valeurN.getBytes();
            BigInteger valeurd= new BigInteger(valD);
            BigInteger valeurn= new BigInteger(valN);
            dechiffre(plaintextBig,valeurd,valeurn);
            input.setText(dechiffre(plaintextBig,valeurd,valeurn));
            
        }
    }//GEN-LAST:event_dechiffrerActionPerformed

    private void chiffrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiffrerActionPerformed
        // TODO add your handling code here:
         String msgIn = "";

          if (input.getText().isEmpty()) {
            input.setText("");
            input.setText(" Votre champs de text est vide");
        //    outputServeur.setText(" ugfiosdfungoisuoinfffs  s df sd f sdf é");

            } else {

            msgIn = input.getText();
            byte[] messageByte=msgIn.getBytes();
            String valeurE = inpute.getText();
            byte[] valE=valeurE.getBytes();
            String valeurN = inputn.getText();
            byte[] valN= valeurN.getBytes();
            BigInteger valeure = new BigInteger(valE);
            BigInteger valeurn;
            valeurn = new BigInteger(valN);
            BigInteger msgBig= new BigInteger(messageByte);
            chiffrer(msgBig, valeure, valeurn);

            input.setText(chiffrer(msgBig,valeure,valeurn));
          }

    }//GEN-LAST:event_chiffrerActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client().setVisible(true);
            }
        });
        partager();
        //envoyer();
                
    }
   
     public String chiffrer(BigInteger message, BigInteger valeurE, BigInteger valeurN) {
       /* byte[] msg = message.getBytes();
        for (int i = 0; i < message.length(); i++) {
            int asciival = msg[i];
            BigInteger val= new BigInteger(""+ asciival);
            BigInteger cipherVal;
            cipherVal = val.modPow(valeurE, valeurN);
            String stringChiffre = cipherVal.toString();

            System.out.println(stringChiffre);
        }
        String stringChiffre = cipherVal.toString();*/

       /* int i;
         byte[] temp = new byte[1];
        
         BigInteger[] chiffre;
        
        
         BigInteger[] mes;
                
         byte[] plainTextByte=message.getBytes();
        
         mes=new BigInteger[plainTextByte.length];
         for(i=0;i<=mes.length;i++){
                
         temp[0]=plainTextByte[i];
             
         mes[i]=new BigInteger(temp);
         }
            
            
         chiffre=new BigInteger[mes.length];
         for(i=0;i<=mes.length;i++){
                    
         chiffre[i]=mes[i].modPow(valeurE,valeurN);
         }
         String stringChiffre=chiffre.toString();*/
        BigInteger msg;
        msg=message.modPow(valeurE, valeurN);
        String messageString=msg.toString();
        return messageString;
    }
    
 
      public static void partager(){
                
                try{
                    String valeurE="";
                String valeurN="";
                String text="";
                    //ipad=ip.getText();
                    //valport=Integer.parseInt(port.getText());
                
                socket= new Socket("127.0.0.1",8088);

                    entreSocket = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                sortieSocket = new DataOutputStream(socket.getOutputStream());
                   while(!valeurE.equals("")||valeurN.equals("")||text.equals("")){
                       valeurE=entreSocket.readUTF();
                       valeurN=entreSocket.readUTF();
                       text=entreSocket.readUTF();
                       inpute.setText(inpute.getText()+""+valeurE);
                       inputn.setText(inputn.getText()+""+valeurN);
                       output.setText(output.getText()+""+text);
                   }
                }catch(IOException e){
                //
            
               }
               
            
           }
      
           /// GENERATION DE CLés:::::::::::::::::
      
           public void genkeypairs(int taill){
        taill=Integer.parseInt(taille.getText());
        SecureRandom random = new SecureRandom();
        p=BigInteger.probablePrime(taill, random);
        q=BigInteger.probablePrime(taill, random);
        n=p.multiply(q);
        
        phi=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        
        do 
        {
            e=BigInteger.probablePrime(32, random);
        }while(e.gcd(phi).intValue()!=1);
        
        d=e.modInverse(phi);
        String stringE=e.toString();
        inpute.setText(stringE);
        String stringD=d.toString();
        inputd.setText(stringD);
        String stringN=n.toString();
        inputn.setText(stringN);
        //return "+e+" "+d+" "+n+";
   }
           
            
            /// FONCTION DE CHIFFREMENT ET DECHIFFREMENT
            
            public String chiffrer(String message){
            int i;
            byte[] temp = new byte[1];
        
             BigInteger[] chiffre;
        
        
            BigInteger[] mes;
                
             byte[] plainTextByte=message.getBytes();
        
            mes=new BigInteger[plainTextByte.length];
            for(i=0;i<=mes.length;i++){
                
                temp[0]=plainTextByte[i];
             
                mes[i]=new BigInteger(temp);
             }
            
            
                chiffre=new BigInteger[mes.length];
                    for(i=0;i<=mes.length;i++){
                    
                        chiffre[i]=mes[i].modPow(e,n);
                    }
                    String stringChiffre=chiffre.toString();
                return stringChiffre;
        }
            
             public String dechiffre( BigInteger[] chifre, BigInteger valeurD, BigInteger valeurN){
               BigInteger[] Message = null;
               BigInteger[] dechi;
                
                dechi= new BigInteger[chifre.length];
                
                for(int i=0;i<dechi.length;i++){
                    Message[i]= chifre[i].modPow(valeurD, valeurN);
                }
                char[] charArraye= new char[Message.length];
                
                    for(int i=0;i<charArraye.length;i++){
                        charArraye[i]=(char)(Message[i].intValue());
                   }
                 return (new String(charArraye));
        
             }
             
             
             //// FONCTION QUUI PERMET D'ENVOYER
             public static void envoyer(){
            
                try{
                    String text="";
                    //ipad=ip.getText();
                    //valport=Integer.parseInt(port.getText());
                socket= new Socket("127.0.0.1",8088);
                //serversocket= new  ServerSocket(valport);
               //socket=serversocket.accept();
                
                 
                entreSocket = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                sortieSocket = new DataOutputStream(socket.getOutputStream());
                   while(true){
                       text=entreSocket.readUTF();
                       input.setText(input.getText()+" "+text);
                   }
                }catch(IOException e){
                //
            
               }
               
            
           }

             
             
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button chiffrer;
    private java.awt.Button connect;
    private java.awt.Button dechiffrer;
    private java.awt.Button envoyer;
    private java.awt.Button generer;
    private java.awt.Button importer;
    private static javax.swing.JTextArea input;
    private static javax.swing.JTextField inputd;
    private static javax.swing.JTextField inpute;
    private static javax.swing.JTextField inputn;
    private static javax.swing.JTextField ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea output;
    private java.awt.Button partager;
    private static javax.swing.JTextField port;
    private static javax.swing.JTextField taille;
    // End of variables declaration//GEN-END:variables
}
