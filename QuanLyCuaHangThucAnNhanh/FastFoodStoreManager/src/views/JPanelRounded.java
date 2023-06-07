package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class JPanelRounded {
	private JPanel p;

	/**
	 * Create the panel.
	 */
	public JPanelRounded(int with, int height, Color colorBackground, Color foregroundColor) {
		p = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(with, height);
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded opaque panel with borders.
				graphics.setColor(colorBackground);
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(foregroundColor);
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
	}

	public JPanel getP() {
		return p;
	}

}
