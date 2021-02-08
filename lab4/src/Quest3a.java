// import java.awt.*;
// import javax.swing.*;
// class DrawPanel extends JPanel{
//     private static final long serialVersionUID = 1L;
//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         int increase = 15;
//         int width = getWidth();
//         int height = getHeight();
//         int widthStep = width/increase;
//         int heightStep = height/increase;
//         for (int i = 0; i < increase; i++) {
//             g.drawLine(0, 0, i*widthStep, height - i*heightStep);
//         }
//     }
// }
// public class Quest3a{
//     public static void main(String[] args) {
//         DrawPanel panel = new DrawPanel();
//         JFrame app = new JFrame();
//         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         app.add(panel);
//         app.setSize(500, 500);
//         app.setVisible(true);
//     }
// }
