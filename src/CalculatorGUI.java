import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
        JFrame frame = new JFrame();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton add = new JButton("=");

        void renderForm(){
            t1.setBounds(10,10,200,40);
            t2.setBounds(10,51,200,40);
            t3.setBounds(10,130,200,40);
//            t1.setText("Enter number 1");
//            System.out.println(t1.getText());
            frame.add(t1);
            frame.add(t2);
            frame.add(t3);


            add.setBounds(10,95,100,30);
            add.addActionListener(this);
            frame.add(add);

        }

        void render() {
            renderForm();
            frame.setSize(400,400);
            frame.setLayout(null);
            frame.setTitle("Find Sum");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(t1.getText());
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1+num2;

        t3.setText(String.valueOf(sum));

    }
}

