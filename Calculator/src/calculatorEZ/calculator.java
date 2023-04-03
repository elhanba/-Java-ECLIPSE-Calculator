package calculatorEZ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBackground(new Color(0, 0, 0));
		frmCalculator.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculator.setBounds(100, 100, 346, 486);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(0, 0, 0));
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		textField.setBounds(10, 11, 309, 70);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBackground(new Color(0, 0, 0));
		btnBackspace.setForeground(new Color(255, 140, 0));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0){
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 22));
		btnBackspace.setBounds(87, 92, 78, 70);
		frmCalculator.getContentPane().add(btnBackspace);
		
		final JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(0, 0, 0));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn7.setBounds(10, 161, 78, 70);
		frmCalculator.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(0, 0, 0));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
			
		});
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn4.setBounds(10, 230, 78, 70);
		frmCalculator.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(0, 0, 0));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn1.setBounds(10, 299, 78, 70);
		frmCalculator.getContentPane().add(btn1);
		
		final JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(0, 0, 0));
		btnDot.setForeground(new Color(255, 255, 255));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnDot.setBounds(164, 368, 78, 70);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnClear = new JButton("AC");
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setForeground(new Color(255, 140, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnClear.setBounds(10, 92, 78, 70);
		frmCalculator.getContentPane().add(btnClear);
		
		final JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn8.setBounds(87, 161, 78, 70);
		frmCalculator.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(0, 0, 0));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn5.setBounds(87, 230, 78, 70);
		frmCalculator.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(0, 0, 0));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn2.setBounds(87, 299, 78, 70);
		frmCalculator.getContentPane().add(btn2);
		
		final JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(0, 0, 0));
		btn0.setForeground(new Color(255, 255, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn0.setBounds(87, 368, 78, 70);
		frmCalculator.getContentPane().add(btn0);
		
		final JButton btn00 = new JButton("00");
		btn00.setBackground(new Color(0, 0, 0));
		btn00.setForeground(new Color(255, 255, 255));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn00.setBounds(10, 368, 78, 70);
		frmCalculator.getContentPane().add(btn00);
		
		final JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setForeground(new Color(255, 255, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn9.setBounds(164, 161, 78, 70);
		frmCalculator.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(0, 0, 0));
		btn6.setForeground(new Color(255, 255, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn6.setBounds(164, 230, 78, 70);
		frmCalculator.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(0, 0, 0));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btn3.setBounds(164, 299, 78, 70);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(255, 140, 0));
		btnEqual.setForeground(new Color(255, 255, 255));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+"){
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-"){
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*"){
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/"){
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%"){
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnEqual.setBounds(241, 368, 78, 70);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(0, 0, 0));
		btnPlus.setForeground(new Color(255, 140, 0));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnPlus.setBounds(241, 299, 78, 70);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(0, 0, 0));
		btnSub.setForeground(new Color(255, 140, 0));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnSub.setBounds(241, 230, 78, 70);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(new Color(0, 0, 0));
		btnMul.setForeground(new Color(255, 140, 0));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnMul.setBounds(241, 161, 78, 70);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(0, 0, 0));
		btnDivide.setForeground(new Color(255, 140, 0));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnDivide.setBounds(241, 92, 78, 70);
		frmCalculator.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(new Color(0, 0, 0));
		btnPercent.setForeground(new Color(255, 140, 0));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnPercent.setBounds(164, 92, 78, 70);
		frmCalculator.getContentPane().add(btnPercent);
	}
}
