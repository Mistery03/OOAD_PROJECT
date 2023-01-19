import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class MainMenuViewer extends JFrame {
 
    public int currentCard = 0;
    public CardLayout cl;
    public JPanel pCard, pBtn;
    public JButton btnFirst, btnNext, btnPrevious, btnLast;
 
    public MainMenuViewer()
    {
 
        setTitle("Course Selection");
        setSize(900, 900);

        pCard = new JPanel();
        cl = new CardLayout();
        pCard.setLayout(cl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     
    }

    public void display()
    {
   
        pBtn= new JPanel();
        btnFirst= new JButton("First");
        btnNext = new JButton("Next");
        btnPrevious = new JButton("Previous");
        btnLast = new JButton("Last");

        pBtn.add(btnFirst);
 
        // Adding JButton "nextbtn" on JFrame.
        pBtn.add(btnNext);
 
        // Adding JButton "previousbtn" on JFrame.
        pBtn.add(btnPrevious);
 
        // Adding JButton "lastbtn" on JFrame.
        pBtn.add(btnLast);

        getContentPane().add(pCard, BorderLayout.NORTH);
        getContentPane().add(pBtn, BorderLayout.SOUTH);

        setVisible(true);
}
    

}