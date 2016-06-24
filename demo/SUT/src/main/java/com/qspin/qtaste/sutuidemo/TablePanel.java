package com.qspin.qtaste.sutuidemo;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

final class TablePanel extends JPanel {

    public TablePanel() {
        super();
        setName(COMPONENT_NAME);
        genUI();
    }

    private void genUI() {
        prepareComponent();
        setLayout(new BorderLayout());
        add(new JScrollPane(mTable), BorderLayout.CENTER);
    }

    private void prepareComponent() {
        mTable.setName("TABLE");
    }

    private JTable mTable = new JTable(ModelBuilder.getTableModel());

    private static final int NUMBER_OF_COMPONENT = 1;
    public static final String COMPONENT_NAME = "TABLE_PANEL";
}
