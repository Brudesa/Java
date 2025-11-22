package ui;

import model.Produto;
import model.Venda;
import service.RelatorioService;

import javax.swing.*;
import java.awt.*;

public class TelaVendas extends JFrame {

    private Venda venda;
    private DefaultListModel<String> listaProdutoModel = new DefaultListModel<>();

    public TelaVendas() {

        String cliente = JOptionPane.showInputDialog(this, "Nome do cliente:", "Cadastro", JOptionPane.QUESTION_MESSAGE);

        if (cliente == null || cliente.isBlank()) cliente = "Cliente não identificado";

        venda = new Venda(cliente);

        setTitle("Sistema de Vendas - Cliente: " + cliente);
        setSize(450, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // lista de produtos
        JList<String> listaProdutos = new JList<>(listaProdutoModel);
        add(new JScrollPane(listaProdutos), BorderLayout.CENTER);

        // botoes
        JPanel painelBotoes = new JPanel(new GridLayout(1, 2));

        JButton btnAdd = new JButton("Adicionar Produto");
        JButton btnRelatorio = new JButton("Gerar Relatório");

        painelBotoes.add(btnAdd);
        painelBotoes.add(btnRelatorio);
        add(painelBotoes, BorderLayout.SOUTH);

        // evento add
        btnAdd.addActionListener(e -> adicionarProduto());

        // evento relatorio
        btnRelatorio.addActionListener(e -> gerarRelatorio());

        setVisible(true);
    }

    private void adicionarProduto() {
        try {
            String nome = JOptionPane.showInputDialog(this, "Nome do produto:");
            if (nome == null || nome.isBlank()) return;

            double preco = Double.parseDouble(JOptionPane.showInputDialog(this, "Preço: "));
            int qtd = Integer.parseInt(JOptionPane.showInputDialog(this, "Quantidade: "));

            Produto p = new Produto(nome, preco, qtd);
            venda.adicionarProduto(p);
            listaProdutoModel.addElement(p.toString());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida!");
        }
    }

    private void gerarRelatorio() {
        String relatorio = new RelatorioService().gerarTexto(venda);
        JTextArea area = new JTextArea(relatorio);
        area.setEditable(false);
        JOptionPane.showMessageDialog(this, new JScrollPane(area), "Relatório Final", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TelaVendas::new);
    }
}
