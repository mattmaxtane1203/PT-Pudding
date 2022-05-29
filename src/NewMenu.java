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

public class NewMenu extends JFrame {

    JPanel newMenuPanel, titlePanel, formPanel, kodeMenuPanel, namaMenuPanel, hargaMenuPanel, stokMenuPanel, buttonPanel;
    JLabel titleLabel, kodeMenuLabel, namaMenuLabel, hargaMenuLabel, stokMenuLabel;
    JTextField namaMenuField, hargaMenuField, stokMenuField;
    JButton backButton, saveButton;

    
    public NewMenu(){
        settings();
        initializeComponents();
        setVisible(true);
    }

    public void initializeComponents(){

        newMenuPanel = new JPanel(new BorderLayout());
        titlePanel = new JPanel();
        formPanel = new JPanel();
        kodeMenuPanel = new JPanel(new FlowLayout());
        namaMenuPanel = new JPanel(new FlowLayout());
        hargaMenuPanel = new JPanel(new FlowLayout());
        stokMenuPanel = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new GridLayout(0, 1));

        // Set title
        titleLabel = new JLabel("Insert New Menu");
        titleLabel.setPreferredSize(new Dimension(100, 100));
        titleLabel.setFont(titleLabel.getFont().deriveFont(15f));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // Set Form
        kodeMenuLabel.setPreferredSize(new Dimension(80, 20));
        namaMenuLabel.setPreferredSize(new Dimension(80, 20));
        hargaMenuLabel.setPreferredSize(new Dimension(80, 20));
        stokMenuLabel.setPreferredSize(new Dimension(80, 20));
        
        kodeMenuLabel.setFont(kodeMenuLabel.getFont().deriveFont(12f));
        namaMenuLabel.setFont(namaMenuLabel.getFont().deriveFont(12f));
        hargaMenuLabel.setFont(hargaMenuLabel.getFont().deriveFont(12f));
        stokMenuLabel.setFont(stokMenuLabel.getFont().deriveFont(12f));

        namaMenuField.setPreferredSize(new Dimension(150, 20));
        hargaMenuField.setPreferredSize(new Dimension(150, 20));
        stokMenuField.setPreferredSize(new Dimension(150, 20));

        kodeMenuPanel.add(kodeMenuLabel);
        
        namaMenuPanel.add(namaMenuLabel);
        namaMenuPanel.add(namaMenuField);

        hargaMenuPanel.add(hargaMenuLabel);
        hargaMenuPanel.add(hargaMenuField);
        
        hargaMenuPanel.add(hargaMenuLabel);
        hargaMenuPanel.add(hargaMenuField);

        formPanel.add(kodeMenuPanel);
        formPanel.add(namaMenuPanel);
        formPanel.add(hargaMenuPanel);
        formPanel.add(stokMenuPanel);

        // Set buttons
        backButton = new JButton("Back");
        saveButton = new JButton("Save");
        buttonPanel.add(backButton);
        buttonPanel.add(saveButton);

        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void settings(){
        setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
    }

}
