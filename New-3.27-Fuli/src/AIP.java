import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class AIP extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel2;
    private JLabel jLabel0;
    private JLabel jLabel1;
    private JTextField jTextField0;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JButton jButton0;
    public AIP() {
        initComponents();
    }

    private void initComponents() {
        setTitle("定投计算");
        setLayout(new GroupLayout());
        add(getJTextField0(), new Constraints(new Leading(130, 10, 10), new Leading(97, 10, 10)));
        add(getJTextField1(), new Constraints(new Leading(130, 10, 10), new Leading(153, 10, 10)));
        add(getJTextField2(), new Constraints(new Leading(130, 10, 10), new Leading(214, 10, 10)));
        add(getJLabel2(), new Constraints(new Leading(100, 24, 10, 10), new Leading(216, 12, 12)));
        add(getJLabel0(), new Constraints(new Leading(99, 10, 10), new Leading(97, 10, 10)));
        add(getJLabel1(), new Constraints(new Leading(100, 11, 12, 12), new Leading(155, 12, 12)));
        add(getJButton0(), new Constraints(new Leading(218, 10, 10), new Leading(150, 12, 12)));
        setSize(427, 349);
    }

    private JButton getJButton0() {
        if (jButton0 == null) {
            jButton0 = new JButton();
            jButton0.setText("定投收益");
            jButton0.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton0MouseMouseClicked(event);
                }
            });
        }
        return jButton0;
    }

    private JTextField getJTextField2() {
        if (jTextField2 == null) {
            jTextField2 = new JTextField();
            jTextField2.setText("0         ");
        }
        return jTextField2;
    }

    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField();
            jTextField1.setText("0         ");
        }
        return jTextField1;
    }

    private JTextField getJTextField0() {
        if (jTextField0 == null) {
            jTextField0 = new JTextField();
            jTextField0.setText("0         ");
        }
        return jTextField0;
    }

    private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel();
            jLabel1.setText("x");
            jLabel1.setToolTipText("收益率");
        }
        return jLabel1;
    }

    private JLabel getJLabel0() {
        if (jLabel0 == null) {
            jLabel0 = new JLabel();
            jLabel0.setText("a");
            jLabel0.setToolTipText("每期定投金额");
        }
        return jLabel0;
    }

    private JLabel getJLabel2() {
        if (jLabel2 == null) {
            jLabel2 = new JLabel();
            jLabel2.setText("n");
            jLabel2.setToolTipText("定投期数");
        }
        return jLabel2;
    }
    Icon ico=new ImageIcon("./src/Fuli.png");
    sumofthey sum=new sumofthey();

    private void jButton0MouseMouseClicked(MouseEvent event) {
    	
    	
}
}