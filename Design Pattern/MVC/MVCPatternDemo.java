public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create a model with initial data.
        Student model = new Student("101", "John Doe");
        // Create the view.
        StudentView view = new StudentView();
        // Create the controller that links the model and view.
        StudentController controller = new StudentController(model, view);
    }
}
