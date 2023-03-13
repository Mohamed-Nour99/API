package com.example.university.demouniversity.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class material {

    @Id
    private Integer materialId  ;
    @Column
    private String materialName  ;

    //@OneToMany(
            //cascade = CascadeType.ALL
    //)
    //@JoinColumn(
            //name = "material_id" ,
            //referencedColumnName = " materialId "
    //)
    //private List<studentmaterial> studentmaterials ;


    public material() {
    }

    public material(Integer materialId, String materialName) {
        this.materialId = materialId;
        this.materialName = materialName;

    }
    public Integer getMaterialId() {
        return materialId;
    }
    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
    public String getMaterialName() {
        return materialName;
    }
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }


}
