import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainMenu extends JFrame {

    JPanel menuPanel, titlePanel, buttonsPanel;
    JLabel titleLabel;
    JButton newMenuButton, viewMenuButton, updateMenuButton, deleteMenuButton;

    public MainMenu(){
        settings();
        initializeComponents();
        setVisible(true);
    }

    public void initializeComponents(){

        menuPanel = new JPanel(new BorderLayout());
        titlePanel = new JPanel();
        buttonsPanel = new JPanel(new GridLayout(4,0));

        // Set title
        titleLabel = new JLabel("PT. Pudding");
        titleLabel.setPreferredSize(new Dimension(100, 100));
        titleLabel.setFont(titleLabel.getFont().deriveFont(15f));
        titlePanel.add(titleLabel);

        // Set buttons
        newMenuButton = new JButton("Insert New Menu");
        viewMenuButton = new JButton("View Menu");
        updateMenuButton = new JButton("Update Menu");
        deleteMenuButton = new JButton("Delete Menu");
        buttonsPanel.add(newMenuButton);
        buttonsPanel.add(viewMenuButton);
        buttonsPanel.add(updateMenuButton);
        buttonsPanel.add(deleteMenuButton);

        // Add panels to frame
        add(titlePanel, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.CENTER);
    }

    public void settings(){
        setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == newMenuButton){
            new NewMenu();
        }

    }

}
