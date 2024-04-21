import java.awt.*;

public class App extends Frame {
    public App(String title) {
        super(title);
        // Set the layout manager for the frame
        setLayout(new FlowLayout());

        // Create components
        Button button = new Button("Click Me!");
        Label label = new Label("Hello, World!");

        // Add components to the frame
        add(label);
        add(button);

        // Set frame properties
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        App window = new App("My Java Window");
    }
}
