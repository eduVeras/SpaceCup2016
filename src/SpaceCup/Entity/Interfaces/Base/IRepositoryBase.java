/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Interfaces.Base;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shiftinc-Dev02
 * @param <TEntity>
 * @param <Type>
 */
public interface IRepositoryBase<TEntity, Type extends Serializable> {
    //Na real eu nem to usando esse Type ai
    
   /** Persiste a nova instancia do objeto na base
     * @param newInstance
     * @return  
     */
    void Insert(TEntity obj);
    /** Busca na base o objeto passando a Primary Key dele
     *   the indicated id as primary key
     * @param id
     * @return 
     */
    TEntity GetById(int id);
 
    /** Atualiza no banco as alterações feita no objeto
     * @param transientObject 
     */
    void Update(TEntity obj);
 
    /** Remove o objeto da base
     * @param persistentObject 
     */
    void Delete(TEntity obj);  
    
    /** Retorna uma lista de objetos da base
     */
    ArrayList<TEntity> GetAll();
}
