package repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import model.student;

public interface studentrepositry extends JpaRepository<student,Integer>{

}
