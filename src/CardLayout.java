import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CardLayout extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayout frame = new CardLayout();
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
	public CardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(0, 0, 428, 244);
		contentPane.add(panel);
		panel.setLayout(new java.awt.CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel.add(panel_1, "name_95236188629994");
		panel_1.setLayout(null);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			contentPane.removeAll();
			contentPane.add(panel_2);
			}
		});
		btnEnter.setBounds(159, 110, 115, 29);
		panel_1.add(btnEnter);
		
		JLabel lblPleasePressenter = new JLabel("Please press \"Enter\" to play");
		lblPleasePressenter.setBounds(109, 74, 225, 20);
		panel_1.add(lblPleasePressenter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel.add(panel_2, "name_95236225757986");
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel.add(panel_3, "name_95236262811854");
	}

}
