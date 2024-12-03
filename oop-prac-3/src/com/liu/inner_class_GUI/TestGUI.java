package com.liu.inner_class_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {
    public static void main(String[] args) {
        // 拓展： 搞清楚匿名内部类在开发中的真实使用场景
        // GUI编程
        // 1. 创建窗口
        JFrame  win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton button = new JButton("登录");
        panel.add(button);

//        // 给按钮绑定单击事件监听器
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "登录成功");
//            }
//        });
        // 代码简化
        button.addActionListener(e -> JOptionPane.showMessageDialog(win, "登录成功"));

        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
