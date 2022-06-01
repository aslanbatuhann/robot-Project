import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {


    private int secim1;
    private JPanel panel1;
    private JTextField textField2;
    private JButton girişButton;

    public form1 (){
        add(panel1);
        setSize(400,200);
        setTitle("İlk FORM");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        girişButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                secim1 = Integer.parseInt(textField2.getText());

            }
        });
    }

    public int getSecim1() {
        return secim1;
    }
}
