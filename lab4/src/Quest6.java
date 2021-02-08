// import javax.swing.JOptionPane;
// import java.awt.*;
// import javax.swing.*;
// import java.util.*;
// class DrawPanel extends JPanel{
//     private static final long serialVersionUID = 1L;
//     private Map<Color, Integer> bars = new LinkedHashMap<Color, Integer>();
//     public void addBar(Color color, int value){
//         bars.put(color, value);
//         repaint();
//     }
//     @Override
//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         int max = Integer.MIN_VALUE;
//         for (Integer value : bars.values()){
//             max = Math.max(max, value);
//         }
//         int width = (getWidth() / bars.size()) - 2;
//         int x = 1;
//         for (Color color : bars.keySet()){
//             int value = bars.get(color);
//             int height = (int)((getHeight()-5) * ((double)value / max));
//             g.setColor(color);
//             g.fillRect(x, getHeight() - height, width, height);
//             g.setColor(Color.black);
//             g.drawRect(x, getHeight() - height, width, height);
//             x += (width + 2);
//         }
//     }
//     @Override
//     public Dimension getPreferredSize() {
//         return new Dimension(bars.size() * 10 + 2, 50);
//     }
// }
// public class Quest6{
//     public static void main(String[] args) {
//         String firstnum = JOptionPane.showInputDialog("Enter 1st number");
//         String secondnum = JOptionPane.showInputDialog("Enter 2nd number");
//         String thirdnum = JOptionPane.showInputDialog("Enter 3st number");
//         String fourthnum = JOptionPane.showInputDialog("Enter 4st number");
//         String fifthnum = JOptionPane.showInputDialog("Enter 5st number");
//         int num1 = Integer.parseInt(firstnum);
//         int num2 = Integer.parseInt(secondnum);
//         int num3 = Integer.parseInt(thirdnum);
//         int num4 = Integer.parseInt(fourthnum);
//         int num5 = Integer.parseInt(fifthnum);
//         DrawPanel panel = new DrawPanel();
//         JFrame app = new JFrame();
//         panel.addBar(Color.BLACK, num1);
//         panel.addBar(Color.BLUE, num2);
//         panel.addBar(Color.CYAN, num3);
//         panel.addBar(Color.DARK_GRAY, num4);
//         panel.addBar(Color.GREEN, num5);
//         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         app.add(panel);
//         app.setSize(500, 500);
//         app.setVisible(true);
//     }
// }
