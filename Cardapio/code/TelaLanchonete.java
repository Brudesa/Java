import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLanchonete extends JFrame {

    private Cardapio cardapio = new Cardapio();
    private Pedido pedido = new Pedido();

    private JTextArea areaResumo;
    private JLabel labelTotal;

    public TelaLanchonete() {

        setTitle("Lanchonete EduTech");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // ---- Painel do Cardápio ----
        JPanel painelMenu = new JPanel();
        painelMenu.setLayout(new GridLayout(0, 1));

        for (Item item : cardapio.getItens()) {
            JButton btn = new JButton(item.toString());
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pedido.adicionarItem(item);
                    atualizarResumo();
                }
            });
            painelMenu.add(btn);
        }

        add(painelMenu, BorderLayout.NORTH);

        // ---- Painel do Resumo ----
        areaResumo = new JTextArea();
        areaResumo.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResumo);
        add(scroll, BorderLayout.CENTER);

        // ---- Painel do Total ----
        JPanel painelTotal = new JPanel(new FlowLayout());
        labelTotal = new JLabel("Total: R$ 0,00");
        painelTotal.add(labelTotal);

        add(painelTotal, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void atualizarResumo() {
        StringBuilder texto = new StringBuilder();
        for (Item item : pedido.getItens()) {
            texto.append(item.getNome())
                .append(" - R$ ")
                .append(String.format("%.2f", item.getPreco()))
                .append("\n");
        }
        areaResumo.setText(texto.toString());

        labelTotal.setText("Total: R$ " + String.format("%.2f", pedido.calcularTotal()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLanchonete());
    }
}
