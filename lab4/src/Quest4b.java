// import javax.swing.*;
// import java.awt.*;
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
//             g.drawLine(0, i*heightStep, (i+1)*widthStep, height);
//             g.drawLine(width, i*heightStep, width - (i+1)*widthStep, height);
//             g.drawLine(width, height - i*heightStep, width - (i+1)*widthStep, 0);
//             g.drawLine(0, height - i*heightStep, (i+1)*widthStep, 0);
//         }
//     }
// }
// public class Quest4b {
//     public static void main(String[] args) {
//         DrawPanel panel = new DrawPanel();
//         JFrame app = new JFrame();
//         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         app.add(panel);
//         app.setSize(500, 500);
//         app.setVisible(true);
//     }
// }