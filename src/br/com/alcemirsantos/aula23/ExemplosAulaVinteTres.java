package br.com.alcemirsantos.aula23;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import br.com.alcemirsantos.aula24.MostraDialogoActionListener;

public class ExemplosAulaVinteTres {

	public static void main(String[] args) {

		// Cria e configura a janela.
		JFrame janelaPrincipal = new JFrame("Hello World Swing");
		janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPrincipal.setPreferredSize(new Dimension(600,400));
		janelaPrincipal.getContentPane().setLayout(new GridLayout(2, 4));

		JTabbedPane painelComAbas = new JTabbedPane(JTabbedPane.TOP);
		janelaPrincipal.getContentPane().add(painelComAbas);

		JPanel panel = new JPanel();
		JLabel label3 = new JLabel("complexa");
		panel.add(label3);
		JTextField txtFharenheit = new JTextField(10);
		panel.add(txtFharenheit);
		painelComAbas.addTab("Aba 1", null, panel, null);

		String texto = txtFharenheit.getText();
		
		JPanel panel2 = new JPanel();
		painelComAbas.addTab("Aba 2 tab", null, panel2, null);
		JLabel label = new JLabel("Txt");
		panel2.add(label);

		JPanel panel3 = new JPanel();
		painelComAbas.addTab("Aba 3", null, panel3, null);
		JLabel label2 = new JLabel("mensagem");
		panel3.add(label2);

		JPanel panel4 = new JPanel();
		painelComAbas.addTab("Aba4", null, panel4, null);
		JLabel label4 = new JLabel("Txt");
		JButton btnOK = new JButton("OK");
		panel4.add(label4);
		panel4.add(btnOK);

		MostraDialogoActionListener listener = new MostraDialogoActionListener(); 
		btnOK.addActionListener(listener);
		// Exibe a janela.
		janelaPrincipal.pack();
		janelaPrincipal.setVisible(true);

	}


}
