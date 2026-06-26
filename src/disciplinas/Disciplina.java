/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

/**
 *
 * @author Dylan
 */
public class Disciplina {
    
    protected TipoCategorias categoria;
    protected TipoDisciplinas disciplina;
    protected int capacidadMax;

    public TipoCategorias getCategoria() {
        return categoria;
    }

    public TipoDisciplinas getDisciplina() {
        return disciplina;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public Disciplina(TipoCategorias categoria, TipoDisciplinas disciplina, int capacidadMax) {
        this.categoria = categoria;
        this.disciplina = disciplina;
        this.capacidadMax = capacidadMax;
    }

    @Override
    public String toString() {
        return "Disciplina: " + disciplina + 
                "Categoria: " + categoria + 
                "La capacidad maxima es: " + capacidadMax;
    }

    
    
    
}
