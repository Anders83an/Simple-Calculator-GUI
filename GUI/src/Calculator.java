import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Calculator");
		window.setSize(new Dimension(600, 300));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setPreferredSize(new Dimension(600, 100));
		final JTextField input1 = new JTextField("0");
		final JTextField input2 = new JTextField("0");
		input1.setPreferredSize(new Dimension(150, 40));
		input2.setPreferredSize(new Dimension(150, 40));
		inputPanel.add(input1, BorderLayout.EAST);
		inputPanel.add(input2, BorderLayout.WEST);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(400, 150));
		final JLabel output = new JLabel("Result: ");
		output.setPreferredSize(new Dimension(250, 80));
		outputPanel.add(output, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(600, 50));
		JButton multiplyButton = new JButton("Multiply");
		multiplyButton.setPreferredSize(new Dimension(100, 40));
		JButton addButton = new JButton("Add");
		addButton.setPreferredSize(new Dimension(100, 40));
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setPreferredSize(new Dimension(100, 40));
		
		buttonPanel.add(multiplyButton, BorderLayout.EAST);
		buttonPanel.add(addButton, BorderLayout.CENTER);
		buttonPanel.add(cancelButton, BorderLayout.WEST);
		
		window.add(inputPanel, BorderLayout.NORTH);
		window.add(outputPanel, BorderLayout.CENTER);
		window.add(buttonPanel, BorderLayout.SOUTH);
		
		multiplyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				output.setText("Result:   " + multiply(Integer.valueOf(input1.getText()) , Integer.valueOf(input2.getText())));
			}
		}));
		
		addButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				output.setText("Result:    " + add(Integer.valueOf(input1.getText()) , Integer.valueOf(input2.getText())));
			}
		}));
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		window.setVisible(true);
		
	}

	public static long multiply(int a, int b) {
		return a * b;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
}
