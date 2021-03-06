package com.harryfreeborough.nesemu.ui;

import com.harryfreeborough.nesemu.Console;
import com.harryfreeborough.nesemu.ppu.Pallete;

import javax.swing.*;
import java.awt.*;

/**
 * Panel rendered to contained in the {@link EmuFrame}.
 */
public class EmuPanel extends JPanel {

    private final Console console;

    public EmuPanel(Console console) {
        super();

        this.console = console;
    }

    @Override
    public void paint(Graphics g) {
        for (int x = 0; x < 256; x++) {
            for (int y = 0; y < 240; y++) {
                g.setColor(new Color(Pallete.getRgb(this.console.getPpu().getState().backbuffer[y * 256 + x]), false));
                g.fillRect(x * 2, y * 2, 2, 2);
            }
        }
    }

}
