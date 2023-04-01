package panel_Switscher;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Panel_2 extends JPanel {
	private JLabel newLabelLabel;

	/**
	 * Create the panel.
	 */
	public Panel_2() {

		initGUI();
	}
	private void initGUI() {
		setBackground(new Color(255, 128, 0));
		setLayout(null);
		{
			newLabelLabel = new JLabel("Panel 2");
			newLabelLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
			newLabelLabel.setHorizontalAlignment(SwingConstants.CENTER);
			newLabelLabel.setBounds(10, 10, 580, 34);
			add(newLabelLabel);
		}
	}

}
