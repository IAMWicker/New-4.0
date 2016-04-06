package Fuli;
import java.awt.Color;
import java.awt.Font;
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
  
 public class mainFrame extends JFrame { 
  
  private static final long serialVersionUID = 1L; 
  private JTextField jTextField2; 
  private JTextField jTextField1; 
  private JTextField jTextField0; 
  private JTextField jTextField3; 
  private JButton jButton0; 
  private JButton jButton1; 
  private JLabel jLabel3; 
  private JLabel jLabel2; 
  private JLabel jLabel1; 
  private JLabel jLabel0;
 private JTextField jTextField4;
 private JLabel jLabel4; 
  
  public mainFrame() { 
   initComponents(); 
  } 
  
  private void initComponents() {
    setTitle("复利计算器");
    setAlwaysOnTop(true);
    setBackground(Color.lightGray);
    setFont(new Font("Dialog", Font.BOLD, 15));
    setLayout(new GroupLayout());
    add(getJLabel3(), new Constraints(new Leading(59, 38, 10, 10), new Leading(184, 12, 12)));
    add(getJLabel1(), new Constraints(new Leading(61, 38, 10, 10), new Leading(94, 10, 10)));
    add(getJLabel0(), new Constraints(new Leading(59, 38, 12, 12), new Leading(48, 10, 10)));
    add(getJLabel2(), new Constraints(new Leading(59, 38, 12, 12), new Leading(138, 12, 12)));
    add(getJTextField3(), new Constraints(new Leading(103, 12, 12), new Leading(181, 12, 12)));
    add(getJTextField2(), new Constraints(new Leading(103, 12, 12), new Leading(138, 12, 12)));
    add(getJTextField1(), new Constraints(new Leading(103, 12, 12), new Leading(92, 10, 10)));
    add(getJTextField0(), new Constraints(new Leading(103, 12, 12), new Leading(45, 24, 10, 10)));
    add(getJTextField4(), new Constraints(new Leading(103, 38, 12, 12), new Leading(230, 20, 12, 12)));
    add(getJLabel4(), new Constraints(new Leading(59, 27, 12, 12), new Leading(232, 10, 10)));
    add(getJButton5(), new Constraints(new Leading(241, 116, 12, 12), new Leading(75, 12, 12)));
    add(getJButton1(), new Constraints(new Leading(148, 12, 12), new Leading(72, 12, 12)));
    add(getJButton0(), new Constraints(new Leading(148, 12, 12), new Leading(33, 10, 10)));
    add(getJButton4(), new Constraints(new Leading(241, 116, 12, 12), new Leading(33, 10, 10)));
    add(getJButton2(), new Constraints(new Leading(148, 206, 12, 12), new Leading(112, 19, 12, 12)));
    add(getJButton3(), new Constraints(new Leading(148, 206, 12, 12), new Leading(151, 18, 12, 12)));
    add(getJButton7(), new Constraints(new Leading(245, 12, 12), new Leading(220, 12, 12)));
    add(getJButton6(), new Constraints(new Leading(245, 12, 12), new Leading(181, 12, 12)));
    add(getJButton10(), new Constraints(new Leading(145, 212, 12, 12), new Leading(256, 12, 12)));
    add(getJButton8(), new Constraints(new Leading(147, 92, 12, 12), new Leading(181, 63, 12, 12)));
    setSize(548, 410);
}

private JButton getJButton10() {
    if (jButton10 == null) {
        jButton10 = new JButton();
        jButton10.setBackground(new Color(255, 128, 0));
        jButton10.setFont(new Font("Dialog", Font.BOLD, 12));
        jButton10.setForeground(Color.white);
        jButton10.setText("多次等额投资");
        jButton10.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent event) {
                jButton10MouseMouseClicked(event);
            }
        });
    }
    return jButton10;
}

private JButton getJButton8() {
    if (jButton8 == null) {
        jButton8 = new JButton();
        jButton8.setBackground(new Color(255, 128, 0));
        jButton8.setForeground(Color.white);
        jButton8.setText("求利率");
        jButton8.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent event) {
                jButton8MouseMouseClicked(event);
            }
        });
    }
    return jButton8;
}

private JButton getJButton7() {
    if (jButton7 == null) {
        jButton7 = new JButton();
        jButton7.setBackground(new Color(128, 0, 255));
        jButton7.setForeground(Color.white);
        jButton7.setText("多次所需年限");
        jButton7.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent event) {
                jButton7MouseMouseClicked(event);
            }
        });
    }
    return jButton7;
}

private JButton getJButton6() {
  if (jButton6 == null) {
   jButton6 = new JButton();
   jButton6.setBackground(new Color(128, 0, 255));
   jButton6.setForeground(Color.white);
   jButton6.setText("一次所需年限");
   jButton6.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton6MouseMouseClicked(event);
    }
   });
  }
  return jButton6;
 }

 private JButton getJButton5() {
  if (jButton5 == null) {
   jButton5 = new JButton();
   jButton5.setBackground(new Color(255, 0, 128));
   jButton5.setForeground(Color.white);
   jButton5.setText("多次所需本金");
   jButton5.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton5MouseMouseClicked(event);
    }
   });
  }
  return jButton5;
 }

 private JButton getJButton4() {
  if (jButton4 == null) {
   jButton4 = new JButton();
   jButton4.setBackground(new Color(255, 0, 128));
   jButton4.setForeground(Color.white);
   jButton4.setText("一次所需本金");
   jButton4.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton4MouseMouseClicked(event);
    }
   });
  }
  return jButton4;
 }

 private JButton getJButton3() {
  if (jButton3 == null) {
   jButton3 = new JButton();
   jButton3.setBackground(new Color(255, 128, 255));
   jButton3.setForeground(Color.white);
   jButton3.setText("多次复利最低本金要求");
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
   jButton2.setBackground(new Color(255, 128, 255));
   jButton2.setForeground(Color.white);
   jButton2.setText("一次复利最低本金要求");
   jButton2.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton2MouseMouseClicked(event);
    }
   });
  }
  return jButton2;
 }

 private JLabel getJLabel4() {
    if (jLabel4 == null) {
        jLabel4 = new JLabel();
        jLabel4.setText("F");
        jLabel4.setToolTipText("终值（Future Value），或叫未来值，即期末本利和的价值");
    }
    return jLabel4;
}

private JTextField getJTextField4() {
  if (jTextField4 == null) {
   jTextField4 = new JTextField();
   jTextField4.setText("0     ");
  }
  return jTextField4;
 }

 private JLabel getJLabel0() {
    if (jLabel0 == null) {
        jLabel0 = new JLabel();
        jLabel0.setText("P");
        jLabel0.setToolTipText("现值（Present Value），或叫期初金额");
    }
    return jLabel0;
}

private JLabel getJLabel1() {
    if (jLabel1 == null) {
        jLabel1 = new JLabel();
        jLabel1.setText("i");
        jLabel1.setToolTipText("利率或折现率");
    }
    return jLabel1;
}

private JLabel getJLabel2() {
    if (jLabel2 == null) {
        jLabel2 = new JLabel();
        jLabel2.setText("n");
        jLabel2.setToolTipText("计息期数");
    }
    return jLabel2;
}

private JLabel getJLabel3() {
    if (jLabel3 == null) {
        jLabel3 = new JLabel();
        jLabel3.setText("A");
        jLabel3.setToolTipText("年金（Annuity），或叫等额值");
    }
    return jLabel3;
}

private JTextField getJTextField0() { 
   if (jTextField0 == null) { 
    jTextField0 = new JTextField(); 
    jTextField0.setText("0         "); 
   } 
   return jTextField0; 
  } 
  
  private JTextField getJTextField1() { 
   if (jTextField1 == null) { 
    jTextField1 = new JTextField(); 
    jTextField1.setText("0         "); 
   } 
   return jTextField1; 
  } 
  
  private JTextField getJTextField2() { 
   if (jTextField2 == null) { 
    jTextField2 = new JTextField(); 
    jTextField2.setText("0         "); 
   } 
   return jTextField2; 
  } 
  
  private JButton getJButton1() { 
   if (jButton1 == null) { 
    jButton1 = new JButton(); 
    jButton1.setBackground(Color.blue); 
    jButton1.setForeground(Color.white); 
    jButton1.setText("多次复利"); 
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
    jButton0.setBackground(Color.blue); 
    jButton0.setForeground(Color.white); 
    jButton0.setText("一次复利"); 
    jButton0.addMouseListener(new MouseAdapter() { 
   
     public void mouseClicked(MouseEvent event) { 
      jButton0MouseMouseClicked(event); 
     } 
    }); 
   } 
   return jButton0; 
  } 
  
  private JTextField getJTextField3() { 
   if (jTextField3 == null) { 
    jTextField3 = new JTextField(); 
    jTextField3.setText("0         "); 
   } 
   return jTextField3; 
  } 

private JButton jButton2;
private JButton jButton3;
private JButton jButton4;
private JButton jButton5;
private JButton jButton6;
private JButton jButton7;
private JButton jButton8;
private JButton jButton10;
Icon ico=new ImageIcon("./src/Fuli.png");
private void jButton0MouseMouseClicked(MouseEvent event) {try
{double P=Double.parseDouble(getJTextField0().getText()), 
i=Double.parseDouble(getJTextField1().getText()), 
n=Double.parseDouble(getJTextField2().getText()), 
A=Double.parseDouble(getJTextField3().getText()), 
F=Double.parseDouble(getJTextField4().getText());
if(n>60)
	JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
else if(i>1)
	JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0&&F==0)
    	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
F=sumofthey.F1(P, i, n, A);
   JOptionPane.showMessageDialog(jButton0, "F="+F,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
  } 
  
  
  private void jButton1MouseMouseClicked(MouseEvent event) {try
  {double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=Double.parseDouble(getJTextField4().getText());   
  if(n>60)
		JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
	else if(i>1)
		JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0&&F==0)
    	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
   F=sumofthey.F2(P, i, n, A);

   JOptionPane.showMessageDialog(jButton0, "F="+F,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
  }

 private void jButton2MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=Double.parseDouble(getJTextField4().getText());
 if(n>60)
		JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
	else if(i>1)
		JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


 if(i==0&&P==0&&n==0&&A==0&&F==0)
    	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
  P=sumofthey.P1(F, i, n, A);
  JOptionPane.showMessageDialog(jButton0, "P="+P,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}

 }

 private void jButton3MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=Double.parseDouble(getJTextField4().getText());
 if(n>60)
		JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
	else if(i>1)
		JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


 if(i==0&&P==0&&n==0&&A==0&&F==0)
 	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
  P=sumofthey.P2(F, i, n, A);

  JOptionPane.showMessageDialog(jButton0, "P="+P,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
 }

 private void jButton4MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=Double.parseDouble(getJTextField4().getText());
 if(n>60)
		JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
	else if(i>1)
		JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);

 if(i==0&&P==0&&n==0&&A==0&&F==0)
 	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
  A=sumofthey.A1(F, i, n, P);
  JOptionPane.showMessageDialog(jButton0, "A="+A,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}


 }

 private void jButton5MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=Double.parseDouble(getJTextField4().getText());
 if(n>60)
		JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
	else if(i>1)
		JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);

 if(i==0&&P==0&&n==0&&A==0&&F==0)
 	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
  A=sumofthey.A2(F, i, n, P);
  JOptionPane.showMessageDialog(jButton0, "A="+A,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
 }

 private void jButton6MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
            i=Double.parseDouble(getJTextField1().getText()), 
            n=Double.parseDouble(getJTextField2().getText()), 
            A=Double.parseDouble(getJTextField3().getText()), 
            F=Double.parseDouble(getJTextField4().getText());
 	if(i>1)
		JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


 if(i==0&&P==0&&n==0&&A==0&&F==0)
 	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
  n=sumofthey.n1(F, i, A, P);
  JOptionPane.showMessageDialog(jButton0, "n="+n,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
 }

private void jButton7MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
i=Double.parseDouble(getJTextField1().getText()), 
n=Double.parseDouble(getJTextField2().getText()), 
A=Double.parseDouble(getJTextField3().getText()), 
F=Double.parseDouble(getJTextField4().getText());
if(i>1)
	JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0&&F==0)
	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
    n=sumofthey.n2(F, i, A, P);
    JOptionPane.showMessageDialog(jButton0, "n="+n,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);} 
}

private void jButton8MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
i=Double.parseDouble(getJTextField1().getText()), 
n=Double.parseDouble(getJTextField2().getText()), 
A=Double.parseDouble(getJTextField3().getText()), 
F=Double.parseDouble(getJTextField4().getText());
if(n>60)
	JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0&&F==0)
	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
    i=sumofthey.i1(F, n, A, P);
    JOptionPane.showMessageDialog(jButton0, "i="+i,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}
}

private void jButton10MouseMouseClicked(MouseEvent event) {try{double P=Double.parseDouble(getJTextField0().getText()), 
i=Double.parseDouble(getJTextField1().getText()), 
n=Double.parseDouble(getJTextField2().getText()), 
A=Double.parseDouble(getJTextField3().getText()), 
F=Double.parseDouble(getJTextField4().getText());
if(n>60)
	JOptionPane.showMessageDialog(jButton0, "超过60年限","出错", JOptionPane.INFORMATION_MESSAGE);
else if(i>1)
	JOptionPane.showMessageDialog(jButton0, "利率应小于1","出错", JOptionPane.INFORMATION_MESSAGE);


if(i==0&&P==0&&n==0&&A==0&&F==0)
	JOptionPane.showMessageDialog(jButton0, "你没有输入任何数", "真的福利",JOptionPane.INFORMATION_MESSAGE,ico);else{
    double Vc=sumofthey.Vc(F, n, i, P);
  
    JOptionPane.showMessageDialog(jButton0, "Vc="+Vc,"计算结果", JOptionPane.INFORMATION_MESSAGE);}}catch(Exception e){JOptionPane.showMessageDialog(jButton0, "请输入数字","出错", JOptionPane.INFORMATION_MESSAGE);}
}

}



