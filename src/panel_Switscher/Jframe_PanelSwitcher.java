package panel_Switscher;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

//////////////

public class Jframe_PanelSwitcher extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel_Buttons;
	private JPanel panel_Container;
	private JButton btn_Panel1btn_Panel1;
	private JButton btn_Panel1btn_Panel2;
	private JButton btn_Panel1btn_Panel4;
	private JButton btn_Panel1btn_Panel3;
	////////////
	private Panel_1 panel_1;
	private Panel_2 panel_2;
	private Panel_3 panel_3;
	private Panel_4 panel_4;
	private JPanel panel;
	private JPanel panel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe_PanelSwitcher frame = new Jframe_PanelSwitcher();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe_PanelSwitcher() {
		initGUI();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel_Buttons = new JPanel();
			panel_Buttons.setBackground(new Color(38, 38, 41));
			panel_Buttons.setBounds(4, 10, 404, 754);
			contentPane.add(panel_Buttons);
			panel_Buttons.setLayout(null);
			{
				panel = new JPanel();
				panel.setBackground(new Color(38, 38, 41));
				panel.setBounds(98, 93, 196, 209);
				panel_Buttons.add(panel);
				panel.setLayout(null);
			}
			{
				panel_5 = new JPanel();
				panel_5.setBounds(10, 415, 384, 329);
				panel_Buttons.add(panel_5);
				panel_5.setLayout(null);
				{
					btn_Panel1btn_Panel1 = new JButton("btn_Panel1");
					btn_Panel1btn_Panel1.setBounds(10, 158, 196, 21);
					panel_5.add(btn_Panel1btn_Panel1);
					btn_Panel1btn_Panel1.setBackground(new Color(38, 38, 41));
					btn_Panel1btn_Panel1.setForeground(new Color(197, 154, 74));
					{
						btn_Panel1btn_Panel2 = new JButton("btn_Panel2");
						btn_Panel1btn_Panel2.setBounds(10, 204, 196, 21);
						panel_5.add(btn_Panel1btn_Panel2);
						{
							btn_Panel1btn_Panel3 = new JButton("btn_Panel3");
							btn_Panel1btn_Panel3.setBounds(10, 252, 196, 21);
							panel_5.add(btn_Panel1btn_Panel3);
							{
								btn_Panel1btn_Panel4 = new JButton("btn_Panel4");
								btn_Panel1btn_Panel4.setBounds(10, 298, 196, 21);
								panel_5.add(btn_Panel1btn_Panel4);
								btn_Panel1btn_Panel4.addActionListener(this);
							}
							btn_Panel1btn_Panel3.addActionListener(this);
						}
						btn_Panel1btn_Panel2.addActionListener(this);
					}
					btn_Panel1btn_Panel1.addActionListener(this);
				}
			}
		}
		{
			panel_Container = new JPanel();
			panel_Container.setBounds(418, 10, 958, 754);
			contentPane.add(panel_Container);

		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_Panel1btn_Panel4) {
			do_btn_Panel1btn_Panel4_actionPerformed(e);
		}
		if (e.getSource() == btn_Panel1btn_Panel3) {
			do_btn_Panel1btn_Panel3_actionPerformed(e);
		}
		if (e.getSource() == btn_Panel1btn_Panel2) {
			do_btn_Panel1btn_Panel2_actionPerformed(e);
		}
		if (e.getSource() == btn_Panel1btn_Panel1) {
			do_btn_Panel1btn_Panel1_actionPerformed(e);
		}
	}

	protected void do_btn_Panel1btn_Panel1_actionPerformed(ActionEvent e) {
		// Entfernen des aktuellen Panels
		panel_Container.removeAll();
		// Erstellen und Hinzufügen des neuen Panels
		panel_1 = new Panel_1();
		panel_1.setBounds(0, 0, 600, 400);
		panel_Container.add(panel_1);
		panel_Container.repaint();

	}

	protected void do_btn_Panel1btn_Panel2_actionPerformed(ActionEvent e) {
		// Entfernen des aktuellen Panels
		panel_Container.removeAll();

		// Erstellen und Hinzufügen des neuen Panels
		panel_2 = new Panel_2();
		panel_2.setBounds(0, 0, 600, 400);
		panel_Container.add(panel_2);
		panel_Container.repaint();
	}

	protected void do_btn_Panel1btn_Panel3_actionPerformed(ActionEvent e) {
		// Entfernen des aktuellen Panels
		panel_Container.removeAll();
		// Erstellen und Hinzufügen des neuen Panels
		panel_3 = new Panel_3();
		panel_3.setBounds(0, 0, 600, 400);
		panel_Container.add(panel_3);
		panel_Container.repaint();
	}

	protected void do_btn_Panel1btn_Panel4_actionPerformed(ActionEvent e) {
		// Entfernen des aktuellen Panels
		panel_Container.removeAll();
		// Erstellen und Hinzufügen des neuen Panels
		panel_4 = new Panel_4();
		panel_4.setBounds(0, 0, 600, 400);
		panel_Container.add(panel_4);
		panel_Container.repaint();
	}
}
