import java.awt.*;
import javax.swing.*;

abstract class Viewer extends JFrame 
{
   
   Viewer()
   {
    super("Course selection");
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
   }

   public abstract void viewBody();

   
}