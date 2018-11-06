package com.xyf.sem.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: XuYifei
 * @Date: 2018.10.30 22:05
 * @Description: 开始界面
 */
public class StartUI extends JFrame implements ActionListener {
    //初始化“开始界面”的组件


    //构造函数
    public StartUI() {

        //定义“开始界面”的组件
        JButton button[] = new JButton[4];//一级按钮有几项就填几

        //定义按钮功能
        button[0] = new JButton("查询设备");//查询设备并进行操作：修改、注销等
        button[1] = new JButton("添加设备");
        button[2] = new JButton("修改设备");
        button[3] = new JButton("删除设备");

        //对按钮注册监听，this表示StartUI （implements ActionListener）类的对象
        button[0].addActionListener(this);
        button[1].addActionListener(this);
        button[2].addActionListener(this);
        button[3].addActionListener(this);
        button[0].setActionCommand("查询");
        button[1].setActionCommand("添加");
        button[2].setActionCommand("修改");
        button[3].setActionCommand("删除");

        //设置按钮字体
        Font buttonFont = new Font("微软雅黑", Font.BOLD, 20);//设置-按钮中的字体大小
        Dimension preferredSize = new Dimension(100, 100);//设置-按钮尺寸
        for (int i = 0; i < button.length; i++) {
            button[i].setFont(buttonFont);
            button[0].setPreferredSize(preferredSize);
            //按钮尺寸设置无效
        }

        this.setLayout(new GridLayout(button.length, 1));//设置界面为网格布局

        //向StartUI中添加组件
        this.add(button[0]);
        this.add(button[1]);
        this.add(button[2]);
        this.add(button[3]);

        //绘制界面
        this.setTitle("地震设备管理系统");
        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //PSVM主函数，程序开始
    public static void main(String[] args) {
        StartUI startUI = new StartUI();
    }


    /**
     * 发生动作时调用
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {

            case "查询":
                System.out.println("查询");
                break;

            case "添加":
                System.out.println("添加");
                break;

            case "修改":
                System.out.println("修改");
                break;

            case "删除":
                System.out.println("删除");
                break;
        }

    }
}
