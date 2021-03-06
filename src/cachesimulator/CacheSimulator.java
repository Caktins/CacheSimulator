/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachesimulator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lrive
 */
public class CacheSimulator extends javax.swing.JFrame {

    ArrayList<Integer> addresses = new ArrayList<>();
    byte cacheSize;
    byte ways;

    public CacheSimulator() {
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

        openFile_btn = new javax.swing.JButton();
        file_tbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        startSim_btn = new javax.swing.JButton();
        cacheSizeTbox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mappingOptions = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cache Simulator");
        setFocusCycleRoot(false);

        openFile_btn.setText("Open File");
        openFile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFile_btnActionPerformed(evt);
            }
        });

        file_tbox.setEnabled(false);
        file_tbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_tboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cache properties");

        startSim_btn.setText("Start Simulation");
        startSim_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSim_btnActionPerformed(evt);
            }
        });

        cacheSizeTbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacheSizeTboxActionPerformed(evt);
            }
        });

        jLabel2.setText("Cache Size");

        mappingOptions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fully assosiative", "2-way associative", "4-way associative" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mappingOptions.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mappingOptions.setToolTipText("");
        jScrollPane1.setViewportView(mappingOptions);
        mappingOptions.getAccessibleContext().setAccessibleName("mappingOptions");

        jLabel4.setText("Mapping mode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(openFile_btn)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(file_tbox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cacheSizeTbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startSim_btn))
                                .addGap(0, 94, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFile_btn)
                    .addComponent(file_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cacheSizeTbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(startSim_btn)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(114, 114, 114))
        );

        openFile_btn.getAccessibleContext().setAccessibleName("openFile_btn");
        file_tbox.getAccessibleContext().setAccessibleName("file_tbox");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openFile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFile_btnActionPerformed
// Getting the file from pc
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT files", "txt");
        chooser.setFileFilter(filter);
        int result = chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename;

        if (f == null) {
            infoBox("No file selected!", "choosing file");
        } else {
            switch (result) {
                case JFileChooser.APPROVE_OPTION:
                    filename = f.getAbsolutePath();
                    file_tbox.setText(filename);

                    // Reading the file of addresses and storing in addresses
                    File ff;
                    Scanner scan = null;
                    try {
                        ff = new File(filename);
                        scan = new Scanner(ff);
                    } catch (Exception e) {
                        System.exit(0);
                    }
                    //Assuming all the data on the file are integers
                    while (scan.hasNext()) {
                        if (scan.hasNextInt()) {
                            addresses.add(scan.nextInt());
                        } else {
                            scan.next();
                        }
                    }
                    //
                    System.out.println(addresses);
                    break;
                case JFileChooser.CANCEL_OPTION:
                    infoBox("No file selected!", "choosing file");
                    break;
                case JFileChooser.ERROR_OPTION:
                    infoBox("Error", "choosing file");
                    break;
            }

        }
    }//GEN-LAST:event_openFile_btnActionPerformed
//
    private void startSim_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSim_btnActionPerformed

        long startTime = System.currentTimeMillis();

        ArrayList<Integer> threads = new ArrayList<>();

// Validating cache size, mapping option and file selected      
        try {
            cacheSize = Byte.parseByte(cacheSizeTbox.getText());
            String adrs = file_tbox.getText();
            if (adrs.isEmpty()) {
                infoBox("Choose a text file!", "Simulation btn");
                return;
            }
            switch (mappingOptions.getSelectedIndex()) {
                case -1:
                    infoBox("Please select a mapping option.", "Simulation btn");
                    return;
                case 0:
                    ways = 1;
                    break;
                case 1:
                    ways = 2;
                    break;
                default:
                    ways = 4;
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "Please enter a number on cache size.", "Error", JOptionPane.CANCEL_OPTION);
            return;
        }
//
        Cache cacheSim = new Cache(addresses, ways, cacheSize);
        FIFO fifoCache = new FIFO();
        LRU lruCache = new LRU();
        LFU lfuCache = new LFU();
        Random randomCache = new Random();
        Optimum optimumCache = new Optimum();

        Runnable Fifo = new Runnable() {
            public void run() {
                fifoCache.Start(cacheSim);
                threads.add(1);
                return;
            }
        };

        Runnable Lru = new Runnable() {
            public void run() {
                lruCache.Start(cacheSim);
                threads.add(1);
                return;
            }
        };

        Runnable Lfu = new Runnable() {
            public void run() {
                lfuCache.Start(cacheSim);
                threads.add(1);
                return;
            }
        };

        Runnable Random = new Runnable() {
            public void run() {
                randomCache.Start(cacheSim);
                threads.add(1);
                return;
            }
        };

        Runnable Optimum = new Runnable() {
            public void run() {
                optimumCache.Start(cacheSim);
                threads.add(1);
                return;
            }
        };

        Runnable Threads = new Runnable() {
            public void run() {
                long endTime;
                while (threads.size() != 1) {

                }

                endTime = System.currentTimeMillis() - startTime;

                System.out.println("All algorithms done!");

//                System.out.println("-----------------");
//                System.out.println("FIFO details: ");
//                System.out.println("Hits: " + fifoCache._hits);
//                System.out.println("Misses: " + fifoCache._misses);
//                System.out.println("Time: " + fifoCache._endTime);
//                System.out.println("-----------------");
//
//                System.out.println("-----------------");
//                System.out.println("LRU details: ");
//                System.out.println("Hits: " + lruCache._hits);
//                System.out.println("Misses: " + lruCache._misses);
//                System.out.println("Time: " + lruCache._endTime);
//                System.out.println("-----------------");
//
//                System.out.println("-----------------");
//                System.out.println("LFU details: ");
//                System.out.println("Hits: " + lfuCache._hits);
//                System.out.println("Misses: " + lfuCache._misses);
//                System.out.println("Time: " + lfuCache._endTime);
//                System.out.println("-----------------");
//                System.out.println("-----------------");
//                System.out.println("Random details: ");
//                System.out.println("Hits: " + randomCache._hits);
//                System.out.println("Misses: " + randomCache._misses);
//                System.out.println("Time: " + randomCache._endTime);
//                System.out.println("-----------------");

                System.out.println("-----------------");
                System.out.println("Optimum details: ");
                System.out.println("Hits: " + optimumCache._hits);
                System.out.println("Misses: " + optimumCache._misses);
                System.out.println("Time: " + optimumCache._endTime);
                System.out.println("-----------------");

                System.out.println("-----------------");
                System.out.println("Cache Total Execution Time: " + endTime);
                System.out.println("-----------------");
            }
        };

        //new Thread(Fifo).start();
        //new Thread(Lru).start();
        //new Thread(Lfu).start();
        //new Thread(Random).start();
        new Thread(Optimum).start();
        new Thread(Threads).start();
    }//GEN-LAST:event_startSim_btnActionPerformed

    private void file_tboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_tboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_tboxActionPerformed

    private void cacheSizeTboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacheSizeTboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cacheSizeTboxActionPerformed

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
            java.util.logging.Logger.getLogger(CacheSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CacheSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CacheSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CacheSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CacheSimulator().setVisible(true);
            }
        });
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cacheSizeTbox;
    private javax.swing.JTextField file_tbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> mappingOptions;
    private javax.swing.JButton openFile_btn;
    private javax.swing.JButton startSim_btn;
    // End of variables declaration//GEN-END:variables
}
