/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgsocial.model;

import java.util.ArrayList;

/**
 *
 * @author MIGUEL CAMPOS
 */
public class Concept {
    private String name;
    private String system;
    private String schedule;
    private String description;
    private ArrayList<String> tags;
    
    public Concept(String name, String system, String schedule, String description, ArrayList<String> tags) {
        this.name = name;
        this.system = system;
        this.schedule = schedule;
        this.description = description;
        this.tags = tags;
    }
    
    public String getName() { return name; }
    public String getSystem() { return system; }
    public String getSchedule() { return schedule; }
    public String getDescription() { return description; }
    public ArrayList<String> getTags() { return tags; }
    
    @Override
    public String toString() {
        return String.format("%s - %s \nHorarios: %s\nPersonagem: %s\nTags: %s\n", 
                name, system, schedule, description, tags); 
    }
}
