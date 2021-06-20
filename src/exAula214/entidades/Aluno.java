package exAula214.entidades;

import java.util.Objects;

public class Aluno {
    private int codigo;

    public Aluno(){

    }

    public Aluno(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigo == aluno.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
