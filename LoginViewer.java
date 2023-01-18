import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
 //test 1
//create CreateLoginForm class to create login form  
class createLoginViewer extends JFrame implements ActionListener  
{  
    //initialize button, panel, label, and text field  
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
      
    //calling constructor  
    createLoginViewer()  
    {     
          
        //create label for student ID   
        userLabel = new JLabel();  
        userLabel.setText("Student ID");      //set label value for textField1  
          
        //create text field to get student ID from the student  
        textField1 = new JTextField(15);    //set length of the text  
  
        //create label for password  
        passLabel = new JLabel();  
        passLabel.setText("Password");      //set label value for textField2  
          
        //create text field to get password from the student  
        textField2 = new JPasswordField(15);    //set length for the password  
          
        //create button
        b1 = new JButton("LOGIN"); //set label to button  
          
        //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);    //set student ID label to panel  
        newPanel.add(textField1);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(textField2);   //set text field to panel  
        newPanel.add(b1);           //set button to panel  
          
        //set border to panel   
        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String studValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        if (studValue.equals("test1@gmail.com") && passValue.equals("test")) {  //if authentic, navigate user to a new page  
              
            //create instance of the NewPage  
            NewPage page = new NewPage();  
              
            //make page visible to the user  
            page.setVisible(true);  
              
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+studValue);  
            page.getContentPane().add(wel_label);  
        }  
        else{  
            //show error message  
            System.out.println("Please enter valid student ID or password.");  
        }  
    }  
}  
//create the main class  
class LoginViewer  
{  
    //main() method start  
    public static void main(String arg[])  
    {  
        try  
        {  
            //create instance of the CreateLoginForm  
            createLoginViewer form = new createLoginViewer();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}  
