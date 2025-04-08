
package Principal;
import javax.swing.JOptionPane;
import model.produto;
public class Principal {

    
    public static void main(String[] args) {
        produto objetoproduto = new produto(1,"produto1",10.5);
        
        JOptionPane.showMessageDialog(null, objetoproduto.getNome());
    
    objetoproduto.setNome("produto1 plus");
    
    JOptionPane.showMessageDialog(null, objetoproduto.getNome());
        
        
       
        
    }
    
}
