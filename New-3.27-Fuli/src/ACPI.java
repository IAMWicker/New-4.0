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
public class ACPI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel0;
    private JTextField jTextField0;
    private JLabel jLabel1;
    private JTextField jTextField1;
    private JLabel jLabel2;
    private JTextField jTextField2;
    private JLabel jLabel3;
    private JTextField jTextField3;
    private JButton jButton1;
    private JButton jButton0;
    private JButton jButton2;

    public ACPI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("还贷计算");
        setLayout(new GroupLayout());
        add(getJLabel0(), new Constraints(new Leading(28, 10, 10), new Leading(37, 10, 10)));
        add(getJTextField0(), new Constraints(new Leading(47, 12, 12), new Leading(37, 12, 12)));
        add(getJLabel1(), new Constraints(new Leading(28, 7, 10, 286), new Leading(73, 12, 12)));
        add(getJTextField1(), new Constraints(new Leading(47, 10, 235), new Leading(73, 12, 12)));
        add(getJLabel2(), new Constraints(new Leading(28, 10, 288), new Leading(113, 12, 12)));
        add(getJTextField2(), new Constraints(new Leading(47, 10, 235), new Leading(109, 12, 12)));
        add(getJLabel3(), new Constraints(new Leading(28, 10, 286), new Leading(149, 12, 12)));
        add(getJTextField3(), new Constraints(new Leading(47, 10, 235), new Leading(147, 12, 12)));
        add(getJButton1(), new Constraints(new Leading(155, 12, 12), new Leading(87, 10, 10)));
        add(getJButton0(), new Constraints(new Leading(155, 12, 12), new Leading(44, 10, 10)));
        add(getJButton2(), new Constraints(new Leading(155, 12, 12), new Leading(131, 12, 12)));
        setSize(320, 240);
    }

    private JButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new JButton();
            jButton2.setText("还款利息");
            jButton2.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton2MouseMouseClicked(event);
                }
            });
        }
        return jButton2;
    }

    private JButton getJButton0() {
        if (jButton0 == null) {
            jButton0 = new JButton();
            jButton0.setText("还款本息");
            jButton0.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton0MouseMouseClicked(event);
                }
            });
        }
        return jButton0;
    }

    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setText("月均还款");
            jButton1.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton1MouseMouseClicked(event);
                }
            });
        }
        return jButton1;
    }

    private JTextField getJTextField3() {
        if (jTextField3 == null) {
            jTextField3 = new JTextField();
            jTextField3.setText("0         ");
        }
        return jTextField3;
    }

    private JLabel getJLabel3() {
        if (jLabel3 == null) {
            jLabel3 = new JLabel();
            jLabel3.setText("n");
            jLabel3.setToolTipText("还款月数");
        }
        return jLabel3;
    }

    private JTextField getJTextField2() {
        if (jTextField2 == null) {
            jTextField2 = new JTextField();
            jTextField2.setText("0         ");
        }
        return jTextField2;
    }

    private JLabel getJLabel2() {
        if (jLabel2 == null) {
            jLabel2 = new JLabel();
            jLabel2.setText("l");
            jLabel2.setToolTipText("年利率");
        }
        return jLabel2;
    }

    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField();
            jTextField1.setText("0         ");
        }
        return jTextField1;
    }

    private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel();
            jLabel1.setText("i");
            jLabel1.setToolTipText("月利率");
        }
        return jLabel1;
    }

    private JTextField getJTextField0() {
        if (jTextField0 == null) {
            jTextField0 = new JTextField();
            jTextField0.setText("0         ");
        }
        return jTextField0;
    }

    private JLabel getJLabel0() {
        if (jLabel0 == null) {
            jLabel0 = new JLabel();
            jLabel0.setText("a");
            jLabel0.setToolTipText("贷款额");
        }
        return jLabel0;
    }
    Icon ico=new ImageIcon("./src/Fuli.jpg");

    private void jButton0MouseMouseClicked(MouseEvent event) {try{
    double a=Double.parseDouble(getJTextField0().getText()), 
    i=Double.parseDouble(getJTextField1().getText()), 
    l=Double.parseDouble(getJTextField2().getText()),
    n=Double.parseDouble(getJTextField3().getText());    
    if(a==0&&i==0&&l==0&&n==0)
    	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真实福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
    i=l/12;
    double Y=sumofthey.Y(a, i, l, n);
    JOptionPane.showMessageDialog(jButton0, "Y="+Y,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}
    }

    private void jButton1MouseMouseClicked(MouseEvent event) {try{
    double a=Double.parseDouble(getJTextField0().getText()), 
    i=Double.parseDouble(getJTextField1().getText()), 
    l=Double.parseDouble(getJTextField2().getText()),
    n=Double.parseDouble(getJTextField3().getText());  
    if(a==0&&i==0&&l==0&&n==0)
    	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真实福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
    i=l/12;
    double b=sumofthey.B(a, i, l, n);
    JOptionPane.showMessageDialog(jButton0, "b="+b,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}
    }

    private void jButton2MouseMouseClicked(MouseEvent event) {try{
    double a=Double.parseDouble(getJTextField0().getText()), 
    i=Double.parseDouble(getJTextField1().getText()), 
    l=Double.parseDouble(getJTextField2().getText()),
    n=Double.parseDouble(getJTextField3().getText());
    if(a==0&&i==0&&l==0&&n==0)
    	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真实福利",JOptionPane.INFORMATION_MESSAGE,ico);
    else
    {
    i=l/12;
    double Z=sumofthey.Z(a, i, l, n);
    JOptionPane.showMessageDialog(jButton0, "Z="+Z,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}
    }

}