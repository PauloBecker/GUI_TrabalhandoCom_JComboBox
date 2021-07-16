import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tela2 implements ActionListener {
	
	JLabel label;
	JComboBox<String> comboBox;
	
	public Tela2() {

		JFrame frame = new JFrame("Título");
		frame.setVisible(true);
		frame.setSize(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		
		String[] redesSociais = {"Facebook", "Instagram"};
		
		comboBox = new JComboBox<String>(redesSociais);
		comboBox.addActionListener(this);
		frame.add(comboBox);
		
		ImageIcon fig = new ImageIcon("img/facebook.png");
		
		label = new JLabel(fig);
		frame.add(label);
	
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {


				new Tela2();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(e.getActionCommand());
		System.out.println(comboBox.getSelectedItem());
		String aux = comboBox.getSelectedItem().toString().toLowerCase();
		label.setIcon(new ImageIcon("img/" +aux+".png"));
	}

}
