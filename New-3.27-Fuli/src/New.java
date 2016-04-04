import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class New extends JFrame {

    private static final long serialVersionUID = 1L;
    private JButton jButton0;
    private JButton jButton1;
    private JButton jButton2;
	private JButton jButton3;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public New() {
        initComponents();
    }

    private void initComponents() {
		setTitle("复利工具");
		setLayout(new GroupLayout());
		add(getJButton2(), new Constraints(new Leading(286, 250, 12, 12), new Leading(260, 203, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(20, 250, 12, 12), new Leading(32, 203, 10, 10)));
		add(getJButton3(), new Constraints(new Leading(286, 250, 12, 12), new Leading(32, 203, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(20, 250, 12, 12), new Leading(260, 203, 12, 12)));
		setSize(558, 489);
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setBackground(Color.white);
			jButton3.setText("组合计算");
			jButton3.setMnemonic('B');
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
            jButton2.setBackground(Color.white);
            jButton2.setText("贷款计息");
            jButton2.setMnemonic('B');
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
            jButton1.setBackground(Color.white);
            jButton1.setText("定期定额投资");
            jButton1.setMnemonic('B');
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
            jButton0.setBackground(Color.white);
            //jButton0.setIcon(new ImageIcon(getClass().getResource("/5655917120150328193002057_640.jpg")));
            jButton0.setText("复利投资");
            jButton0.setMnemonic('B');
            jButton0.addMouseListener(new MouseAdapter() {
    
                public void mouseClicked(MouseEvent event) {
                    jButton0MouseMouseClicked(event);
                }
            });
        }
        return jButton0;
    }

    private static void installLnF() {
        try {
            String lnfClassname = PREFERRED_LOOK_AND_FEEL;
            if (lnfClassname == null)
                lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(lnfClassname);
        } catch (Exception e) {
            System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
                    + " on this platform:" + e.getMessage());
        }
    }

    /**
     * Main entry of the class.
     * Note: This class is only created so that you can easily preview the result at runtime.
     * It is not expected to be managed by the designer.
     * You can modify it as you like.
     */
    public static void main(String[] args) {
        installLnF();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                New frame = new New();
                frame.setDefaultCloseOperation(New.EXIT_ON_CLOSE);
                frame.setTitle("New");
                frame.getContentPane().setPreferredSize(frame.getSize());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    @SuppressWarnings("deprecation")
    private void jButton0MouseMouseClicked(MouseEvent event) {
        mainFrame mf=new mainFrame();
        mf.show();
    }

    @SuppressWarnings("deprecation")
    private void jButton1MouseMouseClicked(MouseEvent event) {
        AIP aip=new AIP();
        aip.show();
    }

    @SuppressWarnings("deprecation")
    private void jButton2MouseMouseClicked(MouseEvent event) {
        ACPI acpi=new ACPI();
        acpi.show();
    }

	private void jButton3MouseMouseClicked(MouseEvent event) {
		PI pi=new PI();
		pi.show();
	}

}