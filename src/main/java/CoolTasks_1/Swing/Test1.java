package CoolTasks_1.Swing;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test1 {
    public static void main(String[] args) {
        LabelFrame frame = new LabelFrame();
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

class LabelFrame extends JFrame {
    //створюємо панель
    JPanel panel = new JPanel();

    LabelFrame() {
        // вирівнювання за замовчуванням (CENTER)
        JLabel label1 = new JLabel("Бееее");
        Icon icon = new ImageIcon("C:\\Users\\Ярослав\\WorkID\\Other\\CoolTasks_1\\Swing\\k.jpg");
        // створюємо мітку із зображенням
        JLabel label4 = new JLabel(icon);
        //додаємо мітки в панель
        panel.add(label1);
        panel.add(label4);
              //додаємо панель у фрейм
        this.add(panel);
    }
}
