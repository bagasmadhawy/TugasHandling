package tugashandling;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Input extends JFrame {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("TUGAS");
    JLabel labelJk = new JLabel("Jenis Kelamin");
    JLabel titikDuaC = new JLabel(" : ");
    JRadioButton rbLk = new JRadioButton(" Laki-Laki ");
    JRadioButton rbPr = new JRadioButton(" Perempuan ");
    ButtonGroup bgJk = new ButtonGroup();
    JTextField hasilJk = new JTextField("Jenis Kelamin Belum Dipilih");
    JLabel labelAgama = new JLabel("Agama");
    JLabel titikDuaD = new JLabel(" : ");
    String namaAgama[]
            = {" Islam ", " Kristen ", " Katholik ", " Hindu ", " Budha "};
    JComboBox cbAgama = new JComboBox(namaAgama);
    JTextField hasilAgama = new JTextField("Islam");
    JLabel labelBahasa = new JLabel("Bahasa Sehari-Hari");
    JLabel titikDuaF = new JLabel(" : ");
    JCheckBox cbBi = new JCheckBox(" B. Indonesia ");
    JCheckBox cbBd = new JCheckBox(" B. Daerah ");
    JTextField hasilBahasa = new JTextField("Bahasa Belum Dipilih");
    JTextField jalan = new JTextField("Jalan Biasa");
    JTextField jalanCepat = new JTextField("Jalan Cepat");
    JTextField lariBiasa = new JTextField("Lari Biasa");
    JTextField lariKencang = new JTextField("Lari Kencang");
    JTextField hasilJll = new JTextField();
    JTextField hasilnyaJll = new JTextField();
    Font font = new Font("SanSerif", Font.BOLD, 30);
    Font font1 = new Font("SanSerif", Font.BOLD, 15);

    public Input() {
        //frame
        frame.setTitle("Tugas");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        //judul
        frame.add(label);
        label.setFont(font1);
        label.setBounds(370, 20, 100, 20);

        //jeniskelamin
        frame.add(labelJk);
        labelJk.setBounds(50, 70, 150, 20);
        frame.add(titikDuaC);
        titikDuaC.setBounds(185, 70, 150, 20);
        frame.add(rbLk);
        rbLk.setBounds(200, 70, 100, 20);
        frame.add(rbPr);
        rbPr.setBounds(300, 70, 100, 20);
        bgJk.add(rbLk);
        bgJk.add(rbPr);
        rbLk.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbLk) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilJk.setText("Laki-Laki");
                }
            }
        });
        rbPr.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbPr) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilJk.setText("Perempuan");
                }
            }
        });
        frame.add(hasilJk);
        hasilJk.setBounds(200, 100, 200, 20);
        hasilJk.setEditable(false);

        //agama
        frame.add(labelAgama);
        labelAgama.setBounds(50, 140, 150, 20);
        frame.add(titikDuaD);
        titikDuaD.setBounds(185, 140, 150, 20);
        frame.add(cbAgama);
        cbAgama.setBounds(200, 140, 200, 20);
        cbAgama.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (cbAgama.getSelectedIndex() == 0) {
                    hasilAgama.setText("Islam");
                } else if (cbAgama.getSelectedIndex() == 1) {
                    hasilAgama.setText("Kristen");
                } else if (cbAgama.getSelectedIndex() == 2) {
                    hasilAgama.setText("Katholik");
                } else if (cbAgama.getSelectedIndex() == 3) {
                    hasilAgama.setText("Hindu");
                } else if (cbAgama.getSelectedIndex() == 4) {
                    hasilAgama.setText("Budha");
                }
            }
        });
        frame.add(hasilAgama);
        hasilAgama.setBounds(200, 170, 200, 20);
        hasilAgama.setEditable(false);

        //bahasa
        frame.add(labelBahasa);
        labelBahasa.setBounds(50, 210, 150, 20);
        frame.add(titikDuaF);
        titikDuaF.setBounds(185, 210, 150, 20);
        frame.add(cbBi);
        cbBi.setBounds(200, 210, 100, 20);
        frame.add(cbBd);
        cbBd.setBounds(300, 210, 100, 20);
        cbBi.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbBi) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilBahasa.setText("Bahasa Indonesia");
                    cbBd.setSelected(false);
                }
            }
        });
        cbBd.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbBd) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilBahasa.setText("Bahasa Daerah");
                    cbBi.setSelected(false);
                }
            }
        });
        frame.add(hasilBahasa);
        hasilBahasa.setBounds(200, 240, 200, 20);
        hasilBahasa.setEditable(false);

        //palingbawah
        frame.add(jalan);
        jalan.setBounds(25, 280, 150, 20);
        jalan.setEditable(false);
        jalan.setHorizontalAlignment(JTextField.CENTER);
        jalan.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(jalan.getText());
            }
        });
        frame.add(jalanCepat);
        jalanCepat.setBounds(225, 280, 150, 20);
        jalanCepat.setEditable(false);
        jalanCepat.setHorizontalAlignment(JTextField.CENTER);
        jalanCepat.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(jalanCepat.getText());
            }
        });
        frame.add(lariBiasa);
        lariBiasa.setBounds(425, 280, 150, 20);
        lariBiasa.setEditable(false);
        lariBiasa.setHorizontalAlignment(JTextField.CENTER);
        lariBiasa.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(lariBiasa.getText());
            }
        });
        frame.add(lariKencang);
        lariKencang.setBounds(625, 280, 150, 20);
        lariKencang.setEditable(false);
        lariKencang.setHorizontalAlignment(JTextField.CENTER);
        lariKencang.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(lariKencang.getText());
            }
        });
        frame.add(hasilJll);
        hasilJll.setBounds(25, 310, 750, 50);
        hasilJll.setEditable(false);
        hasilJll.setFont(font);
        hasilJll.setHorizontalAlignment(JTextField.CENTER);
        hasilJll.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                hasilnyaJll.setText(hasilJll.getText());
            }
        });
        frame.add(hasilnyaJll);
        hasilnyaJll.setBounds(25, 380, 750, 50);
        hasilnyaJll.setEditable(false);
        hasilnyaJll.setFont(font);
        hasilnyaJll.setHorizontalAlignment(JTextField.CENTER);
    }
}
