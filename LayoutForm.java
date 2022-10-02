

import javax.swing.*;
import javax.swing.UIManager.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class LayoutForm {
    private JPanel mainJP;
    private JPanel uperSubPanel;
    private JPanel menuSubPanel;
    private JPanel mainContentSubPanel;
    private JButton resetButton;
    private JButton action1Button;
    private JButton action2Button;
    private JButton printTextButton;
    private JRadioButton radioButton1;
    private JRadioButton BLUERadioButton;
    private JRadioButton YELLOWRadioButton;
    private JSlider slider1;
    private JTree tree1;
    private JTextPane textPane1;
    private JLabel sliderLabel;
    private JSplitPane splitPane1;
    private JTextArea outputTextarea;


    public LayoutForm() {
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!resetButton.isSelected()) {
                    resetButton.setBackground(new Color(30, 40, 0));
                    resetButton.setSelected(true);
                    textPane1.setText("put some text in the text panel/ remove on toggle ");
                } else {
                    resetButton.setBackground(new Color(200, 217, 223));
                    resetButton.setSelected(false);
                    textPane1.setText("");
                }
            }
        });


        action1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!action1Button.isSelected()) {
                    action1Button.setBackground(new Color(200, 44, 3, 20));
                    action1Button.setSelected(true);
                } else {
                    action1Button.setBackground(new Color(214, 217, 223));
                    action1Button.setSelected(false);
                }
            }
        });


        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int sliderValue = ((JSlider) e.getSource()).getValue();
                sliderLabel.setText("Value of the slider is: " + sliderValue);
                int maxSize = splitPane1.getMaximumDividerLocation();
                int dividerLocation = maxSize * sliderValue / 100;
                textPane1.setText("max size is " + maxSize + " locaton is " + dividerLocation);
                splitPane1.setDividerLocation(dividerLocation);

            }
        });
    } // end of the LayoutForm public method

    // this is pretty much boilerplate for the gui  ---old and not the most user frendly
    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }


        JFrame mainJFrame = new JFrame("MainJP");
        mainJFrame.setContentPane(new LayoutForm().mainJP);
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setPreferredSize(new Dimension(800, 400));
        mainJFrame.pack();
        mainJFrame.setVisible(true);
    }
    {
     $$$setupUI$$$();
    }

    
    private void $$$setupUI$$$() {
        mainJP = new JPanel();
        mainJP.setLayout(new BorderLayout(0, 0));
        uperSubPanel = new JPanel();
        uperSubPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        mainJP.add(uperSubPanel, BorderLayout.NORTH);
        resetButton = new JButton();
        resetButton.setText("Reset");
        uperSubPanel.add(resetButton);
        action1Button = new JButton();
        action1Button.setText("Action1");
        uperSubPanel.add(action1Button);
        action2Button = new JButton();
        action2Button.setText("Action2");
        uperSubPanel.add(action2Button);
        printTextButton = new JButton();
        printTextButton.setText("PrintText");
        uperSubPanel.add(printTextButton);
        menuSubPanel = new JPanel();
        menuSubPanel.setLayout(new GridBagLayout());
        mainJP.add(menuSubPanel, BorderLayout.WEST);
        final JLabel label1 = new JLabel();
        label1.setText("Label");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        menuSubPanel.add(label1, gbc);
        radioButton1 = new JRadioButton();
        radioButton1.setText("RED");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        menuSubPanel.add(radioButton1, gbc);
        BLUERadioButton = new JRadioButton();
        BLUERadioButton.setText("BLUE");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        menuSubPanel.add(BLUERadioButton, gbc);
        YELLOWRadioButton = new JRadioButton();
        YELLOWRadioButton.setText("YELLOW");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        menuSubPanel.add(YELLOWRadioButton, gbc);
        slider1 = new JSlider();
        slider1.setAlignmentX(1.0f);
        slider1.setAlignmentY(0.0f);
        slider1.setAutoscrolls(false);
        slider1.setValue(20);
        slider1.setValueIsAdjusting(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        menuSubPanel.add(slider1, gbc);
        sliderLabel = new JLabel();
        sliderLabel.setText("start at 20");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        menuSubPanel.add(sliderLabel, gbc);
        mainContentSubPanel = new JPanel();
        mainContentSubPanel.setLayout(new GridBagLayout());
        mainJP.add(mainContentSubPanel, BorderLayout.CENTER);
        splitPane1 = new JSplitPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainContentSubPanel.add(splitPane1, gbc);
        tree1 = new JTree();
        splitPane1.setLeftComponent(tree1);
        textPane1 = new JTextPane();
        splitPane1.setRightComponent(textPane1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainJP;
    }

}
