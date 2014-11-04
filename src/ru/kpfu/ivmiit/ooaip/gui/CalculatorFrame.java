package ru.kpfu.ivmiit.ooaip.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import ru.kpfu.ivmiit.ooaip.parser.ParserException;

public class CalculatorFrame extends JFrame {
	private final JTextField textField;
	private final Calculator calculator;

	public CalculatorFrame() {
		calculator = new Calculator();
		getContentPane().setLayout(null);

		textField = new JTextField();
		((AbstractDocument) textField.getDocument())
				.setDocumentFilter(new MyDocumentFilter());
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CalculatorFrame.this.calc();
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(25, 11, 346, 38);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(25, 92, 79, 54);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});

		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button.setBounds(113, 92, 79, 54);
		getContentPane().add(button);

		JButton button_1 = new JButton("3");
		button_1.setBounds(202, 92, 79, 54);
		getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});

		JButton button_2 = new JButton("4");
		button_2.setBounds(25, 158, 79, 54);
		getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});

		JButton button_3 = new JButton("5");
		button_3.setBounds(113, 158, 79, 54);
		getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});

		JButton button_4 = new JButton("6");
		button_4.setBounds(202, 158, 79, 54);
		getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});

		JButton button_5 = new JButton("7");
		button_5.setBounds(25, 223, 79, 54);
		getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});

		JButton button_6 = new JButton("8");
		button_6.setBounds(113, 223, 79, 54);
		getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});

		JButton button_7 = new JButton("9");
		button_7.setBounds(202, 223, 79, 54);
		getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});

		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_8.setBounds(25, 287, 167, 54);
		getContentPane().add(button_8);

		JButton btnNewButton_1 = new JButton(".");
		btnNewButton_1.setBounds(202, 288, 79, 53);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});

		JButton button_9 = new JButton("+");
		button_9.setBounds(308, 92, 79, 54);
		getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
			}
		});

		JButton button_10 = new JButton("-");
		button_10.setBounds(308, 158, 79, 54);
		getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});

		JButton button_11 = new JButton("*");
		button_11.setBounds(308, 223, 79, 54);
		getContentPane().add(button_11);
		button_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});

		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		button_12.setBounds(308, 287, 79, 54);
		getContentPane().add(button_12);

		JButton button_13 = new JButton("(");
		button_13.setBounds(392, 92, 79, 54);
		getContentPane().add(button_13);
		button_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "(");
			}
		});

		JButton button_14 = new JButton(")");
		button_14.setBounds(392, 158, 79, 54);
		getContentPane().add(button_14);
		button_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ")");
			}
		});

		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CalculatorFrame.this.calc();
			}
		});
		button_15.setBounds(392, 223, 79, 118);
		getContentPane().add(button_15);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setBounds(392, 11, 79, 38);
		getContentPane().add(btnC);
	}

	private void calc() {
		String expr = textField.getText();
		try {
			double result = calculator.calculate(expr);
			textField.setText(Double.toString(result));
			// DecimalFormatSymbols s = new DecimalFormatSymbols();
			// s.setDecimalSeparator('.');
			// DecimalFormat f = new DecimalFormat("#,###.00", s);
			//
			// textField.setText(f.format(result));
		} catch (ParserException e1) {
			JOptionPane.showMessageDialog(CalculatorFrame.this,
					"Неправильный формат выражения.", "Inane warning",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame();
		frame.setVisible(true);

	}
}

class MyDocumentFilter extends DocumentFilter {
	@Override
	public void insertString(FilterBypass fb, int offset, String string,
			AttributeSet attr) throws BadLocationException {
		string = string.replaceAll("[^0-9,()+*/.]", "");
		super.insertString(fb, offset, string, attr);
	}

	@Override
	public void replace(FilterBypass fb, int offset, int length, String text,
			AttributeSet attrs) throws BadLocationException {
		text = text.replaceAll("[^0-9,()+*/.]", "");
		super.replace(fb, offset, length, text, attrs);
	}
}