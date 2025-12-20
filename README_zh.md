# 计时器模块

使用Swing构建的简单计时器应用程序。提供基本的计时器功能，具有开始、暂停和重新开始能力。

>注意：这个计时器的最小内置单位是1ms。

## 功能

- 开始、暂停和重新开始计时器
- 实时显示更新
- 线程安全的计时器操作
- 用户友好的GUI界面

## 要求

- Java开发工具包（JDK）8或更高版本

## 安装和运行

1. 确保系统上安装了JDK。
2. 导航到项目目录。
3. 编译源代码：
   ```
   javac -d bin src/timer/*.java
   ```
4. 运行计时器：
   ```
   java -cp bin timer.Timer_main
   ```

## 使用方法

1. 启动应用程序
2. 点击"start"开始计时
3. 点击"pause"暂停计时器
4. 点击"restart"重置并重新开始

## 项目结构

- `src/timer/Timer_main.java`：主应用程序和GUI
- `src/timer/Timer.java`：计时器逻辑实现
- `src/timer/Refresh.java`：显示刷新线程
- `src/timer/Pause.java`：暂停功能
- `bin/`：编译的类文件

## 贡献

欢迎贡献附加计时器功能或改进！