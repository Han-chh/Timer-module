# Timer Module

一个展示开始、暂停、重启和持续更新用时状态的轻量 Java Swing 计时器。

[English](README.md)

## 项目概述

Timer Module 将计时状态封装为简单桌面组件。工作循环在运行时更新显示值，暂停会保留当前状态，重启则恢复初始状态。

## 截图

![原生计时器暂停并显示当前用时](assets/screenshots/timer-module.png)

截图直接来自运行中的 Swing 计时器。

## 功能

- 开始
- 实时用时显示
- 暂停/继续
- 重启/重置
- Swing 桌面界面

## 运行

仓库中的 JAR 已在 Java 25 上验证：

```bash
java -jar Timer-module.jar
```

## 精度说明

实现通过 `Thread.sleep(1)` 后递增浮点数来刷新显示。这可以展示计时状态和 UI 更新，但在完成基准验证前，不应宣传为经过测量的 1 毫秒精度。
