// import java.awt.*;
import javax.swing.*;

abstract class Viewer extends JFrame 
{
   
   Viewer()
   {
    super("Faculty");
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
   }

   public abstract void viewBody();

   
}