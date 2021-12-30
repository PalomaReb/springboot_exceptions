package com.example.ex12.Student.application.infrastucture.dto.output;


import com.example.ex12.Student.application.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentOUTPUT {

private String id;
private int num_hours_week;
private String branch;
private String comments;

public StudentOUTPUT changeStudentDTO(Student student){
    StudentOUTPUT studentOUTPUT = new StudentOUTPUT();

    studentOUTPUT.setId(student.getId_student());
    studentOUTPUT.setNum_hours_week(student.getNum_hours_week());
    studentOUTPUT.setBranch(student.getBranch());
    studentOUTPUT.setComments(student.getComments());
    return studentOUTPUT;
}
}
