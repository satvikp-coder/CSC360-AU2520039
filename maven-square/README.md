# Maven Square Project (`maven-square`)

A Maven-managed Java Swing application demonstrating basic shape rendering using `java.awt.Graphics`.

---

## 📁 Project Structure

```text
maven-square/
├── pom.xml                                   # Maven build configuration
└── src/main/java/com/example/App.java        # Main Java Swing application
```

---

## 💻 Code Overview (`App.java`)

* **Class**: `com.example.App` (extends `javax.swing.JPanel`)
* **Graphics Method**: Overrides `paintComponent(Graphics g)`
* **Rendering**: Sets brush color to `Color.BLUE` and renders a solid 200x200 square at position `(150, 100)` using `g.fillRect(150, 100, 200, 200)`.

---

## 🚀 How to Run

### Option A: Using Apache Maven
```bash
# Build and compile
mvn clean compile

# Execute the application
mvn exec:java -Dexec.mainClass="com.example.App"
```

### Option B: Using standard Java CLI (`javac`)
```bash
# Compile source file
javac -d bin src/main/java/com/example/App.java

# Run compiled class
java -cp bin com.example.App
```

---

## 🛠️ Requirements
* **JDK**: Java 8 or higher
* **Maven**: 3.6+ (Optional, for Maven build commands)
