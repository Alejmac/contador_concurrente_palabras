/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contadordepalabras;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.text.DecimalFormat;

public class vista extends javax.swing.JFrame {
      private JTextArea txaPrincipal1;
    private JButton btnSecuencial1;
    private JTextArea txaFinalSecuencial1;
    private CalculoConcurrente calculoConcurrente;

    public vista(JTextArea txaPrincipal, JButton btnSecuencial, JTextArea txaFinalSecuencial) {
        this.txaPrincipal1 = txaPrincipal;
        this.btnSecuencial1 = btnSecuencial;
        this.txaFinalSecuencial1 = txaFinalSecuencial;
        initComponents();
    }

       private void contarPalabrasSecuencial() {
        String texto = txaPrincipal.getText();
        //System.out.println("El texto es: " + texto);
        if (!texto.isEmpty()) {
            long startTime = System.nanoTime();
            // Contar palabras secuencialmente
            String[] palabras = texto.split("\\s+"); // delimita quitando los espacios 
            int cantidadPalabras = palabras.length;
            System.out.println("Cantidad de palabras: " + cantidadPalabras);

            long endTime = System.nanoTime();
            double tiempoEjecucion = (endTime - startTime) / 1_000_000.0; // Convertir a milisegundos
            System.out.println("El tiempo de ejecución es: " + tiempoEjecucion + " ms");

            txaFinalSecuencial.setText("Resultado: " + cantidadPalabras + " palabras\n");
            txaFinalSecuencial.append("Tiempo: " + new DecimalFormat("#0.00").format(tiempoEjecucion) + " ms");
        } else {
            txaFinalSecuencial.setText("Resultado: No hay texto");
        }
    }
     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPrincipal = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnSecuencial = new javax.swing.JButton();
        btnConcurrente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaFinalSecuencial = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaFinalconcurrente = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        txaPrincipal.setColumns(20);
        txaPrincipal.setRows(5);
        jScrollPane1.setViewportView(txaPrincipal);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setText("Contador De Palabras");

        btnSecuencial.setText("Secuencial");
        btnSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecuencialActionPerformed(evt);
            }
        });

        btnConcurrente.setText("Concurrente");
        btnConcurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcurrenteActionPerformed(evt);
            }
        });

        txaFinalSecuencial.setColumns(20);
        txaFinalSecuencial.setRows(5);
        jScrollPane2.setViewportView(txaFinalSecuencial);

        txaFinalconcurrente.setColumns(20);
        txaFinalconcurrente.setRows(5);
        jScrollPane3.setViewportView(txaFinalconcurrente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnSecuencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConcurrente)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSecuencial)
                    .addComponent(btnConcurrente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecuencialActionPerformed
        contarPalabrasSecuencial();
    }//GEN-LAST:event_btnSecuencialActionPerformed

    private void btnConcurrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcurrenteActionPerformed
          String texto = txaPrincipal.getText();
    calculoConcurrente = new CalculoConcurrente(texto, txaFinalconcurrente);
    calculoConcurrente.contarPalabrasConcurrente();
    }//GEN-LAST:event_btnConcurrenteActionPerformed
 
    
     public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            JTextArea txaPrincipal1 = new JTextArea();
            JButton btnSecuencial1 = new JButton();
            JTextArea txaFinalSecuencial1 = new JTextArea();

            vista contador = new vista(txaPrincipal1, btnSecuencial1, txaFinalSecuencial1);
            contador.setVisible(true);
            
        }
    });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcurrente;
    private javax.swing.JButton btnSecuencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txaFinalSecuencial;
    private javax.swing.JTextArea txaFinalconcurrente;
    private javax.swing.JTextArea txaPrincipal;
    // End of variables declaration//GEN-END:variables
}
