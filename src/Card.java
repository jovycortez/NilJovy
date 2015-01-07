import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Card extends JFrame {

	private JPanel contentPane;
	JPanel Menu;
	JPanel Home;
	JPanel MathDrills;
	JPanel Scores;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card frame = new Card();
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
	public Card() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		Menu = new JPanel();
		contentPane.add(Menu, "name_23398999095957");
		Menu.setLayout(new CardLayout(0, 0));

		Home = new JPanel();
		Menu.add(Home, "name_23604816833582");
		Home.setLayout(null);

		JButton button = new JButton("Exit");
		button.setBounds(325, 218, 89, 23);
		Home.add(button);

		JButton button_1 = new JButton("Drills");
		button_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// These for lines of code is how we switch between windows in
				// code
				Menu.removeAll();
				Menu.add(MathDrills);
				Menu.repaint();
				Menu.revalidate();
			}
		});
		button_1.setBounds(10, 36, 89, 23);
		Home.add(button_1);

		JLabel lblDrills = new JLabel("Home");
		lblDrills.setBounds(10, 11, 46, 14);
		Home.add(lblDrills);

		JButton btnScores = new JButton("Scores");
		btnScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This will go to score window
				Menu.removeAll();
				Menu.add(Scores);
				Menu.repaint();
				Menu.revalidate();
			}
		});
		btnScores.setBounds(109, 36, 89, 23);
		Home.add(btnScores);

		 Scores = new JPanel();
		Menu.add(Scores, "name_23596591084333");
		Scores.setLayout(null);

		JButton btnDrills = new JButton("Home");
		btnDrills.setBounds(10, 36, 89, 23);
		Scores.add(btnDrills);

		JButton btnMuiltply = new JButton("Drills");
		btnMuiltply.setBounds(109, 36, 89, 23);
		Scores.add(btnMuiltply);

		JLabel lblHome = new JLabel("Scores");
		lblHome.setBounds(10, 11, 46, 14);
		Scores.add(lblHome);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(325, 218, 89, 23);
		Scores.add(btnExit);

		MathDrills = new JPanel();
		Menu.add(MathDrills, "name_23609174812274");
		MathDrills.setLayout(null);

		JLabel lblMathDrills = new JLabel("Math Drills");
		lblMathDrills.setBounds(10, 11, 95, 14);
		MathDrills.add(lblMathDrills);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(10, 36, 89, 23);
		MathDrills.add(btnNewButton);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(109, 36, 89, 23);
		MathDrills.add(btnNext);

		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.setBounds(325, 218, 89, 23);
		MathDrills.add(btnExit_1);
	}
}
