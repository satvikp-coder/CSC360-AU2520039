# Moving & Zooming Triangle Projects

This directory contains 2D Computer Graphics programs written in Java Swing, demonstrating geometric transformations (Translation and Scaling) using `java.awt.geom.AffineTransform`.

---

## 📄 Files Included

### 1. `MovingTriangle.java`
* **Concept**: 2D Geometric Translation & Real-time Mouse Tracking.
* **Key Components**:
  * `AffineTransform.translate(mouseX, mouseY)`: Moves the triangle from the origin to the current mouse coordinates.
  * `MouseMotionListener`: Tracks mouse cursor movement across the panel.
* **How to Run**:
  ```bash
  javac MovingTriangle.java
  java MovingTriangle
  ```

### 2. `ZoomingTriangle.java`
* **Concept**: 2D Geometric Scaling & Continuous Animation.
* **Key Components**:
  * `AffineTransform.scale(scale, scale)`: Scales the triangle geometry smoothly.
  * `javax.swing.Timer`: Fires every 30ms to update the scale factor and trigger repaints.
  * Centroid Alignment: Translates to the center of the window prior to scaling so the triangle zooms about its center.
* **How to Run**:
  ```bash
  javac ZoomingTriangle.java
  java ZoomingTriangle
  ```

---

## 🛠️ Requirements
* **JDK**: Java 8 or higher
