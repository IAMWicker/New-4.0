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
public class PI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField jTextField0;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField1;
    private JLabel jLabel0;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel1;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JButton jButton0;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;

    public PI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("组合计算");
        setLayout(new GroupLayout());
        add(getJTextField0(), new Constraints(new Leading(108, 10, 10), new Leading(66, 10, 10)));
        add(getJTextField2(), new Constraints(new Leading(108, 38, 12, 12), new Leading(161, 10, 10)));
        add(getJTextField3(), new Constraints(new Leading(108, 38, 12, 12), new Leading(210, 10, 10)));
        add(getJTextField1(), new Constraints(new Leading(108, 38, 12, 12), new Leading(112, 10, 10)));
        add(getJLabel0(), new Constraints(new Leading(51, 10, 10), new Leading(68, 12, 12)));
        add(getJLabel2(), new Constraints(new Leading(51, 8, 12, 12), new Leading(163, 12, 12)));
        add(getJLabel3(), new Constraints(new Leading(51, 12, 12), new Leading(212, 12, 12)));
        add(getJLabel1(), new Constraints(new Leading(54, 8, 10, 10), new Leading(114, 12, 12)));
        add(getJTextField4(), new Constraints(new Leading(291, 38, 10, 10), new Leading(66, 12, 12)));
        add(getJTextField5(), new Constraints(new Leading(291, 38, 12, 12), new Leading(114, 12, 12)));
        add(getJTextField6(), new Constraints(new Leading(291, 38, 12, 12), new Leading(161, 12, 12)));
        add(getJLabel4(), new Constraints(new Leading(245, 8, 10, 10), new Leading(68, 12, 12)));
        add(getJLabel5(), new Constraints(new Leading(245, 8, 12, 12), new Leading(116, 12, 12)));
        add(getJLabel6(), new Constraints(new Leading(247, 14, 10, 10), new Leading(163, 12, 12)));
        add(getJButton0(), new Constraints(new Leading(472, 10, 10), new Leading(60, 12, 12)));
        add(getJButton1(), new Constraints(new Leading(472, 12, 12), new Leading(116, 12, 12)));
        add(getJButton2(), new Constraints(new Leading(472, 12, 12), new Leading(174, 10, 10)));
        add(getJButton3(), new Constraints(new Leading(270, 12, 12), new Leading(270, 10, 10)));
        setSize(610, 357);
    }

    private JButton getJButton3() {
        if (jButton3 == null) {
            jButton3 = new JButton();
            jButton3.setText("计算结果");
            jButton3.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton3MouseMouseClicked(event);
                }
            });
        }
        return jButton3;
    }

    private JButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new JButton();
            jButton2.setText("加入定投");
            jButton2.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton2MouseMouseClicked(event);
                }
            });
        }
        return jButton2;
    }

    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setText("加入复利");
            jButton1.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton1MouseMouseClicked(event);
                }
            });
        }
        return jButton1;
    }

    private JButton getJButton0() {
        if (jButton0 == null) {
            jButton0 = new JButton();
            jButton0.setText("加入单利");
            jButton0.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton0MouseMouseClicked(event);
                }
            });
        }
        return jButton0;
    }

    private JLabel getJLabel6() {
        if (jLabel6 == null) {
            jLabel6 = new JLabel();
            jLabel6.setText("n");
        }
        return jLabel6;
    }

    private JLabel getJLabel5() {
        if (jLabel5 == null) {
            jLabel5 = new JLabel();
            jLabel5.setText("x");
        }
        return jLabel5;
    }

    private JLabel getJLabel4() {
        if (jLabel4 == null) {
            jLabel4 = new JLabel();
            jLabel4.setText("a");
        }
        return jLabel4;
    }

    private JTextField getJTextField6() {
        if (jTextField6 == null) {
            jTextField6 = new JTextField();
            jTextField6.setText("0     ");
        }
        return jTextField6;
    }

    private JTextField getJTextField5() {
        if (jTextField5 == null) {
            jTextField5 = new JTextField();
            jTextField5.setText("0     ");
        }
        return jTextField5;
    }

    private JTextField getJTextField4() {
        if (jTextField4 == null) {
            jTextField4 = new JTextField();
            jTextField4.setText("0     ");
        }
        return jTextField4;
    }

    private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel();
            jLabel1.setText("i");
        }
        return jLabel1;
    }

    private JLabel getJLabel3() {
        if (jLabel3 == null) {
            jLabel3 = new JLabel();
            jLabel3.setText("A");
        }
        return jLabel3;
    }

    private JLabel getJLabel2() {
        if (jLabel2 == null) {
            jLabel2 = new JLabel();
            jLabel2.setText("n");
        }
        return jLabel2;
    }

    private JLabel getJLabel0() {
        if (jLabel0 == null) {
            jLabel0 = new JLabel();
            jLabel0.setText("P");
        }
        return jLabel0;
    }

    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField();
            jTextField1.setText("0     ");
        }
        return jTextField1;
    }

    private JTextField getJTextField3() {
        if (jTextField3 == null) {
            jTextField3 = new JTextField();
            jTextField3.setText("0     ");
        }
        return jTextField3;
    }

    private JTextField getJTextField2() {
        if (jTextField2 == null) {
            jTextField2 = new JTextField();
            jTextField2.setText("0     ");
        }
        return jTextField2;
    }

    private JTextField getJTextField0() {
        if (jTextField0 == null) {
            jTextField0 = new JTextField();
            jTextField0.setText("0         ");
        }
        return jTextField0;
    }
    
    double sum=0;
    Icon ico=new ImageIcon("./src/Fuli.png");

    private void jButton0MouseMouseClicked(MouseEvent event) {
        try
{double P=Double.parseDouble(getJTextField0().getText()), 
i=Double.parseDouble(getJTextField1().getText()), 
n=Double.parseDouble(getJTextField2().getText()), 
A=Double.parseDouble(getJTextField3().getText());
double F=0;
if(n>60)
    JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
else if(i>1)
    JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0)
        JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
F=sumofthey.F1(P, i, n, A);
sum=sum+F;
   JOptionPane.showMessageDialog(jButton0, "F="+F,"本次计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
    }

    private void jButton1MouseMouseClicked(MouseEvent event) {
        try
  {double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=0;  
  if(n>60)
        JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
    else if(i>1)
        JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0&&F==0)
        JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
   F=sumofthey.F2(P, i, n, A);
sum=sum+F;
   JOptionPane.showMessageDialog(jButton0, "F="+F,"本次计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
  
    }

    private void jButton2MouseMouseClicked(MouseEvent event) {
        try{
    double a=Double.parseDouble(getJTextField4().getText()), 
    x=Double.parseDouble(getJTextField5().getText()), 
    n=Double.parseDouble(getJTextField6().getText());
    if(n>60)
        JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
    else if(x>1)
        JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);
    
    double M=sumofthey.M(a, x, n);sum=sum+M;
    if(x==0&&n==0&&a==0)
        JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);
    else
    JOptionPane.showMessageDialog(jButton0, "M="+M,"计算结果", JOptionPane.INFORMATION_MESSAGE);}
        catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}
    }

    private void jButton3MouseMouseClicked(MouseEvent event) {
        JOptionPane.showMessageDialog(jButton0, "SUM="+sum,"计算结果", JOptionPane.INFORMATION_MESSAGE);
    }
}