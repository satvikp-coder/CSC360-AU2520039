# CSC360 - Computer Graphics & Java GUI Programming

This repository contains practical projects, experiments, and comprehensive class notes created for **CSC360 (Computer Graphics)**. It covers 2D graphics rendering, geometric transformations, event-driven animations using Java AWT/Swing and JavaFX, Maven project management, build lifecycle & CI/CD fundamentals, and concurrency.

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
    ├── 08-August/            # Notes and reflections for August 2026
    │   ├── 06-aug-2026.md        # SSH vs HTTPS, Vector vs Raster Graphics
    │   ├── 13-aug-2026.md        # Maven architecture, Coordinate systems & Transformations
    │   ├── 18-aug-2026.md        # Paint cycle, AWT vs Swing vs JavaFX, Timer & Mouse events
    │   ├── 20-aug-2026.md        # Documentation standards, OOP inheritance, AffineTransform & Path2D
    │   ├── 25-aug-2026.md        # Maven pom.xml, Swing in JavaFX, Processes vs Threads, Thread Safety
    │   └── 27-aug-2026.md        # JAR & Class files, CI/CD, UTF-8, Source vs Runtime, JUnit, Maven Dependencies
    ├── 09-September/         # Notes and reflections for September 2026
    │   ├── 01-sep-2026.md        # Triangle from equations, Determinants, JavaFX Canvas Project, Binary Trees
    │   ├── 03-sep-2026.md        # ASCII Trees, Print vs Drawing, CLI vs GUI, List Common Arrow-Drawing, Splash Screens
    │   ├── 08-sep-2026.md        # Collections (List/Set/Map), GUI vs DBMS View, Events & Graphics, CSS Grid, Form Controls, Dialogs, JavaFX Graph Editor
    │   ├── 10-sep-2026.md        # Advanced Java SE: Stream API, NIO Channels, XML, Networking, JDBC, Security, Advanced Swing/AWT
    │   ├── 17-sep-2026.md        # Cross-Project Peer Reviews, JavaFX Canvas Coordinate Math, Event-Driven Mouse Routing, Model-View Reset
    │   └── 29-sep-2026.md        # Desktop Graph Editor, Command Pattern, Custom LinkedStack, Hit Detection & JSON Codec
    ├── 10-October/           # Notes and reflections for October 2026
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
| **06 Aug 2026** | GitHub Authentication (SSH vs HTTPS), Vector vs Raster Graphics | [`06-aug-2026.md`](Notes/08-August/06-aug-2026.md) |
| **13 Aug 2026** | Maven Architecture & Lifecycle, 2D Coordinate Systems, Affine Transformations | [`13-aug-2026.md`](Notes/08-August/13-aug-2026.md) |
| **18 Aug 2026** | Swing Paint Cycle (`paintComponent`), GUI Frameworks (AWT/Swing/JavaFX), Timer Animation, Mouse Listeners | [`18-aug-2026.md`](Notes/08-August/18-aug-2026.md) |
| **20 Aug 2026** | Documentation Pipeline, Java OOP & `@Override`, `AffineTransform`, `Path2D.Double` Geometry | [`20-aug-2026.md`](Notes/08-August/20-aug-2026.md) |
| **25 Aug 2026** | Importance of `pom.xml`, `javax.swing` in JavaFX, Processes vs Threads, Thread Safety, Click Me Button | [`25-aug-2026.md`](Notes/08-August/25-aug-2026.md) |
| **27 Aug 2026** | JAR & Class Files in Git, CI/CD Overview, UTF-8 Encoding, Source vs Runtime Version, JUnit & Testing, Maven Dependencies | [`27-aug-2026.md`](Notes/08-August/27-aug-2026.md) |
| **01 Sep 2026** | Triangle from 3 Equations & Determinants, JavaFX Circle & Arrow Canvas Project, Binary Tree Visualization | [`01-sep-2026.md`](Notes/09-September/01-sep-2026.md) |
| **03 Sep 2026** | ASCII Tree Keyboard Drawing, Print vs Drawing, CLI vs GUI, Arrow-Drawing Between Common Elements, Splash Screens | [`03-sep-2026.md`](Notes/09-September/03-sep-2026.md) |
| **08 Sep 2026** | Java Collections (List/Set/Map), GUI View vs DBMS View, Event-Driven Graphics, CSS Grid, Form Controls (Checkbox/Radio/Slider), Dialogs vs Toasts, JavaFX Graph Editor | [`08-sep-2026.md`](Notes/09-September/08-sep-2026.md) |
| **10 Sep 2026** | Advanced Java SE: Stream API, NIO Channels, XML, Networking, JDBC, Security, Advanced Swing/AWT | [`10-sep-2026.md`](Notes/09-September/10-sep-2026.md) |
| **17 Sep 2026** | Cross-Project Peer Reviews, JavaFX Canvas Coordinate Math, Event-Driven Mouse Routing, Model-View Two-Phase Reset, GitHub Issues #5 & #10 | [`17-sep-2026.md`](Notes/09-September/17-sep-2026.md) |
| **29 Sep 2026** | Desktop Graph Editor Architecture, Domain Modeling, Command Pattern Undo/Redo, Custom `LinkedStack`, Gesture Disambiguation, Hit Detection (`GeometryUtils`), `PullMotionModel`, Monotonic JSON Codec | [`29-sep-2026.md`](Notes/09-September/29-sep-2026.md) |
| **Review Sets** | Practice questions covering graphics fundamentals & Git workflows | [`Questions/6-8-26.md`](Notes/Questions/6-8-26.md) |

---

## 🎓 Theory into Practice: Application of Classroom Lessons

This repository is structured to directly reflect and implement the theoretical principles taught across the CSC360 lecture sessions:

| Lecture Domain | Core Classroom Theory Taught | Practical Implementation in this Repository | Relevant Code & Artifacts |
| :--- | :--- | :--- | :--- |
| **2D Geometric Modeling & Affine Transformations** | Defining shapes at canonical origin `(0,0)` and manipulating spatial states via transformation matrices ($T \cdot S \cdot R$) rather than mutating raw vertex coordinates. | • Shapes defined once centered at `(0,0)` via `Path2D.Double`.<br>• Real-time cursor tracking via `AffineTransform.translate()`.<br>• Centered zoom animation via `AffineTransform.scale()` with center-translation offset. | [`MovingTriangle.java`](moving-triangle/MovingTriangle.java)<br>[`ZoomingTriangle.java`](moving-triangle/ZoomingTriangle.java) |
| **GUI Lifecycle, EDT & Animation Pacing** | Single-threaded Event Dispatch Thread (EDT) safety, `paintComponent` rendering lifecycle, and driving animations through timer callbacks instead of busy-wait loops. | • Rigorous `super.paintComponent(g)` invocation on every redraw.<br>• Mouse motion listeners decouple state mutation from rendering via `repaint()`.<br>• 30ms (~33 FPS) frame pacing driven by `javax.swing.Timer`. | [`MovingTriangle.java`](moving-triangle/MovingTriangle.java)<br>[`ZoomingTriangle.java`](moving-triangle/ZoomingTriangle.java)<br>[`App.java`](maven-square/src/main/java/com/example/App.java) |
| **Declarative Build Systems & Dependency Isolation** | Standard Maven directory layout (`src/main/java`), deterministic builds with explicit character encoding, bytecode target levels, and scope-based dependency isolation. | • Explicit `<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>` for cross-platform consistency.<br>• `<maven.compiler.release>17</maven.compiler.release>` to prevent JVM version mismatches.<br>• Scoping `junit` strictly to `<scope>test</scope>` to prevent artifact bloat.<br>• Automated run workflow configured via `exec-maven-plugin`. | [`maven-square/pom.xml`](maven-square/pom.xml) |
| **Source Control & Binary Exclusion Hygiene** | Storing only human-authored source and build manifests in Git; strictly excluding compiled binaries (`.class`), archives (`.jar`), and build directories (`target/`) to avoid repo bloat and binary merge conflicts. | • Comprehensive `.gitignore` configuration excluding all compiler output, JAR packages, target folders, and IDE caches.<br>• Clean reproducibility on any machine with `mvn clean compile`. | [`.gitignore`](.gitignore)<br>[`pom.xml`](maven-square/pom.xml) |
| **Mathematical Geometry & Graph Visualization** | Solving line intersections via 2×2 matrix determinants ($D = a_1b_2 - a_2b_1$) and transitioning from CLI/text structures (ASCII trees) to interactive canvas graphics (circle nodes with perimeter-docked directional arrows). | • Vertex calculation models from linear systems.<br>• Node-and-arrow rendering mechanics with clean angular arrowheads.<br>• Binary tree hierarchy layouts with non-overlapping child distribution. | [`Notes/09-September/01-sep-2026.md`](Notes/09-September/01-sep-2026.md)<br>[`Notes/09-September/03-sep-2026.md`](Notes/09-September/03-sep-2026.md)<br>[`Notes/09-September/08-sep-2026.md`](Notes/09-September/08-sep-2026.md) |
| **Interactive Canvas Events & Model-View State Synchronization** | Immediate-mode Canvas vs procedural GraphicsContext, bounding-box coordinate offset calculation ($centerX - r$), dispatching primary vs secondary mouse events, and two-phase atomic state resets. | • Right-click node generation with centered geometric offset.<br>• Synchronized visual wipe (`clearCanvas`) coupled with collection eviction (`circlePoints.clear()`).<br>• Defensive data encapsulation via `Collections.unmodifiableList()`. | [`Notes/09-September/17-sep-2026.md`](Notes/09-September/17-sep-2026.md) |
| **Modern Java Pipelines & Architecture** | Transitioning from imperative loops to declarative Stream API pipelines, NIO buffer channels, JDBC transaction abstractions, and Swing MVC patterns. | • Declarative pipeline modeling, data structures, and architectural flowcharts for scalable graphics and enterprise data processing. | [`Notes/09-September/10-sep-2026.md`](Notes/09-September/10-sep-2026.md) |
| **Desktop Graph Editor & Command Pattern Architecture** | Decoupling bootstrapping from JavaFX controller, Command pattern undo/redo with custom `LinkedStack`, boundary offset trigonometry (`atan2`), transient UI kinematics (`PullMotionModel`), and monotonic JSON serialization. | • Complete Graph Editor desktop suite.<br>• Reversible mutations (`EditCommand`).<br>• Custom singly-linked stack.<br>• GeometryUtils perimeter clipping & segment hit-detection.<br>• 27 automated JUnit tests. | [`Notes/09-September/29-sep-2026.md`](Notes/09-September/29-sep-2026.md) |

---

## 🛠️ Prerequisites & Environment

* **Java Development Kit (JDK)**: Java 8 or higher (Java 17+ recommended)
* **Apache Maven**: Version 3.8+ (for building Maven-managed projects)
* **Git**: For version control
