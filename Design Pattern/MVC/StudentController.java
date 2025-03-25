import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
        initView();
        initController();
    }

    // Initialize the view with data from the model
    public void initView() {
        view.setRollNo(model.getRollNo());
        view.setName(model.getName());
        view.setVisible(true);
    }

    // Set up event listeners
    public void initController() {
        view.addUpdateListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateModelFromView();
            }
        });
    }

    // When the button is clicked, update the model with data from the view
    public void updateModelFromView() {
        model.setRollNo(view.getRollNo());
        model.setName(view.getName());
        System.out.println("Model updated: " + model.getRollNo() + ", " + model.getName());
    }
}
