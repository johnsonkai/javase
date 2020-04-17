/*
 * EmpoManagerFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package cn.com.empomain;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import cn.com.dao.EmpDAO;
import cn.com.dao.impl.ImplDeptDAO;
import cn.com.dao.impl.ImplEmpDAO;
import cn.com.entity.Empolyee;
import cn.com.util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class EmpoManagerFrame extends javax.swing.JInternalFrame {
	EmpDAO dao = new ImplEmpDAO();

	/** Creates new form EmpoManagerFrame */
	public EmpoManagerFrame() {
		initComponents();
		fillTable(new Empolyee());
	}

	//填充表格
	private void fillTable(Empolyee emp) {
		// TODO Auto-generated method stub
		//获得table对象
		DefaultTableModel dtm = (DefaultTableModel) this.showEmpTable
				.getModel();
		List<Empolyee> temp = dao.getInfFromOracle(emp);
		System.out.println(temp.toString());

		dtm.setRowCount(0);
		for (Empolyee e : temp) {
			Vector<String> vector = new Vector<String>();
			vector.add(e.getEmpNo() + "");
			System.out.println(e.getEmpNo());
			vector.add(e.getEmpName());
			vector.add(e.getDno() + "");
			vector.add(e.getEmpDesc());
			dtm.addRow(vector);
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		empNameLabel = new javax.swing.JLabel();
		empNameField = new javax.swing.JTextField();
		empDnoField = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		empDesc = new javax.swing.JTextField();
		empSelectButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		showEmpTable = new javax.swing.JTable();
		resetButton = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		empName = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		empDno = new javax.swing.JTextField();
		empDescField = new javax.swing.JTextField();
		updateButton = new javax.swing.JButton();
		deleteButton = new javax.swing.JButton();
		empNo = new javax.swing.JTextField();
		rsButton = new javax.swing.JButton();

		setClosable(true);
		setMaximizable(true);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.SoftBevelBorder(
						javax.swing.border.BevelBorder.RAISED,
						new java.awt.Color(0, 51, 255), new java.awt.Color(51,
								51, 255), new java.awt.Color(0, 51, 255),
						new java.awt.Color(0, 0, 255)),
				"\u5458\u5de5\u4fe1\u606f\u67e5\u8be2",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("微软雅黑", 0, 18), new java.awt.Color(102, 255,
						102)));

		empNameLabel.setText("\u5458\u5de5\u59d3\u540d");

		jLabel2.setText("\u5458\u5de5\u6240\u5728\u7684\u90e8\u95e8");

		jLabel3.setText("\u5458\u5de5\u63cf\u8ff0");

		empSelectButton.setText("\u67e5\u8be2");
		empSelectButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				empSelectButtonActionPerformed(evt);
			}
		});

		showEmpTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "员工编号", "员工姓名", "员工所在部门编号", "员工描述" }));
		showEmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				showEmpTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(showEmpTable);

		resetButton.setText("\u91cd\u7f6e");
		resetButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resetButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(39, 39, 39)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(10,
																				10,
																				10)
																		.addComponent(
																				jScrollPane1))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								empNameLabel)
																						.addComponent(
																								jLabel3))
																		.addGap(42,
																				42,
																				42)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								empDesc)
																						.addComponent(
																								empNameField,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								139,
																								Short.MAX_VALUE))
																		.addGap(48,
																				48,
																				48)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2)
																										.addGap(47,
																												47,
																												47)
																										.addComponent(
																												empDnoField,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												127,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												empSelectButton)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												144,
																												Short.MAX_VALUE)
																										.addComponent(
																												resetButton)))))
										.addContainerGap(230, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																empNameLabel)
														.addComponent(
																empNameField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																empDnoField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(28, 28, 28)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																empDesc,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																empSelectButton)
														.addComponent(
																resetButton))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												161, Short.MAX_VALUE)
										.addContainerGap()));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.SoftBevelBorder(
						javax.swing.border.BevelBorder.RAISED,
						new java.awt.Color(51, 255, 51), new java.awt.Color(51,
								255, 102), new java.awt.Color(0, 255, 0),
						new java.awt.Color(51, 255, 0)),
				"\u5458\u5de5\u4fe1\u606f\u66f4\u65b0\u548c\u5220\u9664",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("微软雅黑", 0, 12), new java.awt.Color(51, 51,
						255)));
		jPanel2.setEnabled(false);

		jLabel1.setText("\u5458\u5de5\u7f16\u53f7");

		jLabel4.setText("\u5458\u5de5\u59d3\u540d");

		jLabel5.setText("\u5458\u5de5\u6240\u5c5e\u90e8\u95e8");

		jLabel6.setText("\u5458\u5de5\u63cf\u8ff0");

		updateButton.setText("\u4fee\u6539");
		updateButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateButtonActionPerformed(evt);
			}
		});

		deleteButton.setText("\u5220\u9664");
		deleteButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteButtonActionPerformed(evt);
			}
		});

		rsButton.setText("\u91cd\u7f6e");
		rsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rsButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(37,
																				37,
																				37)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel5)))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addContainerGap(
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				updateButton)
																		.addGap(12,
																				12,
																				12)))
										.addGap(17, 17, 17)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																empDno,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																146,
																Short.MAX_VALUE)
														.addComponent(
																empNo,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																146,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(69,
																				69,
																				69)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel6))
																		.addGap(63,
																				63,
																				63)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								empDescField)
																						.addComponent(
																								empName,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								156,
																								Short.MAX_VALUE)))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(77,
																				77,
																				77)
																		.addComponent(
																				deleteButton)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				rsButton)))
										.addGap(208, 208, 208)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(26, 26, 26)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jLabel4)
														.addComponent(
																empName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																empNo,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(49, 49, 49)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(jLabel6)
														.addComponent(
																empDescField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																empDno,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(60, 60, 60)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																updateButton)
														.addComponent(
																deleteButton)
														.addComponent(rsButton))
										.addGap(42, 42, 42)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(24, 24,
																		24)
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jPanel2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										248,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(23, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents
	/**查询中增加清空文本内容的事件*/
	private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		reset();
	}
	/**删除和修改时各组件的清空*/
	private void rsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.empDno.setText("");
		this.empName.setText("");
		this.empNo.setText("");
		this.empDescField.setText("");
	}

	/**删除员工信息的事件*/
	private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String empNo = this.empNo.getText();
		if (StringUtil.isNullOrEmpty(empNo)) {
			JOptionPane.showMessageDialog(null, "请输入要删除的员工号");
		}
		Empolyee e = new Empolyee();
		e.setEmpNo(Integer.parseInt(empNo));
		int count = dao.deleteInfFromOracle(e);
		if (count == 1) {
			JOptionPane.showMessageDialog(null, "信息删除成功", "inf update",
					JOptionPane.INFORMATION_MESSAGE);
			this.fillTable(new Empolyee());
		} else {
			JOptionPane.showMessageDialog(null, "信息删除失败", "inf update",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	/**按员工编号修改员工信息*/
	private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String empNo = this.empNo.getText();
		String empName = this.empName.getText();
		String empDno = this.empDno.getText();
		String empDesc = this.empDescField.getText();
		if (StringUtil.isNullOrEmpty(empNo) || StringUtil.isNullOrEmpty(empNo)
				|| StringUtil.isNullOrEmpty(empName)
				|| StringUtil.isNullOrEmpty(empDesc)) {
			JOptionPane.showMessageDialog(null, "请选要修改信息的内容");
			return;
		}
		Empolyee e = new Empolyee();
		if (!StringUtil.isNullOrEmpty(empNo)
				&& !StringUtil.isNullOrEmpty(empNo)
				&& !StringUtil.isNullOrEmpty(empName)
				&& !StringUtil.isNullOrEmpty(empDesc)) {
			e.setEmpNo(Integer.parseInt(empNo));
			e.setDno(Integer.parseInt(empDno));
			e.setEmpDesc(empDesc);

			e.setEmpName(empName);
		}
		int count = dao.updateInfFromOracle(e);
		if (count == 1) {
			JOptionPane.showMessageDialog(null, "信息修改成功", "inf update",
					JOptionPane.INFORMATION_MESSAGE);
			this.fillTable(new Empolyee());

		} else {
			JOptionPane.showMessageDialog(null, "信息修改失败", "inf update",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	/**table鼠标点击事件*/
	private void showEmpTableMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int row = this.showEmpTable.getSelectedColumn();
		this.empNo.setText((String) this.showEmpTable.getValueAt(row, 0));
		this.empName.setText((String) this.showEmpTable.getValueAt(row, 1));
		this.empDno.setText((String) this.showEmpTable.getValueAt(row, 2));
		this.empDescField
				.setText((String) this.showEmpTable.getValueAt(row, 3));

	}

	/**button查询事件*/
	private void empSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String empName = this.empNameField.getText();
		String empDno = this.empDnoField.getText();
		String empDesc = this.empDesc.getText();
		Empolyee e = new Empolyee();
		e.setEmpName(empName);
		if (StringUtil.isNullOrEmpty(empDno)) {
			e.setDno(0);

		} else {
			e.setDno(Integer.parseInt(empDno));
		}

		e.setEmpDesc(empDesc);
		fillTable(e);
		

	}
	//查询的各组件的清空
	private void reset() {
		this.empDesc.setText("");
		this.empDnoField.setText("");
		this.empNameField.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton deleteButton;
	private javax.swing.JTextField empDesc;
	private javax.swing.JTextField empDescField;
	private javax.swing.JTextField empDno;
	private javax.swing.JTextField empDnoField;
	private javax.swing.JTextField empName;
	private javax.swing.JTextField empNameField;
	private javax.swing.JLabel empNameLabel;
	private javax.swing.JTextField empNo;
	private javax.swing.JButton empSelectButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton resetButton;
	private javax.swing.JButton rsButton;
	private javax.swing.JTable showEmpTable;
	private javax.swing.JButton updateButton;
	// End of variables declaration//GEN-END:variables

}