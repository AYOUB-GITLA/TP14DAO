package dao;

import java.util.List;

import beans.Identifiable;

public interface Dao<T extends Identifiable> {
	 void create(T obj);            // INSERT
	    T update(T obj);               // UPDATE, retourne l’objet modifié (ou null si non trouvé)
	    boolean delete(int id);        // DELETE, true si un enregistrement a été supprimé
	    T findById(int id);            // SELECT by PK
	    List<T> findAll();

}
