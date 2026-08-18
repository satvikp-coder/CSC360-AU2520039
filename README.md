# CSC360 - Computer Graphics Projects

This repository contains Java Swing applications created for **CSC360 (Computer Graphics)** focusing on 2D graphics rendering, geometric transformations, and animations using `Java AWT` and `Swing`.

---

## 📁 Repository Structure

```text
CSC360/
├── moving-triangle/      # Java Swing applications for 2D Transformations
│   ├── MovingTriangle.java   # Triangle following mouse cursor via Translation
│   └── ZoomingTriangle.java  # Animated zooming triangle via Scaling
└── maven-square/         # Maven-based Java Swing project
    ├── pom.xml               # Maven configuration file
    └── src/main/java/com/example/App.java  # Basic square rendering
```

---

## 🚀 Projects Overview

### 1. Moving & Zooming Triangles (`moving-triangle`)

Demonstrates 2D geometric transformations using `java.awt.geom.AffineTransform` and `Path2D.Double`.

* **`MovingTriangle.java`**:
  * **Concept**: 2D Translation (`AffineTransform.translate()`) & Event Handling.
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

A foundational Maven-configured Java Swing project demonstrating primitive shape rendering.

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

## 🛠️ Prerequisites

* **Java Development Kit (JDK)**: Java 8 or higher
* **Apache Maven** (optional, required only for `maven-square` build management)
