import java.util.*;

// Base class
class Tool {
    void draw() {
        System.out.println("Using a generic tool");
    }
}

// Subclass PenTool
class PenTool extends Tool {
    void draw() {
        System.out.println("Drawing with Pen Tool");
    }
}

// Subclass EraserTool
class EraserTool extends Tool {
    void draw() {
        System.out.println("Erasing with Eraser Tool");
    }
}

// Subclass LineTool
class LineTool extends Tool {
    void draw() {
        System.out.println("Drawing a Line with Line Tool");
    }
}

// Main class
public class ToolDemo {
    public static void main(String[] args) {
        // Create a collection of Tool references
        ArrayList<Tool> tools = new ArrayList<>();

        // Add different Tool subclass objects
        tools.add(new PenTool());
        tools.add(new EraserTool());
        tools.add(new LineTool());

        // Polymorphism: Each tool behaves differently on draw()
        for (Tool tool : tools) {
            tool.draw(); // Calls appropriate overridden method
        }
    }
}

