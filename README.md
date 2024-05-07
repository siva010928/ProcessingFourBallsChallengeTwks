
# Processing Challenge - 4 Balls

## Description
This Java project animates four balls moving from left to right across the screen, each at different speeds and heights. It's a simple demonstration of using Processing in a Gradle-built Java application.

## Features
- **Four Animated Balls**: Each ball moves horizontally across the screen at its unique speed.
  - **Ball 1**: Positioned at 1/5th from the top, moves at a speed of 1 unit per frame.
  - **Ball 2**: Positioned at 2/5th from the top, moves at a speed of 2 units per frame.
  - **Ball 3**: Positioned at 3/5th from the top, moves at a speed of 3 units per frame.
  - **Ball 4**: Positioned at 4/5th from the top, moves at a speed of 4 units per frame.

## Setup and Running the Project

### Prerequisites
- JDK 11 or later
- Gradle 6.3 or later

### Cloning the Repository
To get started with this project, first clone the repository to your local machine using:
```bash
git clone https://github.com/siva010928/4-balls-challenge.git
cd 4-balls-challenge
```

### Building the Project
To build the project, run the following command from the root of the project:
```bash
gradle build
```

### Running the Application
To run the application, execute:
```bash
gradle run
```

This will start the application, and you should see the animation of the four balls moving across your screen.

## Dependencies
- **JUnit**: For unit testing.
- **Processing Core**: The Processing library is used to create graphical animations.

## Project Structure
```
.
├── build.gradle        # Gradle build script
└── src                 # Source files for the application
    ├── main            # Main application code
    │   └── java        # Java source files
    └── test            # Test code
        └── java        # Java test source files
```
