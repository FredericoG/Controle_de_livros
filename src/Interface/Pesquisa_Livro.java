/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frederico
 */
public class Pesquisa_Livro extends javax.swing.JInternalFrame {

    private JTable tabela;
    private final DefaultTableModel modelo = new DefaultTableModel();
    public conexao con;

    /**
     * Creates new form Pesquisar
     */
    public Pesquisa_Livro(conexao conect) {
        con = conect;
        criaTabela();
        initComponents();
    }

    private void criaTabela() {
        tabela = new JTable(modelo);
        modelo.addColumn("Nome do livro"); // adiciona as colunas na tabela
        modelo.addColumn("Nome do autor");
        modelo.addColumn("Nome da editora");
        modelo.addColumn("Ano da publicação");

        tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        pesquisa = ("select * from frederico.livro join frederico.autor on (frederico.livro.idlivroautor = frederico.autor.id)");
    }

    private void PesquisaLivro(String sql) {

        con.executeSQL(sql);
        con.resultset.first();
        do {
            modelo.addRow(new Object [] ( con.resultset.getObject("nomelivro")
            , con.resultset.getObject("nomeautor")
            , con.resultset.getObject("nomeeditora")
            , con.resultset.getObject("ano")));
        }while (con.resultset.next);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtNomeAutor = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtNomeEditora = new javax.swing.JTextField();
        jtNomeLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jsResultado = new javax.swing.JScrollPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pesquisa de Livros");

        jLabel1.setText("Nome do autor: ");

        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome da editora: ");

        jLabel3.setText("Nome do livro: ");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsResultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pesquisar)
                                .addGap(36, 36, 36)
                                .addComponent(Limpar)
                                .addGap(40, 40, 40)
                                .addComponent(Cancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 452, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtNomeAutor, jtNomeEditora, jtNomeLivro});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisar)
                    .addComponent(Limpar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtNomeAutor, jtNomeEditora, jtNomeLivro});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed

        jtNomeAutor.setText("");
        jtNomeEditora.setText("");
        jtNomeLivro.setText("");
        limparClienteJTable();

    }//GEN-LAST:event_LimparActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        Pesquisa_Livro pesquisa_Livro = new Pesquisa_Livro(con);
        pesquisa_Livro.setVisible(true);
    }//GEN-LAST:event_PesquisarActionPerformed

    private void limparClienteJTable() {
        DefaultTableModel tabela = (DefaultTableModel) jtResultado.getModel();
        while (tabela.getRowCount() > 0) {
            tabela.removeRow(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jsResultado;
    private javax.swing.JTextField jtNomeAutor;
    private javax.swing.JTextField jtNomeEditora;
    private javax.swing.JTextField jtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
