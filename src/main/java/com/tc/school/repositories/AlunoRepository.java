package com.tc.school.repositories;

import com.tc.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository <AlunoModel, Long> {


}
