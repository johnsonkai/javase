/*
 * DeptManagerFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package cn.com.deptmain;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import cn.com.dao.DeptDAO;
import cn.com.dao.impl.ImplDeptDAO;
import cn.com.entity.Dept;
import cn.com.util.JdbcUtil;
import cn.com.util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class DeptManagerFrame extends javax.swing.JInternalFrame {
	DeptDAO dao = new ImplDeptDAO(JdbcUtil.getConn());

	/** Creates new form DeptManagerFrame */
	public DeptManagerFrame() {
		initComponents();
		//把获得的数据以表格形式显示
		this.fillTable(new Dept());
	}

	//填充数据
	public void fillTable(Dept depts) {
		// TODO Auto-generated method stub
		//new一个DefaultTableModel对象
		DefaultTableModel dtm = (DefaultTableModel) this.showDeptTable
				.getModel();

		//清空数据即把行数设为0
		dtm.setRowCount(0);
		List<Dept> dept = dao.getDeptsByName(depts);

		for (Dept d : dept) {
			//把所得的数据放入vector中
			Vector<String> vector = new Vector<String>();
			vector.add(d.getId() + "");

			vector.add(d.getDeptName());
			vector.add(d.getDeptDesc());
			//按行添加数据
			dtm.addRow(vector);
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		selectPanel = new javax.swing.JPanel();
		jb_Dept = new javax.swing.JButton();
		descField = new javax.swing.JTextField();
		descLabel = new javax.swing.JLabel();
		DeptNameField = new javax.swing.JTextField();
		DeptNameLb = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		showDeptTable = new javax.swing.JTable();
		resButton = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		deptId = new javax.swing.JTextField();
		deptName = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		deptDesc = new javax.swing.JTextField();
		jbUpdate = new javax.swing.JButton();
		jbDel = new javax.swing.JButton();
		resetButton = new javax.swing.JButton();

		setClosable(true);
		setMaximizable(true);

		selectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
						new java.awt.Color(153, 255, 0)),
				"\u90e8\u95e8\u67e5\u8be2",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("微软雅黑", 0, 18),
				new java.awt.Color(0, 255, 51)));

		jb_Dept.setText("\u67e5\u8be2");
		jb_Dept.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_DeptActionPerformed(evt);
			}
		});

		descLabel.setText("\u90e8\u95e8\u63cf\u8ff0");

		DeptNameLb.setText("\u90e8\u95e8\u540d\u5b57");

		showDeptTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "部门id", "部门名", "部门描述" }));
		showDeptTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				showDeptTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(showDeptTable);

		resButton.setText("\u91cd\u7f6e");
		resButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout selectPanelLayout = new javax.swing.GroupLayout(
				selectPanel);
		selectPanel.setLayout(selectPanelLayout);
		selectPanelLayout
				.setHorizontalGroup(selectPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								selectPanelLayout
										.createSequentialGroup()
										.addGap(45, 45, 45)
										.addComponent(DeptNameLb)
										.addGap(64, 64, 64)
										.addComponent(
												DeptNameField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												160,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(49, 49, 49)
										.addComponent(descLabel)
										.addGap(65, 65, 65)
										.addComponent(
												descField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												193,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												66, Short.MAX_VALUE)
										.addComponent(jb_Dept)
										.addGap(97, 97, 97)
										.addComponent(resButton)
										.addGap(67, 67, 67))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								selectPanelLayout
										.createSequentialGroup()
										.addContainerGap(206, Short.MAX_VALUE)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												647,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(163, 163, 163)));
		selectPanelLayout
				.setVerticalGroup(selectPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								selectPanelLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												selectPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																DeptNameLb)
														.addComponent(
																DeptNameField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(descLabel)
														.addComponent(
																descField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jb_Dept)
														.addComponent(resButton))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												190,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(331, 331, 331)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				new javax.swing.border.SoftBevelBorder(
						javax.swing.border.BevelBorder.RAISED,
						new java.awt.Color(0, 51, 255), new java.awt.Color(51,
								51, 255), new java.awt.Color(0, 0, 255),
						new java.awt.Color(0, 0, 255)),
				"\u90e8\u95e8\u4fee\u6539",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.TOP, new java.awt.Font("微软雅黑",
						0, 18), new java.awt.Color(102, 204, 0)));

		jLabel1.setText("\u90e8\u95e8id");

		jLabel2.setText("\u90e8\u95e8\u540d\u5b57");

		jLabel3.setText("\u90e8\u95e8\u63cf\u8ff0");

		jbUpdate.setText("\u4fee\u6539");
		jbUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbUpdateActionPerformed(evt);
			}
		});

		jbDel.setText("\u5220\u9664");
		jbDel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbDelActionPerformed(evt);
			}
		});

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
										.addContainerGap(356, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2))
																		.addGap(95,
																				95,
																				95)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								deptName)
																						.addComponent(
																								deptId,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								156,
																								Short.MAX_VALUE))
																		.addGap(60,
																				60,
																				60)
																		.addComponent(
																				jLabel3)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				deptDesc,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				149,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jbUpdate)
																		.addGap(151,
																				151,
																				151)
																		.addComponent(
																				jbDel)
																		.addGap(128,
																				128,
																				128)
																		.addComponent(
																				resetButton)))
										.addGap(82, 82, 82)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(62,
																				62,
																				62)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								deptName,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel1)
																		.addComponent(
																				jLabel3)
																		.addComponent(
																				deptDesc,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				deptId,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(49, 49, 49)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jbUpdate)
														.addComponent(jbDel)
														.addComponent(
																resetButton))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(46, 46, 46)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														selectPanel,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(39, 39, 39)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(selectPanel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 311,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(83, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents
	/**清空各文本组件中的数据*/
	private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		clearInfAtText();
	}
	//清空文本内容的方法（再删除和修改信息的组件之中）
	private void clearInfAtText(){
		this.deptId.setText("");
		this.deptName.setText("");
		this.deptDesc.setText("");
	}
	/**清空文本内容*/
	private void resButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		this.descField.setText("");
		this.DeptNameField.setText("");
	}

	/**table鼠标点击事件*/
	private void showDeptTableMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int row = this.showDeptTable.getSelectedRow();
		this.deptId.setText((String) this.showDeptTable.getValueAt(row, 0));
		this.deptName.setText((String) this.showDeptTable.getValueAt(row, 1));
		this.deptDesc.setText((String) this.showDeptTable.getValueAt(row, 2));

	}

	/**添加一个按部门id删除的事件*/
	private void jbDelActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String deptId = this.deptId.getText();
		if (StringUtil.isNullOrEmpty(deptId)) {
			JOptionPane.showMessageDialog(null, "请选择要删除的id");
		} else {
			Dept d = new Dept();
			d.setId(Integer.parseInt(deptId));
			int count = dao.deleteDept(d);
			if (count == 1) {
				JOptionPane.showMessageDialog(null, "删除成功");
				this.fillTable(d);
			} else {
				JOptionPane.showMessageDialog(null, "删除失败");
			}
		}
	}

	/**添加一个按部门id修改的事件*/
	private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String deptId = this.deptId.getText();
		String deptName = this.deptName.getText();
		String deptDesc = this.deptDesc.getText();
		if (StringUtil.isNullOrEmpty(deptId)) {
			JOptionPane.showMessageDialog(null, "请选择修改的记录");
		} else {
			Dept d = new Dept();
			d.setId(Integer.parseInt(deptId));
			d.setDeptName(deptName);
			d.setDeptDesc(deptDesc);
			int count = dao.updateDept(d);
			if (count == 1) {
				JOptionPane.showMessageDialog(null, "数据跟新成功");
				this.fillTable(new Dept());
			} else {
				JOptionPane.showMessageDialog(null, "数据更新失败");
			}
		}

	}

	/**添加一个查询事件*/
	private void jb_DeptActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String deptName = this.DeptNameField.getText();
		String deptDesc = this.descField.getText();
		Dept dept = new Dept();
		dept.setDeptName(deptName);
		dept.setDeptDesc(deptDesc);
		this.fillTable(dept);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField DeptNameField;
	private javax.swing.JLabel DeptNameLb;
	private javax.swing.JTextField deptDesc;
	private javax.swing.JTextField deptId;
	private javax.swing.JTextField deptName;
	private javax.swing.JTextField descField;
	private javax.swing.JLabel descLabel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton jbDel;
	private javax.swing.JButton jbUpdate;
	private javax.swing.JButton jb_Dept;
	private javax.swing.JButton resButton;
	private javax.swing.JButton resetButton;
	private javax.swing.JPanel selectPanel;
	private javax.swing.JTable showDeptTable;
	// End of variables declaration//GEN-END:variables

}