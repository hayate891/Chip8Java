/*
 * Copyright (C) 2013-2015 Craig Thomas
 * This project uses an MIT style license - see LICENSE for details.
 */
package com.chip8java.emulator.listeners;

import com.chip8java.emulator.CentralProcessingUnit;
import com.chip8java.emulator.Emulator;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * The StepMenuItemListener will trace execution on the CPU when it is selected.
 */
public class StepMenuItemListener implements ItemListener {

    // The Emulator that the ItemListener will update when clicked
    private Emulator mEmulator;

    public StepMenuItemListener(Emulator emulator) {
        super();
        mEmulator = emulator;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        AbstractButton button = (AbstractButton)e.getSource();
        if (!button.getModel().isSelected()) {
            mEmulator.setStep(false);
        } else {
            mEmulator.setStep(true);
            mEmulator.setTrace(true);
        }
    }
}
