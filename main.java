import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TaskController taskControl = new TaskController();
        taskControl.loadTasks();
        int alTrue = 0;
        while(alTrue < 25){
            System.out.println("Choose action: 1 - Get list of tasks, 2 - Add new task, 3 - Delete task, 4 - Edit task, 5 - Change task status, 0 - Exit");
            String action = scanner.nextLine();
            try{
                switch (action) {
                    case "1":
                        taskControl.infor();
                        break;
                    case "2":
                        taskControl.getTaskByUser();
                        taskControl.exportTasks();
                        break;

                    case "3":
                        System.out.print("Enter task id you want to delete: ");
                        int taskid3 = Integer.parseInt(scanner.nextLine());
                        taskControl.delTask(taskid3);
                        taskControl.exportTasks();
                        break;

                    case "4":
                        System.out.print("Enter task id: ");
                        int taskid4 = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter new task description: ");
                        String newDescr4 = scanner.nextLine();
                        taskControl.changeTaskDescr(taskid4,newDescr4);
                        taskControl.exportTasks();
                        break;
                    
                    case "5":
                        System.out.print("Enter task id: ");
                        int taskid5 = Integer.parseInt(scanner.nextLine());
                        taskControl.changeStat(taskid5);
                        taskControl.exportTasks();
                        break;


                    case "0":
                        alTrue = 26;
                    default:
                        break;
                }
            } catch(Exception e){
                System.out.println("Unexpected error");
            }

        }
    }
}
