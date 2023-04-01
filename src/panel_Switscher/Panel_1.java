package panel_Switscher;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Panel_1 extends JPanel {
	private JLabel newLabelLabel;

	/**
	 * Create the panel.
	 */
	public Panel_1() {

		initGUI();
	}
	private void initGUI() {
		setBackground(new Color(0, 128, 255));
		setLayout(null);
		{
			newLabelLabel = new JLabel("Panel 1");
			newLabelLabel.setHorizontalAlignment(SwingConstants.CENTER);
			newLabelLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
			newLabelLabel.setBounds(10, 10, 580, 34);
			add(newLabelLabel);
		}
	}

}
