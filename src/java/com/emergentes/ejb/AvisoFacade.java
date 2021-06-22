/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.ejb;

import com.emergentes.entidades.Aviso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author intel
 */
@Stateless
public class AvisoFacade extends AbstractFacade<Aviso> {
    @PersistenceContext(unitName = "TE_ventasautoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AvisoFacade() {
        super(Aviso.class);
    }
    
}
