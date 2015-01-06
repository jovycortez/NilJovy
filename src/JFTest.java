import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JFTest extends JFrame {

	private JPanel contentPane;
	private JTextField myText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFTest frame = new JFTest();
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
	public JFTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		final JLabel lblNewLabel = new JLabel("Hi Simmigon");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnHi = new JButton("Hi");
		btnHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtNew = myText.getText();
				lblNewLabel.setText(txtNew);
			}
		});
		contentPane.add(btnHi, BorderLayout.WEST);
		
		myText = new JTextField();
		contentPane.add(myText, BorderLayout.CENTER);
		myText.setColumns(10);
		
		
	}

}
