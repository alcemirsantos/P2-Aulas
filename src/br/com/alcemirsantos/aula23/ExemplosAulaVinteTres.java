package br.com.alcemirsantos.aula23;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class ExemplosAulaVinteTres {

	public static void main(String[] args) {

		// Cria e configura a janela.
		JFrame frame = new JFrame("Hello World Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 4));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Aba 1", null, panel, null);
		JLabel label3 = new JLabel("complexa");
		panel.add(label3);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("Aba 2 tab", null, panel2, null);
		JLabel label = new JLabel("Txt");
		panel2.add(label);
		
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("Aba 3", null, panel3, null);
		JLabel label2 = new JLabel("mensagem");
		panel2.add(label2);
		
		
		JPanel panel4 = new JPanel();
		tabbedPane.addTab("Aba4", null, panel4, null);
		JLabel label4 = new JLabel("Txt");
		JButton btnOK = new JButton("OK");
		panel4.add(label4);
		panel4.add(btnOK);
				
		// Exibe a janela.
		frame.pack();
		frame.setVisible(true);

	}
}
