/*
Lab 6
Simiao Wang
5101
Section-8
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    // GUI class and attributes of every textbox, label and button
        private JLabel TotalPoint = new JLabel("Total Assignment Point");
        private JLabel EarnedPoint = new JLabel("Earned Point");
        private JLabel percentage = new JLabel("Percentage of class");
        private JLabel WeightedScore = new JLabel("Weighted Score");
        private JTextField field1 = new JTextField (6);

        private JTextField field2 = new JTextField (6);
        private JTextField field3 = new JTextField (6);

        private JTextArea output = new JTextArea(1, 6 );
        private JButton button = new JButton("Click");
        public GUI() { setSize (200 ,300);//create 2 panels and add components to panel
            setTitle("Weighted Grade Calculator" );
            Container contentPane = getContentPane ( );
            //create a Flow Layout panel and add components
            JPanel FirstPanel = new JPanel();
            FirstPanel.setLayout(new FlowLayout());
            FirstPanel.add(TotalPoint);
            FirstPanel.add(field1);
            FirstPanel.add(EarnedPoint);
            FirstPanel.add(field2);
            FirstPanel.add(percentage);
            FirstPanel.add(field3);

            //create another Flow Layout panel and add components
            JPanel SecondPanel = new JPanel();
            SecondPanel.setLayout(new FlowLayout());
            SecondPanel.add(WeightedScore);
            SecondPanel.add(button);
            SecondPanel.add(output );
            output.setLineWrap ( true ) ;
            output.setEditable ( false );
            button.addActionListener ( this ) ;

            contentPane.add("North",FirstPanel);//add panels to container
            contentPane.add("Center",SecondPanel);
        }
        public void actionPerformed( ActionEvent e){//action of butto
            double digitTotal = Double.parseDouble(field1.getText().trim());
            double digitEarned = Double.parseDouble(field2.getText().trim());
            double digitper= Double.parseDouble(field3.getText().trim());
            if (e.getSource() == button) {
                WeightedGrade grade= new WeightedGrade();
                output.append(String.valueOf(grade.getGrade(digitTotal,digitEarned,digitper)));
            }

        }


}
