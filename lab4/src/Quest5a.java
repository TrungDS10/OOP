// import javax.swing.*;
// import java.awt.*;
// class DrawPanel extends JPanel{
//     private static final long serialVersionUID = 1L;
//     public void paintComponent(Graphics g){
//         int increase = 15;
//         int width = getWidth();
//         int height = getHeight();
//         int widthStep = width/ 2;
//         int heightStep = height / 2;
//         for (int i = 0; i < increase; i++) {
//             int t = i * 20;
//             g.drawLine(widthStep + t, heightStep + t, widthStep + t, heightStep + 20 + t);
//             g.drawLine(widthStep + t, heightStep + 20 + t, widthStep - 20 - t , heightStep + 20 + t);
//             g.drawLine(widthStep - 20 - t, heightStep + 20 + t, widthStep - 20 - t, heightStep - 20 - t);
//             g.drawLine(widthStep - 20 - t, heightStep - 20 - t, widthStep + 20 + t, heightStep - 20 - t);
//             g.drawLine(widthStep  + 20 + t, heightStep - 20 - t, widthStep + 20 + t, heightStep + 20 + t);
//         }
//     }
// }
// public class Quest5a{
//     public static void main(String[] args) {
//         DrawPanel panel = new DrawPanel();
//         JFrame app = new JFrame();
//         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         app.add(panel);      
//         app.setSize(500, 500); 
//         app.setVisible(true);
//     }
// }

