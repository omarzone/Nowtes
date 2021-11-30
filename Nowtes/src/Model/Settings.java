/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author polilxd
 */
public class Settings {
    
    boolean Theme = false;
    int priorityTask = 0;
   
    
    public Settings(){
          
    }
    
    public boolean getTheme(){
       
        return this.Theme;
    }
    
    public void setTheme(boolean Theme){
       
        this.Theme = Theme;
        
    }
    
    public void setPriorityTask(int priorityTask){
        
        this.priorityTask = priorityTask;
        
    }
    
    public int getPriorityTask(){
      
        return this.priorityTask;
    }
    
}
