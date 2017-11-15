/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.games.tiles;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author MC170171
 */
public class Tiles extends javax.swing.JFrame {

    private boolean playing = false;
    private int level = 1;
    private int H;
    private final int W = 100;
    private final int maxLevel = 10;
    private int tileID = 0;
    private int counter = 0;
    private JLabel[] tiles = new JLabel[maxLevel*(5)+1];
    private int[] belongs = new int [maxLevel*(5)+1];

    JLabel square = new JLabel("");
    
    private void slideTile(JLabel label, int height) {
        
        label.setLocation(0, height);
        
        switch (belongs[counter]) {
            case 1:
                slide1.add(label);
                slide1.repaint();
            case 2:
                slide2.add(label);
                slide2.repaint();
            case 3:
                slide3.add(label);
                slide3.repaint();
            case 4:
                slide4.add(label);
                slide4.repaint();
        }
        
        if (height == slide1.getHeight()) {
            label.setVisible(false);
        }
        
    }
    
    private void startLevel() {
        
        int squares = level * 5;
        int speed = 10 - level;
        H = (maxLevel - level) * 10;
        
        levelCounter.setText(level + ".");
        //for (int i = tileID; i < squares+tileID; i++) {
        for (int i = 0; i < 5; i++) {
            tiles[i] = new JLabel("");
            tiles[i].setSize(H, W);
            tiles[i].setBackground(Color.black);
            tiles[i].setOpaque(true);
            counter = i;
            belongs[counter] = randomInt(1,4);
            
            Thread animationThread = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < slide1.getHeight() + 1; i++) {
                        slideTile(tiles[counter], i);
                        try {
                            Thread.sleep(speed);} catch (Exception ex) {}
                    }
                }
            });

            animationThread.start();
            tileID++;
            
            Thread delayThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(speed);} catch (Exception ex) {}
                }
            });
            delayThread.start();
        }
        
        

        
        
    }
    
    private void startGame() {
        
        if (playing == true) {
            System.out.println("Game is already in progress.");
            
        } else {
            
            playing = true;
            playNowButton.setVisible(false);
            
            startLevel();
            
        }
        
    }
    
    public int randomInt(int min, int max) {
        
        Random random = new Random();
        
        return random.nextInt((max-min)+1)+min;
    }
    
    public Tiles() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/dev/games/tiles/resources/icons/tiles_icon.png")).getImage());
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
        title = new javax.swing.JLabel();
        levelCounter = new javax.swing.JLabel();
        playNowButton = new javax.swing.JButton();
        bottomBanner = new javax.swing.JPanel();
        slide1 = new javax.swing.JPanel();
        slide2 = new javax.swing.JPanel();
        slide3 = new javax.swing.JPanel();
        slide4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mBarOptions = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tiles");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Agency FB", 1, 100)); // NOI18N
        title.setForeground(new java.awt.Color(102, 153, 255));
        title.setText("Tiles");

        levelCounter.setFont(new java.awt.Font("Agency FB", 1, 50)); // NOI18N
        levelCounter.setForeground(new java.awt.Color(102, 153, 255));

        playNowButton.setBackground(new java.awt.Color(0, 0, 0));
        playNowButton.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        playNowButton.setForeground(new java.awt.Color(102, 153, 255));
        playNowButton.setText("Play");
        playNowButton.setBorder(null);
        playNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playNowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(playNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(levelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(levelCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playNowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomBanner.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bottomBannerLayout = new javax.swing.GroupLayout(bottomBanner);
        bottomBanner.setLayout(bottomBannerLayout);
        bottomBannerLayout.setHorizontalGroup(
            bottomBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomBannerLayout.setVerticalGroup(
            bottomBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        slide1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout slide1Layout = new javax.swing.GroupLayout(slide1);
        slide1.setLayout(slide1Layout);
        slide1Layout.setHorizontalGroup(
            slide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        slide1Layout.setVerticalGroup(
            slide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        slide2.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout slide2Layout = new javax.swing.GroupLayout(slide2);
        slide2.setLayout(slide2Layout);
        slide2Layout.setHorizontalGroup(
            slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        slide2Layout.setVerticalGroup(
            slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        slide3.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout slide3Layout = new javax.swing.GroupLayout(slide3);
        slide3.setLayout(slide3Layout);
        slide3Layout.setHorizontalGroup(
            slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        slide3Layout.setVerticalGroup(
            slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        slide4.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout slide4Layout = new javax.swing.GroupLayout(slide4);
        slide4.setLayout(slide4Layout);
        slide4Layout.setHorizontalGroup(
            slide4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        slide4Layout.setVerticalGroup(
            slide4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(slide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slide3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slide2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slide4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slide1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(bottomBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mBarOptions.setBackground(new java.awt.Color(204, 204, 204));
        mBarOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        mBarOptions.setForeground(new java.awt.Color(255, 51, 51));
        mBarOptions.setText("Options");
        mBarOptions.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mBarOptions.add(jSeparator2);

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mBarOptions.add(jMenuItem1);
        mBarOptions.add(jSeparator1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mBarOptions.add(jMenuItem2);
        mBarOptions.add(jSeparator3);

        jMenuBar1.add(mBarOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Created: Max Carter\nDate: 14/11/17\nSource: GitHub");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void playNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playNowButtonActionPerformed
        startGame();
    }//GEN-LAST:event_playNowButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomBanner;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel levelCounter;
    private javax.swing.JMenu mBarOptions;
    private javax.swing.JButton playNowButton;
    private javax.swing.JPanel slide1;
    private javax.swing.JPanel slide2;
    private javax.swing.JPanel slide3;
    private javax.swing.JPanel slide4;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
