package telefonica;

public class Telefonica {

    public static void main(String[] args)  {

	Contato c1 = new Contato ("Iani Vargas", "(33)7901-5772", "(48) 98846-2402", "bacogay563@labebx.com");
	Contato c2 = new Contato ("Laura Souza", "(32)8384-8129", "(48) 99844-2008", "housseine3506@uorak.com");
        Contato c3 = new Contato ("Ian Pinheiro", "(54)5534-7228","(48) 98877-2509", "khurram4209@uorak.com");
        
        Agenda a1 = new Agenda();
        a1.AdicionaContato(c1);
        a1.AdicionaContato(c2);
        a1.AdicionaContato(c3);
        a1.mostrarContato();
    }
}
    

