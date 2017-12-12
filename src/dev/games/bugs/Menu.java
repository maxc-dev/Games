package dev.games.bugs;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/** First attempt at a 2 player game.
 *
 * @author mc170171
 */
public class Menu extends javax.swing.JFrame {

    private void chooseMode(boolean single) {
        
        String item = mode.getSelectedItem() + "";
        
        if (item.contains("Time Trial")) {
            this.dispose();
            new TimeTrial().setVisible(true);
            
        } else if (item.contains("Race")) {
            if (single == true) {
                playSingleplayer(true);
                
            } else {
                playMultiplayer(true);
                
            }
            
        } else if (item.contains("Frenzy")) {
            if (single == true) {
                playSingleplayer(false);
                
            } else {
                playMultiplayer(false);
                
            }
        }
        
    }
    
    protected void playMultiplayer(boolean race) {
        this.dispose();
        new Multiplayer(race).setVisible(true);
    }
    
    protected void playSingleplayer(boolean race) {
        this.dispose();
        new Singleplayer(race).setVisible(true);
    }
    
    private void formatHover(JLabel label) {
        label.setBorder(BorderFactory.createLineBorder(new Color(51, 204, 0)));
    }
    
    private void formatExit(JLabel label) {
        label.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public Menu() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/dev/games/bugs/resources/bugmodels/three/1.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        titleMenu = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        playSingleplayer = new javax.swing.JButton();
        playMultiplayer = new javax.swing.JButton();
        previousScores = new javax.swing.JButton();
        rulesMP = new javax.swing.JLabel();
        rulesSP = new javax.swing.JLabel();
        howToPlay = new javax.swing.JLabel();
        mode = new javax.swing.JComboBox<>();
        rulesMode = new javax.swing.JLabel();
        bugs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bugs");
        setResizable(false);

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        titleMenu.setFont(new java.awt.Font("Agency FB", 1, 100)); // NOI18N
        titleMenu.setForeground(new java.awt.Color(51, 204, 0));
        titleMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/textmodels/title.png"))); // NOI18N

        close.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        close.setForeground(new java.awt.Color(0, 255, 0));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/textmodels/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        playSingleplayer.setBackground(new java.awt.Color(51, 153, 0));
        playSingleplayer.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        playSingleplayer.setForeground(new java.awt.Color(51, 102, 0));
        playSingleplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/bugmodels/three/1.png"))); // NOI18N
        playSingleplayer.setText(" Singleplayer");
        playSingleplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playSingleplayerActionPerformed(evt);
            }
        });

        playMultiplayer.setBackground(new java.awt.Color(51, 153, 0));
        playMultiplayer.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        playMultiplayer.setForeground(new java.awt.Color(51, 102, 0));
        playMultiplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/bugmodels/one/1.png"))); // NOI18N
        playMultiplayer.setText(" Multiplayer");
        playMultiplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMultiplayerActionPerformed(evt);
            }
        });

        previousScores.setBackground(new java.awt.Color(51, 153, 0));
        previousScores.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        previousScores.setForeground(new java.awt.Color(51, 102, 0));
        previousScores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/bugmodels/two/1.png"))); // NOI18N
        previousScores.setText(" Previous Scores");

        rulesMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/rulemodels/mp.png"))); // NOI18N

        rulesSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/rulemodels/sp.png"))); // NOI18N

        howToPlay.setFont(new java.awt.Font("Agency FB", 1, 70)); // NOI18N
        howToPlay.setForeground(new java.awt.Color(0, 153, 51));
        howToPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howToPlay.setText("How to Play:");
        howToPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mode.setBackground(new java.awt.Color(51, 153, 0));
        mode.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        mode.setForeground(new java.awt.Color(51, 102, 0));
        mode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                        Race", "                    Time Trial" }));
        mode.setToolTipText("Currently playing this mode!");
        mode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modeItemStateChanged(evt);
            }
        });
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });

        rulesMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/rulemodels/race.png"))); // NOI18N

        bugs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/games/bugs/resources/background/bugs.png"))); // NOI18N

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playSingleplayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playMultiplayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(close))
                    .addComponent(rulesMP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(howToPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rulesMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rulesSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bugs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleMenu)
                    .addGroup(backLayout.createSequentialGroup()
                        .addComponent(bugs, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(howToPlay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playSingleplayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rulesSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rulesMP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playMultiplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mode)
                    .addComponent(rulesMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(close)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        formatHover(close);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        formatExit(close);
    }//GEN-LAST:event_closeMouseExited

    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeActionPerformed

    private void playSingleplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playSingleplayerActionPerformed
        chooseMode(true);
    }//GEN-LAST:event_playSingleplayerActionPerformed

    private void playMultiplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playMultiplayerActionPerformed
        chooseMode(false);
    }//GEN-LAST:event_playMultiplayerActionPerformed

    private void modeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modeItemStateChanged
        String item = (mode.getSelectedItem() + "").replaceAll("  ", "");
        String direc = "/dev/games/bugs/resources/rulemodels/" + item + ".png";
        rulesMode.setIcon(new javax.swing.ImageIcon(getClass().getResource(direc)));
    }//GEN-LAST:event_modeItemStateChanged

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JLabel bugs;
    private javax.swing.JLabel close;
    private javax.swing.JLabel howToPlay;
    private javax.swing.JComboBox<String> mode;
    private javax.swing.JButton playMultiplayer;
    private javax.swing.JButton playSingleplayer;
    private javax.swing.JButton previousScores;
    private javax.swing.JLabel rulesMP;
    private javax.swing.JLabel rulesMode;
    private javax.swing.JLabel rulesSP;
    private javax.swing.JLabel titleMenu;
    // End of variables declaration//GEN-END:variables
}
