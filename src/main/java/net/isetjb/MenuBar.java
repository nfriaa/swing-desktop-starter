/*
 * The MIT License
 *
 * Copyright 2017 Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.isetjb;

import net.isetjb.config.I18N;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import org.apache.log4j.Logger;

/**
 * MenuBar class.
 *
 * @author Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn)
 */
public class MenuBar extends JMenuBar
{
    final static Logger log = Logger.getLogger(MenuBar.class);

    // file :
    JMenu jMenuFile = new JMenu(I18N.lang("menubar.jMenuFile"));
    JMenuItem jMenuItemFrame1 = new JMenuItem(I18N.lang("menubar.jMenuItemFrame1"));
    JMenuItem jMenuItemQuit = new JMenuItem(I18N.lang("menubar.jMenuItemQuit"));

    // help :
    JMenu jMenuHelp = new JMenu(I18N.lang("menubar.jMenuHelp"));
    JMenuItem jMenuItemFrameAbout = new JMenuItem(I18N.lang("menubar.jMenuItemFrameAbout"));

    /**
     * Constructor.
     */
    public MenuBar()
    {
        log.debug("START constructor...");

        // file :
        add(jMenuFile);
        jMenuFile.setMnemonic(KeyEvent.VK_F);

        jMenuItemFrame1.setAccelerator(KeyStroke.getKeyStroke('R', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        jMenuFile.add(jMenuItemFrame1);

        jMenuFile.addSeparator();

        jMenuItemQuit.setAccelerator(KeyStroke.getKeyStroke('Q', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        jMenuFile.add(jMenuItemQuit);

        // help :
        add(jMenuHelp);
        jMenuHelp.setMnemonic(KeyEvent.VK_H);

        jMenuItemFrameAbout.setAccelerator(KeyStroke.getKeyStroke('A', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        jMenuHelp.add(jMenuItemFrameAbout);

        log.debug("End of constructor.");
    }
}
