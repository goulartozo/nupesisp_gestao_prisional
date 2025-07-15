/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nupesisp.telas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglas
 */
public class TelaInicial extends JFrame{
    
    private JScrollPane jScrollPane; 
    private DefaultTableModel model;
    
    nupesisp.processos.Process process = new nupesisp.processos.Process();
    
    private JTextField jtfBusca;
    public TelaInicial() {
        setTitle("Ficha de Acolhimento da Atenção Prmária Prisional");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());
        
        JPanel telaInicial = new JPanel();
        JLabel txtNome = new JLabel("Nome:");
        jtfBusca = new JTextField(20);
        JButton btnLocalizar = new JButton("Buscar");
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnAtualizar = new JButton("Atualizar");
        btnLocalizar.addActionListener(e -> localizarIndividuo(e));
        btnAtualizar.addActionListener(e -> atualizarLista(e));
        btnCadastrar.addActionListener(e -> abrirTela(e));
        telaInicial.add(txtNome);
        telaInicial.add(jtfBusca);
        telaInicial.add(btnLocalizar);
        telaInicial.add(btnAtualizar);
        telaInicial.add(btnCadastrar);
        add(telaInicial, BorderLayout.NORTH);
        
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOME");
        model.addColumn("CPF");
        model.addColumn("IDADE");
        model.addColumn("NOME DA MÃE");
        JTable tabelaInformacoes = new JTable(model);
        
        jScrollPane = new JScrollPane(tabelaInformacoes);
        add(jScrollPane, BorderLayout.CENTER);
    }
    
    public void abrirTela(ActionEvent e){
        nupesisp.telas.TelaCadastro telaCadastro = new nupesisp.telas.TelaCadastro(model);
        telaCadastro.setVisible(true);
    }
    
    public void atualizarLista(ActionEvent e){
        process.carregarDadosTabela(model);
    }
    
    public void localizarIndividuo(ActionEvent e){
        
        String cpfString = jtfBusca.getText();
        
        process.carregarDadosTabelaPorCpf(model, cpfString);
    }
        
}
