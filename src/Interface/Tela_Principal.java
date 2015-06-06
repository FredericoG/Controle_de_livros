package Interface;

/**
 *
 * @author Frederico
 */
public class Tela_Principal extends javax.swing.JFrame {

//    public conexao con;

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastraUsuario = new javax.swing.JMenuItem();
        CadastraAutor = new javax.swing.JMenuItem();
        CadastraLivro = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmPesquisar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Livros");
        setResizable(false);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(0, 0, 800, 410);

        jMenu1.setText("Cadastrar");

        CadastraUsuario.setText("Cadastro de Usuário");
        CadastraUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(CadastraUsuario);

        CadastraAutor.setText("Cadastro de Autor");
        CadastraAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraAutorActionPerformed(evt);
            }
        });
        jMenu1.add(CadastraAutor);

        CadastraLivro.setText("Cadastro de Livro");
        CadastraLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraLivroActionPerformed(evt);
            }
        });
        jMenu1.add(CadastraLivro);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pesquisar");

        jmPesquisar.setText("Pesquisar Livro");
        jmPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPesquisarActionPerformed(evt);
            }
        });
        jMenu2.add(jmPesquisar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");

        jMenuItem5.setText("Sobre o programa");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 811, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastraUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraUsuarioActionPerformed

        Cadastra_Usuario usuario = new Cadastra_Usuario();
        jdpPrincipal.add(usuario);
        usuario.setVisible(true);

    }//GEN-LAST:event_CadastraUsuarioActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void CadastraAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraAutorActionPerformed
        Autor autor = new Autor();
        jdpPrincipal.add(autor);
        autor.setVisible(true);
    }//GEN-LAST:event_CadastraAutorActionPerformed

    private void jmPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPesquisarActionPerformed
        Pesquisa_Livro pesquisar = new Pesquisa_Livro(conexao conect
        );
        jdpPrincipal.add(pesquisar);
        pesquisar.setVisible(true);
    }//GEN-LAST:event_jmPesquisarActionPerformed

    private void CadastraLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraLivroActionPerformed

        Cadastra_Livro cadastraLivro = new Cadastra_Livro();
        jdpPrincipal.add(cadastraLivro);
        cadastraLivro.setVisible(true);
    }//GEN-LAST:event_CadastraLivroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastraAutor;
    private javax.swing.JMenuItem CadastraLivro;
    private javax.swing.JMenuItem CadastraUsuario;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem jmPesquisar;
    // End of variables declaration//GEN-END:variables
}
