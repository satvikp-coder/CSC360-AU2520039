# CSC360 - Computer Graphics & Java GUI Programming

This repository contains practical projects, experiments, and comprehensive class notes created for **CSC360 (Computer Graphics)**. It covers 2D graphics rendering, geometric transformations, event-driven animations using Java AWT/Swing and JavaFX, Maven project management, and concurrency fundamentals.

---

## 📁 Repository Structure

```text
CSC360/
├── moving-triangle/      # Java Swing applications for 2D Transformations
│   ├── MovingTriangle.java   # Triangle following mouse cursor via Translation
│   └── ZoomingTriangle.java  # Animated zooming triangle via Scaling & Timer
├── maven-square/         # Maven-based Java Swing project
│   ├── pom.xml               # Maven Project Object Model configuration
│   └── src/main/java/com/example/App.java  # Custom 2D square rendering
└── Notes/                # Structured lecture notes, reflections & practice questions
    ├── 06-aug-2026.md        # SSH vs HTTPS, Vector vs Raster Graphics
    ├── 13-aug-2026.md        # Maven architecture, Coordinate systems & Transformations
    ├── 18-aug-2026.md        # Paint cycle, AWT vs Swing vs JavaFX, Timer & Mouse events
    ├── 20-aug-2026.md        # Documentation standards, OOP inheritance, AffineTransform & Path2D
    ├── 25-aug-2026.md        # Maven pom.xml, Swing in JavaFX, Processes vs Threads, Thread Safety
    └── Questions/            # Practice problem sets & review questions
        └── 6-8-26.md         # Practice questions on SSH/HTTPS & Raster/Vector graphics
```

---

## 🚀 Projects Overview

### 1. Moving & Zooming Triangles (`moving-triangle`)

Demonstrates 2D geometric transformations using `java.awt.geom.AffineTransform` and `Path2D.Double`.

* **`MovingTriangle.java`**:
  * **Concept**: 2D Translation (`AffineTransform.translate()`) and dynamic mouse tracking.
  * **Behavior**: Renders a blue triangle centered at `(0,0)` and dynamically transforms its position to match the mouse cursor position in real time using a `MouseMotionListener`.
  * **How to Run**:
    ```bash
    cd moving-triangle
    javac MovingTriangle.java
    java MovingTriangle
    ```

* **`ZoomingTriangle.java`**:
  * **Concept**: 2D Scaling (`AffineTransform.scale()`), Translation & Swing Timer Animation.
  * **Behavior**: Renders a red triangle oscillating between minimum (`0.4x`) and maximum (`2.5x`) scale factors driven by a 30ms Swing `Timer`. It translates to the panel center prior to scaling so the zoom remains centered.
  * **How to Run**:
    ```bash
    cd moving-triangle
    javac ZoomingTriangle.java
    java ZoomingTriangle
    ```

---

### 2. Maven Square App (`maven-square`)

A foundational Maven-configured Java Swing project demonstrating primitive shape rendering and build lifecycle automation.

* **`App.java`**:
  * **Concept**: Custom 2D painting via `Graphics.fillRect()`.
  * **Behavior**: Opens a 500x500 window and paints a solid 200x200 blue square centered in the view.
  * **How to Build & Run with Maven**:
    ```bash
    cd maven-square
    mvn clean compile
    mvn exec:java -Dexec.mainClass="com.example.App"
    ```
  * **How to Run directly with Java**:
    ```bash
    cd maven-square
    javac -d bin src/main/java/com/example/App.java
    java -cp bin com.example.App
    ```

---

## 📝 Class Notes & Reflections (`Notes/`)

Each class session includes in-depth notes with diagrams and concise reflections:

| Date | Key Topics Covered | Notes File |
| :--- | :--- | :--- |
| **06 Aug 2026** | GitHub Authentication (SSH vs HTTPS), Vector vs Raster Graphics | [`06-aug-2026.md`](Notes/06-aug-2026.md) |
| **13 Aug 2026** | Maven Architecture & Lifecycle, 2D Coordinate Systems, Affine Transformations | [`13-aug-2026.md`](Notes/13-aug-2026.md) |
| **18 Aug 2026** | Swing Paint Cycle (`paintComponent`), GUI Frameworks (AWT/Swing/JavaFX), Timer Animation, Mouse Listeners | [`18-aug-2026.md`](Notes/18-aug-2026.md) |
| **20 Aug 2026** | Documentation Pipeline, Java OOP & `@Override`, `AffineTransform`, `Path2D.Double` Geometry | [`20-aug-2026.md`](Notes/20-aug-2026.md) |
| **25 Aug 2026** | Importance of `pom.xml`, `javax.swing` in JavaFX, Processes vs Threads, Thread Safety, Click Me Button | [`25-aug-2026.md`](Notes/25-aug-2026.md) |
| **Review Sets** | Practice questions covering graphics fundamentals & Git workflows | [`Questions/6-8-26.md`](Notes/Questions/6-8-26.md) |

---

## 🛠️ Prerequisites & Environment

* **Java Development Kit (JDK)**: Java 8 or higher (Java 17+ recommended)
* **Apache Maven**: Version 3.8+ (for building Maven-managed projects)
* **Git**: For version control
