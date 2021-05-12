package telefonica;

import java.util.ArrayList;

public class Agenda {
    
    ArrayList<Contato> contatos = new ArrayList();
   
    
    public void AdicionaContato(Contato contato) {
        contatos.add(contato);        
    }    
    public void RemoverContato (Contato contato) {
        contatos.remove(contato);
    }

    void mostrarContato() {
              int i = 0;
        System.out.println("----------------------------------");
        while(i < contatos.size()){
            System.out.println(contatos.get(i).getNome());
            System.out.println(contatos.get(i).getEmail());
            System.out.println(contatos.get(i).getTelefone());
            System.out.println(contatos.get(i).getCelular());
            System.out.println("----------------------------------");
            i++;
        }
    }   
    
}