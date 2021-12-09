package Model;


public class Settings {
    
    boolean themeDark;
    int priorityOrder;
    
    

    public Settings(boolean themeDark, int priorityOrder) {
        this.themeDark = themeDark;
        this.priorityOrder = priorityOrder;
    }
    

    public boolean isThemeDark() {
        return themeDark;
    }

    public void setThemeDark(boolean themeDark) {
        this.themeDark = themeDark;
    }

    public int getPriorityOrder() {
        return priorityOrder;
    }

    public void setPriorityOrder(int priorityOrder) {
        this.priorityOrder = priorityOrder;
    }
   
    
  
    
}
