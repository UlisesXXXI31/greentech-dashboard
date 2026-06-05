package com.greentech.backend.model;

import jakarta.persistence.*;

import java.lang.annotation.Inherited;
import java.time.LocalDateTime;

@Entity
@Table(name = "solar_panels")
public class SolarPanel {     

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, length=100)
private String model;

@Column(name = "current_output", nullable = false)
private Double current_output;

// Cambiamos String por PanelStatus y añadimos la anotación de JPA
@Enumerated(EnumType.STRING)
@Column(name = "status", nullable = false)
private PanelStatus status; // OK, WARNING, FAULT

@Column(name = "installation_date", nullable = false)   
private LocalDateTime installation_date;

@Column(name = "last_update", nullable = false)
private LocalDateTime last_update;

//Constructores

public SolarPanel() {}

public SolarPanel(String model, Double current_output, PanelStatus status, LocalDateTime installation_date, LocalDateTime last_update) {
    this.model = model;
    this.current_output = current_output;
    this.status = status;
    this.installation_date = installation_date;
    this.last_update = last_update;
}
//Getters y Setters
public Long getId() {
    return id;  
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}
public Double getCurrent_output() {
    return current_output;
}
public void setCurrent_output(Double current_output) {
    this.current_output = current_output;
}
public PanelStatus getStatus() {
    return status;
}
public void setStatus(PanelStatus status) {
    this.status = status;
}
public LocalDateTime getInstallation_date() {
    return installation_date;
}
public void setInstallation_date(LocalDateTime installation_date) {
    this.installation_date = installation_date;
}
public LocalDateTime getLast_update(){
     return last_update;
}

public void setLast_update(LocalDateTime last_update){
    this.last_update= last_update;
}





}