package com.example.university.demouniversity.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "studentmaterial")
public class studentmaterial  implements Serializable {

    @Id
    private Integer studentmaterialId ;

    @Column
    private Double grade ;
    @Column
    private Integer studentId ;

    @Column
    private Integer materialId  ;

    @Column
    private Integer year ;

    public studentmaterial() {
    }

    public studentmaterial(Integer studentmaterialId,Integer studentId ,Integer materialId ,  Double grade, Integer year) {
        this.studentmaterialId = studentmaterialId;
        this.studentId=studentId ;
        this.materialId=materialId ;

        this.grade = grade;
        this.year = year;
    }
    public Integer getStudentmaterialId() {
        return studentmaterialId;
    }
    public void setStudentmaterialId(Integer studentmaterialId) {
        this.studentmaterialId = studentmaterialId;
    }

    public Double getGrade() {
        return grade;
    }
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
}
