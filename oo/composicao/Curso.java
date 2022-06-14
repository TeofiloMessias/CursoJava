package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<Aluno>();

    Curso(String nome){
        this.nome = nome;
    }
    void adicionarAluno(Aluno aluno){
        //bidirecional
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}
