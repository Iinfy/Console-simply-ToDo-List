import java.io.Serializable;

public class task implements Serializable{
    private String name;
    private String description;
    private statuses status;

    public task(String name, String descr){
        this.name = name;
        this.description = descr;
        this.status = statuses.ACTIVE;
    }

    public void changeDescr(String newDescr){
        this.description = newDescr;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public void toComplete(){
        this.status = statuses.COMPLETED;
    }

    public String getTask(){
        return "Name: " + name + " - " + description + "\n" + "Status: " + status.toString();
    }

    public String getTaskList(){
        return "Name: " + name + " - " + description + " " + "Status: " + status.toString();
    }

    public void changeStatus(){
        if(status == statuses.ACTIVE){
            status = statuses.COMPLETED;
        } else{
            status = statuses.ACTIVE;
        }
    }
}
