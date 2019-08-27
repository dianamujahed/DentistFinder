import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialityForm {
    private JCheckBox isSpecialistCheckBox;
    private JTextField AreaOfSpecialization;
    private JTextField StartYear;
    private JButton addButton;

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
