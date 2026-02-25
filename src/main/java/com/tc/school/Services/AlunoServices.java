package com.tc.school.Services;

import com.tc.school.models.AlunoModel;
import com.tc.school.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServices {

    @Autowired
    private AlunoRepository alunoRepository;


    public AlunoModel criarAluno(AlunoModel alunoModel){

        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> buscarTodosAlunos(){
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id){
        alunoRepository.deleteAllById(id);
    }

}
