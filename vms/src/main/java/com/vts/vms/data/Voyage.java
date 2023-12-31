package com.vts.vms.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Voyages")
public class Voyage {
    @Id
    private String id;
    private Ship ship;
    private String departurePortName;
    private String destinationPortName;
    private List<CargoObject> cargoObjectList;
    private String captainName;
    private Integer crewCount;
    public void clearId(){
        this.id = null;
    }
}
