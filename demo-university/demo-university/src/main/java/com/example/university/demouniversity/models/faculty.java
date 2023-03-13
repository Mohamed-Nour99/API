package com.example.university.demouniversity.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class faculty {

    @Id
    private Integer facultyid ;
    @Column
    private String facultyname ;
    @Column
    private Integer universityid ;



    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "faculty_id" ,
            referencedColumnName = "facultyid"
    )
    private List<material> materials ;

    public faculty() {
    }

    public faculty(Integer facultyid, String facultyname, Integer universityid) {
        this.facultyid = facultyid;
        this.facultyname = facultyname;
        this.universityid = universityid;

    }

    public Integer getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(Integer facultyid) {
        this.facultyid = facultyid;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public Integer getUniversityid() {
        return universityid;
    }

    public void setUniversityid(Integer universityid) {
        this.universityid = universityid;
    }
}
