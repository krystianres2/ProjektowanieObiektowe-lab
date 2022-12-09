import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public Main() {
        super("Kalkulator silni");
        setLayout(new GridLayout(0, 1));

        inputField = new JTextField();
        add(inputField);

        calculateButton = new JButton("Oblicz");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel("Podaj liczbę i kliknij Oblicz");
        add(resultLabel);

        setSize(400, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(inputField.getText());

        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }

        resultLabel.setText(n + "! = " + wynik);
    }

    public static void main(String[]args){
new Main();

    }
}
