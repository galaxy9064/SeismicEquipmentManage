package com.xyf;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: XuYifei
 * @Date: 2018.10.30 22:05
 * @Description: 开始界面
 */
public class StartUI extends JFrame {
    //初始化“开始界面”的组件


    //构造函数
    public StartUI() {
        //定义“开始界面”的组件
        JButton button[] = new JButton[4];//一级按钮有几项就填几

        button[0] = new JButton("查询设备");//查询设备并进行操作：修改、注销等
        button[1] = new JButton("添加设备");
        button[2] = new JButton("修改设备");
        button[3] = new JButton("删除设备");

        Font buttonFont = new Font("微软雅黑", Font.BOLD, 20);//设置-按钮中的字体大小
        Dimension preferredSize = new Dimension(100, 100);//设置-按钮尺寸
        for (int i = 0; i < button.length; i++) {
            button[i].setFont(buttonFont);
            button[0].setPreferredSize(preferredSize);
            //按钮尺寸设置无效
        }

        //向StartUI中添加组件
        this.add(button[0]);
        this.add(button[1]);
        //绘制界面
        this.setSize(640, 480);
        this.setLayout(new GridLayout(button.length, 1));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //PSVM主函数，程序开始
    public static void main(String[] args) {
        StartUI startUI = new StartUI();
    }


}
