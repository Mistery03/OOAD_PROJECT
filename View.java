import javax.swing.*;    
public class View {    
    JFrame f;    
    View(){    
    f=new JFrame();    
    String data[][]={ 
        {"Foundation in Management","1","RM 16,000"},    
        {"Diploma in Management","2","RM 23,400"},    
        {"Bachelor of Digital Enterprise Management(Hons.) ","3","RM 54,250"},
        {"Diploma in Mechanical Engineering","2","RM 25,100"},
        {"Bachelor of Engineering(Hons.) Electrical","4","RM 76,000"},
        {"Diploma in Information Technology","2","RM 24,500"},
        {"Bachelor of Computer Science(Hons.) in Software Engineering","3","RM 62,250"},
        {"Bachelor of Multimedia(Hons.)(Media Arts)","3","RM 62,250"},
        {"Bachelor of Cinematic Arts(Hons.)","3","RM 62,250"},
        
    };    
    String column[]={"Course Name","Course Duration(Years)","Total Programme Fee"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new View();    
}    
}    