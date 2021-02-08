// import java.awt.*;
// import javax.swing.*;
// class DrawPanel extends JPanel {
//     private static final long serialVersionUID = 1L;
//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         int x = getSize().width / 2 - 10;
//         int y = getSize().height/ 2 - 10;
//         int width = 20;
//         int height = 20;
//         int startAngle = 0;
//         int arcAngle = 180;
//         int depth = 20;
//         for (int i = 0; i < 15; i++) {
//             if (i % 2 == 0) {
//                 y = y - depth;
//                 width = width + 2*depth;
//                 height = height + 2*depth;
//                 g.drawArc(x, y, width, height, startAngle, -arcAngle);
//             } else {
//                 x = x - 2*depth;
//                 y = y - depth;
//                 width = width + 2*depth;
//                 height = height + 2*depth;
//                 g.drawArc(x, y, width, height, startAngle, arcAngle);
//             }
//         }
//     }
// }
// public class Quest5b{
//     public static void main(String[] args) {
//         DrawPanel panel = new DrawPanel();
//         JFrame app = new JFrame();
//         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         app.add(panel);
//         app.setSize(500, 500);
//         app.setVisible(true);
//     }
// }
