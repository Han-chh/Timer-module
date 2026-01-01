# Timer Module

## Description

A simple timer application built in Java using Swing. Provides basic timer functionality with start, pause, and restart capabilities.

>Note: the lowest embeded precision of this timer is 1 ms.

## Features

- Start, pause, and restart timer
- Real-time display updates
- Thread-safe timer operations
- User-friendly GUI interface

## Requirements

- Java Development Kit (JDK) 8 or higher

## Run

```bash
java -jar Timer-module.jar
```

## Usage

1. Launch the application
2. Click "start" to begin timing
3. Click "pause" to pause the timer
4. Click "restart" to reset and start over

## Project Structure

- `src/timer/Timer_main.java`: Main application and GUI
- `src/timer/Timer.java`: Timer logic implementation
- `src/timer/Refresh.java`: Display refresh thread
- `src/timer/Pause.java`: Pause functionality
- `bin/`: Compiled class files

## Contributing

Feel free to contribute additional timer features or improvements!