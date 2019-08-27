import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialityForm {
    private JPanel panel1;
    private JCheckBox isSpecialistCheckBox;
    private JTextField AreaOfSpecialization;
    private JTextField StartYear;
    private JButton addButton;
    private static JFrame Frame;

    public void  showSpecialityFrame(){
        Frame = new JFrame("SpecialityForm");
        Frame.setContentPane(new SpecialityForm().panel1);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
    }
    public SpecialityForm() {
        isSpecialistCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( isSpecialistCheckBox.isSelected()==true)
                {
                    AreaOfSpecialization.setEnabled(true);
                    StartYear.setEnabled(true);
                    addButton.setEnabled(true);
                }
            }
        });
    }

    public JTextField getAreaOfSpecialization() {
        return AreaOfSpecialization;
    }

    public JTextField getStartYear() {
        return StartYear;
    }
}
