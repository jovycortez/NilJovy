import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoLooping extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int numberofQuestion = 0;
	JButton btnNewButton;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoLooping frame = new NoLooping();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NoLooping() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 80, 159, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(10, 15, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		numberofQuestion = 10;
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel.setText("Lift off in "+numberofQuestion--);
			}
		});
		btnNewButton.setBounds(10, 46, 89, 23);
		contentPane.add(btnNewButton);
	}
}
