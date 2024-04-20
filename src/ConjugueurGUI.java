import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConjugueurGUI extends JFrame {
    private JTextField textField;
    private JTextArea textArea;

    public ConjugueurGUI() {
        setTitle("Conjugueur au Futur Simple");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textField = new JTextField();
        textArea = new JTextArea();
        textArea.setEditable(false);

        JButton conjugateButton = new JButton("Conjuguer");
        conjugateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String verbe = textField.getText();
                conjuguer(verbe);
            }
        });

        panel.add(textField, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        panel.add(conjugateButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public void conjuguer(String verbe) {
        if (verbe.endsWith("er")) {
            conjuguerPremierGroupe(verbe);
        } else if (verbe.equals("aller")) {
            conjuguerAller();
        } else if (verbe.equals("avoir")) {
            conjuguerAvoir();
        } else if (verbe.equals("devoir")) {
            conjuguerDevoir();
        } else if (verbe.equals("être")) {
            conjuguerEtre();
        } else if (verbe.equals("faire")) {
            conjuguerFaire();
        } else if (verbe.equals("pouvoir")) {
            conjuguerPouvoir();
        } else if (verbe.equals("savoir")) {
            conjuguerSavoir();
        } else if (verbe.equals("venir")) {
            conjuguerVenir();
        } else if (verbe.equals("voir")) {
            conjuguerVoir();
        } else if (verbe.equals("vouloir")) {
            conjuguerVouloir();
        } else if (verbe.endsWith("ir")) {
            conjuguerDeuxiemeGroupe(verbe);
        } else if (verbe.endsWith("re")) {
            conjuguerTroisiemeGroupe(verbe);
        } else {
            textArea.setText("Je ne sais pas conjuguer ce verbe.");
        }
    }

    public void conjuguerPremierGroupe(String verbe) {
        String radical = verbe.substring(0, verbe.length() - 2);

        textArea.setText("");
        textArea.append("Je " + radical + "erai\n");
        textArea.append("Tu " + radical + "eras\n");
        textArea.append("Il/Elle " + radical + "era\n");
        textArea.append("Nous " + radical + "erons\n");
        textArea.append("Vous " + radical + "erez\n");
        textArea.append("Ils/Elles " + radical + "eront\n");
    }

    public void conjuguerDeuxiemeGroupe(String verbe) {
        String radical = verbe.substring(0, verbe.length() - 2);

        textArea.setText("");
        textArea.append("Je " + radical + "irai\n");
        textArea.append("Tu " + radical + "iras\n");
        textArea.append("Il/Elle " + radical + "ira\n");
        textArea.append("Nous " + radical + "irons\n");
        textArea.append("Vous " + radical + "irez\n");
        textArea.append("Ils/Elles " + radical + "iront\n");
    }

    public void conjuguerTroisiemeGroupe(String verbe) {
        String radical = verbe.substring(0, verbe.length() - 2);

        textArea.setText("");
        textArea.append("Je " + radical + "rai\n");
        textArea.append("Tu " + radical + "ras\n");
        textArea.append("Il/Elle " + radical + "ra\n");
        textArea.append("Nous " + radical + "rons\n");
        textArea.append("Vous " + radical + "rez\n");
        textArea.append("Ils/Elles " + radical + "ront\n");
    }

    public void conjuguerAller() {
        textArea.setText("");
        textArea.append("Je irai\n");
        textArea.append("Tu iras\n");
        textArea.append("Il/Elle ira\n");
        textArea.append("Nous irons\n");
        textArea.append("Vous irez\n");
        textArea.append("Ils/Elles iront\n");
    }

    public void conjuguerAvoir() {
        textArea.setText("");
        textArea.append("Je aurai\n");
        textArea.append("Tu auras\n");
        textArea.append("Il/Elle aura\n");
        textArea.append("Nous aurons\n");
        textArea.append("Vous aurez\n");
        textArea.append("Ils/Elles auront\n");
    }

    public void conjuguerDevoir() {
        textArea.setText("");
        textArea.append("Je devrai\n");
        textArea.append("Tu devras\n");
        textArea.append("Il/Elle devra\n");
        textArea.append("Nous devrons\n");
        textArea.append("Vous devrez\n");
        textArea.append("Ils/Elles devront\n");
    }

    public void conjuguerEtre() {
        textArea.setText("");
        textArea.append("Je serai\n");
        textArea.append("Tu seras\n");
        textArea.append("Il/Elle sera\n");
        textArea.append("Nous serons\n");
        textArea.append("Vous serez\n");
        textArea.append("Ils/Elles seront\n");
    }

    public void conjuguerFaire() {
        textArea.setText("");
        textArea.append("Je ferai\n");
        textArea.append("Tu feras\n");
        textArea.append("Il/Elle fera\n");
        textArea.append("Nous ferons\n");
        textArea.append("Vous ferez\n");
        textArea.append("Ils/Elles feront\n");
    }

    public void conjuguerPouvoir() {
        textArea.setText("");
        textArea.append("Je pourrai\n");
        textArea.append("Tu pourras\n");
        textArea.append("Il/Elle pourra\n");
        textArea.append("Nous pourrons\n");
        textArea.append("Vous pourrez\n");
        textArea.append("Ils/Elles pourront\n");
    }

    public void conjuguerSavoir() {
        textArea.setText("");
        textArea.append("Je saurai\n");
        textArea.append("Tu sauras\n");
        textArea.append("Il/Elle saura\n");
        textArea.append("Nous saurons\n");
        textArea.append("Vous saurez\n");
        textArea.append("Ils/Elles sauront\n");
    }

    public void conjuguerVenir() {
        textArea.setText("");
        textArea.append("Je viendrai\n");
        textArea.append("Tu viendras\n");
        textArea.append("Il/Elle viendra\n");
        textArea.append("Nous viendrons\n");
        textArea.append("Vous viendrez\n");
        textArea.append("Ils/Elles viendront\n");
    }

    public void conjuguerVoir() {
        textArea.setText("");
        textArea.append("Je verrai\n");
        textArea.append("Tu verras\n");
        textArea.append("Il/Elle verra\n");
        textArea.append("Nous verrons\n");
        textArea.append("Vous verrez\n");
        textArea.append("Ils/Elles verront\n");
    }

    public void conjuguerVouloir() {
        textArea.setText("");
        textArea.append("Je voudrai\n");
        textArea.append("Tu voudras\n");
        textArea.append("Il/Elle voudra\n");
        textArea.append("Nous voudrons\n");
        textArea.append("Vous voudrez\n");
        textArea.append("Ils/Elles voudront\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ConjugueurGUI();
            }
        });
    }
}
