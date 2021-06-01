import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Zad2 implements ActionListener{
	
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	
	public Zad2() {
		
		JFrame frame = new JFrame();
		
		button1 = new JButton("<");
		button1.addActionListener(this);
		button1.setBounds(200, 20, 70, 25);
		
		button2 = new JButton(">");
		button2.addActionListener(this);
		button2.setBounds(520, 20, 70, 25);
		
		
		label1 = new JLabel("Euro:");
		label1.setBounds(20, 20, 80, 25);
		
		label2 = new JLabel("Przelicznik:");
		label2.setBounds(300, 20, 100, 25);
		
		label3 = new JLabel("Dollary:");
		label3.setBounds(620, 20, 60, 25);
		
		label4 = new JLabel("", SwingConstants.CENTER);
		label4.setBounds(0, 60, 800, 25);
		label4.setForeground(Color.RED);
		
		
		textField1 = new JTextField("0");
		textField1.setBounds(80, 20, 80, 25);
		
		textField2 = new JTextField("1.42");
		textField2.setBounds(400, 20, 80, 25);
		
		textField3 = new JTextField("0");
		textField3.setBounds(690, 20, 80, 25);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(null);
		panel.add(label1);
		panel.add(textField1);
		panel.add(button1);
		panel.add(label2);
		panel.add(textField2);
		panel.add(button2);
		panel.add(label3);
		panel.add(textField3);
		panel.add(label4);
		
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Przelicznik walut");
		frame.pack();
		frame.setSize(800,130);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Zad2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
		double euros = 0;
		double dollars = 0;
		double przelicznik = 0;
		
		if(textField1.getText() != null && textField1.getText().length() > 0) {
			euros = Double.parseDouble(textField1.getText());
		}
		if(textField3.getText() != null && textField3.getText().length() > 0) {
			dollars = Double.parseDouble(textField3.getText());
		}
		if(textField3.getText() != null && textField2.getText().length() > 0) {
			przelicznik = Double.parseDouble(textField2.getText());
		}
		
		double result;
		double roundedResult;
		
		
		if(e.getSource() == button1) {
			label4.setText("");
			if(przelicznik != 0) {
				result = dollars * przelicznik;
				roundedResult = Math.round(result * 10000.0) / 10000.0;
				System.out.println(roundedResult);
				textField1.setText(Double.toString(roundedResult));
			}else {
				label4.setText("Przelicznik równy 0.");
			}
		}
		if(e.getSource() == button2) {
			label4.setText("");
			if(przelicznik != 0) {
				result = euros / przelicznik;
				roundedResult = Math.round(result * 10000.0) / 10000.0;
				System.out.println(roundedResult);
				textField3.setText(Double.toString(roundedResult));
			}else {
				label4.setText("Przelicznik równy 0.");
			}
		}
		}catch (NumberFormatException e1) {
			label4.setText("Niew³aœciwy format wprowadzonych danych.");
		}
	}
}


