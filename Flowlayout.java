import javax.swing.JButton;

public class  FlowlayoutExample {
    JFrame frame =new Jframe();
    JButton b1=new JButton ("1");
    JButton b2=new JButton("3");
    frame.add(b1);
    frame.add(b2);
    frame.setLayout(new Flowlayout());
    frame.setSize(300,300);
    frame.setVisible(true);
}
public static void main(String args[]){
    new FlowlayoutExample();
}
