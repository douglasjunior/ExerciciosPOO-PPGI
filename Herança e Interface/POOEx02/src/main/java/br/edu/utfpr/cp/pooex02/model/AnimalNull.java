package br.edu.utfpr.cp.pooex02.model;

/**
 *
 * @author Douglas
 */
public final class AnimalNull extends Animal {

    public static Animal NULL = new AnimalNull();
    
    private AnimalNull(){
    }
    
    @Override
    public String toString() {
        return "Null";
    }

}
