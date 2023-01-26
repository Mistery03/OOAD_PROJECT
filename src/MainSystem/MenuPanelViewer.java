package MainSystem;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanelViewer extends Viewer 
{
    JLabel lTitle;
    JButton btnUserRegister, btnUserLogin, btnFacultyLogin;
    JPanel pTitle, pButtons;

    public MenuPanelViewer()
    {
        pTitle = new JPanel();
        pButtons = new JPanel();

        this.setLayout(new BorderLayout());
        lTitle = new JLabel("COURSE SELECTION SYSTEM", JLabel.CENTER);
        lTitle.setFont(new Font("Verdana", Font.PLAIN, 36));
        pTitle.add(lTitle);

        pButtons.setLayout(new GridBagLayout());
       
        GridBagConstraints c  = new GridBagConstraints();

        btnUserRegister = new JButton("User Register");
        btnUserRegister.setPreferredSize(new Dimension(200, 50));
        c.insets = new Insets(10, 10, 10, 10);
        c.gridx = 0;
        c.gridy = 0;

        pButtons.add(btnUserRegister,c);
    
        btnUserLogin = new JButton("User Login");
        btnUserLogin.setPreferredSize(new Dimension(200, 50));
        c.gridx = 0;
        c.gridy = 1;


        pButtons.add(btnUserLogin,c);

        btnFacultyLogin = new JButton("Faculty Login");
        btnFacultyLogin.setPreferredSize(new Dimension(200, 50));
        c.gridx = 0;
        c.gridy = 2;
        pButtons.add(btnFacultyLogin,c);


       
       
        add(pTitle, BorderLayout.NORTH);
        add(pButtons, BorderLayout.CENTER);

        setVisible(true);

    }
}
