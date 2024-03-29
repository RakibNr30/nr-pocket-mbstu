package com.rakib.cse.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "STUDENTCT2", schema = "SABBIR")


/*
 * call pkg_std_perf.studentCT1Marks stored procedure
 */

@NamedStoredProcedureQuery(
        name="studentCT2Marks",
        procedureName="pkg_std_perf.studentCT2Marks",
        parameters={
                @StoredProcedureParameter(name="inUsername", type=String.class, mode=ParameterMode.IN),
                @StoredProcedureParameter(name="inSession", type=String.class, mode=ParameterMode.IN),
                @StoredProcedureParameter(name="inCourseCode", type=String.class, mode=ParameterMode.IN),
                @StoredProcedureParameter(name="outMarks", type=Integer.class, mode=ParameterMode.OUT)
        }
)

public class StudentCT2Entity {
    private Long serialno;
    private String username;
    private String coursecode;
    private String asession;
    private Double marks;

    @Id
    @Column(name = "SERIALNO")
    public Long getSerialno() {
        return serialno;
    }

    public void setSerialno(Long serialno) {
        this.serialno = serialno;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "COURSECODE")
    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    @Basic
    @Column(name = "ASESSION")
    public String getAsession() {
        return asession;
    }

    public void setAsession(String asession) {
        this.asession = asession;
    }

    @Basic
    @Column(name = "MARKS")
    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCT2Entity that = (StudentCT2Entity) o;
        return Objects.equals(serialno, that.serialno) &&
                Objects.equals(username, that.username) &&
                Objects.equals(coursecode, that.coursecode) &&
                Objects.equals(asession, that.asession) &&
                Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialno, username, coursecode, asession, marks);
    }
}
