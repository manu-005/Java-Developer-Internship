import javax.swing.*;
import java.awt.*;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> taskModel;
    private JList<String> taskList;
    private JTextField taskField;
    private JButton addButton, deleteButton;

    public ToDoApp() {
        setTitle("To-Do List");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

//Initialization
        taskModel = new DefaultListModel<>();
        taskList = new JList<>(taskModel);
        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Task");

//Panel for input field and buttons
        JPanel inputPanel = new JPanel();
        inputPanel.add(taskField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);

//Add scroll to the task list
        JScrollPane scrollPane = new JScrollPane(taskList);

//Layout alignment
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

//here add the Button Actions
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskModel.addElement(task);
                taskField.setText("");
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskModel.remove(selectedIndex);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoApp::new);
    }
}
