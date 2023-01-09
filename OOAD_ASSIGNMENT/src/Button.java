import javax.swing.JButton;

abstract class Button implements ActionListener 
{
    JButton btn;
    String filePath;

    public Button(String name, String filePath)
    {
       
        this.btn = new JButton(name);
        this.filePath = filePath;
    }
    public abstract void btnFunc();

}
