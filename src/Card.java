import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.acl.Group;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.SwingConstants;

public class Card extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnswer;
	JLabel lblMathQuestion;
	JButton btnSubmit;
	JLabel lblConfirm;
	JLabel lblNumberOfTries;

	int numOfTrials = 0;
	static int number1 = 0;
	static int number2 = 0;
	static int numberOfQuestion = 0;
	static int problemType = 0;
	static String userChoice = null;
	static double right = 0;
	static DecimalFormat df = new DecimalFormat("#.##");
	JButton btnNext;
	static int i;
	static String score;
	final static int ONEDIGIT = 10;
	final static int TWODIGIT = 100;
	private JLabel lblRight;

	ButtonGroup Additiongroup = new ButtonGroup();
	JRadioButton rbtnOneDigitOverOneDigit;
	JRadioButton rbtnOneDigitOverTwoDigits;
	JRadioButton rbtnTwoDigitsOverOneDigit;
	JRadioButton rbtnTwoDigitsOverTwoDigits;

	// These are our cards
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

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// These for lines of code is how we switch between windows in
				// code
				Menu.removeAll();
				Menu.add(MathDrills);
				Menu.repaint();
				Menu.revalidate();
				if (rbtnOneDigitOverOneDigit.isSelected()) {
					System.out.println("Huh");
				}
			}
		});
		btnOk.setBounds(127, 218, 89, 23);
		Home.add(btnOk);

		JLabel lblDrills = new JLabel("Home");
		lblDrills.setBounds(10, 11, 46, 14);
		Home.add(lblDrills);

		JButton btnScores = new JButton("Scores");
		btnScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This will go to score window
				Menu.removeAll();
				Menu.add(Scores);
				Menu.repaint();
				Menu.revalidate();
			}
		});
		btnScores.setBounds(226, 218, 89, 23);
		Home.add(btnScores);

		rbtnOneDigitOverOneDigit = new JRadioButton("1+1");
		rbtnOneDigitOverOneDigit.setBounds(10, 32, 77, 23);
		Home.add(rbtnOneDigitOverOneDigit);

		rbtnOneDigitOverTwoDigits = new JRadioButton("1 + 12");
		rbtnOneDigitOverTwoDigits.setBounds(89, 32, 99, 23);
		Home.add(rbtnOneDigitOverTwoDigits);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("1 + 123");
		rdbtnNewRadioButton_1.setBounds(190, 32, 89, 23);
		Home.add(rdbtnNewRadioButton_1);

		rbtnTwoDigitsOverOneDigit = new JRadioButton("12 + 2");
		rbtnTwoDigitsOverOneDigit.setBounds(10, 58, 77, 23);
		Home.add(rbtnTwoDigitsOverOneDigit);

		rbtnTwoDigitsOverTwoDigits = new JRadioButton("12 + 12");
		rbtnTwoDigitsOverTwoDigits.setBounds(89, 57, 99, 23);
		Home.add(rbtnTwoDigitsOverTwoDigits);
		
		Additiongroup.add(rbtnOneDigitOverOneDigit);
		Additiongroup.add(rbtnOneDigitOverTwoDigits);
		Additiongroup.add(rbtnTwoDigitsOverOneDigit);
		Additiongroup.add(rbtnTwoDigitsOverTwoDigits);

		JRadioButton radioButton_1 = new JRadioButton("12 + 123");
		radioButton_1.setBounds(190, 58, 89, 23);
		Home.add(radioButton_1);

		JRadioButton radioButton_4 = new JRadioButton("123 + 1");
		radioButton_4.setBounds(10, 84, 77, 23);
		Home.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("123 + 12");
		radioButton_5.setBounds(89, 84, 99, 23);
		Home.add(radioButton_5);

		JRadioButton radioButton_3 = new JRadioButton("123 + 123");
		radioButton_3.setBounds(190, 84, 89, 23);
		Home.add(radioButton_3);
		// All math
		// The first run

		MathDrills = new JPanel();
		Menu.add(MathDrills, "name_23609174812274");
		MathDrills.setLayout(null);

		JLabel lblMathDrills = new JLabel("Math Drills");
		lblMathDrills.setBounds(10, 11, 95, 14);
		MathDrills.add(lblMathDrills);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(10, 68, 89, 23);
		MathDrills.add(btnNewButton);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(109, 68, 89, 23);
		MathDrills.add(btnNext);

		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.setBounds(325, 218, 89, 23);
		MathDrills.add(btnExit_1);

		lblMathQuestion = new JLabel("");
		lblMathQuestion.setBounds(20, 43, 178, 14);
		number1 = (int) (Math.random() * ONEDIGIT);
		number2 = (int) (Math.random() * ONEDIGIT);
		numOfTrials = 2;
		lblMathQuestion.setText(number1 + " + " + number2 + " = ");
		MathDrills.add(lblMathQuestion);

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
	}
}
