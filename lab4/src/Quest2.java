// import javax.swing.*;
// import java.awt.*;
// class DrawPanel extends JPanel{
//     private static final long serialVersionUID = 1L;
//     public void paintComponent(Graphics g){
//         super.paintComponent(g);
//         int width = getWidth();
//         int height = getHeight();
//         g.drawLine(0, 0, width, height);
//         g.drawLine(0, height, width, 0);
//         g.drawLine(width/2, 0, width/2, height);
//         g.drawLine(0, height/2, width, height/2);
//     }
// }
// public class Quest2{
//     public static void main(String[] args) {
//         DrawPanel panel = new DrawPanel();
//         JFrame app = new JFrame();
//         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         app.add(panel);
//         app.setSize(400,600);
//         app.setVisible(true);
//     }
// }