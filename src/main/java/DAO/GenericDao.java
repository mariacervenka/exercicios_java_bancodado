package DAO;

import java.util.List;

public interface GenericDao<T, ID> {

    //no interface vc pode omitir as primeiras palavras pq ele ja eh por padrao publico e abstrato
    //isso no nome da classe <T> o sistm vai entender que ja eh generica a classe que ta aplicando
    //e o prof ja deixou o id pq semana q vem vamos pesquisar com o id


    public abstract void inserir(T entidade);

    public abstract List<T> listar();
}
