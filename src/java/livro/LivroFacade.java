/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author junio
 */
@Stateless
public class LivroFacade extends AbstractFacade<Livro> {

    @PersistenceContext(unitName = "biblioteca")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LivroFacade() {
        super(Livro.class);
    }
    
}
