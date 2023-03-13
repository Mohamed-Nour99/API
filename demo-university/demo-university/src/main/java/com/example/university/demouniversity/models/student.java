package com.example.university.demouniversity.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Table
@Entity
public class student implements Serializable {

    @Id
    private Integer studentId ;
    @Column
    private String studentName ;
    @Column
    private Integer facultyid ;

    @Column
    private Integer level ;
    @Column
    private Integer topTen ;

    //@OneToMany(
            //cascade = CascadeType.ALL
    //)
    //@JoinColumn(
            //name = "student_id" ,
            //referencedColumnName = "studentId"
    //)
    //private List<studentmaterial> studentmaterials ;





    public student() {
    }

    public student(Integer studentId, String studentName,Integer facultyid, Integer level, Integer topTen) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.facultyid = facultyid ;


        this.level = level;
        this.topTen = topTen;
    }

    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Integer getTopTen() {
        return topTen;
    }
    public void setTopTen(Integer topTen) {
        this.topTen = topTen;
    }

    public Integer getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(Integer facultyid) {
        this.facultyid = facultyid;
    }


}
