package com.example.ex12.Student.application.infrastucture.dto.input;

import com.example.ex12.Student.application.domain.Student;
import com.example.ex12.Student.application.domain.StudentJPA;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class StudentINPUT {

    private String id;
    private int num_hours_week;
    private String branch;
    private String comments;

    public Student toOutput(StudentINPUT studentINPUT){
        Student student = new Student();

        student.setId_student(student.getId_student());
        student.setNum_hours_week(studentINPUT.getNum_hours_week());
        student.setBranch(studentINPUT.getBranch());
        student.setComments(studentINPUT.getComments());

        return student;
    }

}
