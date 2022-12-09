import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame("Celcjusz na Fahrenheit");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JTextField celsiusField = new JTextField();
        celsiusField.setPreferredSize(new Dimension(100, 30));

        JButton convertButton = new JButton("konwertuj");
        convertButton.setPreferredSize(new Dimension(100, 30));

        panel.add(celsiusField);
        panel.add(convertButton);

        JLabel fahrenheitLabel = new JLabel();
        fahrenheitLabel.setPreferredSize(new Dimension(200, 30));

        frame.add(panel, BorderLayout.NORTH);
        frame.add(fahrenheitLabel, BorderLayout.SOUTH);

        convertButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String celsiusText = celsiusField.getText();
                double celsius = Double.parseDouble(celsiusText);
                double fahrenheit = celsius * 1.8 + 32;
                fahrenheitLabel.setText(fahrenheit + "°F");
            }
        });
        frame.setVisible(true);





    }
}
