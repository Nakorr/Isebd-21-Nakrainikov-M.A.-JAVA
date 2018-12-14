import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    private Lokomotiv lokomotiv;

    public void setLokomotiv(Lokomotiv lokomotiv) {
        this.lokomotiv = lokomotiv;
    }

    public MyPanel(Lokomotiv lokomotiv) {
        this.lokomotiv = lokomotiv;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (lokomotiv != null) {
            lokomotiv.DrawLokomotiv(g);
        }
    }
}

